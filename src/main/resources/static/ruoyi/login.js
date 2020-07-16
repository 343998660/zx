$(function () {

        $("button").click(function () {
            var name=$("#logname").val().trim();
            var word=$("#logpassword").val();
            var url="/login";
            var date={'username':name,'password':word };
            if(name != ""){
                $.post(url,date,function (e) {
                    $("#tips").html(e).css("color","#FF0000");

                if(e=="登录成功"){
                    location.href = ctx + 'a';
                }else {
                    $("#tips").html('糟糕服务器连接失败了').css("color","#FF0000");
                }

                });
        }else {
            $("#tips").html('用户名不允许为空').css("color","#FF0000");
        }


        })
    })
