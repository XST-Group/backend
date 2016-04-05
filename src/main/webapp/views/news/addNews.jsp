<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2016/4/5
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加资讯</title>
</head>
<body>
<form action="/xst/addNews/add" method="post">
    <table border="0">
        <th colspan="2">添加资讯</th>
        <tr>
            <td>catid</td>
            <td><input type="text" name="catid"/></td>
        </tr>
        <tr>
            <td>typeid</td>
            <td><input type="text" name="typeid"/></td>
        </tr>
        <tr>
            <td>标题</td>
            <td><input type="text" name="title"/></td>
        </tr>
        <tr>
            <td>style</td>
            <td><input type="text" name="style"/></td>
        </tr>
        <tr>
            <td>图片URL</td>
            <td><input type="text" name="thumb"/></td>
        </tr>
        <tr>
            <td>keywords</td>
            <td><input type="text" name="keywords"/></td>
        </tr>
        <tr>
            <td>资讯内容</td>
            <td><textarea rows="3" cols="20" name="description"></textarea></td>
        </tr>
        <tr>
            <td>url</td>
            <td><input type="text" name="url"/></td>
        </tr>
        <tr>
            <td>listorder</td>
            <td><input type="text" name="listorder"/></td>
        </tr>
        <tr>
            <td>status</td>
            <td><input type="text" name="status"/></td>
        </tr>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>所属分组</td>
            <td><input type="text" name="arr_group_id"/></td>
        </tr>
    </table>
    <button type="submit" name="submit">提交</button>
</form>
</body>
</html>
