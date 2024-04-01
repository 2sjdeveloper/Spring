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
			<th>표지</th>
			<th>출판일자</th>
			<th>금액</th>
			<th>출판사</th>
			<th>도서소개</th>
		</tr>
		<c:forEach items="${list}" var="book">
			<tr>
				<td>${book.bookNo }</td>
				<td>${book.bookName }</td>
				<td><img class="bookimg"
					src="${pageContext.request.contextPath }/resources/images/${book.bookCoverimg }"></td>
				<td><fmt:formatDate value="${book.bookDate }" pattern="yyyy-MM-dd"/> </td>
				<td><fmt:formatNumber value="${book.bookPrice }" type="currency"></fmt:formatNumber> </td>
				<td>${book.bookPublisher }</td>
				<td>${book.bookInfo }</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>