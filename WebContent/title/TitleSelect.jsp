<%@page import="web_basic.jsp_13.erp.Title"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	List<Title> list = (List<Title>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>타이틀 목록</title>
<link rel="stylesheet" href="style/title.css">
</head>
<body>
<%
		if (list != null) {
						for (Title t : list) {
%>
						<%=t.getTno()%>
						<%=t.getTname()%><br>
<%
		}
	} else {
%>

<%
		}
%>
</body>
</html>