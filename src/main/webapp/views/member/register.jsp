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
    <link rel="stylesheet" href="${assetsPath}/css/app.min.css">
</head>
<body>
<jsp:include page="../common/header.jsp" />
<%--<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.css"/>--%>       <!--这个为该页面特殊引入,为适应bootstrap的图标-->
<script type="text/javascript" src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript"src="//cdn.bootcss.com/jquery.form/3.51/jquery.form.min.js"></script>
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



                                    <input id="codevalue" class="form-control" type="text" name="codenum" placeholder="验证码">

                                </div>
                                <img id="imgObj" src="${rootPath}/code.html" alt="" onclick="changeImg()" class="col-sm-2">
                               <%-- <img src="http://img.mukewang.com/545308540001678401500040.jpg" alt="" class="col-sm-2"/>--%>
                            </div>


                            <div class="form-group">

                                <div class="col-sm-offset-2 col-sm-10">
                                    <div class="errorMsg" style="color:#ff6f56"></div>
                                    <button type="submit" onclick="return userRegisterSubmit()" class="regist-btn">立即注册</button>
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


    }
        function userRegisterSubmit() {

            $.ajax({
                type: 'post',
                url: '${rootPath}/member/register',    //  填进你要处理表单信息的Servlet
                data: $('#registerForm').serialize(),    //   字符串  name1=value1&name2=value2
                success: function(loginMsg) {
                    if( loginMsg.status ) {
                        alertMessage('注册成功！');
                        location.href='${rootPath}/index';    //  路径不对的话改一下
                        //changeImg();
                    }
                    else {
                        changeImg();
                        $('.errorMsg').html(loginMsg.message);

                    }
                }
            });
            //registerForm.reset();
            //changeImg();
            return false;
        }

//验证码刷新
    var blue="#3498DB";
    var grey2="#bdc3c7";
    var toColor=function(obj,color,status){
        if(status){
            obj.addClass("input-focus",200);
        }else{
            obj.removeClass("input-focus",200);
        }
        obj.siblings("i").eq(0).animate({    //jquery对象，，，[0]为DOM对象
            color: color,
        },400)
    }
    //获得焦点
    $("input[type='text']").focus(function(){
        toColor($(this),blue,true);
    })
    //失去焦点
    $("input[type='text']").blur(function(){
        toColor($(this),grey2,false);
    })




    //用来更换图片
    function changeImg() {
        var imgSrc = $("#imgObj");
        var src = imgSrc.attr("src");
        imgSrc.attr("src", chgUrl(src));
    }
    //时间戳
    //为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
    function chgUrl(url) {
        var timestamp = (new Date()).valueOf();
        url = url.substring(0, 17);
        if ((url.indexOf("&") >= 0)) {
            url = url + "×tamp=" + timestamp;
        } else {
            url = url + "?timestamp=" + timestamp;
        }
        return url;
    }
</script>
<script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
<script type="text/javascript"src="${assetsPath}/js/main.js"></script>
<script type="text/javascript"src="//cdn.bootcss.com/jquery.form/3.51/jquery.form.min.js"></script>
<script type="text/javascript"src="${assetsPath}/js/check_login.js"></script>
<script src="//cdn.bootcss.com/jquery/2.2.0/jquery.js"></script>
<script src="//cdn.bootcss.com/jqueryui/1.11.0/jquery-ui.js"></script>
<jsp:include page="../common/footer.jsp" />
</body>
</html>
