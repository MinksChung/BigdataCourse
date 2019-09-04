<%@page import="bean.BbsDTO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberDTO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String writer = request.getParameter("writer");
	
	BbsDAO dao = new BbsDAO();
	BbsDTO dto = new BbsDTO();
	dto.setId(id);
	dto.setTitle(title);
	dto.setContent(content);
	dto.setWriter(writer);
	dao.insert(dto);
	
	out.println("<hr>");
	out.println("<h3>입력한 정보 확인</h3>");
	out.println("<hr>");
	
	out.println("<h3>당신이 입력한 id는 " + id + "</h3>");
	out.println("<h3>당신이 입력한 pw는 " + title + "</h3>");
	out.println("<h3>당신이 입력한 name는 " + content + "</h3>");
	out.println("<h3>당신이 입력한 tel는 " + writer + "</h3>");
	%>

</body>
</html>