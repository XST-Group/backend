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
    <script src="${assetsPath}/ckeditor/ckeditor.js"></script>
    <script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>


<!--------------------
        header
--------------------->
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

        <div class="content-course">
            <form class="form-horizontal news-add" style="padding:50px" action="${rootPath}/admin/news/update/${news.id}" method="post">
                <div class="form-group">
                    <label  class="col-sm-2 control-label">添加资讯标题</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control"  name="title" value="${news.title}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">资讯概要</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" name="description" value="${news.description}">
                    </div>
                </div>
                <div class="form-group">
                    <label  class="col-sm-2 control-label">资讯内容</label>
                    <div class="col-sm-8">
                        <textarea  name="content" id="editor" class="form-control" rows="3" value="${news.content}"></textarea>
                    </div>
                </div>
                <div class="form-group">
                    <label  class="col-sm-2 control-label">资讯分组</label>
                    <div class="col-sm-3">
                        <select class="form-control" name="arr_group_id"  id="group">
                            <option value="1">语文课题小组</option>
                            <option value="2">英语课题小组</option>
                            <option value="3">数学专题小组</option>
                            <option value="4">化学专题小组</option>
                            <option value="5">物理专题小组</option>
                            <option value="6">地理专题小组</option>
                            <option value="7">生物专题小组</option>
                            <option value="8">历史专题小组</option>
                        </select>
                        <script type="text/javascript">
                            function display(){
                                var all_options = document.getElementById("group").options;
                                for (var i=0; i<all_options.length; i++){
                                    if ((","+all_options[i].value+",")=="${news.arrGroupId}")
                                    {
                                        all_options[i].selected = true;
                                        break;
                                    }
                                }
                            };
                            display();
                        </script>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">资讯类别</label>
                    <div class="col-sm-3">
                        <select class="form-control" name="type"  id="type">
                            <option value="教研">教研</option>
                            <option value="管理">管理</option>
                            <option value="综合">综合</option>
                            <option value="海外"  >海外</option>
                        </select>
                        <script type="text/javascript">
                            function display(){
                                var all_options = document.getElementById("type").options;
                                for (var i=0; i<all_options.length; i++){
                                    if (all_options[i].value=="${news.type}")
                                    {
                                        all_options[i].selected = true;
                                        break;
                                    }
                                }
                            };
                            display();
                        </script>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-success">提交</button>
                    </div>
                </div>
            </form>
        </div>
        <script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
        <script type="text/javascript"src="//cdn.bootcss.com/jquery.form/3.51/jquery.form.min.js"></script>
        <script type="text/javascript"src="${assetsPath}/js/main.min.js"></script>
        <script type="text/javascript">CKEDITOR.replace('content');</script>
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
</body>
</html>