<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="login-modal">

  <div style="width:100%;height:100%;position:fixed;z-index:2000;top:0;left:0;overflow:hidden"
       onclick="hideLoginBox()">
    <div style="height:100%;opacity:.4;background:#000"></div>
  </div>

  <div class="modal" type>
    <div class="modal-header clearfix">
      <h2 class="l">登录</h2>
      <div class="register pull-right">      没有账号？
        <a href="/member/register"><strong>立即注册</strong></a>
      </div>
    </div>

    <div class="modal-body">
      <form id="loginForm" action="${rootPath}/member/login">
        <div class="control-group">
          <div class="user-id">
            <input id="username" type="text" placeholder="请输入邮箱/用户名" name="username"
                   onfocus="loginInputFocus(this)" onblur="loginInputBlur(this)" />
          </div>
        </div>

        <div class="control-group">
          <div class="user-pw">
            <input id="password" type="password" name="password" placeholder="请输入密码"
                   onfocus="loginInputFocus(this)" onblur="loginInputBlur(this)" />
          </div>
        </div>

        <div class="errorMsg"  style="color:red;font-size:12px">
          <c:if test="${loginMsg.status==0 && loginMsg!=null}">
            <p>${loginMsg.message}</p>
          </c:if>
          <p></p>
        </div>

        <div class="control-group">
          <div class="r">
            <button type="submit" onclick="userLogin()" class="btn btn-primary btn-login">登录</button>
          </div>
        </div>

      </form>
    </div>

  </div>

</div>
