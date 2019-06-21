<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>게시판</h2>
	<table border="1" width="600px">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>이름</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
	<c:forEach var="row" items="${map.list}">
		<tr>
			<td>${row.bno }</td>
			<td>${row.title }</td>
			<td>${row.userid }</td>
			<td>${row.regdate }</td>
			<td>${row.viewcnt }</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>