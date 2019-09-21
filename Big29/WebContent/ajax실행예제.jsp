<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function(){
	$("#b1").click(function(){
		$.ajax({
			url:"home4.jsp",
			success: function(result){
				document.write(result)
			}
		});
	});
	$("#b2").click(function(){ //b2단추를 누르면
		var idValue=$("#id").val(); //변수안에 #id에 들어오는 값을 담아서
		$.ajax({  //ajax통신을 시도하는데
			url:"home6.jsp", //시도할 내용이 담긴 곳은 홈6.jsp파일이고
			data: { 			//시도할때 들이댈 데이터는 {}안에 있는 것들이고
				id:idValue 	
			},
			success: function(result){ //통신에 성공했을때는 {}안에 있는 일이 일어난다
				$("div").html(result);  //html에 파라메터에 담긴것 표시 
				//(댓글로 누적인경우는 append 로 명령어 바꿔주고)
			}
		});
	});
	$("#b3").click(function(){ //b2단추를 누르면
		var reValue=$("#re").val(); //변수안에 #re에 들어오는 값을 담아서
		$.ajax({  //ajax통신을 시도하는데
			url:"home7.jsp", //시도할 내용이 담긴 곳은 홈7.jsp파일이고
			data: { 			//시도할때 들이댈 데이터는 {}안에 있는 것들이고
				re:reValue 	
			},
			success: function(result){ //통신에 성공했을때는 {}안에 있는 일이 일어난다
				$("div").append(result);  //파라메터에 담긴것 표시 
				//(댓글로 누적인경우는 append 로 명령어 바꿔주고)
			}
		});
	});
	$("#b4").click(function(){ 
		var reValue=$("#re").val();
		var idValue=$("#id").val(); 
		$.ajax({  
			url:"home8.jsp", 
			data: { 			
				re:reValue, 	
				id:idValue
			},
			success: function(result){ 
				$("div").append(result); 
			}
		});
	});
});
</script>
</head>
<body>
id입력<input type="text" id="id" name="id"><br>
댓글입력<input type="text" id="re" name="re"><br>
<hr color="red">
<div></div>

<button type="button" id="b1">ajax통신1(테이블로결과받아옴)</button>
<button type="button" id="b2">ajax통신2(아이디가동일한지검사))</button>
<button type="button" id="b3">ajax통신3(리스트로결과받아옴)</button>
<button type="button" id="b4">ajax통신3(아이디+댓글 표형태로 표시)</button>
</body>
</html>