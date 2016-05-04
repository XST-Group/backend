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
           <jsp:include page="sidebar.jsp"/>



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

</body>
</html>
