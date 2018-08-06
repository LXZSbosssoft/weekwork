package cn.test.Controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@Scope(value="prototype")
@RequestMapping("/user")
public class control {
    @RequestMapping("/register")
    public String register() {

        return "register";
    }
    @RequestMapping("/index")
    public String index(){

        return "index";
    }
}
