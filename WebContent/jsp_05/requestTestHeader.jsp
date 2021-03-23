<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헤더 정보 예제</title>
<style type="text/css">
h1 {
	text-align: center;
}

table {
	margin: auto;
	width: 800px;
	border: 1px solid green;
}

tr>th {
	width: 250px;
}

#dd {
	padding-left: 20px;
}
</style>
</head>
<body>
	<h1>헤더 정보 예제</h1>
	<table>
		<tr>
			<th>헤더 이름</th>
			<th id="dd">헤더값</th>
		</tr>
		<%
			Enumeration<String> e = request.getHeaderNames();
		while (e.hasMoreElements()) {
			String headerName = e.nextElement();
		%>
		<tr>
			<td><%=headerName%></td>
			<td id="dd"><%=request.getHeader(headerName)%></td>
		</tr>

		<%
			}
		%>
	</table>

	<hr>

	<h1>쿠키, URL/URI, 요청방식에 관련된 정보</h1>

	<table border='1'>
		<%
			Cookie[] cookie = request.getCookies();
		%>
		<tr>
			<th>쿠키정보</th>
			<%
				if (cookie == null) {
			%>
			<td>쿠키가 존재하지 않습니다.</td>
			<%
				} else {
			for (int i = 0; i < cookie.length; i++) {
			%>
			<td><%=cookie[i].getName()%>(<%=cookie[i].getValue()%>)&nbsp;&nbsp;
				<%
					}
				}
				%>
		</tr>
		<tr>
			<th>서버도메인명</th>
			<td><%=request.getServerName()%></td>
		</tr>
		<tr>
			<th>서버 포트번호</th>
			<td><%=request.getServerPort()%></td>
		</tr>
		<tr>
			<th>요청 URL</th>
			<td><%=request.getRequestURL()%></td>
		</tr>
		<tr>
			<th>요청 URI</th>
			<td><%=request.getRequestURI()%></td>
		</tr>
		<tr>
			<th>요청 쿼리</th>
			<td><%=request.getQueryString()%></td>
		</tr>
		<tr>
			<th>클라이언트 호스트명</th>
			<td><%=request.getRemoteHost()%></td>
		</tr>
		<tr>
			<th>클라이언트 IP 주소</th>
			<td><%=request.getRemoteAddr()%></td>
		</tr>
		<tr>
			<th>프로토콜</th>
			<td><%=request.getProtocol()%></td>
		</tr>
		<tr>
			<th>요청방식</th>
			<td><%=request.getMethod()%></td>
		</tr>
		<tr>
			<th>컨텍스트 경로</th>
			<td><%=request.getContextPath()%></td>
		</tr>
	</table>

</body>
</html>