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
		String id = request.getParameter("id");
		out.println("id : " + id + "<br />");
		String pw = request.getParameter("pw");
		out.println("pw : " + pw + "<br />");
		String name = request.getParameter("name");
		out.println("name : " + name); %> <br />
	<%
		String tel = request.getParameter("tel");
		out.println("tel : " + tel);
	%>

</body>
</html>