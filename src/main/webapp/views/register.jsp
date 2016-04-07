<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>index</title>
    <link rel="stylesheet" href="${assetsPath}/css/app.css">
</head>
<body>
<jsp:include page="common/header.jsp" />

<div class="main register-bg">
    <div class="container">
        <div id="register">
            <div class="constr">
                <div class="regist-head">注册</div>
                <div class="regist-body">
                    <div class="regist-main">

                        <form action="" class="form-horizontal col-md-offset-1" role="form">
                            <div class="form-group">
                                <label for="email" class="col-sm-2 control-label"><span class="regist-star">*</span>登录邮箱</label>

                                <div class="col-md-5">
                                    <input type="text" class="form-control" id="email"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="nickname" class="col-sm-2 control-label"><span class="regist-star"></span>用户昵称</label>

                                <div class="col-md-5">
                                    <input type="text" class="form-control" id="username"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="password" class="col-sm-2 control-label"><span class="regist-star">*</span>登录密码</label>

                                <div class="col-md-5">
                                    <input type="text" class="form-control" id="password"/>
                                </div>
                                <span class="col-sm-5 tip">请输入6-16位密码，区分大小写，不能使用空格</span>
                            </div>

                            <div class="form-group">
                                <label for="password2" class="col-sm-2 control-label"><span class="regist-star">*</span>确认密码</label>

                                <div class="col-md-5">
                                    <input type="text" class="form-control" id="password2"/>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="" class="col-sm-2 control-label"><span class="regist-star">*</span>验证码</label>
                                <div class="regist-cell col-md-3">
                                    <input class="form-control">
                                </div>
                                <img src="http://img.mukewang.com/545308540001678401500040.jpg" alt="" class="col-sm-2"/>
                            </div>

                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button type="submit" class="regist-btn">立即注册</button>
                                </div>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="common/footer.jsp" />
</body>
</html>
