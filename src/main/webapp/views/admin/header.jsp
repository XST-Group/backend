<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<div class="navbar" role="navigation">
  <div class="navbar-header">
    <a class="" href="index.html">
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
          <li><a href="./">个人中心</a></li>
          <li class="divider"></li>
          <li><a href="./">账号设置</a></li>
          <li><a href="./">意见反馈</a></li>
          <li class="divider"></li>
          <li><a tabindex="-1" href="sign-in.html">登出</a></li>
        </ul>
      </li>
    </ul>

  </div>
</div>