package com.hfut.hello;

import java.util.List;

public interface UserMapper {
public void insert(User u);
public void delete(User u);
public void update(User u);
public List<User> select(User u);
}
