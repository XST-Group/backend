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

    <!--<link href='http://fonts.useso.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>-->
    <link rel="stylesheet" href="${assetsPath}/css/app.min.css"/>
    <%--<link rel="stylesheet" href="${assetsPath}/css/theme.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="css/default.css">--%>

    <script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

<div class="main">
        <!--------------------
                header
        --------------------->
        <div class="admin">
            <jsp:include page="header.jsp" />

            <!--------------------
                    nav
            --------------------->
            <div class="sidebar-nav">
                <ul>
                    <li>
                        <a href="#" data-target="userManage" class="nav-header">
                            <i class="fa fa-user"></i> 用户管理<i class="fa fa-collapse"></i>
                        </a>
                    </li>
                    <li>
                        <ul class="userManage nav nav-list" style="display: none;border-bottom: 1px solid #ccc;">
                            <li><a href="${rootPath}/admin/member/list"><span class="fa fa-caret-right"></span> 用户列表</a></li>
                            <li><a href="${rootPath}/admin/verify/list"><span class="fa fa-caret-right"></span> 注册审核</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#" data-target="resourceManage" class="nav-header">
                            <i class="fa fa-folder"></i> 资源管理<i class="fa fa-collapse"></i>
                        </a>
                    </li>
                    <li>
                        <ul class="resourceManage nav nav-list" style="display: none;border-bottom: 1px solid #ccc;">
                            <li><a href="web-latest.html"><span class="fa fa-caret-right"></span> 资源1</a></li>
                            <li><a href="web-parameter.html"><span class="fa fa-caret-right"></span> 资源2</a></li>
                            <li><a href="web-bug.html"><span class="fa fa-caret-right"></span> 资源3</a></li>
                            <li><a href="${rootPath}/admin/resource/list"><span class="fa fa-caret-right"></span> 课程列表</a></li>
                            <li><a href="${rootPath}/admin/resource/add"><span class="fa fa-caret-right"></span> 课程添加</a></li>
                        </ul>
                    </li>

                    <li>
                        <a href="#" data-target="dashboard-menu3" class="nav-header">
                            <i class="fa fa-fw fa-group"></i>&nbsp;&nbsp;小组管理<i class="fa fa-collapse"></i>
                        </a>
                    </li>
                    <li>
                        <ul class="dashboard-menu3 nav nav-list" style="display: none;border-bottom: 1px solid #ccc;">
                            <li><a href="users-change.html"><span class="fa fa-caret-right"></span>小组1</a></li>
                        </ul>
                    </li>
                    <li><a href="${rootPath}/admin/news/list" data-target="dashboard-menu4" class="nav-header">
                        <i class="fa fa-fw fa-volume-up"></i>&nbsp;&nbsp;资讯管理</a></li>
                    <li>
                </ul>
            </div>



            <!--于此分左右层次-->
            <div class="content">





            </div>
        </div>

</div>


<script>
    $(document).ready(function () {
        $(".sidebar-nav a").click(function(){
            var tree="."+$(this).attr("data-target");
            $(tree).slideToggle(300);
            if($(this).hasClass("collapsed")){
                $(this).removeClass("collapsed");
            }else{
                $(this).addClass("collapsed");
            }
        })
    });
</script>

<%--<script>

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
            var msg="${loginMsg}";
//            var msg="abc";

            if(msg!=''){
                alertMessage(msg);
            }
        });
    });


</script>--%>

</body>
</html>
