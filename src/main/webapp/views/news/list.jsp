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
                        <a href="#"><img src="./images/course.jpg " alt=""/></a>
                        <p>这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题这是一个标题</p>
                    </div>
                    <div class="col-md-6 img-right">
                        <div class="row">
                            <div class="col-xs-6 img-right-small">
                                <a href="#"><img src="./images/course.jpg " alt=""/></a>
                                <p>这是一个小标题这是一个小标题这是一个小标题</p>
                            </div>
                            <div class="col-xs-6 img-right-small">
                                <a href="#"><img src="./images/course.jpg " alt=""/></a>
                                <p>这是一个小标题这是一个小标题这是一个小标题]</p>
                            </div>
                        </div>
                        <div class="clearfix visible-xs-block"></div>
                        <div class="row">
                            <div class="col-xs-6 img-right-small">
                                <a href="#"><img src="./images/course.jpg " alt=""/></a>
                                <p>这是一个小标题这是一个小标题这是一个小标题]</p>
                            </div>
                            <div class="col-xs-6 img-right-small">
                                <a href="#"><img src="./images/course.jpg " alt=""/></a>
                                <p>这是一个小标题这是一个小标题这是一个小标题]</p>
                            </div>
                        </div>
                    </div>
                </div>

                <div id="adv-article">
                    <div class="row">
                        <div class="col-md-12 floor">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="row">
                                        <div class="col-md-4">
                                            <img src="images/course.jpg" alt=""/>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="title"><a href="">这是一个标题</a></div>
                                            <div class="decs">描述描述描述描述描述描述描述描述描述描述描述描述描述描述描述描述描述描述</div>
                                            <div class="time"><i class="fa fa-clock-o"></i>上传时间2016-2-27</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="line"></div>

                    <div class="row">
                        <div class="col-md-12 floor">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="row">
                                        <div class="col-md-4">
                                            <img src="images/course.jpg" alt=""/>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="title"><a href="">这是一个标题</a></div>
                                            <div class="decs">描述描述描述描述描述描述描述描述描述描述描述描述描述描述描述描述描述描述</div>
                                            <div class="time"><i class="fa fa-clock-o"></i>上传时间2016-2-27</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
        </div>
    </div>
    <jsp:include page="../common/footer.jsp" />
    <script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
    <script type="text/javascript"src="/assets/js/main.min.js"></script>
</body>
</html>
