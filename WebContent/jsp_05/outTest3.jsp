<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out Test</title>
</head>
<body>
	<h2>out 테스트</h2>
	<table border = "1">
		<tr>
			<td>autoFlush 여부 </td>
			<td><%=out.isAutoFlush() %></td>
		</tr>
		<tr>
			<td>출력버퍼의크기 </td>
			<td><%=out.getBufferSize() %></td>
		</tr>
		<tr>
			<td>출력버퍼의 남은양 </td>
			<td><%=out.getRemaining() %></td>
		</tr>
	</table>
</body>
</html>