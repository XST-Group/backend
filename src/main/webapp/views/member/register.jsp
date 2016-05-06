<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>注册</title>
    <link rel="stylesheet" href="${assetsPath}/css/app.css">
</head>
<body>
<jsp:include page="../common/header.jsp" />
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.css"/>       <!--这个为该页面特殊引入,为适应bootstrap的图标-->
<script type="text/javascript" src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<%--<script type="text/javascript"src="//cdn.bootcss.com/jquery.form/3.51/jquery.form.min.js"></script>--%>
<div class="main register-bg">
    <div class="container">
        <div id="register">
            <div class="constr">
                <div class="regist-head">注册</div>
                <div class="regist-body">
                    <div class="regist-main">

                        <form action="${rootPath}/member/register" id="registerForm" class="form-horizontal col-md-offset-1" role="form" method="post">
                            <div class="form-group">
                                <label for="email" class="col-sm-2 control-label"><span class="regist-star">*</span>登录邮箱</label>

                                <div class="col-md-5">
                                    <input type="text" class="form-control" id="email"  name="email"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <label <%--for="nickname"--%> class="col-sm-2 control-label"><span class="regist-star"></span>用户昵称</label>

                                <div class="col-md-5">
                                    <input type="text" class="form-control" id="username"  name="username"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="password" class="col-sm-2 control-label"><span class="regist-star">*</span>登录密码</label>

                                <div class="col-md-5">
                                    <input type="password" class="form-control" id="password" name="password" />
                                </div>
                                <span class="col-sm-5 tip">请输入6-16位密码，区分大小写，不能使用空格</span>
                            </div>

                            <div class="form-group">
                                <label for="password2" class="col-sm-2 control-label"><span class="regist-star">*</span>确认密码</label>

                                <div class="col-md-5">
                                    <input type="password" class="form-control" id="password2"  name="password2"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label"><span class="regist-star">*</span>验证码</label>
                                <div class="regist-cell col-md-3">
                                    <input class="form-control">
                                </div>
                                <img src="http://img.mukewang.com/545308540001678401500040.jpg" alt="" class="col-sm-2"/>
                            </div>


                            <div class="form-group">

                                <div class="col-sm-offset-2 col-sm-10">
                                    <div class="errorMsg" style="color:#ff6f56"></div>
                                    <button type="submit" onclick="return userLoginSubmit()" class="regist-btn">立即注册</button>
                                </div>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>

        function userLoginSubmit() {

            console.log('loginSubmit')
            $.ajax({
                type: 'post',
                url: '${rootPath}/member/register',    //  填进你要处理表单信息的Servlet
                data: $('#registerForm').serialize(),    //   字符串  name1=value1&name2=value2
                success: function(loginMsg) {
                    console.log(loginMsg)
                    if( loginMsg.status ) {
                        //alert('登陆成功');
                        location.href='${rootPath}/index';    //  路径不对的话改一下
                    }
                    else {
                        $('.errorMsg').html(loginMsg.message);
                    }
                }
            });
            registerForm.reset();
            return false;
        }


</script>
<jsp:include page="../common/footer.jsp" />
</body>
</html>
