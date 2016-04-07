<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>校视通</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!--<link href='http://fonts.useso.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>-->
    <link rel="stylesheet" href="${assetsPath}/css/app.css"/>
    <%--<link rel="stylesheet" href="css/admin_manage.css"/>--%>
    <link rel="stylesheet" href="//cdn.bootcss.com/iCheck/1.0.2/skins/square/blue.css"/>
</head>
<body>


<!--------------------
        header
--------------------->
<div class="admin">
    <div class="navbar" role="navigation">
        <div class="navbar-header">
            <a class="" href="index">
            <span class="navbar-brand">
                <span class="fa fa-book"></span> 校视通
            </span>
            </a>
        </div>

        <div class="navbar-user" style="height: 1px;">
            <ul id="main-menu" class="nav navbar-nav navbar-right">
                <li class="dropdown hidden-xs">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <span class="fa fa-user padding-right-small" style="position:relative;top: 3px;"></span> xuzhao***.com
                        <i class="fa fa-caret-down"></i>
                    </a>

                    <ul class="dropdown-menu">
                        <li><a href="../resource">个人中心</a></li>
                        <li class="divider"></li>
                        <li><a href="../resource">账号设置</a></li>
                        <li><a href="../resource">意见反馈</a></li>
                        <li class="divider"></li>
                        <li><a tabindex="-1" href="sign-in.html">登出</a></li>
                    </ul>
                </li>
            </ul>

        </div>
    </div>

    <!--------------------
           nav
    --------------------->
    <div class="sidebar-nav">
        <ul>
            <li>
                <a href="#" data-target="userManage" class="nav-header">
                    <i class="fa fa-user"></i> 用户管理<i class="fa fa-collapse"></i>
                </a>
            </li>
            <li>
                <ul class="userManage nav nav-list" style="display: none;border-bottom: 1px solid #ccc;">
                    <li><a href="#"><span class="fa fa-caret-right"></span> 用户列表</a></li>
                    <li><a href="#"><span class="fa fa-caret-right"></span> 注册审核</a></li>
                </ul>
            </li>

            <li>
                <a href="#" data-target="resourceManage" class="nav-header">
                    <i class="fa fa-folder"></i> 资源管理<i class="fa fa-collapse"></i>
                </a>
            </li>
            <li>
                <ul class="resourceManage nav nav-list" style="display: none;border-bottom: 1px solid #ccc;">
                    <li><a href="web-latest.html"><span class="fa fa-caret-right"></span> 资源1</a></li>
                    <li><a href="web-parameter.html"><span class="fa fa-caret-right"></span> 资源2</a></li>
                    <li><a href="web-bug.html"><span class="fa fa-caret-right"></span> 资源3</a></li>
                    <li><a href="web-courselist.html"><span class="fa fa-caret-right"></span> 课程列表</a></li>
                    <li><a href="web-courseadd.html"><span class="fa fa-caret-right"></span> 课程添加</a></li>
                </ul>
            </li>

            <li>
                <a href="#" data-target="dashboard-menu3" class="nav-header">
                    <i class="fa fa-fw fa-group"></i>&nbsp;&nbsp;小组管理<i class="fa fa-collapse"></i>
                </a>
            </li>
            <li>
                <ul class="dashboard-menu3 nav nav-list" style="display: none;border-bottom: 1px solid #ccc;">
                    <li><a href="users-change.html"><span class="fa fa-caret-right"></span>小组1</a></li>
                </ul>
            </li>

            <li><a href="#" data-target="dashboard-menu4" class="nav-header"><i
                    class="fa fa-fw fa-volume-up"></i>&nbsp;&nbsp;资讯管理</a></li>
            <li>


        </ul>
    </div>


    <div class="content-course">

        <!--  课程添加   -->
        <form class="video-add">
          <h2 class="dash-head">课程添加</h2>
          <div class="form-group form-info">
            <label for="courseName">课程名称</label>
            <input type="text" class="form-control" id="courseName">
          </div>
          <div class="form-group form-info">
            <label for="courseTime">创建时间</label>
            <input type="datetime-local" class="form-control" id="courseTime">
          </div>
          <div class="form-group form-info">
            <label for="courseUrl">播放路径</label>
            <input type="url" class="form-control" id="courseUrl">
          </div>
          <div class="select">
            <div class="">
              <span>一级目录</span>
              <select class="form-control" id="category-select">
                  <option selected value="">请选择</option>
                  <c:forEach items="${firstCategorys}" var="category">
                      <option value="${category.id}">${category.name}</option>
                  </c:forEach>
              </select>
            </div>
            <div class="">
              <span>二级目录</span>
              <select class="form-control" id="second-category-select">
                  <c:forEach items="${categoryList}" var="category2">
                      <option value="${category2.id}">${category2.name}</option>
                  </c:forEach>
              </select>
            </div>
          </div>
          <div class="form-group inputFile">
            <label for="inputFile">上传视频</label>
            <input type="file" id="inputFile">
            <p class="help-block">支持MP4格式</p>
          </div>
          <button type="submit" class="btn btn-success btn-course">确定</button>
        </form>
        <!--  END 课程添加-->
    </div>

    <script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="//cdn.bootcss.com/iCheck/1.0.2/icheck.min.js"></script>
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

            $('input').iCheck({
                checkboxClass: 'icheckbox_square-blue',
                radioClass: 'iradio_square-blue',
                increaseArea: '20%' // optional
            });

            var category_select = $("#category-select"),
                    second_category_select = $("#second-category-select");
            category_select.change(function(){
                if(category_select.val() != "") {
                    loadCategory(category_select.val(),second_category_select);
                } else {
                    clearCategory(second_category_select);
                }
            });
        });

        function loadCategory(id , selector){
//            var url = "http://" + host + uri + id + ".json";
            var url = "http://localhost:8080/xst/category/node/"+id;
            $.getJSON(url , function(data){
                selector.empty();
                $.each(data,function(i, category){
                    var option = "<option value='" + category.id + "'>" + category.name + "</option>";
                    selector.append(option);
                });
            });
        }

        function clearCategory(selector) {
            selector.empty();
        }
    </script>

    <script type="text/javascript">
        function firstCategoryChange(){

        }

    </script>
</div>
  </body>
</html>
