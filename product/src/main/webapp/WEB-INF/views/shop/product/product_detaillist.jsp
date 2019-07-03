<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록 상세화면</title>
<%@ include file="../../include/header.jsp" %>
</head>
<body>
<%@ include file="../../include/filemenu.jsp" %>
<table border="1" width="500px">
	<tr>
		<td>상품ID</td>
		<td>${dto.product_id}</td>
	</tr>
	<tr>
		<td>상품명</td>
		<td>${dto.product_name}</td>
	</tr>
	<tr>
		<td>가격</td>
		<td>${dto.price}</td>
	</tr>
	<tr>
		<td>상품설명</td>
		<td>${dto.description}</td>
	</tr>
	<tr>
		<td>이미지</td>
		<td><img src="${path}/resources/images/${dto.picture_url}" width="100" height="100"></td>
	</tr>
</table>
</body>
</html>