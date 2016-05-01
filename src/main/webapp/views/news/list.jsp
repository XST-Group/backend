<%--
  Created by IntelliJ IDEA.
  User: jeff
  Date: 16/2/27
  Time: 上午10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
            <div class="row">
                <div class="col-md-6 no-gap">
                    <div class="img-left">
                        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">

                            <ul class="img-listButton list-inline carousel-indicators">        <!--赋予了图形-->
                                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>     <!--改写active?-->
                                <li data-target="#carousel-example-generic" data-slide-to="1" class=""></li>
                                <li data-target="#carousel-example-generic" data-slide-to="2" class=""></li>
                            </ul>

                            <!-- Wrapper for slides -->
                            <div class="carousel-inner" role="listbox">
                                <div class="item active">
                                    <div class="img-block">
                                    <a href="/xst/news/view/${page.list.get(0).id}"><img src="${page.list.get(0).thumb}" alt=""/></a>
                                        <p>${page.list.get(0).title}</p>                        <!--与carousel-caption无法共存-->
                                    </div>
                                </div>                            
                                <c:forEach begin="1" end="5" items="${page.list}" var="news">
                                <div class="item">
                                    <div class="img-block">
                                         <a href="/xst/news/view/${news.id}"><img src="${news.thumb}" alt=""/></a>
                                        <p>${news.title}</p>                        <!--与carousel-caption无法共存-->
                                    </div>
                                </div>

                                </c:forEach>
                            </div>

                        </div>
                    </div>
                </div>

                <div class="col-md-6 no-gap">
                    <div class="img-right">
                        <ul>
                            <div class="title">主标题</div>
                                <div class="item active">
                                    <li><a href="/xst/news/view/${page.list.get(0).id}">${page.list.get(0).title}</a></li>
                                </div>
                                <c:forEach begin="1" end="5" items="${page.list}" var="news" varStatus="status">

                                <div class="item">
                                    <li><a href="/xst/news/view/${news.id}">${news.title}</a></li>
                                </div>

                                </c:forEach>                            
                        </ul>
                    </div>

                </div>
            </div>
            </div>

                <div id="adv-article">
                    <div class="nav">
                        <ul>
                            <span>分类:</span>
                            <c:if test="${type==null}"> <li><a href="${rootPath}/news/list" class="active">全部</a></li></c:if>
                            <c:if test="${type!=null}"> <li><a href="${rootPath}/news/list" >全部</a></li></c:if>

                            <c:if test="${type==1}"> <li><a href="${rootPath}/news/list/1" class="active">教研</a></li></c:if>
                            <c:if test="${type!=1}"> <li><a href="${rootPath}/news/list/1" >教研</a></li></c:if>

                            <c:if test="${type==2}"> <li><a href="${rootPath}/news/list/2" class="active">管理</a></li></c:if>
                            <c:if test="${type!=2}"> <li><a href="${rootPath}/news/list/2" >管理</a></li></c:if>

                            <c:if test="${type==3}"> <li><a href="${rootPath}/news/list/3" class="active">综合</a></li></c:if>
                            <c:if test="${type!=3}"> <li><a href="${rootPath}/news/list/3" >综合</a></li></c:if>

                            <c:if test="${type==4}"> <li><a href="${rootPath}/news/list/4" class="active">海外</a></li></c:if>
                            <c:if test="${type!=4}"> <li><a href="${rootPath}/news/list/4" >海外</a></li></c:if>
                            <%--<li><a href="${rootPath}/news/list/2">管理</a></li>--%>
                            <%--<li><a href="${rootPath}/news/list/3">综合</a></li>--%>
                            <%--<li><a href="${rootPath}/news/list/4">海外</a></li>--%>
                        </ul>
                    </div>

                    <c:forEach begin="${listStart}" end="${page.list.size()}" items="${page.list}" var="news">
                        <div class="row">
                            <div class="col-md-12 floor">
                                <div class="row adv-article">
                                    <c:choose>
                                        <c:when test="${news.thumb != ''}" >
                                        <div class="col-md-3">
                                            <a href="/xst/news/view/${news.id}" class="transition">
                                            <span class="image-wrapper">
                                                <img src="${news.thumb}" alt="${news.title}"/>
                                            </span>
                                            </a>
                                        </div>
                                        <div class="col-md-9">
                                            <div class="title"><a href="/xst/news/view/${page.list.get(0).id}">${news.title}</a></div>
                                            <div class="decs">${news.description}</div>
                                            <div class="time"><i class="fa fa-clock-o"></i>上传时间: ${news.inputtime}</div>
                                        </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="col-md-3">
                                                <a href="/xst/news/view/${news.id}" class="transition">
                                                    <span class="image-wrapper">
                                                        <img src="${assetsPath}/images/new_default_page.png" alt="${news.title}"/>
                                                    </span>
                                                </a>
                                            </div>

                                            <div class="col-md-9">
                                                <div class="title"><a href="/xst/news/view/${page.list.get(0).id}">${news.title}</a></div>
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
<script type="text/javascript" src="//cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script>
    $(function () {
        $(".navmenu").mouseover(function () {
            $(this).children("ul").show();
        })
        $(".navmenu").mouseout(function () {
            $(this).children("ul").hide();
        })
    })
</script>
</body>
</html>