<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<script type="text/javascript"
	src="https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.0.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>어디서뭐먹지?</title>
<style>
body {
	font-family: "BM Dohyeon";
	padding-left: 3rem;
	padding-top: 3rem;
}

.page {
	display: flex;
	margin: 1rem;
	padding: 1rem;
}

.front {
	display: flex;
	flex-wrap: wrap;
	padding: 3rem 4rem 4rem 4rem;
}

.search {
	width: 100%;
	position: relative;
	display: flex;
}

/*검색바설정부.*/
.searchTerm {
	width: 100%;
	border: 3px solid #00B4CC;
	border-right: none;
	padding-left: 15px;
	height: 20px;
	outline: none;
	color: #9DBFAF;
}

.searchTerm:focus {
	color: #00B4CC;
}

.searchButton {
	width: 80px;
	height: 55px;
	background: #088A85;
	text-align: center;
	font-size: 15px;
	font-family: "BM DoHyeon";
	color: white;
}

.wrap {
	width: 30%;
	position: absolute;
	top: 13%;
	left: 50%;
	transform: translate(-50%, -50%);
}

.box {
	display: flex;
	position: relative;
}

.boxpic {
	padding: 1rem 1rem;
	border-radius: 50%;
	height: 19rem;
	width: 19rem;
	opacity: 0.5;
}

.boxtext {
	display: flex;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	font-size: 2.2rem;
	color: black;
}

a {
	text-decoration: none;
}

a:hover .boxpic {
	opacity: 1;
}

a:hover .boxtext {
	display: none;
}

@media ( max-width : 800px) {
	.boxpic {
		height: 5rem;
		width: 5rem;
		font-size: 2rem;
		color: black
	}
	.boxtext {
		font-size: 2rem;
		color: black;
	}
}
</style>
</head>
<%
/* String user_id=request.getParameter("id");
String user_name=request.getParameter("name");
String user_email=request.getParameter("email");
session.setAttribute("id", user_id);
session.setAttribute("user_name", user_name);
session.setAttribute("user_email", user_email);  */


String user_id= (String) session.getAttribute("id");                       //session에서 set되어있는 id가 객체로 넘어오므로, get으로 받아서 String 형변환 적용
String user_name = (String) session.getAttribute("user_name");       //현재 페이지에서 사용하고자 하는 정보는 id, name이므로 두개만 get 땡겨와서 변수에 담음.
%>


<body bgcolor="#6ADEDA">

	<header>


		<div class="nav-wrapper">
			<a href="index.jsp"> <img height="120rem" ; width="500rem"
				; src="Imgs/logo.gif">
			</a>
			<div class="wrap">
				<form action="rstListOfSearch.jsp" method="GET">
					<div class="search" style="border: 2px solid #088A85;">
						<input type="text" class="searchTerm" name="key" id="key"
							placeholder="검색어를 입력하세요." style="padding-left: 15px";>
						<button type="submit" class="searchButton">검색</button>
				</form>
			</div>
		</div>
		<%
