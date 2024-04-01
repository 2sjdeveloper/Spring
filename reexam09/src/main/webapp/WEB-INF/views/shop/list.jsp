<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록 조회/수정</title>
<style>
.bookimg {
	width: 50px;
}
</style>
</head>
<body>
<jsp:include page="/WEB-INF/views/shop/header.jsp"></jsp:include>
	<h1>상품 조회/수정</h1>
	<table border="1">
		<tr>
			<th>상품ID</th>
			<th>이름</th>
			<th>단가</th>
			<th>담당자</th>
			<th>등록일자</th>
			<th>공급업체</th>
		</tr>
		<c:forEach items="${list}" var="shop">
			<tr>
				<td>${shop.productId }</td>
				<td>${shop.productName }</td>
				<td>${shop.productPrice }</td>
				<td>${shop.managerId }</td>
				<td>${shop.productDate }</td>
				<td>${shop.company }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>