<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<script>
		function logout() {
			session.setAttribute("id", null)
		}
	</script>
<body>

	<br>
	<br>
	
	<%if(session.getAttribute("id")==null){%>
		<table>
		<form action="test1.main.jsp">
			<tr>
				<td>ID</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>PW</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="로그인"></td>
			</tr>
		</form>
	</table>
	<%}else{
	%><table>
		<form action="test1.main.jsp">
			<tr>
				<td><%=session.getAttribute("id")%>님 환영합니다.</td>
			</tr>
			<tr>
				<td><button type="button" onclick="logout()">로그아웃</button></td>
			</tr>
		</form>
	</table><%	
	}
	%>
	
	
	
	
	
</body>
</html>