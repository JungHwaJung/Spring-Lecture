<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소록 화면</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
	<h2>주소록 목록</h2>
	<input type="button" value="회원등록" onclick="location.href='${path}/address/write.do'">
	
	<table border="1" width="700px">
		<tr>
			<td>아이디</td>
			<td>이  름</td>
			<td>생일</td>
			<td>전호번호</td>
			<td>가입일</td>
		</tr>
		<c:forEach var="row" items="${list}">
		<tr>
			<td>${row.userid}</td>
			<td>
				<a href="${path}/address/view.do?userid=${row.userid}">${row.name}</a>
			</td>
			<td>${row.birthday}</td>
			<td>${row.callnum}</td>
			<td><fmt:formatDate value="${row.join_date}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>