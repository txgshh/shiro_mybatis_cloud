package com.xgjgas.gascloud.com.yphx.service;

import java.util.HashMap;
import java.util.List;

import com.xgjgas.gascloud.com.yphx.domain.XgjMenu;
import com.xgjgas.gascloud.com.yphx.domain.XgjMenuExample;


public interface IXgjMenuService{
	public List<XgjMenu> getList(XgjMenuExample menuExample);
}
