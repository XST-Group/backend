<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: CrazyCodess
  Date: 2016/5/1
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                                    审核日期
                                </th>
                                <th width="24%">
                                    单位
                                </th>
                                <th>
                                    基本操作
                                </th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach begin="1" end="${page.list.size()}" items="${page.list}" var="verify">
                                <tr>
                                    <td>
                                            ${verify.username}
                                    </td>
                                    <td>
                                            ${verify.email}

                                    </td>
                                    <td>
                                            ${verify.regdate}
                                    </td>
                                    <td>
                                            ${verify.schoolAddress}
                                    </td>
                                    <td>
                                       <a href="${rootPath}/admin/member/accept/${verify.userid}" ><button class="btn btn-primary btn-sm">同意</button></a>
                                        <a href="${rootPath}/admin/member/refuse/${verify.userid}" > <button class="btn btn-danger btn-sm">拒绝</button></a>
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
            var msg="${Msg}";
//            var msg="abc";

            if(msg!=''){
                alertMessage(msg);
            }

        });
    });


</script>
</body>
</html>
