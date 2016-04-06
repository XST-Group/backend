<%--
  Created by IntelliJ IDEA.
  User: jeff
  Date: 16/4/6
  Time: 下午3:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>课程</title>
    <link rel="stylesheet" href="${assetsPath}/css/app.min.css">
</head>
<body onload="onLoad()">
<jsp:include page="../common/header.jsp" />
<div class="main">
    <div class="container">
        <div class="breadcrumb-wrapper">
            <ol class="breadcrumb">
                <li><a href="${rootPath}/index">首页</a></li>
                <li class="active"><a>所有小组</a></li>
            </ol>
        </div>
        <div class="group list">
            <div class="row">
                <c:forEach var="group" items="${page.list}">
                    <div class="col-xs-6 col-sm-3">
                        <div class="group-item">
                            <div class="group-thumb">
                                <a href="${rootPath}/group/${group.id}/resources"><img src="${group.thumb}" alt=""></a>
                            </div>
                            <div class="group-info">
                                <div class="title">${group.type}</div>
                                <a href="#" class="btn btn-primary">立即加入</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <jsp:include page="../common/pagination.jsp" />
        </div>
    </div>
</div>
<jsp:include page="../common/footer.jsp" />
<script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
<script type="text/javascript"src="${assetsPath}/js/main.min.js"></script>
</body>
</html>
