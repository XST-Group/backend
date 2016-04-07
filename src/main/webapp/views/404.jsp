<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>index</title>
    <link rel="stylesheet" href="${assetsPath}/css/app.css">
  </head>
  <body>
  <jsp:include page="common/header.jsp" />

    <div class="not-found-content">
      <div class="not-found">
        <img src="images/404.png" alt="" />
        <div class="">
          <h1>404</h1>
          <p>
            对不起！您要访问的页面不存在！
          </p>
          <a type="button" href="${rootPath}/index" class="btn btn-success" name="button">返回首页</a>
        </div>
      </div>
    </div>

  <jsp:include page="common/footer.jsp" />
  </body>
</html>
