<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>校视通</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!--<link href='http://fonts.useso.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>-->
    <link rel="stylesheet" href="${assetsPath}/css/app.min.css"/>

    <script type="text/javascript" src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>


<div class="main">
    <div class="admin">
        <!--------------------
                header
        --------------------->
        <jsp:include page="../header.jsp"/>

        <!--------------------
               nav
        --------------------->
        <jsp:include page="../sidebar.jsp"/>


        <!--于此分左右层次-->
        <div class="content">
            <div class="container-fluid">
                <div class="advisory-manage-content">

                    <div class="row button-group">
                        <div class="col-md-3">
                            <button id="allChoose" class="btn btn-sm btn-info">全选</button>
                            <button id="toggleChoose" class="btn btn-sm btn-info">反选</button>
                            <button id="allDel" class="btn btn-sm btn-danger"><i class="fa fa-trash-o"></i>批量删除</button>
                        </div>
                        <div class="col-md-4">
                            <a href="${rootPath}/views/admin/news/addNews.jsp" ><button class="btn btn-sm btn-info"><i class="fa fa-plus"></i>&nbsp;新增</button></a>
                            <button class="btn btn-sm btn-info"><i class="fa fa-share"></i>&nbsp;导入</button>
                            <button class="btn btn-sm btn-info"><i class="fa fa-share fa-rotate-180"></i>&nbsp;导出</button>
                        </div>
                        <div class="col-md-4">
                            <form class="form-group" action="">
                                <div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1"><i class="fa fa-search"></i>搜索</span>
                                    <input type="text" class="form-control" placeholder="搜索..."
                                           aria-describedby="basic-addon1">
                                </div>
                                <button class="btn btn-sm btn-warning pull-right">查询</button>
                                <div class="clearfix"></div>
                            </form>
                        </div>
                        <div class="col-md-1">
                            <button class="btn btn-sm btn-warning pull-right">高级查询</button>
                            <div class="clearfix"></div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-12">
                            <table class="table" width="100%">
                                <thead>
                                <tr class="active">
                                    <th width="10%">
                                        <br/>选择
                                    </th>
                                    <th width="10%">
                                        序号
                                    </th>
                                    <th width="20%">
                                        标题
                                    </th>
                                    <th width="10%">
                                        作者
                                    </th>
                                    <th width="25%">
                                        内容
                                    </th>
                                    <th style="text-align: center">
                                        基本操作
                                    </th>
                                </tr>
                                </thead>
                                <tbody>


                                <c:forEach begin="1" end="${page.list.size()}" items="${page.list}" var="news">
                                    <tr>
                                        <td>
                                            <input type="checkbox" value="1" name=""/>
                                        </td>
                                        <td>
                                            ${news.id}
                                        </td>
                                        <td>
                                            <div class="title">
                                                ${news.title}
                                            </div>
                                        </td>
                                        <td>
                                            ${news.username}
                                        </td>
                                        <td class="text">
                                            <!--<div class="text">-->
                                            ${news.description}
                                            <!--</div>-->
                                        </td>
                                        <td style="text-align: center">
                                           <a href="${rootPath}/admin/news/view/${news.id}"> <button class="btn btn-warning btn-sm"><i class="fa fa-search"></i>查看</button></a>
                                            <a href="${rootPath}/admin/news/edit/${news.id}">  <button class="btn btn-info btn-sm"><i class="fa fa-pencil"></i>编辑</button></a>
                                            <a href="${rootPath}/admin/news/delete/${news.id}"> <button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i>删除</button></a>
                                            <%--<button class="btn btn-danger btn-sm delone"><i class="fa fa-trash-o"></i>删除</button>--%>
                                        </td>
                                    </tr>
                                </c:forEach>

                                </tbody>
                            </table>

                            <nav>
<%--                                <ul class="pagination">
                                    <li><a href="#">上一页</a></li>
                                    <li class="active"><a href="#">1</a></li>
                                    <li><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                    <li><a href="#">4</a></li>
                                    <li><a href="#">5</a></li>
                                    <li>
                                        <a href="#">下一页</a>
                                    </li>
                                </ul>--%>
    <jsp:include page="../../common/pagination.jsp" />
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>
<script>
    $(document).ready(function () {
        $(".sidebar-nav a").click(function () {
            var tree = "." + $(this).attr("data-target");
            $(tree).slideToggle(300);
            if ($(this).hasClass("collapsed")) {
                $(this).removeClass("collapsed");
            } else {
                $(this).addClass("collapsed");
            }
        })
    });
</script>

<link rel="stylesheet" href="//cdn.bootcss.com/iCheck/1.0.2/skins/square/blue.css"/>

<script src="//cdn.bootcss.com/iCheck/1.0.2/icheck.min.js"></script>
<!--icheck-->
<script>
    $(document).ready(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' // optional
        });
    });
</script>
<!--全选-->
<script>
    $("#allChoose").click(function(){
        $('input').iCheck('check');
    });
    $("#toggleChoose").click(function(){
        $('input').iCheck('toggle');
    });
</script>

<script>

    $(function(){
        function alertMessage(message) {
            var insert =
                    "<div class='suspend' style='width: 100%;height: 100%;display: none;z-index: 2;background-color: rgba(0,0,0,.6);position: fixed;top: 0;left: 0;'>" +
                    "<div class='suspend-content' style='text-align:right;padding: 30px 40px;width: 400px;height: 200px;background-color: #fff;border-radius: 4px;position: fixed;top: 26%;left: 36%;'>" +
                    "<p class='alertMessage' style='text-align:left;font-size: 22px;height: 80px;color: #000;font-weight: bold;margin-bottom: 30px;'></p>" +
                    " <button type='button' class='btn btn-success'>确定</button>" +
                    "</div>" +
                    "</div>";
            $('body').append(insert);
            $('.alertMessage').html(message);
            $('.suspend').css('display','block');
            $('.btn').on('click',function(){
                $('.suspend').css('display','none');
            });


        };
        $(document).ready(function () {
            var msg="${Msg}";
//            var msg="abc";

            if(msg!=''){
                alertMessage(msg);
            }
        });
    });


</script>
</body>
</html>
