<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 화면</title>
<%@ include file="include/header.jsp" %>
<script>
	function doB(){
		$.ajax({
			type:"post",
			url:"${path}/test/doB",
			success: function(result){
				$("#result").html("상품명 : " + result.name + "<br>가격 : " + result.price);
			}
		})
	}
</script>
</head>
<body>
<%@ include file="include/menu.jsp" %>
<hr>
	<h2>링크 테스트</h2>
		<a href="${path}/test/doA">doA</a>
		<a href="javascript:doB()">doB</a>
	
		<div id="result">
		
		</div>
</body>
</html>