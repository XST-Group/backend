<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page isELIgnored="false" %>
<%@page import="com.ckeditor.CKEditorConfig"%>
<%@page import="com.ckeditor.EventHandler"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="ckeditor" uri="http://ckeditor.com"%>
<html>
<head>
    <title>添加资讯</title>
<%--    <script type="text/javascript" src="/resources/ckeditor/ckeditor.js"></script>
    <script type="text/javascript" src="/resources/ckeditor/samples/js/samples.js"></script>--%>
    <script src="${assetsPath}/ckeditor/ckeditor.js"></script>

</head>
<body>
<form action="/xst/admin/news/add" method="post">
    <br border="0">
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
         </tr>
            <td>描述</td>
            <td><input type="text" name="description"/>
            </td>
        <tr>
        <tr>
            <td>资讯内容</td>
            <td><textarea  name="content" id="editor"></textarea>
                <script type="text/javascript">CKEDITOR.replace('editor');</script>
            </td>
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
        <tr>
            <td>类别</td>
            <td><input type="text" name="type"/></td>
        </tr>
    </table>
    <button type="submit" name="submit">提交</button>
</form>
</body>
</html>
