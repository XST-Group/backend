<%--
  Created by IntelliJ IDEA.
  User: jeff
  Date: 16/2/27
  Time: 下午5:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<footer>
    <div class="container site-info">
        <div class="row">
            <div class="col-xs-2"><a href="/"><img src="/assets/images/logo.png" alt="" width="120"></a></div>
            <div class="col-xs-6">
                <div class="row">
                    <div class="col-xs-6">
                        <h3>统计信息</h3>
                        <p>网站总访问量 : 1365544</p>
                        <p>当前在线人数 : ${OnlineCount}</p>
                        <p id="timeStat">页面加载时间 : 0.000234</p>
                    </div>
                    <div class="col-xs-6">
                        <h3>主办单位</h3>
                        <p>南京市XXX教育学院</p>
                        <p>南京市XXX教育研究委员会</p>
                        <p>南京市XXX教育学会</p>
                    </div>
                </div>
            </div>
            <div class="col-xs-4 contacts">
                <span>关注我们:</span>
                <a href=""><i class="contact-icon fa fa-weibo"></i></a>
                <a href=""><i class="contact-icon fa fa-weixin"></i></a>
                <a href=""><i class="contact-icon fa fa-qq"></i></a>
                <a href=""><i class="contact-icon fa fa-renren"></i></a>
                <div class="contact-detail">
                    <p><i class="fa fa-map-marker"></i>江苏省南京市</p>
                    <p><i class="fa fa-phone"></i>123-456-789</p>
                    <p><i class="fa fa-envelope"></i>1234567@qq.com</p>
                </div>
            </div>
        </div>
    </div>
    <div class="copyright">
        <p>江苏省南京市 123-456-789 1234567@qq.com</p>
        <p>备案号 © Copyright 2016</p>
    </div>
</footer>
<!-- end of footer -->
