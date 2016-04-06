<%--
  Created by IntelliJ IDEA.
  User: jeff
  Date: 16/2/27
  Time: 上午10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>资讯</title>
    <link rel="stylesheet" href="${assetsPath}/css/app.min.css">
</head>
<body onload="onLoad()">
    <jsp:include page="../common/header.jsp" />
    <div class="main">
        <div class="container">
            <div class="breadcrumb-wrapper">
                <div class="breadcrumb-wrapper">
                    <ol class="breadcrumb">
                        <li><a href="${rootPath}/index">首页</a></li>
                        <li class="active"><a>所有资讯</a></li>
                    </ol>
                </div>
            </div>
            <div id="adv-img" class="container-fluid">
                <c:set var="listStart" value="0"></c:set>
                <c:if test="${page.pageNow == 1}" >
                    <div class="row">
                        <div class="col-md-6 img-left">
                            <a href="/xst/news/view/${page.list.get(0).id}"><img src="${page.list.get(0).thumb}" alt="${page.list.get(0).title}"/></a>
                            <p>${page.list.get(0).title}</p>
                        </div>
                        <div class="col-md-6 img-right">
                            <div class="row">
                                <c:forEach begin="2" end="5" items="${page.list}" var="news" >
                                    <div class="col-xs-6 img-right-small">
                                        <a href="/xst/news/view/${news.id}"><img src="${news.thumb}" alt="${news.title}"/></a>
                                        <p>${news.title}</p>
                                    </div>
                                </c:forEach>
                            </div>
                            <div class="clearfix visible-xs-block"></div>
                        </div>
                    </div>
                    <c:set var="listStart" value="6"></c:set>
                </c:if>


                <div id="adv-article">
                    <c:forEach begin="${listStart}" end="${page.list.size()}" items="${page.list}" var="news">
                        <div class="row">
                            <div class="col-md-12 floor">
                                <div class="row adv-article">
                                    <c:choose>
                                        <c:when test="${news.thumb != ''}" >
                                        <div class="col-md-4">
                                            <a href="/xst/news/view/${news.id}" class="transition">
                                            <span class="image-wrapper">
                                                <img src="${news.thumb}" alt="${news.title}"/>
                                            </span>
                                            </a>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="title"><a href="/xst/news/view/${page.list.get(0).id}">${news.title}</a></div>
                                            <div class="decs">${news.description}</div>
                                            <div class="time"><i class="fa fa-clock-o"></i>上传时间: ${news.inputtime}</div>
                                        </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="col-md-12">
                                                <div class="title"><a href="">${news.title}</a></div>
                                                <div class="decs">${news.description}</div>
                                                <div class="time"><i class="fa fa-clock-o"></i>上传时间: ${news.inputtime}</div>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                </div>
                            </div>
                        </div>
                        <div class="line"></div>
                    </c:forEach>
                </div>
            </div>
            <jsp:include page="../common/pagination.jsp" />
        </div>
    </div>
<jsp:include page="../common/footer.jsp" />
<script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
<script type="text/javascript"src="${assetsPath}/js/main.min.js"></script>
</body>
</html>