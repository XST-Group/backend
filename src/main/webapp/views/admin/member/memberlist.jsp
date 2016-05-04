<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: CrazyCodess
  Date: 2016/5/1
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="utf-8">
    <title>用户列表</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!--<link href='http://fonts.useso.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>-->
    <link rel="stylesheet" href="${assetsPath}/css/app.min.css"/>
    <link rel="stylesheet" href="${assetsPath}/css/admin_manage.css"/>

    <script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>


<!--------------------
        header
--------------------->
<div class="main">
    <div class="admin">
        <jsp:include page="../header.jsp"/>

        <!--------------------
               nav
        --------------------->
        <jsp:include page="../sidebar.jsp"/>

        <!--于此分左右层次-->
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div>
                        <table class="table" width="100%">
                            <thead>
                            <tr>
                                <th width="16%">
                                    用户名
                                </th>
                                <th width="22%">
                                    邮箱
                                </th>
                                <th width="18%">
                                    注册日期
                                </th>
                                <th width="26%">
                                    单位
                                </th>
                            </tr>
                            </thead>
                            <tbody>


                            <c:forEach begin="1" end="${page.list.size()}" items="${page.list}" var="member">
                                <tr>
                                    <td>
                                        ${member.username}
                                    </td>
                                    <td>
                                            ${member.email}

                                    </td>
                                    <td>
                                            ${member.regdate}
                                    </td>
                                    <td>
                                            ${member.schoolAddress}
                                    </td>
                                </tr>


                            </c:forEach>


                            </tbody>
                        </table>

                        <nav>
                            <ul class="pagination">
                                <li><a href="#">上一页</a></li>
                                <li class="active"><a href="#">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a href="#">4</a></li>
                                <li><a href="#">5</a></li>
                                <li>
                                    <a href="#">下一页</a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
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

        <link rel="stylesheet" href="//cdn.bootcss.com/iCheck/1.0.2/skins/square/blue.css"/>

        <script src="//cdn.bootcss.com/iCheck/1.0.2/icheck.min.js"></script>
        <!--icheck-->
        <script>
            $(document).ready(function(){
                $('input').iCheck({
                    checkboxClass: 'icheckbox_square-blue',
                    radioClass: 'iradio_square-blue',
                    increaseArea: '20%' // optional
                });
            });
        </script>
</body>
</html>
