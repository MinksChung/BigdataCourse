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

<form action="update">
<table border="1">
	<tr>
		<td>ID</td>
		<td>${productFinalDTO.id}</td>
	</tr>
	<tr>
		<td>Name</td>
		<td><input type="text" name="name" value="${productFinalDTO.name}"></td>
	</tr>
	<tr>
		<td>Content</td>
		<td><input type="text" name="content" value="${productFinalDTO.content}"></td>
	</tr>
	<tr>	
		<td>Price</td>
		<td><input type="text" name="price" value="${productFinalDTO.price}"></td>
	</tr>
	<tr>
		<td>Img</td>
		<td><img src="${productFinalDTO.img}"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="수정">&nbsp;&nbsp;<a href="delete?id=${productFinalDTO.id}">삭제</a></td>
	</tr>
</table>
</form>

</body>
</html>