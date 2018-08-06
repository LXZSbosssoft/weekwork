package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hfut.hello.IUserService;
import com.hfut.hello.User;

@Controller
public class Hello{
	@Autowired
	IUserService service;

	@RequestMapping(value = "/hello")
	public ModelAndView handleRequest(User u) throws Exception {
		 List<User>users= service.select(u);
		 System.out.println(users);
		ModelAndView mv = new ModelAndView();
		 if(users.size()>0){
		mv.addObject("users", service.select(new User()));
		 mv.setViewName("/list.jsp");
		 }else{
		mv.setViewName("/exception.jsp");
		 }
		return mv;
	}
}
