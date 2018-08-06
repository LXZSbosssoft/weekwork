package cn.test.service;

import cn.test.entity.Myuser;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    //检验用户登录
    Myuser checkLogin(String username, String password);
    void Regist(Myuser user);
    List<Myuser> allUser();
}
