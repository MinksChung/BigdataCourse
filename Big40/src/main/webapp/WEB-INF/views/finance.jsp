<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="resources/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() {
		/* 버튼 클릭시 동작 구현 */
		$("#btn").click(function() {
			/* append 초기화 */
			$("#div").empty();
			/* code컨트롤러로 넘어가서 code.jsp의 결과 가지고 오는 ajax */
			$.ajax({
				url : "code",
				success : function(result) {
					$("#div").append(result);
				}

			});

		});

	});
</script>
<body>
	
	<!-- 종목3개 가져오는 버튼 -->
	<input type="button" value="주요3종목" id="btn">
	
	<hr>
	
	<!-- ajax결과 붙이는 곳 -->
	<div id="div"></div>

</body>
</html>