<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
        <script type="text/javascript">
            var food = ["사과", "바나나", "멜론"];
            var food2 = [];

            $(function() {
                for (var i = 0; i < 3; i++) {
                    food2[i] = prompt("푸드2에" + i + "를 입력해주세요");
                    document.write(food2[i] + "<br>");
                }

                document.write("food2의 값은 " + food2 + "<br>")
                document.write("<hr>");

                document.write(food[0] + "<br>");
                document.write(food[1] + "<br>");
                document.write(food[2] + "<br>");
                document.write(food + "<br>");
            });
        </script>
    </head>

    <body>
    </body>

    </html>