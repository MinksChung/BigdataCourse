<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 데이터 넣어서 insert진행(id는 auto increment) -->
<form action="insert">
	<table>
		<tr>
			<td>Title</td>
			<td><input type="text" name="title"></td>
		</tr>
		<tr>
			<td>Director</td>
			<td><input type="text" name="director"></td>
		</tr>
		<tr>
			<td>Content</td>
			<td><input type="text" name="content"></td>
		</tr>
		<tr>
			<td>PosterImg</td>
			<td><input type="text" name="posterImg"></td>
		</tr>
		<tr>
			<!-- 등록 누르면 폼대그 액션의 주소로 컨트롤러 이동  그냥 리스트로 돌아가고 싶으면 하이퍼링크 클릭 -->
			<td colspan="5">
				<input type="submit" value="등록">&nbsp;&nbsp;&nbsp;&nbsp;<a href="list">리스트로..</a>
			</td>
		</tr>
	</table>
</form>

</body>
</html>