<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>uploadForm 화면</title>
<%@ include file="../include/header.jsp" %>
<style>
	ifame{
		width:400px;
		height:200px;
		border:1px;
		border-style:solid;
	}
</style>
</head>
<body>
<%@ include file="../include/filemenu.jsp" %>
	<form method="post" id="form1" action="${path}/upload/uploadForm" enctype="multipart/form-data" target="iframe1">
		<input type="file" name="file">
		<input type="submit" value="업로드">
	</form>

	<!-- target을 주지않으면 페이지가 넘어가므로 target을 주어 iframe에 표시함 -->
	<iframe name="iframe1">
	
	</iframe>
</body>
</html>