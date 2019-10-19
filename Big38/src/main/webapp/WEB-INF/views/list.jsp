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

<table>
	<tr>
		<td>ID</td>
		<td>Title</td>
		<td>Director</td>
		<td>Content</td>
		<td>PosterImg</td>
	</tr>
	<!-- jstl활용하여 list통채로 받은 다음 forEach로 변수 movieListDTO를 통해 데이터 불러오기 -->
	<c:forEach items="${list}" var="movieListDTO">
	<tr>
		<td>${movieListDTO.id}</td>
		<!-- 타이틀을 누르면 id를 반환하여 해당 데이터의 select화면으로 이동 -->
		<td><a href="select?id=${movieListDTO.id}">${movieListDTO.title}</a></td>
		<td>${movieListDTO.director}</td>
		<td>${movieListDTO.content}</td>
		<td><img src="resources/img/${movieListDTO.posterImg}" width="100" height="100"></td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="5">
			<!-- insert하는 화면으로 이동 -->
			<form action="insertPage">
				<input type="submit" value="영화등록">
			</form>
		</td>
	</tr>
</table>

</body>
</html>