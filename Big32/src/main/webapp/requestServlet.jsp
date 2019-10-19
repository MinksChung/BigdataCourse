<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="s3" method="get">
		password<input type="password" name="pw" value="1234">
		<input type="submit" value="getRequest">
	</form>
	<form action="s3" method="post">
		password<input type="password" name="pw" value="1234">
		<input type="submit" value="postRequest">
	</form>

</body>
</html>