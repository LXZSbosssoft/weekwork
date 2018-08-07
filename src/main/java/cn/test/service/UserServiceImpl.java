package cn.test.service;

import cn.test.dao.MyuserMapper;
import cn.test.entity.Myuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private MyuserMapper myuserMapper;

    /*
     * 检验用户登录业务
     *
     */
    @Override
    public Myuser checkLogin(String username, String password) {

        Myuser user = myuserMapper.findByUsername(username);
        if(user != null && user.getPassword().equals(password)){

            return user;
        }
        return null;
    }

    @Override
    public int regist(Myuser user) {
        return myuserMapper.insert(user);
    }

    @Override
    public List<Myuser> allUser(){
       return myuserMapper.findAllUser();
    }

}
