/*function showLoginBox(){
    $("#login-modal").css('display','block');
}


function loginInputFocus(input){
    $(input).parent().parent().addClass("active");
}

function loginInputBlur(input){
    $(input).parent().parent().removeClass("active");
}

function hideLoginBox(){
    $("#login-modal").css('display','none');
}


$('#loginButton').click(function() {
    showLoginBox();
})*/

/*
function userLoginSubmit(e) {
    console.log(e)
   /!* $(this).ajax({
        type: 'post',
        url: '${rootPath}/member/login',    //  填进你要处理表单信息的Servlet
        data: $('#loginForm').formSerialize(),    //   字符串  name1=value1&name2=value2
        success: function(responseJSON) {
            console.log(responseJSON)
            var loginMsg = JSON.parse(responseJSON);
            if( loginMsg.status ) {
                alert('登陆成功');
                location.href='${rootPath}/index';    //  路径不对的话改一下
                return true;
            }
            else {
                $('.errorMsg').html(loginMsg.message);
            }
        }
    });
    $(this).resetForm();*!/
    e.preventDefault();
    return false;
});*/
