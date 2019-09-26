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
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fphoto.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=qditpehdfit35w68ufhbxrvmodnqhe0dt183egg7",
				dataType: "json",
				data: {
					url: "http://photo.chosun.com/site/data/rss/rss.xml",
					api_key: "qditpehdfit35w68ufhbxrvmodnqhe0dt183egg7",
					count: 20
				},
				success: function(result){
					$("#result *").remove();
					/* alert("조선일보 사이트 연결 ok"); */
					for(i=0; i<20; i++){
						var title = result.items[i].title;
						var link = result.items[i].link;
						var thumbnail = result.items[i].thumbnail;
						$("#result").append("<a href="+ link + ">" + "<img src=" + thumbnail + " width=200 height=200>" + title + "</a><br>")
					}
					
				}
				
			})
			
		})
		
		$("#b2").click(function(){
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=qditpehdfit35w68ufhbxrvmodnqhe0dt183egg7",
				dataType: "json",
				data: {
					url: "http://www.chosun.com/site/data/rss/rss.xml",
					api_key: "qditpehdfit35w68ufhbxrvmodnqhe0dt183egg7",
					count: 20
				},
				success: function(result){
					$("#result *").remove();
					/* alert("조선일보 사이트 연결 ok"); */
					for(i=0; i<20; i++){
						var title = result.items[i].title;
						var link = result.items[i].link;
						var thumbnail = result.items[i].thumbnail;
						$("#result").append("<a href="+ link + ">" + "<img src=" + thumbnail + " width=200 height=200>" + title + "</a><br>")
					}
					
				}
				
			})
			
		})
		
		$("#b3").click(function(){
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Fsports.xml&api_key=qditpehdfit35w68ufhbxrvmodnqhe0dt183egg7",
				dataType: "json",
				data: {
					url: "http://www.chosun.com/site/data/rss/sports.xml",
					api_key: "qditpehdfit35w68ufhbxrvmodnqhe0dt183egg7",
					count: 20
				},
				success: function(result){
					/* $("#result *").remove(); */
					$("#result").empty();
					/* alert("조선일보 사이트 연결 ok"); */
					for(i=0; i<20; i++){
						var title = result.items[i].title;
						var link = result.items[i].link;
						var thumbnail = result.items[i].thumbnail;
						$("#result").append("<a href="+ link + ">" + "<img src=" + thumbnail + " width=200 height=200>" + title + "</a><br>")
					}
					
				}
				
			})
			
		})
	
	})
</script>

<body>

	<button type="button" id="b1">포토</button>
	<button type="button" id="b2">속보</button>
	<button type="button" id="b3">스포츠</button>
	<hr>
	<div id="result"></div>

</body>
</html>