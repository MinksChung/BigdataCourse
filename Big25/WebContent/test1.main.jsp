<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<br>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		session.setAttribute("id", id);
		session.setAttribute("pw", pw);
	%>
	<%@include file = "test1.login.jsp" %>
	<br>
	<br>
	<a href="test1.news.jsp">뉴스</a>
	<a href="test1.cafe.jsp">카페</a>

</body>
</html>