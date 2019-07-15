<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 메뉴</title>
</head>
<style>
 a { 
 	text-decoration:none;
 	font-family: "NanumSquare", sans-serif;
 }
</style>
<body>
<div align="center">
	<a href="${path}/">Home</a>
	<a href="${path}/upload/uploadForm">업로드 테스트</a>
	<a href="${path}/shop/product/list.do">상품 목록</a>
	<div style="text-align:right;">
	<c:choose>
		<c:when test="${sessionScope.userid == null }">
			<a href="${path}/member/login.do">로그인</a>
		</c:when>
		<c:otherwise>
			${sessionScope.name}님이 로그인중입니다.
			<a href="${path}/member/logout.do">로그아웃</a>
		</c:otherwise>
	</c:choose>
	</div>
</div>
</body>
</html>