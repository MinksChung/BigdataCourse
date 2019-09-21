<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.4.1.js"></script>
<script type="text/javascript">
var array=["포도","바나나","딸기"];
$(function(){
	$("a[title]]").css("background-color","yellow");
	$("a[href='http://www.nate.com']").css("background-color","yellow");
	$("a[href^='mailto']").css("background-color","pink");
	$("a[href$='net']").css("background-color","red");
	$("a[href*='google']").css("background-color","yellow");
	

	
});
</script>
</head>
<body>
<p id="p1"><a href="www.naver.com" title="네이버이동"></a>네이버</p>
<p id="p2"><a href="mailto:admin@naver.com"></a>관리자에게메일</p>
<p id="p3"><a href="www.nate.com" title="네이트이동"></a>네이트</p>
<p id="p2"><a href="www.daum.net" title="다음이동"></a>다음</p>
<p id="p3"><a href="www.google.com" title="구글이동"></a>구글</p>
</body>
</html>