<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function(){
	$("#b1").click(function(){
		$.ajax({
			url:"home4.jsp",
			success: function(result){
				document.write(result)
			}
		});
	});
	$("#b2").click(function(){
		var idValue=$("#id").val();
		$.ajax({
			url:"home6.jsp",
			data: {
				id:idValue 	
			},
			success: function(result){
				$("div").html(result);
			}
		});
	});
});
</script>
</head>
<body>
id입력<input type="text" id="id" name="id"><br>
댓글입력<input type="text" id="re" name="re"><br>
<hr color="red">
<div></div>

<button type="button" id="b1">ajax통신1(테이블로결과받아옴)</button>
<button type="button" id="b2">ajax통신2(아이디가동일한지검사))</button>
<button type="button" id="b3">ajax통신3(리스트로결과받아옴)</button>
</body>
</html>