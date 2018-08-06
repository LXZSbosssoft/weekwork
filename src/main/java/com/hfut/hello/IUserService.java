package com.hfut.hello;

import java.util.List;

public interface IUserService {
	void insert(User u);
	void delete(User u);
	void update(User u);
	List<User> select(User u);
}
