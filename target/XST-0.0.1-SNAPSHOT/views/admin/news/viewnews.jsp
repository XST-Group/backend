<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page isELIgnored="false" %>
<%@page import="com.ckeditor.CKEditorConfig"%>
<%@page import="com.ckeditor.EventHandler"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="ckeditor" uri="http://ckeditor.com"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>校视通</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!--<link href='http://fonts.useso.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>-->
    <link rel="stylesheet" href="${assetsPath}/css/app.min.css"/>
   <%-- <link rel="stylesheet" href="${assetsPath}/css/admin_manage.css"/>--%>
    <script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>



<div class="main">
    <div class="admin">

        <!--------------------
        header
        --------------------->
        <jsp:include page="../header.jsp"/>
        <!--------------------
               nav
        --------------------->
        <jsp:include page="../sidebar.jsp"/>
        <div class="content-course"<%--"container"--%>  style="background:#fdfdfd">

            <div id="advisory-hit-topic" class="container-fluid">
                <div class="row">
                    <div  class="topic col-md-12">
                        <div class="row">
                            <div class="topic-main col-md-12">
                                <div class="article"   >
                                    <h3>
                                        ${news.title}
                                    </h3>
                                    <blockquote>
                                        <p>
                                            ${news.description}
                                        </p>
                                    </blockquote>

                                    <div class="article-main">
                                        ${news.content}
                                            <div class="label-ad">
                                                <ul>
                                                    <span>标签：</span>
                                                    <li>高中</li>
                                                    <li>语文</li>
                                                    <li>ppt</li>
                                                    <div class="clearfix"></div>
                                                </ul>
                                            </div>
                                    </div>
                                    <div class="line"></div>
                                    <div class="addon">
                                        <div class="good pull-left">
                                            <a href=""><i class="fa fa-thumbs-up"></i></a>
                                            <span>2333</span>
                                        </div>

                                        <div class="contact-icon pull-right">
                                            <span>分享到：</span>
                                            <a href=""><i class="contact-icon fa fa-weibo"></i></a>
                                            <a href=""><i class="contact-icon fa fa-weixin"></i></a>
                                            <a href=""><i class="contact-icon fa fa-qq"></i></a>
                                            <a href=""><i class="contact-icon fa fa-renren"></i></a>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                </div>
                                <div class="comment">
                                    <div class="title">文章评论</div>
                                    <!--<div class="comment-main">-->
                                    <!--<p>总体来讲，互联网的介入的确在不同程度上去除掉了一些不必要的中介环节，提升企业招聘效率。但平台在信息匹配之外的扩展上还没有</p>-->
                                    <textarea name="post" id=""  class="comment-main" placeholder="发表评论..."></textarea>
                                    <!--</div>-->
                                    <button class="btn btn-primary pull-right">提交评论</button>
                                    <div class="clear"></div>

                                    <div class="line"></div>

                                    <nav>
                                        <ul class="pagination pull-right">
                                            <li><a href="#">上一页</a></li>
                                            <li class="active"><a href="#">1</a></li>
                                            <li><a href="#">2</a></li>
                                            <li><a href="#">3</a></li>
                                            <li><a href="#">4</a></li>
                                            <li><a href="#">5</a></li>
                                            <li>
                                                <a href="#">下一页</a>
                                            </li>
                                        </ul>
                                        <div class="clearfix"></div>
                                    </nav>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <script>
    $(document).ready(function () {
        $(".sidebar-nav a").click(function(){
            var tree="."+$(this).attr("data-target");
            $(tree).slideToggle(300);
            if($(this).hasClass("collapsed")){
                $(this).removeClass("collapsed");
            }else{
                $(this).addClass("collapsed");
            }
        })
    });
</script>
        <script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
        <script type="text/javascript"src="//cdn.bootcss.com/jquery.form/3.51/jquery.form.min.js"></script>
        <script type="text/javascript"src="${assetsPath}/js/main.min.js"></script>

</body>
</html>