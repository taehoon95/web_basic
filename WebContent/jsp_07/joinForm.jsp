<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>
<style type="text/css">
	
</style>
</head>
<body>
<section id = "formArea">
<h1>회원정보입력</h1>
<form action="joinChk.jsp">
<table>
	<tr>
		<td><label for = "id">아이디 : </label></td>
		<td><input type = "text" name = "id" id = "id"/></td>
	</tr>
	<tr>
		<td><label for = "pass">비밀번호 : </label></td>
		<td><input type = "password" name = "pass" id = "pass"/></td>
	</tr>
	<tr>
		<td><label for = "name">이름 : </label></td>
		<td><input type = "text" name = "name" id = "name"/></td>
	</tr>
	<tr>
		<td><label for = "sex">성별 : </label></td>
		<td><input type = "radio" name = "sex" value = "1" id = "sex" cheched>남
				<input type = "radio" name = "sex" value = "2">여</td>
	</tr>
</table>
</form>
</section>
</body>
</html>