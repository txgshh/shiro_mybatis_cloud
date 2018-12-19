package com.xgjgas.gascloud.com.yphx.shiro.excption;

import org.apache.shiro.authc.AuthenticationException;


/**
 * CaptchaException
 *
 * @author <a href="luchong@xgjgas.com">luchong</a>
 *
 * @version $Revision$
 *
 * @since 2015年5月28日
 */
public class CaptchaException extends AuthenticationException {

	private static final long serialVersionUID = 1L;

	public CaptchaException() {
		super();
	}

	public CaptchaException(String message, Throwable cause) {
		super(message, cause);
	}

	public CaptchaException(String message) {
		super(message);
	}

	public CaptchaException(Throwable cause) {
		super(cause);
	}

}
