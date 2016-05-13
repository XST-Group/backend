<%--
  Created by IntelliJ IDEA.
  User: jeff
  Date: 16/2/28
  Time: 上午11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<div class="breadcrumb-wrapper">
    <div class="container">
        <ol class="breadcrumb">
            <li><a href="/index">首页</a></li>
            <c:forEach var="entry" items="${sessionScope.currentBreadCrumb}">
                <c:choose>
                    <c:when test="${entry.currentPage == true}">
                        <li class="active"><a href="">${entry.label}</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="${entry.url}">${entry.label}></a></li>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </ol>
    </div>
</div>