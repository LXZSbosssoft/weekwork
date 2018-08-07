package cn.test.controller;

import cn.test.entity.Myuser;
import cn.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")


@SessionAttributes("user")
public class UserController {
    @Autowired
    private UserService userServivce;

    //正常访问login页面
    @RequestMapping("/registerPage")
    public String login(){
        return "register";
    }

    @RequestMapping("/register")
    public String register(Myuser myuser){
        int result = userServivce.regist(myuser);
        if(result == 1)
            return "success";
        else
            return "fail";
    }

    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(Myuser user, Model model){
        //调用service方法
        user = userServivce.checkLogin(user.getUsername(), user.getPassword());
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
            model.addAttribute("user",user);
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/allUser")
    public String allUser(Model model){
        List<Myuser> list = userServivce.allUser();
        model.addAttribute("list",list);
        return "allUser";
    }


}
