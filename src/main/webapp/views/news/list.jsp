<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jeff
  Date: 16/2/27
  Time: 上午10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>资讯</title>
    <link rel="stylesheet" href="/assets/css/app.min.css">
</head>
<body onload="onLoad()">
    <jsp:include page="../common/header.jsp" />
    <jsp:include page="../common/breadcrumb.jsp" />
    <div class="main">
        <div class="container">
            <div id="adv-img" class="container-fluid">
                <div class="row">
                    <div class="col-md-6 img-left">
                        <a href="/news/view/${news.id}"><img src="${page.list.get(0).thumb}" alt="${page.list.get(0).title}"/></a>
                        <p>${page.list.get(0).title}</p>
                    </div>
                    <div class="col-md-6 img-right">
                        <div class="row">
                            <c:forEach begin="2" end="5" items="${page.list}" var="news" >
                                <div class="col-xs-6 img-right-small">
                                    <a href="/news/view/${news.id}"><img src="${news.thumb}" alt="${news.title}"/></a>
                                    <p>${news.title}</p>
                                </div>
                            </c:forEach>
                        </div>
                        <div class="clearfix visible-xs-block"></div>
                    </div>
                </div>

                <div id="adv-article">
                    <c:forEach begin="6" end="${page.list.size()}" items="${page.list}" var="news">
                        <div class="row">
                            <div class="col-md-12 floor">
                                <div class="row adv-article">
                                    <div class="col-md-4">
                                        <a href="/news/view/${news.id}" class="transition">
                                        <span class="image-wrapper">
                                            <img src="${news.thumb}" alt="${news.title}"/>
                                        </span>
                                        </a>
                                    </div>
                                    <div class="col-md-8">
                                        <div class="title"><a href="">${news.title}</a></div>
                                        <div class="decs">${news.description}</div>
                                        <div class="time"><i class="fa fa-clock-o"></i>上传时间: ${news.inputtime}</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="line"></div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
<jsp:include page="../common/footer.jsp" />
<script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
<script type="text/javascript"src="/assets/js/main.min.js"></script>
</body>
</html>