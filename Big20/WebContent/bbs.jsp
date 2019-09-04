<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<table border="1">
			<tr>
				<td align="right">no :</td>
				<td>${param.no}</td>
			</tr>
			<tr>
				<td align="right">title :</td>
				<td>${param.title}</td>
			</tr>
			<tr>
				<td align="right">content :</td>
				<td>${param.content}</td>
			</tr>
			<tr>
				<td align="right">writer :</td>
				<td>${param.writer}</td>
			</tr>	
			<tr>
				<td colspan="2" align="center">작성한 게시글</td>
			</tr>
		</table>

</body>
</html>