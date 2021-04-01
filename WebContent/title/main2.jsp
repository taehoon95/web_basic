<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String pagefile = request.getParameter("page");
	if(pagefile == null){
			pagefile = "TitleSelect.jsp";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직책</title>
<link rel="stylesheet" href="style/title.css">
</head>
<body>

	<h2>직책 정보 입력 폼</h2>

	<nav>
		<ul>
			<li><a href="TitleServlet2">직책 목록</a></li>
			<li><a href="main2.jsp?page=TitleInsert.jsp">직책 추가</a></li>
			<li><a href="main2.jsp?page=TitleDelete.jsp">직책 삭제</a></li>
			<li><a href="main2.jsp?page=TitleUpdate.jsp">직책 수정</a></li>
		</ul>
	</nav> 
	
	<jsp:include page= '<%=pagefile%>'/>
</body>
</html>