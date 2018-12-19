package com.xgjgas.gascloud.com.yphx.shiro.realm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xgjgas.gascloud.com.yphx.domain.XgjMenu;
import com.xgjgas.gascloud.com.yphx.domain.XgjMenuExample;
import com.xgjgas.gascloud.com.yphx.domain.XgjSysRole;
import com.xgjgas.gascloud.com.yphx.domain.XgjSysRoleExample;
import com.xgjgas.gascloud.com.yphx.domain.XgjSysUser;
import com.xgjgas.gascloud.com.yphx.domain.XgjSysUserExample;
import com.xgjgas.gascloud.com.yphx.service.IXgjMenuService;
import com.xgjgas.gascloud.com.yphx.service.IXgjSysRoleService;
import com.xgjgas.gascloud.com.yphx.service.IXgjSysUserRoleService;
import com.xgjgas.gascloud.com.yphx.service.IXgjSysUserService;
import com.xgjgas.gascloud.com.yphx.shiro.token.UsernamePasswordCaptchaToken;


/**
 * ApexAuthorizingRealm
 *
 * @author <a href="luchong@xgjgas.com">luchong</a>
 *
 * @version $Revision$
 *
 * @since 2015年5月27日
 */
public class GasAuthorizingRealm extends AuthorizingRealm {

    private static final Logger logger = LoggerFactory
            .getLogger(GasAuthorizingRealm.class);
    @Resource
    private IXgjSysUserRoleService xgjSysUserRoleService;
    @Resource
    private IXgjMenuService xgjMenuService;
    @Resource
    private IXgjSysUserService xgjSysUserService;
    @Resource
    private IXgjSysRoleService xgjSysRoleService;

    /**
     * 授权查询回调，在缓存中查询不到鉴权信息时调用
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
    	GasPrincipal principal = (GasPrincipal) getAvailablePrincipal(principals);
    	XgjSysUserExample xgjSysUserCriteria = new XgjSysUserExample();
		XgjSysUserExample.Criteria criteria = xgjSysUserCriteria.createCriteria();
		criteria.andIdEqualTo(principal.getId());
		XgjSysUser user = xgjSysUserService.getObject(principal.getId());
        if(user != null){
        	SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        	List<HashMap> menuList;
        	if(user.getId().equals("1")){
        		//菜单信息
        		XgjMenuExample menuExample = new XgjMenuExample();
        		List<XgjMenu> menulst = xgjMenuService.getList(menuExample);
        		menuList = new ArrayList<HashMap>();
        		for(XgjMenu xmenu:menulst){
        			HashMap kvalmap = new HashMap();
        			kvalmap.put("PERMISSION", xmenu.getPermission());
        			menuList.add(kvalmap);
        			String Permission  = xmenu.getPermission();
        			if (StringUtils.isNotBlank(Permission)){
        				// 添加基于Permission的权限信息
        				for (String permission : StringUtils.split(Permission,",")){
        					info.addStringPermission(permission);
        				}
        			}
        		}
        	}
    		// 添加用户权限
    		info.addStringPermission("user");
    		// 添加用户角色信息
    		List<XgjSysRole> srlst;
    		if(user.getId().equals("1")){
    			XgjSysRoleExample roleExample = new XgjSysRoleExample();
    			srlst = xgjSysRoleService.getList(roleExample);
    		}
    		XgjSysRoleExample roleExample = new XgjSysRoleExample();
			srlst = xgjSysRoleService.getList(roleExample);
    		for (XgjSysRole role : srlst){
    			info.addRole(role.getEnname());
    		}
        	info.addRole("user");
        	return info;
		}
		else{
			return null;
		}
    }

    /**
     * 身份认证回调，在用户登录时调用
     *
     * @param authcToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken ) throws AuthenticationException {
        UsernamePasswordCaptchaToken token = (UsernamePasswordCaptchaToken) authcToken;
        //验证码验证
        int count=0;
        /*if(Config.isAlwaysEnableCaptcha()){
        	// 判断验证码
        	Session session = SecurityUtils.getSubject().getSession();
        	String code = (String)session.getAttribute(ValidateCodeServlet.VALIDATE_CODE);
			if (token.getCaptcha() == null || !token.getCaptcha().toUpperCase().equals(code)){
				throw new CaptchaException("验证码错误.");
			}
        }*/
        String passwd = "";
        if (token.getPassword() != null) {
            passwd = new String(token.getPassword());
        }
        logger.debug("shiro 对{{},{}}进行身份认证. ",
                new Object[]{token.getUsername(), passwd});
        XgjSysUserExample xgjSysUserCriteria = new XgjSysUserExample();
		XgjSysUserExample.Criteria criteria = xgjSysUserCriteria.createCriteria();
		criteria.andLoginNameEqualTo(token.getUsername());
		criteria.andDelFlagEqualTo("0");//Config.getConfig("system.del.flag"));
		List<XgjSysUser> lst = xgjSysUserService.getList(xgjSysUserCriteria);
        XgjSysUser  userLogin = null;
		if(lst!=null&&lst.size()>0){
			userLogin =lst.get(0);
		}
        //-4:登录错误;-3:用户名或密码为空;-2:密码错误;-1:用户名不存在;0:验证通过;1:用户禁用;2:用户过期
        if(userLogin == null){
            throw new UnknownAccountException();
        }else if(!passwd.equals(userLogin.getPassword())){
            throw new UnknownAccountException();
        }else if("1".equals(userLogin.getDelFlag())){
            throw new  DisabledAccountException();
        }
        if (StringUtils.equals(String.valueOf(token.getPassword()),
                userLogin.getPassword())) {
        	GasPrincipal principal=new GasPrincipal(userLogin);
        	
        	
			  
			  
			// 登陆成功，将用户信息放入session
        	String userId=userLogin.getId();
        	String userName=(String)(userLogin.getName());
        	principal.setName(userName);
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(
            		principal, token.getPassword(),
                    getName());
            
            
            
            
            return info;
        }
        return null;
    }
    /**
     * 授权用户信息
     *
     * @author <a href="luchong@xgjgas.com">luchong</a>
     *
     * @version $Revision$
     *
     * @since 2015年5月28日
     */
    public static class GasPrincipal implements Serializable {

        private static final long serialVersionUID = 1L;

        private String id;
        private String loginName;
        private String name;

        public GasPrincipal(XgjSysUser user) {
            this.id = user.getId();
            this.loginName = user.getLoginName();
            this.name = (String)(user.getName());
        }

        public String getId() {
            return id;
        }

        public String getLoginName() {
            return loginName;
        }

        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name=name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
