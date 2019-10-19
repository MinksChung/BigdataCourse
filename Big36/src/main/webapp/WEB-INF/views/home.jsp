<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="selectAll">리스트로</a>

	<form action="insert">
		ID : <input type="text" name="id"><br />
		PW : <input type="text" name="pw"><br />
		Name : <input type="text" name="name"><br />
		Tel : <input type="text" name="tel"><br />
		<input type="submit" value="가입">
	</form>
	
	<br />
	
	<form action="update">
		ID : <input type="text" name="id"><br />
		PW : <input type="text" name="pw"><br />
		Name : <input type="text" name="name"><br />
		Tel : <input type="text" name="tel"><br />
		<input type="submit" value="수정">
	</form>
	
	<br />
	
	<form action="delete">
		ID : <input type="text" name="id"><br />
		<input type="submit" value="삭제">
	</form>
	
	<br />
	
	<form action="select">
		ID : <input type="text" name="id"><br />
		<input type="submit" value="검색">
	</form>
	
		<br />
	
	<form action="idCheck">
		ID : <input type="text" name="id"><br />
		<input type="submit" value="체크">
	</form>

</body>
</html>