<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jeff
  Date: 16/2/28
  Time: 下午2:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>课程</title>
    <link rel="stylesheet" href="/xst/assets/css/app.min.css">
</head>
<body>
<jsp:include page="../common/header.jsp" />
<div class="main">
    <jsp:include page="../common/breadcrumb.jsp" />
        <div class="container">
            <h3 class="main-title">${resource.title}</h3>
        </div>
        <div class="video-wrapper">
            <div class="container">
                <div class="video">
                    <img src="/xst/assets/images/bof.jpg" id="replaceImg" data-url="${resource.url}"/>
                </div>
                <div class="list">
                    <div class="tabs">
                        <a href="#">相关</a>
                    </div>
                    <ul class="related">
                        <c:forEach items="${siblings}" var="sibling" >
                            <li class="related-item"><a href="/xst/resources/${sibling.id}">
                                <span class="video-img"> <img src="/xst/assets/images/course.jpg" alt=""> </span>
                                <span class="video-title">${sibling.title}</span>
                                <span class="video-stat"><i class="fa fa-play-circle"></i>200<i class="fa fa-comment"></i>20</span>
                            </a></li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
</div>
        <jsp:include page="../common/footer.jsp" />
        <script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
        <script type="text/javascript"src="/xst/assets/js/main.min.js"></script>
        <script type="text/javascript">
            $(function(){
                var replaceImg = $("#replaceImg");
                var url = replaceImg.attr("data-url");
                getFlashHtml(url,replaceImg);
            });
        </script>
</body>
</html>
