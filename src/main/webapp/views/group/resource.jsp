<%--
  Created by IntelliJ IDEA.
  User: jeff
  Date: 16/4/6
  Time: 下午3:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>小组</title>
    <link rel="stylesheet" href="${assetsPath}/css/app.min.css">
</head>
<body onload="onLoad()">
<jsp:include page="../common/header.jsp" />
<div class="main  gray-bg">
    <div class="container">
        <div class="breadcrumb-wrapper">
            <div class="breadcrumb-wrapper">
                <ol class="breadcrumb">
                    <li><a href="${rootPath}/index">首页</a></li>
                    <li><a href="${rootPath}/group/list">小组</a></li>
                    <li><a>${group.type}</a></li>
                </ol>
            </div>
        </div>

        <div class="group-header" style="background:url(${group.thumb});background-repeat: no-repeat;background-size: cover;">
            <div class="group-title">
                <div class="group-heading">
                    ${group.type}
                </div>
                <div class="group-metas">
                    20门课程
                    <span>45条资讯</span>
                    <span>创建时间： ${group.createTime}</span>
                </div>
            </div>
            <div class="image-overlay image-overlay-o"></div>
        </div>
        <!-- group-header -->

        <div class="row m-0">
            <div class="col-md-3">
                <div class="group-side">
                    <h3>小组介绍</h3>
                    <p>这是一个测试的小组,该小组并非实际小组!</p>
                    <a href="" class="btn btn-primary join-btn">加入小组</a>
                </div>
                <!-- group-side -->
            </div>

            <div class="col-md-9">
                <div class="group-main clearfix">
                    <div class="nav-filter clearfix mbl">
                        <ul class="nav nav-pills nav-pills-sm">
                            <li class="active"><a class="js-nav">课程</a></li>
                            <li><a href="${rootPath}/group/${group.id}/news" class="js-nav">资讯</a></li>
                        </ul>
                    </div>
                    <div class="course list">
                        <div class="row">
                        <c:forEach items="${page.list}" var="course">
                            <div class="col-md-4 col-xs-6">
                                <div class="course-item">
                                    <div class="course-thumb">
                                        <a href="${rootPath}/resources/${course.id}"><img src="${course.thumb}" alt=""></a>
                                    </div>
                                    <div class="course-info">
                                        <div class="title"><a href="${rootPath}/resources/${course.id}">${course.title}</a></div>
                                        <div class="desc"><p>${course.description}</p></div>
                                        <div class="addon">
                                            <span class="author">作者</span>
                                            <span class="pull-right charge">￥99.00</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    </div>
                    <div class="clearfix"></div>
                    <jsp:include page="../common/pagination.jsp" />
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../common/footer.jsp" />
<script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
<script type="text/javascript"src="${assetsPath}/js/main.min.js"></script>
</body>
</html>
