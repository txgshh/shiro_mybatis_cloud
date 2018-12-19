package com.xgjgas.gascloud.com.yphx.shiro.token;


/**
 * UsernamePasswordCaptchaToken
 *
 * @author <a href="luchong@xgjgas.com">luchong</a>
 *
 * @version $Revision$
 *
 * @since 2015年5月27日
 */
public class UsernamePasswordCaptchaToken extends org.apache.shiro.authc.UsernamePasswordToken {

    private static final long serialVersionUID = 1L;
    public UsernamePasswordCaptchaToken() {
        super();
    }

    public UsernamePasswordCaptchaToken(String username, char[] password, boolean rememberMe, String host) {
        super(username, password, rememberMe, host);
    }
}
