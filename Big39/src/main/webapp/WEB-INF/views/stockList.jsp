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
			<td>코드</td>
			<td>종목명</td>
			<td>주가</td>
			<td>전일종가</td>
			<td>고가</td>
		</tr>
	<c:forEach items="${list}" var="stockDTO">
		<tr>
			<td>${stockDTO.code}</td>
			<td>${stockDTO.name}</td>
			<td>${stockDTO.stockValue}</td>
			<td>${stockDTO.closingValue}</td>
			<td>${stockDTO.highValue}</td>
		</tr>
	</c:forEach>
	</table>

</body>
</html>