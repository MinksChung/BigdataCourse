<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn1").on("click", function() {
			$("h1").slideUp(1000);
		});
		$("#btn2").on("click", function() {
			$("h1").slideDown("slow");
		});
		$("#btn3").on("click", function() {
			$("h1").slideToggle("fast");
		});
		//$("#btn4").on("click", function() {
			$("h1").animate({marginLeft:"300px"},1000)
				  .animate({marginLeft:0},1000);	
		});
	});
</script>
</head>
<body>
	<button id="btn1">슬라이드업</button>
	<button id="btn2">슬라이드다운</button>
	<button id="btn3">슬라이드토글</button>
	<h1 style="width: 50px; height: 200px; background-color: red;">내가
		움직이는 그것</h1>
	<button id="btn4">애니메이션효과</button>	
</body>
</html>