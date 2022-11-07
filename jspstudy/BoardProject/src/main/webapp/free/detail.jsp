<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<h1>자유게시판 게시글 상세보기화면</h1>
	<div>
		<form id="frm_detail" method="POST" action="${contextPath}/free/modify.do">
			<div>
				<label for="text">게시글번호</label>	
			</div>
			<div>
				<label for="text">작성자</label>
			</div>		
			<div>
				<label for="ip">작성아이피</label>
			</div>
			<div>
				<label for="hit">조회수</label>
			</div>
			<div>
				<label for="title">제목</label>
				<input type="text" name="title" placeholder="워크샵공지">
			
			</div>
			<div>
				<textarea rows="3" cols="30">첨부파일을 확인해주세요.</textarea>
			</div>
		
			<div>
				<input type="submit" value="수정">
				<input type="button" value="목록" id="btn_list">
			</div>
		</form>
	</div>
	
	
</body>
</html>