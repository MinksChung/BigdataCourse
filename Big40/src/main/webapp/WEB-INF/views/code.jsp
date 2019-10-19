<%@page import="org.jsoup.nodes.Element"%>
<%@page import="org.jsoup.select.Elements"%>
<%@page import="org.jsoup.Jsoup"%>
<%@page import="org.jsoup.nodes.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	/* 3개 종목 url 배열게 넣기 */
	String url[] = { "https://stock.nate.com/itemanal/itemanalSise.do?code=028300",
			"https://stock.nate.com/itemanal/itemanalSise.do?code=226950",
			"https://stock.nate.com/itemanal/itemanalSise.do?code=002310" };
	/* for문으로 배열에 넣은 url 각각 크롤링 */
	for (int i = 0; i < url.length; i++) {
		Document doc = Jsoup.connect(url[i]).get();
		/* 종목명 */
		Elements elist0 = doc.select("a.name");
		/* 현재주가와 고가 */
		Elements elist1 = doc.select("td.up");
		/* 전일종가 */
		Elements elist2 = doc.select("li.w1");

		/* 각각 출력 */
		out.println("종 목 : " + elist0.text() + "/"); // 종목명
		out.println("현 재 : " + elist1.get(0).text() + "/"); // 현재주가
		out.println(elist2.get(0).text() + "/"); // 전일종가
		out.println("고 가 :" + elist1.get(3).text()); // 고가
%>
	<hr>
<%
	}
%>