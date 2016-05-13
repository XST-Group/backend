<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>课程</title>
    <link rel="stylesheet" href="${assetsPath}/css/app.min.css">
</head>
<body>
    <jsp:include page="../common/header.jsp" />
    <div class="main">
        <div class="container">
            <div class="breadcrumb-wrapper">
                <ol class="breadcrumb">
                    <li><a href="${rootPath}/index">首页</a></li>
                    <li class="active"><a href="${rootPath}/course/list">所有课程</a></li>
                </ol>
            </div>


            <div class="row">


                <div class="col-xs-12">
                    <div class="select-menu">
                        <ul class="select">

                            <li class="select-list">
                                <dl id="select1">
                                    <dt>分类：</dt>
                                    <c:if test="${nowFirstCate==null}">
                                        <c:set var="selectedOfClass" value="select-all selected"></c:set>
                                    </c:if>
                                    <dd class="${selectedOfClass}"><a href="${rootPath}/course/list">全部</a></dd>
                                    <c:forEach items="${rootCategories}" var="category">
                                        <c:if test="${nowFirstCate.catid == category.id}">
                                            <c:set var="selectedOfClass1" value="select-all selected"></c:set>
                                        </c:if>
                                        <dd class="${selectedOfClass1}"><a href="${rootPath}/course/${category.id}/1">${category.name}</a></dd>
                                        <c:set var="selectedOfClass1" value=""></c:set>
                                    </c:forEach>
                                </dl>
                            </li>

                            <li class="select-list">
                                <dl id="select2">
                                    <dt>阶段：</dt>
                                    <dd class='select-all selected' data-num='0'><a href='#'>全部</a></dd>
                                    <c:forEach items="${secondCates}" var="category2">
                                        <dd data-num="${category2.id}">
                                            <a href="${rootPath}/course/${category2.id}/1">${category2.name}</a>
                                        </dd>
                                    </c:forEach>
                                </dl>
                            </li>

                            <li class="select-list">
                                <dl id="select3">
                                    <dt>学科：</dt>
                                    <dd class='select-all selected' data-num='0'><a href='#'>全部</a></dd>
                                    <c:forEach items="${thirdCates}" var="category3">
                                        <dd data-num="${category3.id}"><a href="${rootPath}/course/${category3.id}/1">${category3.name}</a></dd>
                                    </c:forEach>
                                </dl>
                            </li>

                            <li class="select-result">
                                <dl>
                                    <dt>已选条件：</dt>
                                    <dd class="select-no">暂时没有选择过滤条件</dd>
                                </dl>
                            </li>

                        </ul>
                    </div>



                    <div class="course-list course">
                        <div class="row" id="courselist">
                            <c:forEach items="${page.list}" var="resource">
                                <div class="col-md-3">
                                    <div class="course-item">
                                        <div class="course-thumb">
                                            <a href="/xst/resources/${resource.id}"><img src="${resource.thumb}" alt=""></a>
                                        </div>
                                        <div class="course-info">
                                            <div class="title"><a href="/xst/resources/${resource.id}">${resource.title}</a></div>
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
                    <jsp:include page="../common/pagination.jsp" />

                </div>
            </div>
        </div>
    </div>

    <jsp:include page="../common/footer.jsp" />

    <script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
    <script type="text/javascript"src="${assetsPath}/js/main.min.js"></script>

</body>
</html>
