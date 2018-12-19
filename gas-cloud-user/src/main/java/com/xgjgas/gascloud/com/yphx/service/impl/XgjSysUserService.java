package com.xgjgas.gascloud.com.yphx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xgjgas.gascloud.com.yphx.dao.XgjSysUserMapper;
import com.xgjgas.gascloud.com.yphx.domain.XgjSysUser;
import com.xgjgas.gascloud.com.yphx.domain.XgjSysUserExample;
import com.xgjgas.gascloud.com.yphx.service.IXgjSysUserService;

@Service
public class XgjSysUserService implements IXgjSysUserService{
	@Autowired
	private XgjSysUserMapper xgjSysUserMapper;
	@Override
	public XgjSysUser getObject(String id) {
		return xgjSysUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<XgjSysUser> getList(XgjSysUserExample xgjSysUserCriteria) {
		return xgjSysUserMapper.selectByExample(xgjSysUserCriteria);
	}

}
