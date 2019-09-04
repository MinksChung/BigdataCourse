<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		// 자바 주석
		// 1. 클라이언트 입력 값 받아옴.
		/* HttpRequest request = new HttpRequest(); */
		// 받아올 수 있는 객체를 jsp에서 만들어 놓았다.
		// 내장된 객체(이미 객체를 만들어 놓음)
		String search = request.getParameter("search");
		
		// 2. db처리(생략)
		
		// 3. 결과를 클라이언트에게 보내준다.
		/* PrintWriter out = new PrintWriter(); */
		out.print("<h1>검색 결과 입니다.</h1>");
		out.print("<hr>");
		out.print(search + "에 대한 검색 결과 입니다.");	
	%>
	<br />
	
	${param.search}

</body>
</html>