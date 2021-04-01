<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 성적 입력</title>
<style>
#formArea {
	margin: auto;
	width: 400px;
	border: 1px solid black;
}

h1, fieldset {
	text-align: center;
}
</style>
</head>
	<body>
	<section id="formArea">
		<h1>property * 테스트</h1>
		<form action="beanTest2.jsp">
			<fieldset>
				<legend>기본 정보</legend>
				<label for ="stdNo">번호 : </label>
				<input type = "number" name = "stdNo" id = "stdNo"/><br>
				 <label for="stdName">이름 : </label>
				<input type = "text" name = "stdName" id = "stdName"/><br>
				<br> <label for="kor">국어 : </label>
				<input type = "number" name = "kor" id = "kor"/><br>
				<br> <label for="eng">영어 : </label>
				<input type = "number" name = "eng" id = "eng"/><br>
				<br> <label for="math">수학 : </label>
				<input type = "number" name = "math" id = "math"/><br>
				<br> <input type="submit" value="전송">
			</fieldset>
		</form>
</section>
</body>
</html>