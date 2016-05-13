<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>文库</title>
    <!--<script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>-->
    <link rel="stylesheet" href="${assetsPath}/css/app.min.css"/>
</head>
<body>
<jsp:include page="../common/header.jsp" />
<!-- end of header -->

<div class="main">
    <div class="container">
        <div class="breadcrumb-wrapper">
            <div class="container">
            <ol class="breadcrumb">
                <li><a href="/xst/index">首页</a></li>
                <li><a href="">文库</a></li>
                <li class="active"><a href="">所有资源</a></li>
            </ol>
            </div>
        </div>
        <div class="resource-menu">
            <div class="submenu">
                <ul>
                    <span>学段：</span>
                    <li class="active"><a href="">全部</a></li>
                    <li><a href="${rootPath}/library/1">学前</a></li>
                    <li><a href="${rootPath}/library/2">小学</a></li>
                    <li><a href="${rootPath}/library/3">初中</a></li>
                    <li><a href="${rootPath}/library/4">高中</a></li>
                </ul>
                <ul>
                    <span>学科：</span>
                    <li class="active"><a href="">全部</a></li>
                    <c:choose>
                        <c:when test="${empty docCategory.children}" >
                            <c:choose>
                            <c:when test="${id ==5||id==6}">

                                <li data-value="5" ><a href="${rootPath}/library/5">学前语文</a></li>
                                <li><a href="${rootPath}/library/6">学前数学</a></li>
                            </c:when>

                                <c:when test="${id >=7&&id<=9}">

                                    <li><a href="${rootPath}/library/7">小学语文</a></li>
                                    <li><a href="${rootPath}/library/8">小学数学</a></li>
                                    <li><a href="${rootPath}/library/9">小学英语</a></li>
                                </c:when>

                                <c:when test="${id >=10&&id<=18}">
                                    <li><a href="${rootPath}/library/11">初中数学</a></li>
                                    <li><a href="${rootPath}/library/12">初中英语</a></li>
                                    <li><a href="${rootPath}/library/13">初中物理</a></li>
                                    <li><a href="${rootPath}/library/14">初中化学</a></li>
                                    <li><a href="${rootPath}/library/15">初中生物</a></li>
                                    <li><a href="${rootPath}/library/16">初中政治</a></li>
                                    <li><a href="${rootPath}/library/17">初中历史</a></li>
                                    <li><a href="${rootPath}/library/18">初中地理</a></li>
                                </c:when>

                                <c:when test="${id >=19&&id<=28}">
                                    <li><a href="${rootPath}/library/19">高中语文</a></li>
                                    <li><a href="${rootPath}/library/20">高中数学</a></li>
                                    <li><a href="${rootPath}/library/21">高中英语</a></li>
                                    <li><a href="${rootPath}/library/22">高中物理</a></li>
                                    <li><a href="${rootPath}/library/23">高中化学</a></li>
                                    <li><a href="${rootPath}/library/24">高中生物</a></li>
                                    <li><a href="${rootPath}/library/25">高中政治</a></li>
                                    <li><a href="${rootPath}/library/26">高中历史</a></li>
                                    <li><a href="${rootPath}/library/27">高中地理</a></li>
                                    <li><a href="${rootPath}/library/28">信息技术</a></li>
                                </c:when>

                                <c:otherwise>
                                    <li data-value="5" ><a href="${rootPath}/library/5">学前语文</a></li>
                                    <li><a href="${rootPath}/library/6">学前数学</a></li>
                                </c:otherwise>
                            </c:choose>



                            <%--                           <c:when test="${id >=7||id==6}">
                                                           Salary is very good.
                                                           <li><a href="">学前语文</a></li>
                                                           <li><a href="">学前数学</a></li>
                                                       </c:when>--%>
                        </c:when>
                        <c:otherwise>
                            <c:forEach items="${docCategory.children}" var="firstCate">
                                <li><a href="${rootPath}/library/${firstCate.id}">${firstCate.name}</a></li>
                            </c:forEach>
                        </c:otherwise>
                    </c:choose>







<%--                    <li><a href="">语文</a></li>
                    <li><a href="">数学</a></li>
                    <li><a href="">英语</a></li>
                    <li><a href="">物理</a></li>
                    <li><a href="">化学</a></li>
                    <li><a href="">生物</a></li>
                    <li><a href="">政治</a></li>
                    <li><a href="">历史</a></li>
                    <li><a href="">地理</a></li>
                    <li><a href="">信息技术</a></li>--%>
                </ul>




                <ul>
                    <span>版本：</span>
                    <li class="active"><a href="">全部</a></li>
                    <li><a href="">人教版</a></li>
                    <li><a href="">苏教版</a></li>
                    <li><a href="">冀教版</a></li>
                    <li><a href="">教科版</a></li>
                    <li><a href="">北师大版</a></li>
                    <li><a href="">沪教版</a></li>
