package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hfut.hello.User;
import com.hfut.hello.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
	@Autowired
UserMapper userMapper;
	@Test
	public void insert() throws Exception {
		User u=new User();
		u.setAddress("地球");
		u.setAge(4);
		u.setPassword("password");
		u.setUsername("username");
		userMapper.insert(u);
	}
	@Test
	public void update() throws Exception {
		User u=new User();
		u.setAddress("地球");
		u.setId(1);
		userMapper.update(u);
	}
	@Test
	public void select() throws Exception {
		List<User> users=userMapper.select(new User());
		System.out.println(users);
	}
	@Test
	public void delete() throws Exception {
		User u=new User();
		u.setId(1);
		userMapper.delete(u);
	}
}
