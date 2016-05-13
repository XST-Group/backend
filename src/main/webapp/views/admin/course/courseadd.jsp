<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>校视通</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!--<link href='http://fonts.useso.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>-->
    <%--<link rel="stylesheet" href="${assetsPath}/css/app.css"/>--%>
    <link rel="stylesheet" href="${assetsPath}/css/app.min.css"/>
    <%--<link rel="stylesheet" href="${assetsPath}/css/admin_manage.css"/>--%>

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


        <div class="content-course">

            <!--  课程添加   -->
            <h2 class="dash-head">课程添加</h2>
            <form class="video-add" name="form1" id="form1" action="${rootPath}/admin/resource/add"
                  method="post" enctype="multipart/form-data" target="if" onsubmit="return go()">
                <div class="form-group form-info">
                    <label for="courseName">课程名称</label>
                    <input type="text" class="form-control" id="courseName" name="title" value="">
                </div>
                <div class="select">
                    <div class="">
                        <span>&nbsp;&nbsp;&nbsp;分&nbsp;&nbsp;类&nbsp;&nbsp;&nbsp;</span>
                        <select class="form-control" id="category-select" name="cate1">
                            <option selected value="">请选择</option>
                            <c:forEach items="${firstCategorys}" var="category">
                                <option value="${category.id}">${category.name}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="">
                        <span>阶&nbsp;&nbsp;段</span>
                        <select class="form-control" id="second-category-select" name="cate2" disabled="disabled">
                            <c:forEach items="${categoryList}" var="category2" >
                                <c:if test="${categoryList != null}">
                                    <option value="${category2.id}">${category2.name}</option>
                                </c:if>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="">
                        <span>学&nbsp;&nbsp;科</span>
                        <select class="form-control" id="third-category-select" name="cate3" disabled="disabled">
                            <c:forEach items="${categoryList}" var="category3">
                                <c:if test="${categoryList != null}">
                                    <option value="${category3.id}">${category3.name}</option>
                                </c:if>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group inputFile">
                    <label for="inputFile">上传视频</label>
                    <input type="file" id="inputFile" name="video" value=""/>
                    <p class="help-block">支持MP4格式</p>
                </div>
                <input type="submit" class="btn btn-success btn-course" value="上传" />
            </form>
            <!--  END 课程添加-->
            <iframe id="if" name="if" src="" style="display: none"></iframe>

        </div>

      </div>
   </div>

   <div id="suspend">
     <div class="suspend-content">
       <p id="cname"></p>
       <div class="progress">
         <div id="prop" class="progress-bar progress-bar-primary" role="progressbar" aria-valuemin="0" aria-valuemax="100" style="width: 0%;">
         </div>
       </div>
       <button type="reset" class="btn btn-danger" onclick="cancel()">取消上传</button>
     </div>
   </div>

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



        <script>
            function go(){
              form1.submit();
              var courseName = document.getElementById('courseName');
              var cname = document.getElementById('cname');
              var suspend = document.getElementById('suspend');
              var prop = document.getElementById("prop");
//              suspend.style.display = 'block';
              cname.innerHTML = courseName.value;
//              var timer = setInterval("getP()",50);
            }
            function cancel() {
              document.getElementById("suspend").style.display = "none";
              document.getElementById("prop").style.width = 0;
              document.getElementById('inputFile').value = "";
            }

            var request;
            if (window.XMLHttpRequest) {
              request = new XMLHttpRequest();
            } else {
              request = new ActiveXObject('Microsoft.XMLHTTP');
            }

            function getP(){
              request.onreadystatechange = callBack;
              var url = "getProgressServlet";
              request.open("post",url,true);
              request.setRequestHeader("Content-type","application/x-www-form-urlencoded");
              request.send( "&timeStamp=" + (new Date()).getTime() );
            }

            function callBack(){
              if( request.readyState===4 && request.status===200 ){
                var result = request.responseText;
                result = result.replace(/(^\s*)|(\s*$)/g, "");
                var res = result.split(",");
                var flag = res[1];
                var per = parseInt(res[0]);
                var err = res[2];
                document.getElementById("prop").style.width = per+"%";
                if(flag == "OK"){
                  window.clearInterval(timer);
                  alert("课程添加成功！");
                  document.getElementById("suspend").style.display = "none";
                  document.getElementById("prop").style.width = 0;
                }
                if( err!="" || err.length>0 ) {
                  window.clearInterval(timer);
                  alert(err);
                }
                if( flag==null ) {
                  window.clearInterval(timer);
                }
              }
            }

        </script>

        <link rel="stylesheet" href="//cdn.bootcss.com/iCheck/1.0.2/skins/square/blue.css"/>

        <script src="//cdn.bootcss.com/iCheck/1.0.2/icheck.min.js"></script>
        <!--icheck-->
        <script>
            $(document).ready(function(){
                $('input').iCheck({
                    checkboxClass: 'icheckbox_square-blue',
                    radioClass: 'iradio_square-blue',
                    increaseArea: '20%' // optional
                });
            });
        </script>



       <%--fileUpload:文件上传，至关重要的一句话--%>
       <script>
           $('#inputFile').fileupload();
       </script>

       <script>
               $('input').iCheck({
                   checkboxClass: 'icheckbox_square-blue',
                   radioClass: 'iradio_square-blue',
                   increaseArea: '20%' // optional
               });

               var category_select = $("#category-select"),
                       second_category_select = $("#second-category-select"),
                       third_category_select = $("#third-category-select");

               category_select.change(function(){
                   if(category_select.val() == 1) {
//                       if(second_category_select.attr("disabled")=="disabled"){
                           second_category_select.attr("disabled",false);
                           third_category_select.attr("disabled",false);

//                       }
                       loadCategory(category_select.val(),second_category_select);

                   } else {
                       second_category_select.attr("disabled","disabled");
                       third_category_select.attr("disabled","disabled");
                       clearCategory(second_category_select);
                       clearCategory(third_category_select);
                   }
               });

        //zqh:new

               second_category_select.change(function(){
                   if(second_category_select.val() != "") {
                       loadCategory(second_category_select.val(),third_category_select);
                   } else {
                       clearCategory(third_category_select);
                   }
               });



           function loadCategory(id , selector){
//            var url = "http://" + host + uri + id + ".json";
               var url = "http://localhost:8080/xst/category/node/"+id;
               $.getJSON(url , function(data){
                   selector.empty();
                   $.each(data,function(i, category){
                       var option = "<option value='" + category.id + "'>" + category.name + "</option>";
                       selector.append(option);
                   });
               });
           }

           function clearCategory(selector) {
               selector.empty();
           }
       </script>


</body>
</html>
