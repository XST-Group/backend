<%--
  Created by IntelliJ IDEA.
  User: jeff
  Date: 16/2/27
  Time: 下午5:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>
<header>
    <div class="container">
        <div class="navbar-header pull-left"><a href="/xst/index" class="navbar-brand">
            <img src="${assetsPath}/images/logo.png" alt="Logo" class="img-responsive" width="90"></a>
        </div>
        <nav class="collapse navbar-collapse pull-left">
            <ul class="navbar-nav nav topmenu">
                <li><a href="${rootPath}/course/list">课程</a></li>
                <li><a href="${rootPath}/group/list">小组</a></li>
                <li><a href="#">活动</a></li>
                <li><a href="${rootPath}/news/list">资讯</a></li>
                <li><a href="${rootPath}/library/list">文库</a></li>
            </ul>
        </nav>
        <div class="pull-right user-nav clearfix">

            <ul class="nav nav-login">

                　<c:if test="${sessionScope.memberUser!=null}">

                　　<li><a href="#"> ${sessionScope.memberUser.username}</a></li>
                    <li><a href="${rootPath}/member/logout">退出登陆</a></li>
                　</c:if>
                　<c:if test="${sessionScope.memberUser ==null}">

                    　<li><a href="#" id="loginButton">登录</a></li>
                      <li><a href="${rootPath}/member/register">注册</a></li>

                　</c:if>

            </ul>
        </div>
        <form class="header-search  pull-right " action="index.html" method="post">
          <input type="text" name="name" value="" placeholder="搜索...">
          <button type="submit" name="button"><i class="fa fa-search"></i></button>
        </form>        
    </div>

</header>
<!-- end of header -->
