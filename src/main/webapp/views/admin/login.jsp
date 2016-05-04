<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>校视通</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="${assetsPath}/css/app.css"/>

    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.css"/>       <!--这个为该页面特殊引入,为适应bootstrap的图标-->
    <script type="text/javascript" src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>


<div class="main">
    <div class="admin" id="admin_login">           <!--id为该页面特殊标记-->
        <div class="navbar" role="navigation">
            <div class="navbar-header">
                <a class="" href="${rootPath}/index">
            <span class="navbar-brand">
                <span class="fa fa-book"></span> 校视通
            </span>
                </a>
            </div>
        </div>


        <div class="login_box">
            <div class="modal-header">
                <i class="fa fa-desktop fa-2x col-md-2"></i>

                <h2 class="text-center col-md-4 col-md-offset-2">后台系统登录</h2>
            </div>
            <div class="modal-body">
                <form action="${rootPath}/admin/login" class="form center-block center-block" method="post">
                    <div class="input-group col-md-6">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                        <input type="text" class="form-control input-lg" id="examInputEmail1" name="username"
                               placeholder="请输入您的账号"/>
                    </div>
                    <div class="input-group col-md-6">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                        <input type="password" class="form-control input-lg" id="examInputPassword1" name="password"
                               placeholder="请输入您的密码"/>
                    </div>

                    <div class="input-group col-md-6">
                        <input type="submit" class="btn btn-lg" value="登录" id="login-in">
                        <span><a href="#" style="text-align: right" class="forget">忘记密码?</a></span>
                    </div>
                </form>
            </div>

        </div>


    </div>
</div>
<script>

    $(function(){
        function alertMessage(message) {
            var insert =
                    "<div class='suspend' style='width: 100%;height: 100%;display: none;z-index: 2;background-color: rgba(0,0,0,.6);position: fixed;top: 0;left: 0;'>" +
                    "<div class='suspend-content' style='text-align:right;padding: 30px 40px;width: 400px;height: 200px;background-color: #fff;border-radius: 4px;position: fixed;top: 26%;left: 36%;'>" +
                    "<p class='alertMessage' style='text-align:left;font-size: 22px;height: 80px;color: #000;font-weight: bold;margin-bottom: 30px;'></p>" +
                    " <button type='button' class='btn btn-success'>确定</button>" +
                    "</div>" +
                    "</div>";
            $('body').append(insert);
            $('.alertMessage').html(message);
            $('.suspend').css('display','block');
            $('.btn').on('click',function(){
                $('.suspend').css('display','none');
            });


        };
        $(document).ready(function () {
            var loginMsg="${loginMsg}";
//            var msg="abc";

            if(loginMsg!=''){
                alertMessage(loginMsg);
            }
        });
    });


</script>
</body>
</html>
