<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록 상세화면</title>
<%@ include file="../../include/header.jsp" %>
<script>
$(function() {
	$("#back").click(function() {
		document.form1.action="${path}/shop/product/list.do";
		document.form1.submit();
	});
	
})
</script>
<style>
	body, table {
		font-family : "NanumSquare", sans-serif;
		text-align : center;
	}
</style>
</head>
<body>
<%@ include file="../../include/filemenu.jsp" %>
<h2>상품 정보</h2>
<form name="form1">
	<table  border="1" width="500px" align="center">
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
			<td><img src="${path}/resources/images/${dto.picture_url}" width="300px" height="300px"></td>
		</tr>
	</table>
	<br>
<input type="button" value="뒤로가기" id="back">
</form>
</body>
</html>