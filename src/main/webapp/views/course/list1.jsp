<%--
  Created by IntelliJ IDEA.
  User: jeff
  Date: 16/2/28
  Time: 上午10:46
  To change this template use File | Settings | File Templates.
--%>
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
                                    <dd class="select-all selected"><a href="#">全部</a></dd>
                                    <c:forEach items="${rootCategories}" var="category">
                                        <dd data-num="${category.id}"><a href="${rootPath}/">${category.name}</a></dd>
                                    </c:forEach>
                                </dl>
                            </li>

                            <li class="select-list">
                                <dl id="select2">

                                </dl>
                            </li>

                            <li class="select-list">
                                <dl id="select3">

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
                            <%--<c:forEach items="${page.list}" var="resource">--%>
                                <%--<div class="col-md-3">--%>
                                    <%--<div class="course-item">--%>
                                        <%--<div class="course-thumb">--%>
                                            <%--<a href="/xst/resources/${resource.id}"><img src="${resource.thumb}" alt=""></a>--%>
                                        <%--</div>--%>
                                        <%--<div class="course-info">--%>
                                            <%--<div class="title"><a href="/xst/resources/${resource.id}">${resource.title}</a></div>--%>
                                            <%--<div class="addon">--%>
                                                <%--<span class="author">作者</span>--%>
                                                <%--<span class="pull-right free">免费</span>--%>
                                            <%--</div>--%>
                                        <%--</div>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</c:forEach>--%>
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

    <script>
        var select1 = $("#select1 dd");
        var select2 = $("#select2 dd");
        var select3 = $("#select3 dd");


        select1.click(function() {
            var cate_id = $(this).attr("data-num");
            if(cate_id==1){
                var dds = "<dt>阶段：</dt><dd class='select-all selected' data-num='0'><a href='#'>全部</a></dd>";
                loadCategory(cate_id,$("#select2"),dds);
            }else{
                $("#select2").empty();
                $("#select3").empty();
                $("#selectC").remove();
                $("#selectB").remove();
            }
            loadCourse(cate_id,$("#courselist"));
        });


        $(document).on("click","#select2 dd",function(){
                var cate_id = $(this).attr("data-num");
//            var cate_id = $(this).attr("data-num");

            if(cate_id!=0){
                    var dds = "<dt>学科：</dt><dd class='select-all selected' data-num='0'><a href='#'>全部</a></dd>";
                    loadCategory(cate_id,$("#select3"),dds);
                    $("#selectC").remove();
                    loadCourse(cate_id,$("#courselist"));
            }else{
                    $("#select3").empty();
                    $("#selectC").remove();
                }

            $(this).addClass("selected").siblings().removeClass("selected");
            if ($(this).hasClass("select-all")) {
                $("#selectB").remove();
            } else {
                var copyThisB = $(this).clone();
                if ($("#selectB").length > 0) {
                    $("#selectB a").html($(this).text());
                } else {
                    $(".select-result dl").append(copyThisB.attr("id", "selectB"));
                }
            }


            });


        function loadCategory(id , select , dds){
            var path = '<%=session.getAttribute("requestPath")%>';
            var url = path +"/category/node/"+id;

            console.log(path);
            console.log(url);

            $.getJSON(url , function(data){
                select.empty();
                if(data!=null){
                    $.each(data,function(i, category){
                        var dd = "<dd data-num='" + category.id +"'><a href='#'>"+category.name+"</a></dd>";
                        dds += dd;
                    });
                    console.log(dds);
                    select.html(dds);
                }

            });
         }


        function loadCourse(id , select){
            var path = '<%=session.getAttribute("requestPath")%>';
            var url = path +"/resources/pageleaf/"+id+"/1/20";
            var dds = "";
            console.log(path);
            console.log(url);

            $.getJSON(url , function(data){
                select.empty();
                if(data!=null){
                    $.each(data,function(course){
                        var cid = course.id;
                        var cthumb = course.thumb;
                        var ctitle = course.title;
                        var dd = "<div class='col-md-3'><div class='course-item'><div class='course-thumb'>"
                                +"<a href='/xst/resources/"+cid+"'><img src='"+cthumb+"' alt=''>"
                                +"</a></div><div class='course-info'><div class='title'>"
                                +"<a href='/xst/resources/"+cid+"'>"+ctitle+"</a></div>"
                                +"<div class='addon'><span class='author'>作者</span><span "
                                +"class='pull-right free'>免费</span></div></div></div>";
                        dds += dd;
                    });
                    console.log(dds);
                    select.html(dds);
                }

            });
        }



        $(document).on("click","#select3 dd",function(){
            $(this).addClass("selected").siblings().removeClass("selected");
            if ($(this).hasClass("select-all")) {
                $("#selectC").remove();
            } else {
                var copyThisC = $(this).clone();
                if ($("#selectC").length > 0) {
                    $("#selectC a").html($(this).text());
                } else {
                    $(".select-result dl").append(copyThisC.attr("id", "selectC"));
                }
            }
            var cate_id = $(this).attr("data-num");
            loadCourse(cate_id,$("#courselist"));

        });


    </script>


</body>
</html>
