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
                    <li class="active"><a href="">小学</a></li>
                    <li><a href="">初中</a></li>
                    <li><a href="">高中</a></li>
                </ul>
                <ul>
                    <span>学科：</span>
                    <li><a href="">语文</a></li>
                    <li><a href="">数学</a></li>
                    <li><a href="">英语</a></li>
                    <li><a href="">物理</a></li>
                    <li><a href="">化学</a></li>
                    <li class="active"><a href="">生物</a></li>
                    <li><a href="">政治</a></li>
                    <li><a href="">历史</a></li>
                    <li><a href="">地理</a></li>
                    <li><a href="">信息技术</a></li>
                </ul>
                <ul>
                    <span>版本：</span>
                    <li><a href="">人教版</a></li>
                    <li><a href="">苏教版</a></li>
                    <li><a href="">冀教版</a></li>
                    <li><a href="">教科版</a></li>
                    <li><a href="">北师大版</a></li>
                    <li><a href="">沪教版</a></li>
                    <li><a href="">长春版</a></li>
                    <li><a href="">鲁教版</a></li>
                    <li><a href="">鄂教版</a></li>
                    <li class="active"><a href="">湘教版</a></li>
                    <li><a href="">北京版</a></li>
                    <li><a href="">语文A版</a></li>
                    <li><a href="">语文S版</a></li>
                    <li><a href="">西师大版</a></li>
                </ul>
                <ul>
                    <span>年级：</span>
                    <li><a href="">一年级上</a></li>
                    <li><a href="">一年级下</a></li>
                    <li><a href="">二年级上</a></li>
                    <li><a href="">二年级下</a></li>
                    <li><a href="">三年级上</a></li>
                    <li><a href="">三年级下</a></li>
                    <li><a href="">四年级上</a></li>
                    <li class="active"><a href="">四年级下</a></li>
                    <li><a href="">五年级上</a></li>
                    <li><a href="">五年级下</a></li>
                    <li><a href="">六年级上</a></li>
                    <li><a href="">六年级下</a></li>
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
            <div class="result-list">
                <div class="row">
                    <div class="result-item">
                        <div class="col-xs-2 text-center">
                            <i class="fa fa-file-text fa-5x"></i>
                        </div>
                        <div class="col-xs-10">
                            <div class="title">
                                高中语文第三章课件.ppt
                            </div>
                            <div class="desc">
                                文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内...
                            </div>
                            <div class="addon">
                                <span><i class="fa fa-eye"></i>483</span>
                                <span><i class="fa fa-download"></i>1002</span>
                                <span><i class="fa fa-clock-o"></i>2016-02-12</span>
                                <button class="btn btn-primary pull-right">
                                    <i class="fa fa-download"></i>下载
                                </button>
                            </div>
                        </div>
                        <div class="clear"></div>
                    </div>

                    <div class="result-item">
                        <div class="col-xs-2 text-center">
                            <i class="fa fa-file-text fa-5x"></i>
                        </div>
                        <div class="col-xs-10">
                            <div class="title">
                                高中语文第三章课件.ppt
                            </div>
                            <div class="desc">
                                文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内...
                            </div>
                            <div class="addon">
                                <span><i class="fa fa-eye"></i>483</span>
                                <span><i class="fa fa-download"></i>1002</span>
                                <span><i class="fa fa-clock-o"></i>2016-02-12</span>
                                <button class="btn btn-primary pull-right">
                                    <i class="fa fa-download"></i>下载
                                </button>
                            </div>
                        </div>
                        <div class="clear"></div>
                    </div>

                    <div class="result-item">
                        <div class="col-xs-2 text-center">
                            <i class="fa fa-file-text fa-5x"></i>
                        </div>
                        <div class="col-xs-10">
                            <div class="title">
                                高中语文第三章课件.ppt
                            </div>
                            <div class="desc">
                                文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内...
                            </div>
                            <div class="addon">
                                <span><i class="fa fa-eye"></i>483</span>
                                <span><i class="fa fa-download"></i>1002</span>
                                <span><i class="fa fa-clock-o"></i>2016-02-12</span>
                                <button class="btn btn-primary pull-right">
                                    <i class="fa fa-download"></i>下载
                                </button>
                            </div>
                        </div>
                        <div class="clear"></div>
                    </div>

                    <div class="result-item">
                        <div class="col-xs-2 text-center">
                            <i class="fa fa-file-text fa-5x"></i>
                        </div>
                        <div class="col-xs-10">
                            <div class="title">
                                高中语文第三章课件.ppt
                            </div>
                            <div class="desc">
                                文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内文档内容文档内...
                            </div>
                            <div class="addon">
                                <span><i class="fa fa-eye"></i>483</span>
                                <span><i class="fa fa-download"></i>1002</span>
                                <span><i class="fa fa-clock-o"></i>2016-02-12</span>
                                <button class="btn btn-primary pull-right">
                                    <i class="fa fa-download"></i>下载
                                </button>
                            </div>
                        </div>
                        <div class="clear"></div>
                    </div>                                                            
                </div>                
            </div>
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
</body>
</html>