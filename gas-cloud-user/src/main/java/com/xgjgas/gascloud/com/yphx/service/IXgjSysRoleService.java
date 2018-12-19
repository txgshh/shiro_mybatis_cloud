package com.xgjgas.gascloud.com.yphx.service;

import java.util.List;

import com.xgjgas.gascloud.com.yphx.domain.XgjSysRole;
import com.xgjgas.gascloud.com.yphx.domain.XgjSysRoleExample;


public interface IXgjSysRoleService{
	List<XgjSysRole> getList(XgjSysRoleExample roleExample);

}
