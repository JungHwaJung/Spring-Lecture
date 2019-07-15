<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<%@ include file="../include/header.jsp" %>
<script type="text/javascript">
	$(function() {
		$("#btnLogin").click(function() {
			var userid = $("#userid").val();
			var passwd = $("#passwd").val();
			if(userid == "") {
				alert("아이디를 입력하세요.");
				$("#userid").focus();
				return;
			}
			if(passwd == "") {
				alert("비밀번호를 입력하세요.");
				$("#passwd").focus();
				return;
			}
			document.form1.action="${path}/member/login_check.do";
			document.form1.submit();
		});
	});
</script>
<style>
	body {
		margin: 0 auto;
		width: 400px;
	}
	table {
		width: 400px;
	}
</style>
</head>
<body>
<%@ include file="../include/filemenu.jsp" %>
<br>
<form name="form1" method="post">
	<table border="1">
		<tr>
			<td>아이디</td>
			<td><input id="userid" name="userid"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" id="passwd" name="passwd"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button type="button" id="btnLogin">로그인</button>
				<c:if test="${param.message == 'nologin'}">
					<div style="color:red;">
						먼저 로그인하세요.
					</div>
				</c:if>
				<c:if test="${param.message == 'error'}">
					<div style="color:red;">
						아이디 또는 비밀번호가 일치하지 않습니다.
					</div>
				</c:if>
				<c:if test="${param.message == 'logout'}">
					<div style="color:red;">
						로그아웃 되었습니다.
					</div>
				</c:if>				
			</td>
		</tr>
	</table>
</form>

</body>
</html>