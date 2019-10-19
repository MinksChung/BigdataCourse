<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="insert">
		pid : <input type="text" name="pid"><br />
		pname : <input type="text" name="pname"><br />
		pcontent : <input type="text" name="pcontent"><br />
		price : <input type="text" name="price"><br />
		<input type="submit" value="등록">
	</form>
	
	<form action="update">
		pid : <input type="text" name="pid"><br />
		pname : <input type="text" name="pname"><br />
		pcontent : <input type="text" name="pcontent"><br />
		price : <input type="text" name="price"><br />
		<input type="submit" value="수정">
	</form>
	
	<form action="delete">
		pid : <input type="text" name="pid"><br />
		<input type="submit" value="삭제">
	</form>
	
	<form action="select">
		pid : <input type="text" name="pid"><br />
		<input type="submit" value="검색">
	</form>

</body>
</html>