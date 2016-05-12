<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>首页</title>
    <link rel="stylesheet" href="${assetsPath}/css/app.min.css">
</head>
</head>
<body onload="onLoad()">
<jsp:include page="common/header.jsp" />
<section class="poster">
    <div class="slider">
        <div class="banner">
            <ul>
                <li style="background-image: url('${assetsPath}/images/01.jpg');"></li>
                <li style="background-image: url('${assetsPath}/images/03.jpg');"></li>
                <li style="background-image: url('${assetsPath}/images/02.jpg');"></li>
                <li style="background-image: url('${assetsPath}/images/04.jpg');"></li>
            </ul>
        </div>
        <a href="#" class="unslider-arrow prev"><i class="fa fa-angle-left"></i></a>
        <a href="#" class="unslider-arrow next"><i class="fa fa-angle-right"></i></a>
    </div>
</section>
<!-- end of poster -->

<section class="index-course index-section">
    <div class="container">
        <div class="head-course">
            <h2><span>推荐课程</span></h2>
            <div class="pull-right clearfix">
                <ul class="nav">
                    <li><a href=""  class="active">教研</a></li>
                    <li><a href="">管理</a></li>
                    <li><a href="">海外</a></li>
                    <li><a href="">综合</a></li>
                </ul>
            </div>
        </div>
        <div class="button-course button-left">
            <button type="button" name="button"><i class="fa fa-chevron-left"></i></button>
        </div>
        <div class="index-course-list course">
            <div class="row clearfix">
                <c:forEach var="resource" items="${resources.list}" begin="0" end="3">
                    <div class="col-sm-3 col-xs-6">
                        <div class="course-item">
                            <div class="course-thumb">
                                <a href="${rootPath}/resources/${resource.id}"><img src="${resource.thumb}" alt=""></a>
                            </div>
                            <div class="course-info">
                                <div class="title"><a href="">${resource.title}</a></div>
                                <div class="addon">
                                    <span class="author">作者</span>
                                    <span class="pull-right free">免费</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <div class="row clearfix">
                <c:forEach var="resource" items="${resources.list}" begin="4" end="7">
                    <div class="col-sm-3 col-xs-6">
                        <div class="course-item">
                            <div class="course-thumb">
                                <a href="${rootPath}/resources/${resource.id}"><img src="${resource.thumb}" alt=""></a>
                            </div>
                            <div class="course-info">
                                <div class="title"><a href="">${resource.title}</a></div>
                                <div class="addon">
                                    <span class="author">作者</span>
                                    <span class="pull-right free">免费</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</section>
<!-- end of index course -->

<section class="index-group index-section">
    <div class="container">
        <div class="head-course">
            <h2><span>热门小组</span></h2>
            <div class="pull-right clearfix">
                <ul class="nav">
                    <li><a href=""  class="active">教师中心</a></li>
                    <li><a href="">学习辅导</a></li>
                    <li><a href="">课外研修</a></li>
                    <li><a href="">文学创作</a></li>
                </ul>
            </div>
        </div>
        <div class="button-course button-left">
            <button type="button" name="button"><i class="fa fa-chevron-left"></i></button>
        </div>
        <div class="index-group-list group">
            <div class="row">
                <c:forEach var="group" items="${groups.list}" begin="0" end="3">
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
            <div class="row">
                <c:forEach var="group" items="${groups.list}" begin="4" end="7">
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
        </div>
        <div class="button-course button-right">
            <button type="button" name="button"><i class="fa fa-chevron-right"></i></button>
        </div>
    </div>
</section>
<!-- end of index group -->

<section class="index-about index-section">
    <div class="container">
        <h2><span>关于校视通</span></h2>
        <p>&nbsp;&nbsp;&nbsp;校视通是一家从事互联网免费教学的网络公益教育公司</p>
        <p>&nbsp;&nbsp;秉承“开拓、创新、开拓、创新、公平、分享”的精神，致力于为教育机构及求学者</p>
        <p>打造一站式互动在线教育品牌</p>
    </div>
</section>
<!-- end of index about -->

<section class="index-ad index-section">
    <div class="row">
        <div class="col-md-4 icon-1">
            <i class="fa fa-graduation-cap"></i>
            <h3>免费学习</h3>
            <p>校视通是一家从事互联网免费教学的网络公益教育公司秉承“开拓、创新、公平、分享”的精神致力于为教育机构及求学者打造教育品牌</p>
        </div>
        <div class="col-md-4 icon-2">
            <i class="fa fa-heart"></i>
            <h3>公益活动</h3>
            <p>校视通是一家从事互联网免费教学的网络公益教育公司秉承“开拓、创新、公平、分享”的精神致力于为教育机构及求学者打造教育品牌</p>
        </div>
        <div class="col-md-4 icon-3">
            <i class="fa fa-rocket"></i>
            <h3>学习计划</h3>
            <p>校视通是一家从事互联网免费教学的网络公益教育公司秉承“开拓、创新、公平、分享”的精神致力于为教育机构及求学者打造教育品牌</p>
        </div>
    </div>
    <div class="index-ad-button"><a href="${rootPath}/course/list" class="btn btn-default">立即开始学习</a></div>
</section>
<!-- end of index ad -->

<jsp:include page="common/footer.jsp" />

<script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
<script type="text/javascript"src="${assetsPath}/js/main.js"></script>
<script type="text/javascript"src="//cdn.bootcss.com/jquery.form/3.51/jquery.form.min.js"></script>
<script type="text/javascript"src="${assetsPath}/js/check_login.js"></script>
<script>
    $(function() {
        var unslider = $('.banner').unslider({
            fluid: true,
            dots: true
        });
        $('.unslider-arrow').click(function() {
            var fn = this.className.split(' ')[1];

            //  Either do unslider.data('unslider').next() or .prev() depending on the className
            unslider.data('unslider')[fn]();
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