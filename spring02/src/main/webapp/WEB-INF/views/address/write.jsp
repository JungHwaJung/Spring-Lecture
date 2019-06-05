<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소록 등록 화면</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>주소록 등록 폼</h2>
	<form action="${path}/address/insert.do" name="form1" method="post">
		<table border="1" width="400px">
			<tr>
				<td> 아이디 </td>
				<td><input type="text" name="userid"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="passwd"></td>
			</tr>
			<tr>
				<td>이    름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>생    일</td>
				<td><input type="text" name="birthday"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="callnum"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="등록"></td>
			</tr>
		</table>
	</form>
</body>
</html>