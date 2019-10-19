<%@page import="org.jsoup.Jsoup"%>
<%@page import="org.jsoup.select.Elements"%>
<%@page import="org.jsoup.nodes.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String url = "https://finance.naver.com/item/sise.nhn?code=226950";
		Document doc = Jsoup.connect(url).get();

		Elements name = doc.select("h2 a");
		Elements stockValue = doc.select("#_nowVal");
		Elements closingValue = doc.select("span.tah");
		Elements highValue = doc.select("#_high");

		out.println(stockValue.text());//종목명
		out.println("!!!"+closingValue.get(4).text()+"!!!");//종목명
		out.println(highValue.text());//종목명
	%>
</body>
</html>