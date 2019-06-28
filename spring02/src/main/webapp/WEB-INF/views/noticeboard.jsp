<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 화면</title>
<%@ include file="include/header.jsp" %>
</head>
<body>
<%@ include file="include/menu.jsp" %>
<input type="button" value="글쓰기" onclick="location.href='${path}/nbwrite.do'">
	
	<table border="1" width="700px">
		<tr>
			<td>글번호</td>
			<td>글제목</td>
			<td>글쓴이</td>
			<td>날짜</td>
		</tr>
		<%-- <c:forEach var="row" items="${list}">
		<tr>
			<td>${row.num}</td>
			<td><a href="${path}/datail/${row.userid}">${row.title}</td>
			<td>
				<a href="${path}/address/view.do?userid=${row.userid}">${row.userid}</a>
			</td>
			<td><fmt:formatDate value="${row.join_date}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
		</tr>
		</c:forEach>--%>
	</table>
</body>
</html>