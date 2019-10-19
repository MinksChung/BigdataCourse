<%@page import="com.mega.mvc39.CodeDTO"%>
<%@page import="org.jsoup.select.Elements"%>
<%@page import="org.jsoup.nodes.Document"%>
<%@page import="org.jsoup.Jsoup"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		String url = "https://finance.naver.com/item/main.nhn?code=" + request.getParameter("code");
		Document doc = Jsoup.connect(url).get();
		Elements elements = doc.select("span.blind");
		Elements elements2 = doc.select("h2");
			out.println("종목 : "+elements2.get(1).text() + "/");//종목명
			out.println("현재 : "+elements.get(13).text() + "/");//주가
			out.println("전일 : "+elements.get(16).text() + "/");//전일
			out.println("전일대비(가격) : "+elements.get(14).text() + "/");//전일대비(가격)
			out.println("전일대비(%) : "+elements.get(15).text() + "/");//전일대비(%)
			out.println("고가 : "+elements.get(17).text() + "/");//고가
			out.println("저가 : "+elements.get(21).text());//저가
	%>
	