if (user_id !=null){
%>
		<div class="input-field"
			style="position: absolute; top: 10%; left: 70%;">
			<a class="waves-effect waves-light btn" href="session2.jsp">로그아웃</a>
			<a class="waves-effect waves-light btn" href="UserUpdate.jsp"><%=user_name%>님의
				정보수정</a> <a class="waves-effect waves-light btn"
				style="background-color: indigo;" href="Board.jsp">후기게시판</a>
		</div>
		<%
} else{  
%>
		<div class="input-field"
			style="position: absolute; top: 10%; left: 75%;">
			<a href="UserMember.html" class="waves-effect waves-light btn">회원가입</a>




			<a class="waves-effect waves-light btn" data-placement="bottom"
				data-toggle="popover" data-container="body" type="button"
				data-html="true" href="#" id="login">로그인</a>

			<div id="popover-content" class="hide">
				<form action="session.jsp" method="POST">
					<div class="form-group"
						style="background-color: white; width: 300px; height: 225px; padding: 20px; position: fixed; left: 74%; top: 17%;">
						아이디<input type="text" name="id" placeholder="id"
							class="form-control" maxlength="16"> 비밀번호<input
							type="password" name="pw" placeholder="pw" class="form-control"
							maxlength="14">
						<button type="submit" id="myBtn" name="myBtn"
							class="btn btn-primary">Login »</button>

					</div>
				</form>
				<script type="text/javascript">
      $("[data-toggle=popover]").popover({
    	    html: true, 
    		content: function() {
    	          return $('#popover-content').html();
    	        }
    	});
      </script>
			</div>
			<a class="waves-effect waves-light btn"
				style="background-color: indigo;" href="Board.jsp">후기게시판</a>
			<script>
$(document).ready(function(){
    $('[data-toggle="popover"]').popover();   
});
</script>
		</div>
		<div id="naverIdLogin"
			style="position: absolute; top: 11.5%; left: 69%;"></div>
		<script type="text/javascript">
						var naverLogin = new naver.LoginWithNaverId(
						{
							clientId: "ssar2Nb6E7OfCPR1VJ3V",  
							callbackUrl: "http://localhost:8888/scndWebProject/navercall.jsp",
							isPopup: false, /* 팝업을 통한 연동처리 여부 */
							loginButton: {color: "green", type: 2, height: 38} /* 로그인 버튼의 타입을 지정 */
						}
						);
	
						/* 설정정보를 초기화하고 연동을 준비 */
						naverLogin.init();
	
					</script>
		<%
}
%>
	</header>
	<main>
	<section class="front"
		style="padding-left: 1.5rem; padding-right: 1.5rem;">
		<div class="box">
			<a href=".html"> <img class="boxpic" src="Imgs/1.png"> <span
				class="boxtext">은평구</span>
			</a>
		</div>
		<div class="box">
			<a href=".html"> <img class="boxpic" src="Imgs/2.png"> <span
				class="boxtext">종로구</span>
			</a>
		</div>
		<div class="box">
			<a href="rstListOfDistrict.jsp?districtId=마포구"> <img
				class="boxpic" src="Imgs/4.png"> <span class="boxtext">마포구</span>
			</a>
		</div>
		<div class="box">
			<a href="rstListOfDistrict.jsp?districtId=서대문구"> <img
				class="boxpic" src="Imgs/3.png"> <span class="boxtext">서대문구</span>
			</a>
		</div>
		<div class="box">
			<a href="rstListOfDistrict.jsp?districtId=동작구"> <img
				class="boxpic" src="Imgs/5.png"> <span class="boxtext">동작구</span>
			</a>
		</div>
		<div class="box">
			<a href=".html"> <img class="boxpic" src="Imgs/6.png"> <span
				class="boxtext">영등포구</span>
			</a>
		</div>
		<div class="box">
			<a href=".html"> <img class="boxpic" src="Imgs/7.png"> <span
				class="boxtext">서초구</span>
			</a>
		</div>
		<div class="box">
			<a href=".html"> <img class="boxpic" src="Imgs/8.png"> <span
				class="boxtext">강동구</span>
			</a>
		</div>
		<div class="box">
			<a href=".html"> <img class="boxpic" src="Imgs/9.png"> <span
				class="boxtext">강남구</span>
			</a>
		</div>
		<div class="box">
			<a href=".html"> <img class="boxpic" src="Imgs/10.png"> <span
				class="boxtext">구로구</span>
			</a>
		</div>
		<div class="box">
			<a href=".html"> <img class="boxpic" src="Imgs/11.png"> <span
				class="boxtext">양천구</span>
			</a>
		</div>
		<div class="box">
			<a href=".html"> <img class="boxpic" src="Imgs/12.png"> <span
				class="boxtext">광진구</span>
			</a>
		</div>

	</section>
	</main>
</body>
</html>