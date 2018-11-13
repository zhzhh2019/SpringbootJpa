function submit() {
    var name = $("#username").val();
    var password = $("#password").val();
    $.ajax({
        url: "/loginCheck",
        dataType:"json",
        data:{
            "name":name,
            "password":password
        },
        success: function(data){
            console.log(data)
            alert(data);
        }});

}
