package com.xgjgas.gascloud.com.yphx.controller;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xgjgas.gascloud.com.yphx.domain.XgjSysUser;
import com.xgjgas.gascloud.com.yphx.domain.XgjSysUserExample;
import com.xgjgas.gascloud.com.yphx.service.IXgjSysUserService;
import com.xgjgas.gascloud.com.yphx.shiro.realm.GasAuthorizingRealm.GasPrincipal;

@Controller
public class SystemController {
	@Autowired
	private IXgjSysUserService xgjSysUserService;
	
	@RequestMapping("/login")
	public String loginGet() {
		return "login";
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	//@RequiresPermissions(value={"gas:selectCity:view1"},logical=Logical.OR)
	public String loginPost() {
		Subject sub = SecurityUtils.getSubject();
		GasPrincipal principal = (GasPrincipal)sub.getPrincipal();

    		XgjSysUserExample xgjSysUserCriteria = new XgjSysUserExample();
		XgjSysUserExample.Criteria criteria = xgjSysUserCriteria.createCriteria();
		criteria.andIdEqualTo(principal.getId());
		XgjSysUser user = xgjSysUserService.getObject(principal.getId());
		// 如果已经登录，则跳转到管理首页
		if (user!=null&&user.getLoginName() != null) {
			return "redirect:/";
		}
		return "/index";
	}
}
