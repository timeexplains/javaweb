package com.cn.java.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.java.data.dao.UserMapper;
import com.cn.java.data.model.User;
import com.cn.java.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource  
	private UserMapper userMapper;
	@Override
	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
