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
	<h1>도서등록</h1>
	<form method="post" name="frm" action="insertBook">
		<div>
			<label>도서번호</label> <input type="text" name="bookNo" value="${bookNo }">
		</div>
		<div>
			<label>도서명</label> <input type="text" name="bookName">
		</div>

		<div>
			<label>도서표지</label> <input type="text" name="bookCoverimg">
		</div>
		<div>
			<label>출판일자</label> <input type="text" name="bookDate">
		</div>
		<div>
			<label>금액</label> <input type="text" name="bookPrice">
		</div>
		<div>
			<label>출판사</label> <input type="text" name="bookPublisher">
		</div>
		<div>
			<label>도서소개</label>
			<textarea name="bookInfo"></textarea>
		</div>
		<div>
			<input id="saveBtn" type="button" value="등록" /> 
			<input id="infos" type="button" value="조회" />
		</div>
	</form>
	<script>
		saveBtn.addEventListener("click", ()=>{
			if( frm.bookName.value == ""){
				alert("도서명을 입력하세요.")
				return;
			}
			if( frm.bookPublisher.value == ""){
				alert("출판사를 입력하세요.")
				return;
			}
			alert("도서등록이 완료됐습니다.");
			frm.submit();	//폼제출
		})
	
	</script>
</body>
</html>