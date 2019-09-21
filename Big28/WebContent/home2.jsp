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
                    $("#d1").append($("#reply").val() + "<br>");
                    //a태그 주소 미입력시 현재페이지 refresh.
                    //default 값이 return true이므로, page 자동 이동
                    return false;
                });
                $("#b2").click(function() {
                    $("#d2").append("<img src = img/car.jpg width=100 height=auto>");
                    return false;
                });

                var check = false; //체크가 안되어있음.
                $("#food").change(function() {
                    if (check == false) {
                        $("#u1 input").attr("checked", true);
                        check = true; //체크가 되어있음.
                    } else {
                        $("#u1 input").attr("checked", false);
                        check = false; //체크가 안되어있음.
                    }
                });
                $("#me").focus(function() {
                    console.log($(this).val());
                });
                $("#button1").mouseover(function() {
                    console.log("마우스를 올리셨군요.");
                });
                $("#button2").mouseout(function() {
                    console.log("마우스로 떠나시는군요.");
                });
                $("#id").keyup(function() {
                    console.log("id 길이 계산 시작합니다.");
                    console.log($(this).val().length);
                    if ($(this).val().length < 5) {
                        $("#d3").html("<font color = blue>아이디는 5글자 이상 입력해야 합니다.</font>");
                        return false;
                    } else {
                        $("#d3").html("<font color = red>아이디는 5글자 이상 입력 했습니다.</font>");
                    }
                });
            });
        </script>
    </head>

    <body>
        <a href="" id="b1">댓글달기</a> | <a href="" id="b2">이미지달기</a>
        <hr color="red"> 댓글 입력: <input type="text" id="reply">
        <br>
        <div id="d1"></div>
        <br>
        <hr color="red">
        <div id="d2"></div>
        <br>
        <hr color="red">

        <ul id="u1"><input type="checkbox" id="food">음식
            <li><input type="checkbox">고구마</li>
            <li><input type="checkbox">양파</li>
            <li><input type="checkbox">감자</li>
        </ul>

        <br>
        <hr color="red">포커스가 오면 <input type="text" id="me" value="나한테 포커스가 올거야">

        <br>
        <hr color="red">
        <button id="button1">내 위로 올려요.</button>
        <button id="button2">나를 떠나요.</button>

        <br>
        <hr color="red">
        <br>가입할 id입력: <input type="text" id="id">
        <div id="d3"></div>

    </body>

    </html>