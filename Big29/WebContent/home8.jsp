<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String re= request.getParameter("re");
String id= request.getParameter("id");
out.print("<table border=1px>");
out.print("<td>"+id+"</td>");
out.print("<td>"+re+"</td>");
out.print("</tr>");
out.print("</table>");
%>
