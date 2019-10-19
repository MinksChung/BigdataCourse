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
		var id = $("#id").val();
		
		$.ajax({
			url : "idCheck2",
			data : {
				id : id
			},
			success : function(result){
				$("#div").text(result);
			}
			
		});
	
	});
	
	
});
</script>
</head>
<body>

	ID : <input type="text" name="id" id="id"><br />
	<input type="button" value="전송" id="btn">
	
	<hr>
	
	<div id="div"></div>

</body>
</html>