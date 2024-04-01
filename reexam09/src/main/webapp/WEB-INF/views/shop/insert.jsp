<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insertBoard.jsp</title>
<style>
label {display: inline-block; width: 100px;}
</style>
</head>
<body>
<jsp:include page="/WEB-INF/views/shop/header.jsp"></jsp:include>
	<h1>상품등록</h1>
	<form method="post" name="frm" action="insertProduct">
		<div>
			<label>상품ID</label> <input type="text" name="productId" value="${productId }">
		</div>
		<div>
			<label>상품명</label> <input type="text" name="productName">
		</div>

		<div>
			<label>단가</label> <input type="text" name="productPrice">
		</div>
		<div>
			<label>상품정보</label>
			<textarea name="productInfo"></textarea>
		</div>
		<div>
			<label>등록일자</label> <input type="text" name="productDate">
		</div>
		<div>
			<label>공급업체</label> <input type="text" name="company">
		</div>
		<div>
			<label>담당자</label><input type="text" name="managerId">
		</div>
		<div>
			<input id="saveBtn" type="button" value="등록" /> 
			<input id="infos" type="button" value="조회" />
		</div>
	</form>
	<script>
		saveBtn.addEventListener("click", ()=>{
			if( frm.productName.value == ""){
				alert("상품명을 입력하세요.")
				return;
			}
		
			alert("상품등록이 완료됐습니다.");
			frm.submit();	//폼제출
		})
	
	</script>
</body>
</html>