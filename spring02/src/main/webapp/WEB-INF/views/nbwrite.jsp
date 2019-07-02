<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
<%@ include file="include/header.jsp" %>
</head>
<body>
<%@ include file="include/menu.jsp" %>
<hr>
<form action="detail" method="post">
	글제목 : <input type="text" name="title">
	<br><br>
	글내용 : <textarea rows="10" cols="30" name="content"></textarea>
	&nbsp;&nbsp;<input type="submit" value="등록">
</form>
</body>
</html>