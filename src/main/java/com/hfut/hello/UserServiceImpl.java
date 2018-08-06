package com.hfut.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public void insert(User u) {
		userMapper.insert(u);
	}

	@Override
	public void delete(User u) {
		userMapper.delete(u);
	}

	@Override
	public void update(User u) {
		userMapper.update(u);
	}

	@Override
	public List<User> select(User u) {
		return userMapper.select(u);
	}
}
