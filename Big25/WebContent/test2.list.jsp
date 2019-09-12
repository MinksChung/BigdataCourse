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
      String name = request.getParameter("name");
      String price = request.getParameter("price");
      Cookie cookie1 = new Cookie(name, price);
 
      
      response.addCookie(cookie1);
 
   %>
   <%
      Cookie[] cookies = request.getCookies();
   
       for(int i = 1; i < cookies.length; i++){
          Cookie cookie = cookies[i];
          out.print(cookie.getName() + "<br>");
          out.print(cookie.getValue() + "<br>");
          out.print("<hr>");
          
       }
   %>

</body>
</html>