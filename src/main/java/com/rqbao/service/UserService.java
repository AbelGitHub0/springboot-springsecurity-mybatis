package com.rqbao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rqbao.mapper.SysUserMapper;

@Service
public class UserService {
	@Autowired
	private SysUserMapper userMapper;
}
