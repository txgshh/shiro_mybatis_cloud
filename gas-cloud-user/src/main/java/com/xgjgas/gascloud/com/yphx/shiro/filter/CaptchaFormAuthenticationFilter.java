package com.xgjgas.gascloud.com.yphx.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.util.WebUtils;

import com.xgjgas.gascloud.com.yphx.shiro.token.UsernamePasswordCaptchaToken;


/**
 * CaptchaFormAuthenticationFilter
 *
 * @author <a href="luchong@xgjgas.com">luchong</a>
 *
 * @version $Revision$
 *
 * @since 2015年5月27日
 */
public class CaptchaFormAuthenticationFilter extends org.apache.shiro.web.filter.authc.FormAuthenticationFilter {

    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        String username = getUsername(request);
        String password = getPassword(request);
        if (password==null){
            password = "";
        }
        boolean rememberMe = isRememberMe(request);
        String host = getHost(request);
        return new UsernamePasswordCaptchaToken(username, password.toCharArray(), rememberMe, host);
    }

	@Override
	protected void issueSuccessRedirect(ServletRequest request, ServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//super.issueSuccessRedirect(request, response);
		WebUtils.issueRedirect(request, response,getSuccessUrl(), null, true); 
	}
    
}
