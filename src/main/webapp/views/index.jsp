<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link rel="stylesheet" href="/assets/css/app.min.css">
</head>
<body onload="onLoad()">
    <jsp:include page="common/header.jsp" />
    <section class="poster">
        <div class="slider">
            <div class="banner">
                <ul>
                    <li style="background-image: url('/assets/images/03.jpg');"></li>
                    <li style="background-image: url('/assets/images/02.jpg');"></li>
                </ul>
            </div>
            <a href="#" class="unslider-arrow prev"><i class="fa fa-angle-left"></i></a>
            <a href="#" class="unslider-arrow next"><i class="fa fa-angle-right"></i></a>
        </div>
    </section>
    <!-- end of poster -->

    <section class="index-course index-section">
        <div class="container">
            <h2><span>推荐课程</span></h2>
            <div class="index-course-list course">
                <div class="row clearfix">
                    <div class="col-sm-3 col-xs-6">
                        <div class="course-item">
                            <div class="course-thumb">
                                <a href=""><img src="/assets/images/course.jpg" alt=""></a>
                            </div>
                            <div class="course-info">
                                <div class="title"><a href="">课程课程课程</a></div>
                                <div class="desc"><p>课程描述课程描述课程描述课程描述课程描述课程描述课程描述课程描述</p></div>
                                <div class="addon">
                                    <span class="author">作者</span>
                                    <span class="pull-right free">免费</span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-3 col-xs-6">
                        <div class="course-item">
                            <div class="course-thumb">
                                <a href=""><img src="/assets/images/course.jpg" alt=""></a>
                            </div>
                            <div class="course-info">
                                <div class="title"><a href="">课程课程课程</a></div>
                                <div class="desc"><p>课程描述课程描述课程描述课程描述课程描述课程描述课程描述课程描述</p></div>
                                <div class="addon">
                                    <span class="author">作者</span>
                                    <span class="pull-right free">免费</span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-3 col-xs-6">
                        <div class="course-item">
                            <div class="course-thumb">
                                <a href=""><img src="/assets/images/course.jpg" alt=""></a>
                            </div>
                            <div class="course-info">
                                <div class="title"><a href="">课程课程课程</a></div>
                                <div class="desc"><p>课程描述课程描述课程描述课程描述课程描述课程描述课程描述课程描述</p></div>
                                <div class="addon">
                                    <span class="author">作者</span>
                                    <span class="pull-right free">免费</span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-3 col-xs-6">
                        <div class="course-item">
                            <div class="course-thumb">
                                <a href=""><img src="/assets/images/course.jpg" alt=""></a>
                            </div>
                            <div class="course-info">
                                <div class="title"><a href="">课程课程课程</a></div>
                                <div class="desc"><p>课程描述课程描述课程描述课程描述课程描述课程描述课程描述课程描述</p></div>
                                <div class="addon">
                                    <span class="author">作者</span>
                                    <span class="pull-right free">免费</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- end of index course -->

    <section class="index-group index-section">
        <div class="container">
            <h2><span>热门小组</span></h2>
            <div class="index-group-list group">
                <div class="row">
                    <div class="col-xs-6 col-sm-3">
                        <div class="group-item">
                            <div class="group-thumb">
                                <a href=""><img src="/assets/images/group.jpg" alt=""></a>
                            </div>
                            <div class="group-info">
                                <div class="title">小组名称</div>
                                <div class="desc">小组描述小组描述小组描述小组描述小组描述小组描述小组描述小组描述</div>
                                <a href="#" class="btn btn-primary">立即加入</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-6 col-sm-3">
                        <div class="group-item">
                            <div class="group-thumb">
                                <a href=""><img src="/assets/images/group.jpg" alt=""></a>
                            </div>
                            <div class="group-info">
                                <div class="title">小组名称</div>
                                <div class="desc">小组描述小组描述小组描述小组描述小组描述小组描述小组描述小组描述</div>
                                <a href="#" class="btn btn-primary">立即加入</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-6 col-sm-3">
                        <div class="group-item">
                            <div class="group-thumb">
                                <a href=""><img src="/assets/images/group.jpg" alt=""></a>
                            </div>
                            <div class="group-info">
                                <div class="title">小组名称</div>
                                <div class="desc">小组描述小组描述小组描述小组描述小组描述小组描述小组描述小组描述</div>
                                <a href="#" class="btn btn-primary">立即加入</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-6 col-sm-3">
                        <div class="group-item">
                            <div class="group-thumb">
                                <a href=""><img src="/assets/images/group.jpg" alt=""></a>
                            </div>
                            <div class="group-info">
                                <div class="title">小组名称</div>
                                <div class="desc">小组描述小组描述小组描述小组描述小组描述小组描述小组描述小组描述</div>
                                <a href="#" class="btn btn-primary">立即加入</a>
                            </div>
                        </div>
                    </div>
                </div>
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
        <div class="index-ad-button"><a href="" class="btn btn-default">立即开始学习</a></div>
    </section>
    <!-- end of index ad -->

    <jsp:include page="common/footer.jsp" />
    <script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
    <script type="text/javascript"src="/assets/js/main.min.js"></script>
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
</body>
</html>