<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function() {
	
	$("#btn").click(function(){
		
		$.ajax({
			url : "json",
			success : function(result){
				$("#div").text(result.id + " / " + result.pw + " / " + result.name + " / " + result.tel);
			}
			
		});
	
	});
	
	
});
</script>
</head>
<body>

	<input type="button" value="jsonResult" id="btn">
	
	<hr>
	
	<div id="div"></div>
	<a href="json">jsonResult2</a><br />
	<a href="jsonList">jsonListResult</a>

</body>
</html>