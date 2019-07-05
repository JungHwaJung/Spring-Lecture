<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세보기 화면</title>
<%@ include file="../include/header.jsp" %>
<script>
$(function() {
	$("#back").click(function() {
		document.form1.action="${path}/board/noticeboard.do";
		document.form1.submit();
	});
	
})
</script>
</head>
<style>
	body { text-align:center; }
</style>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>게시판</h2>
	<form action="" name="form1" method="post">
		<table border="1" width="700px">
			<tr>
				<td>글번호</td>
				<td>${dto.seq}</td>
			</tr>
			<tr>
				<td>글제목</td>
				<td>${dto.title}</td>
			</tr>
			<tr>
				<td>글내용</td>
				<td>${dto.content}</td>
			</tr>
			<tr>	
				<td>글쓴이</td>
				<td>${dto.userid}</td>
			</tr>
			<tr>	
				<td>날짜</td>
				<td><fmt:formatDate value="${dto.join_date }" pattern="yyyy-MM-dd HH:mm:ss" /></td>
			</tr>
		</table>
			<br><br><input type="button" value="뒤로가기" id="back">
	</form>
</body>
</html>