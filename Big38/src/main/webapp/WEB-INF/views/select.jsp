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

<!-- 업데이트 진행 (select결과는 각 text타입 인풋태그로 불러와 수정가능하도록 함) -->
<form action="update">
	<table>
		<tr>
			<td>id</td>
			<!-- id는 변경 못하게 히든으로 태그 생성 -->
			<td><input type="hidden" name="id" value="${movieListDTO.id}">${movieListDTO.id}</td>
		</tr>
		<tr>
			<td>Title</td>
			<td><input type="text" name="title" value="${movieListDTO.title}"></td>
		</tr>
		<tr>
			<td>Director</td>
			<td><input type="text" name="director" value="${movieListDTO.director}"></td>
		</tr>
		<tr>
			<td>Content</td>
			<td><input type="text" name="content" value="${movieListDTO.content}"></td>
		</tr>
		<tr>
			<td>PosterImg</td>
			<td><input type="text" name="posterImg" value="${movieListDTO.posterImg}"></td>
		</tr>
		<tr>
			<td colspan="5">
				<!-- 삭제원하면 하이퍼링크로 id만 반환하여 delete진행, 리스트로 돌아가고 싶으면 리스트로 하이퍼링크 클릭 -->
				<input type="submit" value="수정">&nbsp;&nbsp;&nbsp;&nbsp;<a href="delete?id=${movieListDTO.id}">삭제</a>
				&nbsp;&nbsp;&nbsp;&nbsp;<a href="list">리스트로..</a>
			</td>
		</tr>
	</table>
</form>

</body>
</html>