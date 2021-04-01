<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>display 속성</title>
<link rel="stylesheet" href="style/title.css">
</head>
<body>
	
	<fieldset>
		<legend>직책 추가</legend>
		<form action="newTitle2" method="post">
			<label for="tNo">직책번호 :</label> <input type="number" name="tNo"id="tNo"> <br> 
			<label for="tName">직책이름 :</label> <input type="text" name="tName" id="tName"> <br> 
			<input type="submit" value="등록"> <input type="submit" value="취소">
		</form>
	</fieldset>
	
</body>
</html>