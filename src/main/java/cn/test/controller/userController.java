package cn.test.controller;

import cn.test.entity.Myuser;
import cn.test.dao.MyuserMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class userController {
    @Resource
    private MyuserMapper myuserMapper;

    //登录控制
    @RequestMapping("/LoginUser.do")
    public void LoginUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String login = "";//登录界面URL
//        int ID = Integer.parseInt(request.getParameter(""));//获取ID
        String user = request.getParameter("user");//获取登录帐号
        String pwd = request.getParameter("password");//获取登陆密码
        Myuser myuser = this.myuserMapper.selectByUsername(user);
        if (myuser==null) {
            response.setContentType("text/html; charset=UTF-8"); //转码
            PrintWriter out = response.getWriter();
            out.flush();
            out.println("<script>");
            out.println("alert('用户名不存在,请重新输入！');");
            out.println("history.back();");
            out.println("</script>");
//            response.sendRedirect("index.html");
            return;
        }
        if (myuser.getPassword().equals(pwd)) {
//            ObjectMapper mapper = new ObjectMapper();
            List<Myuser> allUser= new ArrayList<Myuser>();
            allUser= this.myuserMapper.getAllUser();
            request.setAttribute("list",allUser);
//            for (Myuser all : list) {
//                System.out.print("ID="+all.getId());
//                System.out.print("\tusername="+all.getUsername());
//                System.out.print("\tpassword="+all.getPassword());
//                System.out.print("\tsex="+all.getSex());
//                System.out.print("\taddresss="+all.getAddress());
//                System.out.println();
//                response.getWriter().write(mapper.writeValueAsString(all));
//            }
//            response.getWriter().close();
//            response.getWriter().write(mapper.writeValueAsString(myuser));
//            response.getWriter().close();
        } else {
            response.getWriter().write("passwzd errror!");
            response.getWriter().close();
            response.setContentType("text/html; charset=UTF-8"); //转码
            PrintWriter out = response.getWriter();
            out.flush();
            out.println("<script>");
            out.println("alert('密码错误,请重新输入！');");
            out.println("history.back();");
            out.println("</script>");
//            response.sendRedirect("index.html");
        }
    }

    //注册控制
    @RequestMapping("/RegistUser.do")
    public void signUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String login = "";//登录界面URL
        String sign = "";//注册界面url
        int ID = Integer.parseInt(request.getParameter("user"));//获取ID
        String user = request.getParameter("name");//获取登录帐号
        String pwd = request.getParameter("password");//获取登陆密码
        String sex = request.getParameter("name");//获取姓名  radio..
        String addr = request.getParameter("adress");//获取地址
        Myuser myuser = this.myuserMapper.selectByUsername(user);
        if (myuser!=null) {  //检测是否有重复的用户名，
            Myuser newUser = new Myuser();
            newUser.setId(ID);
            newUser.setAddress(addr);
            newUser.setPassword(pwd);
            newUser.setSex(sex);
            newUser.setUsername(user);
            myuserMapper.insert(newUser);
            response.sendRedirect("index");
        } else {
            response.setContentType("text/html; charset=UTF-8"); //转码
            PrintWriter out = response.getWriter();
            out.flush();
            out.println("<script>");
            out.println("alert('用户已存在,请重新输入！');");
            out.println("history.back();");
            out.println("</script>");
//            response.sendRedirect("regist.html");
        }
    }
/*
    void printAllUser(Myuser[] allUser) {
        for (Myuser all : allUser) {
            System.out.print("ID="+all.getId());
            System.out.print("\tusername="+all.getUsername());
            System.out.print("\tpassword="+all.getPassword());
            System.out.print("\tsex="+all.getSex());
            System.out.print("\taddresss="+all.getAddress());
            System.out.println();

        }

    }
    */

}
