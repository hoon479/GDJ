<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
	
	<div>
		<a href="${contextPath}/free/insert">작성하러 가기</a>
	</div>

	<div>
			<hr>
		<table border="1">
			<thead>
				<tr>
					<td>게시글번호</td>
					<td>제목</td>
					<td>작성자</td>
					<td>조회수</td>
					<td>삭제</td>
				</tr>
				<tr>
					<td>1</td>
					<td><a href="${contextPath}/free/insert">워크샵공지</a></td>
					<td>이영식</td>
					<td>5</td>
					<td><a href="${contextPath}/free/detail">X</a></td>
				</tr>
				<tr>
					<td>2</td>
					<td><a href="${contextPath}/free/insert">사용안내</a></td>
					<td>김철수</td>
					<td>10</td>
					<td><a href="${contextPath}/free/detail">X</a></td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${frees}" var="free">
					<tr>
						<td>${free.freeno}</td>
						<td><a href="${contextPath}/free/insert?freeno=${free.freeno}">${free.title}</a></td>
						<td>${free.writer}</td>
						<td>${free.content}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>