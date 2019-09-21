<!-- home5.jsp -->
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
                var array = ["java", "fun java", "park"];
                $("#button").click(function() {
                    /* document.getElementById("title").value = array[0];
                    document.getElementById("content").value = array[1];
                    document.getElementById("writer").value = array[2]; */
                    $("#title").val(array[0]);
                    $("#content").val(array[1]);
                    $("#writer").val(array[2]);
                });
                $("#button2").click(function() {
                    if ($("#title").val().length < 3) {
                        alert("title이 3자 미만입니다.");
                        return false;
                    } else if ($("#writer").val().length < 1) {
                        alert("writer를 입력해주세요.");
                        return false;
                    }
                });
            });
        </script>
    </head>

    <body>
        <form action="server2.jsp">
            제목: <input type="text" name="title" id="title"> 
            <br> 내용: <input type="text" name="content" id="content"> 
            <br> 글쓴이: <input type="text" name="writer" id="writer"> 
            <br> <input id="button" type="button" value="배열 값 가져오기"> <br>
            <button id="button2" type="submit">서버로 전송하기.</button>
        </form>

    </body>

    </html>