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
	// 1. 클라이언트가 입력한 map형태의 파라메터를 받는다.
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	
	// 2. DB처리
	MemberDAO dao = new MemberDAO();
	MemberDTO dto = new MemberDTO();
	dto.setId(id);
	dto.setPw(pw);
	dto.setName(name);
	dto.setTel(tel);
	dao.insert(dto);
	
	// 3. 처리 결과를 클라이언트에게 다시 알려준다.
	// => 클라이언트가 볼 수 있는 형태로 만들어서 알려준다.
	// => html로 만들어 클라이언트에게 전송
	out.println("<hr>");
	out.println("<h3>입력한 정보 확인</h3>");
	out.println("<hr>");
	
	out.println("<h3>당신이 입력한 id는 " + id + "</h3>");
	out.println("<h3>당신이 입력한 pw는 " + pw + "</h3>");
	out.println("<h3>당신이 입력한 name는 " + name + "</h3>");
	out.println("<h3>당신이 입력한 tel는 " + tel + "</h3>");
	%>

</body>
</html>