<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서대여관리</title>
<style>
.bookimg {
	width: 50px;
}
</style>
</head>
<body>
	<h1>도서목록조회</h1>
	<table border="1">
		<tr>
			<th>도서번호</th>
			<th>도서명</th>
			<th>대여총계</th>
			<th>대여횟수</th>
		
		</tr>
		<c:forEach items="${list}" var="book">
			<tr>
				<td>${book.bookNo }</td>
				<td>${book.bookName }</td>
				<td>${book.total }</td>
				<td>${book.cnt }</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>