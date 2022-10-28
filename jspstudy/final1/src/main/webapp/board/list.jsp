<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>

<script src="../assets/js/jquery-3.6.1.min.js"></script>
<script>
	$(document).ready(function(){
		
		$('#btn_write').click(function(event){
			location.href = '${contextPath}/board/write.do';
		});
		
	});
</script>
</head>
<body>

	<h1>게시글 목록 보기</h1>
	<div id="btn_write">새글작성</div>
	<ul>
		<c:forEach items="${boards}" var="b">
			<li>
				<a href="${contextPath}/board/detail.do?boardNo=${b.boardNo}">
					<div>${b.writer}</div>
					<div>${b.title}</div>
					<div>${b.createDate}</div>
				</a>
			</li>
		</c:forEach>
	</ul>
	
	<div class="main_board">
		<caption> 총 게시글 ${count}개</caption>
		<thead>
			<tr>
				<td>순번</td>
				<td>작성자</td>
				<td>제목</td>
				<td>작성일</td>
			</tr>
		</thead> 
		<tbody>
			<c:if test="${count eq 0}">
			<tr>
				<td colspan="8">게시물이 없습니다.</td>
			</tr>
			<tr>
				<td ><button>새글작성</button></td>
			</tr>
			</c:if>
		</tbody>
	
	</div>

</body>
</html>