<%--                    <li><a href="">长春版</a></li>
                    <li><a href="">鲁教版</a></li>
                    <li><a href="">鄂教版</a></li>
                    <li><a href="">湘教版</a></li>
                    <li><a href="">北京版</a></li>
                    <li><a href="">语文A版</a></li>
                    <li><a href="">语文S版</a></li>
                    <li><a href="">西师大版</a></li>--%>
                </ul>
                <ul>
                    <span>年级：</span>
                    <li class="active"><a href="">全部</a></li>
                    <li><a href="">一年级</a></li>
                  <%--  <li><a href="">一年级下</a></li>--%>
                    <li><a href="">二年级</a></li>
                    <%--<li><a href="">二年级下</a></li>--%>
                    <li><a href="">三年级</a></li>
                    <%--<li><a href="">三年级下</a></li>--%>
                    <li><a href="">四年级</a></li>
                    <%--<li><a href="">四年级下</a></li>--%>
                    <li><a href="">五年级</a></li>
                    <%--<li><a href="">五年级下</a></li>--%>
                    <li><a href="">六年级</a></li>
                    <li><a href="">初一</a></li>
                    <li><a href="">初二</a></li>
                    <li><a href="">初三</a></li>
                    <li><a href="">高一</a></li>
                    <li><a href="">高二</a></li>
                    <li><a href="">高三</a></li>
                </ul>
            </div> 
        </div>    
        <!-- end of menu -->


        <div class="resource-result">
            <div class="result-sort">
                <div class="wrap">
                    <ul>
                        <li class="all">
                            <span>全部资源</span>
                        </li>
                        <li class="navmenu">
                            <a>发布时间<i class="fa fa-angle-down"></i></a>
                        </li>
                        <li class="navmenu">
                            <a>文件大小<i class="fa fa-angle-down"></i></a>
                        </li>
                    </ul>
                </div>
            </div>
            <!-- end of sort menu -->

            <div class="clear"></div>
            <c:forEach begin="${listStart}" end="${page.list.size()}" items="${page.list}" var="doc">
            <div class="result-list">
                <div class="row">
                    <div class="result-item">
                        <div class="col-xs-2 text-center">
                            <i class="fa fa-file-text fa-5x"></i>
                        </div>



                            <div class="col-xs-10">
                                <div class="title">
                                    ${doc.fileName}${doc.fileExt}
                                </div>
                                <div class="desc">
                                    ${doc.fileSize}
                                </div>
                                <div class="addon">
                                    <span><i class="fa fa-eye"></i>483</span>
                                    <span><i class="fa fa-download"></i>1002</span>
                                    <span><i class="fa fa-clock-o"></i>2016-02-12</span>
                                    <button class="btn btn-primary pull-right">
                                        <i class="fa fa-download"><a href="${assetsPath}/${doc.filePath}/${doc.fileName}${doc.fileExt}" download="${doc.fileName}${doc.fileExt}"> 下载</a></i>
                                    </button>
                                </div>
                            </div>

                        <div class="clear"></div>
                    </div>
                    </c:forEach>

            <!-- end of result list -->

            <nav>
              <ul class="pagination">
                <li><a href="#">上一页</a></li>
                <li class="active"><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li>
                  <a href="#">下一页</a>
                </li>
              </ul>
            </nav>
        </div>    
    </div>   
</div>
</div>

<jsp:include page="../common/footer.jsp" />
</div>
<script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
<script type="text/javascript" src="${assetsPath}/js/main.min.js"></script>

<script>
    $(function(){
        $(".navmenu").mouseover(function(){
            $(this).children("ul").show();
        })
        $(".navmenu").mouseout(function(){
            $(this).children("ul").hide();
        })
    })
</script>


    <script type="text/javascript">
        function display(){
            var all_options = $(".submenu li");
           // alert(all_options.length);
            for (var i=0; i<all_options.length; i++){
                if ($(all_options[i]).attr("data-value")=="${id}")
                {
                    //alert("active");
                    $(all_options[i]).addClass("active");
//                                all_options[i].selected = true;
                    break;
                }
            }
        };
        display();
    </script>
</body>
</html>