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
<script type="text/javascript"src="//cdn.bootcss.com/jquery.form/3.51/jquery.form.min.js"></script>
<div class="main register-bg">
    <div class="container">
        <div id="register">
            <div class="constr">
                <div class="regist-head">注册</div>
                <div class="regist-body">
                    <div class="regist-main">

                        <form action="${rootPath}/member/register" class="form-horizontal col-md-offset-1" role="form" method="post">
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
                                    <input type="text" class="form-control" id="password" name="password" />
                                </div>
                                <span class="col-sm-5 tip">请输入6-16位密码，区分大小写，不能使用空格</span>
                            </div>

                            <div class="form-group">
                                <label for="password2" class="col-sm-2 control-label"><span class="regist-star">*</span>确认密码</label>

                                <div class="col-md-5">
                                    <input type="text" class="form-control" id="password2"  name="password2"/>
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
<jsp:include page="../common/footer.jsp" />
</body>
</html>
