<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
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
    <link rel="stylesheet" href="${assetsPath}/css/app.min.css">
    <link href="//vjs.zencdn.net/5.8/video-js.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../common/header.jsp" />
<div class="main">
        <div class="container">
            <div class="breadcrumb-wrapper">
                <div class="breadcrumb-wrapper">
                    <ol class="breadcrumb">
                        <li><a href="${rootPath}/index">首页</a></li>
                        <li><a href="${rootPath}/course/list">课程</a></li>
                        <li class="active"><a>${resource.title}</a></li>
                    </ol>
                </div>
            </div>
            <h3 class="main-title">${resource.title}</h3>
        </div>
        <div class="video-wrapper">
            <div class="container">

                <%--支持本地播放mp4，但是本地没有mp4--%>
                <div class="video">
                    <video id="really-cool-video" class="video-js vjs-default-skin" controls
                           preload="auto" poster="really-cool-video-poster.jpg"
                           data-setup='{}'>
                        <source src="${assetsPath}/player/video.mp4" type="video/mp4">
                        <p class="vjs-no-js">
                            To view this video please enable JavaScript, and consider upgrading to a web browser
                            that <a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
                        </p>
                    </video>
                </div>

                <%--旧版的视频播放先保留--%>
                <%--<div class="video">--%>
                    <%--<video id="really-cool-video" class="video-js vjs-default-skin" controls--%>
                           <%--preload="auto" poster="really-cool-video-poster.jpg"--%>
                           <%--data-setup='{}'>--%>
                        <%--<source src="${resource.url}" type="video/flv">--%>

                        <%--<p class="vjs-no-js">--%>
                            <%--To view this video please enable JavaScript, and consider upgrading to a web browser--%>
                            <%--that <a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>--%>
                        <%--</p>--%>
                    <%--</video>--%>
                <%--</div>--%>

                <div class="list">
                    <div class="tabs">
                        <a href="#">相关</a>
                    </div>
                    <ul class="related">
                        <c:forEach items="${siblings}" var="sibling" >
                            <li class="related-item"><a href="/xst/resources/${sibling.id}">
                                <span class="video-img"> <img src="${sibling.thumb}" alt=""> </span>
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
        <script type="text/javascript"src="${assetsPath}/js/main.min.js"></script>
<script src="//vjs.zencdn.net/5.8/video.min.js"></script>
<script type="text/javascript">
    $(function(){
        videojs.options.flash.swf = "http://7xsohn.com1.z0.glb.clouddn.com/%40%2Fgroup%2Fvideo-js.swf"
        var player = videojs('really-cool-video', { /* Options */ }, function() {
            console.log('Good to go!');

            this.play(); // if you don't trust autoplay for some reason

            // How about an event listener?
            this.on('ended', function() {
                console.log('awww...over so soon?');
            });
        });
    });
</script>
</body>
</html>
