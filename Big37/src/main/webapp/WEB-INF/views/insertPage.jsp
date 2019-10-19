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

<form action="insert">
<table>
	<tr>
		<td>ID</td>
		<td><input type="text" name="id"></td>
	</tr>
	<tr>
		<td>Name</td>
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<td>Content</td>
		<td><input type="text" name="content"></td>
	</tr>
	<tr>	
		<td>Price</td>
		<td><input type="text" name="price"></td>
	</tr>
	<tr>
		<td>Img</td>
		<td><input type="text" name="img"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="등록"></td>
	</tr>
</table>
</form>

</body>
</html>