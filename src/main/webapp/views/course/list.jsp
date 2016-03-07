<%--
  Created by IntelliJ IDEA.
  User: jeff
  Date: 16/2/28
  Time: 上午10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>课程</title>
    <link rel="stylesheet" href="/xst/assets/css/app.min.css">
</head>
<body onload="onLoad()">
    <jsp:include page="../common/header.jsp" />
    <div class="main">
        <jsp:include page="../common/breadcrumb.jsp" />
        <div class="container">
            <div class="row">
                <div class="col-xs-3">
                    <div class="aside">
                        <div id="treedata">
                            <ul>
                                <c:forEach items="${rootCategories}" var="category">
                                    <li data-id="${category.id}">${category.name}</li>
                                </c:forEach>
                            </ul>
                        </div>
                        <div id="treeview"></div>
                    </div>
                </div>
                <div class="col-xs-9">
                    <div class="course-list">
                        <div class="row course">
                            <c:forEach items="${page.list}" var="resource">
                                <div class="col-md-4">
                                    <div class="course-item">
                                        <div class="course-thumb">
                                            <a href="/xst/resources/${resource.id}"><img src="/xst/assets/images/course.jpg" alt=""></a>
                                        </div>
                                        <div class="course-info">
                                            <div class="title"><a href="/xst/resources/${resource.id}">${resource.title}</a></div>
                                            <div class="desc"><p>课程描述课程描述课程描述课程描述课程描述课程描述课程描述课程描述</p></div>
                                            <div class="addon">
                                                <span class="author">作者</span>
                                                <span class="pull-right free">免费</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                    <!-- end of course-list -->
                    <%--<jsp:include page="/xst/views/course/common/pagination.jsp" />--%>

                </div>
            </div>
        </div>
    </div>
    <jsp:include page="../common/footer.jsp" />
    <script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
    <script type="text/javascript"src="/xst/assets/js/main.min.js"></script>
    <script>
        var treeData = initTree();
        var tree = $('#treeview').treeview({
            data: treeData,
            selectedColor: '#15c288',
            level: 5,
            selectedBackColor: '#fff',
            categoryUrl: '/xst/category/node/',
            resourceUrl: '/xst/course/view/',
            enableLinks: true
        });

        function initTree() {
            var arr = new Array();
            $('#treedata li').each(function(i, item) {
                arr.push({
                    text: $(item).html(),
                    id: $(item).attr('data-id'),
                    selectable: false,
                    hasChild: true
                })
            })
            $('#treedata').remove();
            return arr;
        }
    </script>
</body>
</html>
