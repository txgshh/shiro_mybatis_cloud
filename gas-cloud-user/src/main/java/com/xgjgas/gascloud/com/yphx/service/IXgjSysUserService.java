package com.xgjgas.gascloud.com.yphx.service;

import java.util.List;

import com.xgjgas.gascloud.com.yphx.domain.XgjSysUser;
import com.xgjgas.gascloud.com.yphx.domain.XgjSysUserExample;

public interface IXgjSysUserService{

	public XgjSysUser getObject(String id);

	public List<XgjSysUser> getList(XgjSysUserExample xgjSysUserCriteria);
}
