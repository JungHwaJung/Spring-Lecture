<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
<%@ include file="include/header.jsp" %>
</head>
<body>
<%@ include file="include/filemenu.jsp" %>
<c:if test="${sessionScope.userid != null}">
	<h2 style="text-align:center;">${sessionScope.name}(${sessionScope.userid}) 님의 방문을 환영합니다</h2>
</c:if>
<div align=center>
	<h2>${message}</h2>
</div>
</body>
</html>