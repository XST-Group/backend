<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

    <script type="text/javascript"src="//cdn.bootcss.com/jquery/2.2.0/jquery.min.js"></script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>


<!--------------------
        header
--------------------->
<div class="main">
    <div class="admin">
        <jsp:include page="../header.jsp" />
        <!--------------------
               nav
        --------------------->
        <jsp:include page="../sidebar.jsp"/>


        <div class="content-course" id="libraryadd">
            <!--  课程添加   -->
            <h2 class="dash-head">文库添加</h2>
            <form class="video-add" name="form1" id="form1" action="${rootPath}/admin/library/add"
                  method="post" enctype="multipart/form-data" target="if" <%--onsubmit="return go()"--%> >
<%--                <div class="form-group form-info">
                    <label for="courseName">文档类型</label>
                    <input type="text" class="form-control" id="courseName" name="doctype" value="">
                </div>--%>
                <div class="select">
                    <div class="">
                        <span>&nbsp;文档类型</span>
                        <select class="form-control" id="doctype" name="doctype">
                            <%--<option selected value="">请选择</option>--%>
                            <option value="教案">教案</option>
                            <option value="课件" >课件</option>
                            <option value="学案">学案</option>
                            <%--<option value="4">高中</option>--%>
                        </select>
                    </div>
                    <%--<input type="text" class="form-control" id="courseName" name="doctype" value="">--%>
                </div>
                <div class="select">
                    <div id="select-category">
                        <span>&nbsp;&nbsp;&nbsp;分&nbsp;&nbsp;类&nbsp;&nbsp;&nbsp;</span>
                        <select class="form-control" id="category" name="cate1">
                            <option selected value="">请选择</option>
                            <option value="1">学前</option>
                            <option value="2">小学</option>
                            <option value="3">初中</option>
                            <option value="4">高中</option>
                        </select>
                        <span id="sp">阶&nbsp;&nbsp;段</span>
                        <select class="form-control" id="first-category-select" name="cate2" >
                            <option value="5">学前语文</option>
                            <option value="6">学前数学</option>
                        </select>
                        <select class="form-control" id="second-category-select" name="cate2" >
                            <option value="7">小学语文</option>
                            <option value="8">小学数学</option>
                            <option value="9">小学英语</option>
                        </select>
                        <select class="form-control" id="third-category-select" name="cate2" >
                            <option value="10">初中语文</option>
                            <option value="11">初中数学</option>
                            <option value="12">初中英语</option>
                            <option value="13">初中物理</option>
                            <option value="14">初中化学</option>
                            <option value="15">初中生物</option>
                            <option value="16">初中政治</option>
                            <option value="17">初中历史</option>
                            <option value="18">初中地理</option>
                        </select>
                        <select class="form-control" id="fourth-category-select" name="cate2">
                            <option value="19">高中语文</option>
                            <option value="20">高中数学</option>
                            <option value="21">高中英语</option>
                            <option value="22">高中物理</option>
                            <option value="23">高中化学</option>
                            <option value="24">高中生物</option>
                            <option value="25">高中政治</option>
                            <option value="26">高中历史</option>
                            <option value="27">高中地理</option>
                            <option value="28">信息技术</option>
                        </select>

                    </div>
                </div>

                <div class="form-group inputFile" >
                    <label for="inputFile">上传文件</label>
                    <input type="file" id="inputFile" name="doc" value=""/>
                    <span class="help-block">支持各种</span>
                </div>
                <input type="submit" class="btn btn-success" value="上传" />
            </form>
            <!--  END 课程添加-->
            <iframe id="if" name="if" src="" style="display: none"></iframe>

        </div>

    </div>
</div>
<script type="text/javascript">
    window.onload = function(){
        var selects = document.getElementById("select-category").getElementsByTagName('select');
        var sp = document.getElementById("sp");
        for(var i=1;i<selects.length;i++){
            selects[i].style.display = 'none';
        }
        sp.style.display='none';
        document.getElementById("category").addEventListener("change",function(){
            sp.style.display = 'inline-block';
            //console.log(this.value);
            if(this.value=="1"){
                for(var i=1;i<selects.length;i++){
                    selects[i].style.display = 'none';
                }
                selects[1].style.display = 'inline-block';
                //alert(this.value);
                //document.getElementById("second-category-select").options.length=0;
            }
            else if(this.value=="2"){
                for(var i=1;i<selects.length;i++){
                    selects[i].style.display = 'none';
                }
                selects[2].style.display = 'inline-block';
                console.log("select="+selects[2]);
                //alert(this.value);
                //document.getElementById("second-category-select").options.length=0;
            }
            else if(this.value=="3"){
                for(var i=1;i<selects.length;i++){
                    selects[i].style.display = 'none';
                }
                selects[3].style.display = 'inline-block';
                console.log("select="+selects[3]);
                //alert(this.value);
            }
            else if(this.value=="4"){
                for(var i=1;i<selects.length;i++){
                    selects[i].style.display = 'none';
                }
                selects[4].style.display = 'inline-block';
                //alert(this.value);
            }
            else{
                for(var i=1;i<selects.length;i++){
                    selects[i].style.display = 'none';
                    sp.style.display='none';
                }
            }
        },false);
    }
</script>

<!-- <div id="suspend">
    <div class="suspend-content">
      <p id="cname"></p>
      <div class="progress">
        <div id="prop" class="progress-bar progress-bar-primary" role="progressbar" aria-valuemin="0" aria-valuemax="100" style="width: 0%;">
        </div>
      </div>
      <button type="reset" class="btn btn-danger" onclick="cancel()">取消上传</button>
    </div>
  </div> -->

<script>
    $(document).ready(function () {
        $(".sidebar-nav a").click(function(){
            var tree="."+$(this).attr("data-target");
            $(tree).slideToggle(300);
            if($(this).hasClass("collapsed")){
                $(this).removeClass("collapsed");
            }else{
                $(this).addClass("collapsed");
            }
        })
    });
</script>



</body>
</html>