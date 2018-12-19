package com.xgjgas.gascloud.com.yphx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xgjgas.gascloud.com.yphx.dao.XgjMenuMapper;
import com.xgjgas.gascloud.com.yphx.domain.XgjMenu;
import com.xgjgas.gascloud.com.yphx.domain.XgjMenuExample;
import com.xgjgas.gascloud.com.yphx.service.IXgjMenuService;

@Service
public class XgjMenuService implements IXgjMenuService{
	@Autowired
	private XgjMenuMapper xgjMenuMapper;
	
	@Override
	public List<XgjMenu> getList(XgjMenuExample menuExample) {
		return xgjMenuMapper.selectByExample(menuExample);
	}
}
