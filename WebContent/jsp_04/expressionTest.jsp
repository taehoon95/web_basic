<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
public int sum(){
	int total = 0;
	for(int i = 0 ; i < 101; i++){
		total += i;
	}
	
	return total;
}
%>
<%
	String str = "1부터 100 까지 합";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ExpresstionTest</title>
</head>
<body>
	<h2><%=str %>은 <b><%=sum() %></b>입니다.</h2>
	<br>
	<h2><%=str %>에 3을 곱하면 <b><%=sum()*3 %></b>입니다.</h2>
	<br>
	<h2><%=str %>에 1000을 나누면 <b><%=sum()/1000. %></b>입니다.</h2>
</body>
</html>