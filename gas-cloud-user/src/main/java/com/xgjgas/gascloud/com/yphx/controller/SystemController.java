package com.xgjgas.gascloud.com.yphx.controller;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xgjgas.gascloud.com.yphx.domain.XgjSysUser;

@Controller
public class SystemController {
	@RequestMapping("/login")
	public String loginGet() {
		return "login";
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	@RequiresPermissions(value={"gas:selectCity:view1"},logical=Logical.OR)
	public String loginPost() {
		/*XgjSysUser user = SysAuthorityUtil.getSysUser();
		// 如果已经登录，则跳转到管理首页
		if (user.getLoginName() != null) {
			return "redirect:/";
		}*/
		return "/index";
	}
}
