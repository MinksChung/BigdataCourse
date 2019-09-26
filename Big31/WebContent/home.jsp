<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script src="js/jquery-3.4.1.js"></script>
<script>
	$(function(){
		
		$("#b1").click(function(){
			
			$.ajax({
				
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fmyhome.chosun.com%2Frss%2Fwww_section_rss.xml&api_key=qditpehdfit35w68ufhbxrvmodnqhe0dt183egg7",
				dataType: "json",
				data: {
					url: "http://myhome.chosun.com/rss/www_section_rss.xml",
					api_key: "qditpehdfit35w68ufhbxrvmodnqhe0dt183egg7",
					count: 20
				},
				success: function(result){
					/* alert("조선일보 사이트 연결 ok"); */
					for(i=0; i<20; i++){
						var title = result.items[i].title;
						var link = result.items[i].link;
						$("#result").append("<a href="+ link + ">" + title + "</a><br>")
					}
					
				}
				
			})
			
		})
	
	})
</script>

<body>

	<button type="button" id="b1">오늘의 뉴스</button>
	<hr>
	<div id="result"></div>

</body>
</html>