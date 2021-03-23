<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<style type = "text/css">
	h1{
		text-align:center;
	}
	
	#LoginFormArea{
		text-align :center;
		width : 250px;
		margin : auto;
		border : 1px solid red; 
	}
</style>
<body>
	<h1>로그인</h1>
	<section id = "LoginFormArea">
		<form action="123" method="get">
			<label id = "id" >아이디:</label>		
			<br>
			<input type = "text" name = "id" id = "id">
			<br>
			<label id="passwd">비밀번호 :</label>
			<input type = "password" name = "passwd" id ="passwd">
			<br>
			<input type = "submit" value = "로그인"> 
		</form>
	</section>
</body>
</html>