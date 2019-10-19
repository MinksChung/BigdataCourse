<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<td>순위</td>
			<td>제목</td>
			<td>가수</td>
			<td>이미지</td>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.id}</td>
				<td>${dto.title}</td>
				<td>${dto.singer}</td>
				<td><img src="${dto.img}"></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>