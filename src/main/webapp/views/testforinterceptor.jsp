<%--
  Created by IntelliJ IDEA.
  User: sl
  Date: 16-3-3
  Time: 下午8:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FirstInterceptor测试专用</title>
</head>
<body>
<%!
    String index;
%>
    <%
//        session.setAttribute("index","123");
      index = session.getAttribute("assetsPath").toString();
    %>
      <%= index %>

</body>
</html>
