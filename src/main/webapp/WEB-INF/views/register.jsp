<%--
  Created by IntelliJ IDEA.
  User: 76803
  Date: 2018/8/6
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>网站注册页面</title>
    <style>
        #contanier{
            border: 0px solid white;
            width: 1300px;
            margin: auto;
        }

        #top{
            border: 0px solid white;
            width: 100%;
            height: 50px;
        }
        #menu{
            border: 0px solid white;
            height: 40px;
            background-color: black;
            padding-top: 10px;
            margin-bottom: 15px;
            margin-top: 10px;
        }
        .top{
            border: 0px solid white;
            width: 405px;
            height: 100%;
            float: left;
            padding-left: 25px;
        }
        #top1{
            padding-top: 15px;
        }
        #bottom{
            margin-top: 13px;
            text-align: center;
        }

        #form{
            height: 500px;
            padding-top: 70px;
            background-image: url(/images/t014b4fa27f1af62e44.jpg);
            margin-bottom: 10px;
        }
        a{
            text-decoration: none;
        }

        label.error{
            background:url(/images/unchecked.gif) no-repeat 10px 3px;
            padding-left: 30px;
            font-family:georgia;
            font-size: 15px;
            font-style: normal;
            color: red;
        }

        label.success{
            background:url(/images/checked.gif) no-repeat 10px 3px;
            padding-left: 30px;
        }

        #father{
            border: 0px solid white;
            padding-left: 307px;
        }

        #form2{
            border: 5px solid gray;
            width: 660px;
            height: 450px;
        }

    </style>
    <script type="text/javascript" src="/js/jquery-1.8.3.js" ></script>
    <script type="text/javascript" src="/js/jquery.validate.min.js" ></script>
    <script type="text/javascript" src="/js/messages_zh.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/css/bootstrap.min.css" />
    <script src="/js/bootstrap.min.js"></script>
    <script>
        $(function(){
            $("#registForm").validate({
                rules:{
                    user:{
                        required:true,
                        minlength:3
                    },
                    password:{
                        required:true,
                        digits:true,
                        minlength:6
                    },
                    repassword:{
                        required:true,
                        equalTo:"[name='password']"
                    },


                    sex:{
                        required:true
                    }
                },
                messages:{
                    user:{
                        required:"用户名不能为空!",
                        minlength:"用户名不得少于3位!"
                    },
                    password:{
                        required:"密码不能为空!",
                        digits:"密码必须是整数!",
                        minlength:"密码不得少于6位!"
                    },
                    repassword:{
                        required:"确认密码不能为空!",
                        equalTo:"两次输入密码不一致!"
                    },
                    sex:{
                        required:"性别必须勾选!"
                    }
                },
                errorElement: "label", //用来创建错误提示信息标签,validate插件默认的就是label
                success: function(label) { //验证成功后的执行的回调函数
                    //label指向上面那个错误提示信息标签label
                    label.text(" ") //清空错误提示消息
                        .addClass("success"); //加上自定义的success类
                }
            });
        });
    </script>
</head>
<body>
<div class="container" style="margin-top: 10px;">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">首页</a>
            </div>

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="/user/index">登陆</a>
                    </li>
                    <li class="active">
                        <a href="/user/register">注册 <span class="sr-only">(current)</span></a>
                    </li>

                </ul>
            </div>

        </div>
    </nav>
</div>
<div id="form">
    <form action="/user/RegistUser.do" method="get" id="registForm">
        <div id="father">
            <div id="form2">
                <table border="0px" width="100%" height="100%" align="center" cellpadding="0px" cellspacing="0px" bgcolor="white">
                    <tr>
                        <td colspan="2" >
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <font size="5">注册</font>&nbsp;&nbsp;&nbsp;USER REGISTER
                        </td>
                    </tr>
                    <tr>
                        <td width="180px">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;
                            用户名
                        </td>
                        <td>
                            <em style="color: red;">*</em>&nbsp;&nbsp;&nbsp;<input type="text" name="user" size="35px" id="username"/>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;
                            密码
                        </td>
                        <td>
                            <em style="color: red;">*</em>&nbsp;&nbsp;&nbsp;<input type="password"  name="password" size="35px" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;
                            确认密码
                        </td>
                        <td>
                            <em style="color: red;">*</em>&nbsp;&nbsp;&nbsp;<input type="password" name="repassword" size="35px"/>
                        </td>
                    </tr>


                    <tr>
                        <td>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;
                            性别
                        </td>
                        <td>
										<span style="margin-right: 155px;">
											<em style="color: red;">*</em>&nbsp;&nbsp;&nbsp;<input type="radio"id="sex" name="sex" value="man"/>男
											<input type="radio" name="sex" value="women"/>女<em></em>
											<label for="sex" class="error" style="display: none;"></label>
										</span>

                        </td>
                    </tr>
                    <tr>
                        <td>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;
                            住址
                        </td>
                        <td>
                            <em style="color: red;">*</em>&nbsp;&nbsp;&nbsp;<input type="text" id="address"name="address"  size="35px"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="submit" value="注      册" height="50px"/>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </form>
</div>
</div>
</body>
</html>
