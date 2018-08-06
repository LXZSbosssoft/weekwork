package cn.test.dao;

import cn.test.entity.Myuser;

import java.util.List;

public interface MyuserMapper {

    int insert(Myuser record);

    Myuser selectByUsername(String username);

    List<Myuser> getAllUser();

}