<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
        <script type="text/javascript">
            $(function() {
                $("#b1").click(function() {
                    alert("나를 눌렀군요!");
                });
                $("#b2").click(function() {
                    var reply = $("#reply").val();
                    /* $("#div").append("<h3>" + reply + "</b3>"); */
                    /* $("#div").text(reply); */
                    $("#div").html("<h3>" + reply + "</h3>");
                });
                $("#b3").click(function() {
                    //이미지 달기
                    $("#div2").append("<img src=img/car.jpg width=100 height=auto>");
                });
            });
        </script>
    </head>

    <body>
        <button type="button" id="b1">Click Me!</button>
        <br>
        <hr color="red"> 댓글 쓰기: <input type="text" id="reply">
        <button type="button" id="b2">댓글달기</button>
        <br>
        <div id="div"></div>
        <br>
        <hr color="red">
        <button type="button" id="b3">이미지 달기</button>
        <div id="div2"></div>
    </body>

    </html>