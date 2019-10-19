<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="bbsinsert">
		ID : <input type="text" name="id"> <br />
		Title : <input type="text" name="title"><br />
		Content : <input type="text" name="content"><br />
		Writer : <input type="text" name="writer"><br />
		<input type="submit" value="작성">
	</form>
	
	<br />
	
	<form action="bbsselect">
		ID : <input type="text" name="id"> <br />
		<input type="submit" value="검색">
	</form>
	
</body>
</html>