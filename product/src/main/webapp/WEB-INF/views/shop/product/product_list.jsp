<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록 화면</title>
<%@ include file="../../include/header.jsp" %>
<script>
	$(function(){
		$("#btnAdd").click(function(){
			location.href="${path}/shop/product/write.do";
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
<h2>상품 목록</h2>
<table border="1" width="500px" align=center>
<button type="button" id="btnAdd">상품등록</button><br><br>
	<tr>
		<th>상품ID</th>
		<th>이미지</th>
		<th>상품명</th>
		<th>가격</th>
	</tr>
<c:forEach var="row" items="${list}">
	<tr align="center">
		<td>${row.product_id}</td>
		<td><img src="${path}/resources/images/${row.picture_url}" width="100" height="100"></td>
		<td><a href="${path}/shop/product/detail.do?product_id=${row.product_id}">${row.product_name}</a></td>
		<td><fmt:formatNumber value="${row.price}" pattern="#,###" />원</td>
	</tr>
</c:forEach>
</table>

</body>
</html>