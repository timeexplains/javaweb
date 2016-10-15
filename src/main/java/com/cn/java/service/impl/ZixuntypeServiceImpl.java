package com.cn.java.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.java.data.dao.ZixunTypeMapper;
import com.cn.java.data.model.ZixunType;
import com.cn.java.service.IZixuntypeService;


@Service("zixuntypeService")  
public class ZixuntypeServiceImpl implements IZixuntypeService{
	@Resource  
	private ZixunTypeMapper zixunTypeDao;  
	@Override
	public ZixunType getZixunTypeById(int id) {
		return zixunTypeDao.selectByPrimaryKey(id);
	}

}
