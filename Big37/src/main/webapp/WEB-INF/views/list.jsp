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

<table border="1">
	<tr>
		<td>id</td>
		<td>name</td>
		<td>content</td>
		<td>price</td>
		<td>img</td>
	</tr>
<c:forEach items="${list}" var="poroductFinalDTO">
	<tr>
		<td>${poroductFinalDTO.id}</td>
		<td><a href="select?id=${poroductFinalDTO.id}">${poroductFinalDTO.name}</a></td>
		<td>${poroductFinalDTO.content}</td>
		<td>${poroductFinalDTO.price}</td>
		<td><img src="${poroductFinalDTO.img}"></td>
	</tr>
</c:forEach>
	<tr>
		<td colspan="5">
			<a href="insertPage">상품등록</a>
		</td>
	</tr>
</table>

</body>
</html>