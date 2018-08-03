package cn.test.dao;

import cn.test.entity.Myuser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;



public class MyuserMapperTest {
    private ApplicationContext applicationContext;
    @Autowired
    private MyuserMapper myuserMapper;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        myuserMapper = applicationContext.getBean(MyuserMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void insert() throws Exception {
        Myuser myuser = new Myuser();
        myuser.setUsername("lisi");
        myuser.setPassword("1234");
        myuser.setSex("男");
        myuser.setAddress("dada");
        int result = myuserMapper.insertSelective(myuser);
        assert (result == 1);
    }






}
