package com.xgjgas.gascloud.com.yphx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xgjgas.gascloud.com.yphx.dao.XgjSysRoleMapper;
import com.xgjgas.gascloud.com.yphx.domain.XgjSysRole;
import com.xgjgas.gascloud.com.yphx.domain.XgjSysRoleExample;
import com.xgjgas.gascloud.com.yphx.service.IXgjSysRoleService;

@Service
public class XgjSysRoleService implements IXgjSysRoleService{
	@Autowired
	private XgjSysRoleMapper xgjSysRoleMapper;

	@Override
	public List<XgjSysRole> getList(XgjSysRoleExample roleExample) {
		return xgjSysRoleMapper.selectByExample(roleExample);
	}
}
