<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<div class="sidebar-nav">
  <ul>
    <li>
      <a href="#" data-target="userManage" class="nav-header">
        <i class="fa fa-user"></i> 用户管理<i class="fa fa-collapse"></i>
      </a>
    </li>
    <li>
      <ul class="userManage nav nav-list" style="display: none;border-bottom: 1px solid #ccc;">
        <li><a href="${rootPath}/admin/member/list"><span class="fa fa-caret-right"></span> 用户列表</a></li>
        <li><a href="${rootPath}/admin/verify/list"><span class="fa fa-caret-right"></span> 注册审核</a></li>
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
        <li><a href="${rootPath}/admin/resource/list"><span class="fa fa-caret-right"></span> 课程列表</a></li>
        <li><a href="${rootPath}/admin/library/list"><span class="fa fa-caret-right"></span> 文库列表</a></li>
        <li><a href="${rootPath}/admin/resource/add"><span class="fa fa-caret-right"></span> 课程添加</a></li>
        <li><a href="${rootPath}/views/admin/library/libraryadd.jsp"><span class="fa fa-caret-right"></span> 文库添加</a></li>
      </ul>
    </li>

    <li>
      <a href="#" data-target="dashboard-menu3" class="nav-header">
        <i class="fa fa-fw fa-group"></i>&nbsp;&nbsp;小组管理<i class="fa fa-collapse"></i>
      </a>
    </li>
    <li>
      <ul class="dashboard-menu3 nav nav-list" style="display: none;border-bottom: 1px solid #ccc;">
        <li><a href="#"><span class="fa fa-caret-right"></span>小组1</a></li>
      </ul>
    </li>
    <li><a href="${rootPath}/admin/news/list" data-target="dashboard-menu4" class="nav-header">
      <i class="fa fa-fw fa-volume-up"></i>&nbsp;&nbsp;资讯管理</a></li>
  </ul>
</div>