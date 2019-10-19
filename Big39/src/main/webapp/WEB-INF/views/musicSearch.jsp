<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="musicInsert">
		Title : <input type="text" name="title"><br />
		Singer : <input type="text" name="singer"><br />
		Img : <input type="text" name="img"><br />
		<input type="submit" value="입력">
	</form>
	
	<hr>
	
	<form action="rank">
		<input type="submit" value="100곡">
	</form>
	
	<hr>
	
	<a href="musicList">리스트로..</a>

</body>
</html>