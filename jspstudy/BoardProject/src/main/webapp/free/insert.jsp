<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../assets/js/jquery-3.6.1.min.js"></script>
</head>
<body>
	
	<h1>자유게시판 게시글 작성화면</h1>
	<div>
		<form id="frm_insert" method="POST" action="${contextPath}/free/list.do">
			<div>
			<input type="text" name="writer" placeholder="작성자">
				
			</div>
			<div>
				<input type="text" name="title" placeholder="제목">
				
			</div>
			<div>
				<textarea rows="5" cols="30">내용</textarea>
			</div>
			
			<div>
				<input type="submit" value="작성완료">
				<input type="reset" value="다시작성">
				<input type="button" value="목록" id="btn_list">
			</div>
		</form>
	</div>
	
	
	
	
</body>
</html>