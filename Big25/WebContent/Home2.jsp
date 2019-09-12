<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 자바 코드의 일부분을 넣는다.
	작은 일부분의 자바 코드 프로그램.
	스크립트릿(scriptlet)
	스크립트릿은 여러번 쓸 수 있다. -->
	<%
	
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		/* db table에 해당 id가 있는지 검사
		id pw가 맞으면 세션 등록
		클라이언트와 서버의 연결 session
		세션이 유지되는 동안 세션 정보를 계속해서
		아무데서나 쓸 수 있다.*/
		session.setAttribute("id", id);
		session.setAttribute("name", name);
	
	%>
	
	<a href="Home3.jsp">home3으로</a>
	
</body>
</html>