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
	
	$("#btnh").click(function() {
		var code = $("#h").val();
		
		$.ajax({
			url : "code",
			data : {
				code : code
			},
			success : function(result){
				$("#div").text(result);
			}
			
		});
		
	});
	
	$("#btno").click(function() {
		var code = $("#o").val();
		
		$.ajax({
			url : "code",
			data : {
				code : code
			},
			success : function(result){
				$("#div").text(result);
			}
			
		});
		
	});
	
	$("#btna").click(function() {
		var code = $("#a").val();
		
		$.ajax({
			url : "code",
			data : {
				code : code
			},
			success : function(result){
				$("#div").text(result);
			}
			
		});
		
	});
	
	$("#btn").click(function(){
		var code = $("#code").val();
		
		$.ajax({
			url : "code",
			data : {
				code : code
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

	<input type="hidden" value="028300" id="h"> 
	<input type="button" value="에이치엘비" id="btnh"><br />
	<input type="hidden" value="226950" id="o"> 
	<input type="button" value="올릭스" id="btno"><br />
	<input type="hidden" value="002310" id="a"> 
	<input type="button" value="아세아제지" id="btna"><br />
	
	<br />

	주식코드 : <input type="text" name="code" id="code"><br />
	<input type="button" value="조회" id="btn">
	
	<hr>
	
	<div id="div"></div>
	
	<form action="renew">
		<input type="submit" value="주식정보 갱신">
	</form>
	
	<a href="stockList">리스트로..</a>

</body>
</html>