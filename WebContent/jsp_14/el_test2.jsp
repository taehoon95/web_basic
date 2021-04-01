<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 내장 객체 상용 예제()</title>
</head>
<body>
<h3>${sessionScope.test}</h3>
<h3>${param.hong}</h3>
</body>
</html>