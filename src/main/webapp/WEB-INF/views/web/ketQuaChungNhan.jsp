<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<title>Kết Quả Chứng Nhận</title>

</head>

<body>
<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()"
	 style="cursor: pointer" title="close side menu" id="myOverlay"></div>

<!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
<div class="w3-main" style="margin-left: 280px">

	<div class="w3-row w3-padding-64 center-table">
		<c:if test="${ketqua == false}">
			<h1 class="w3-text-teal">Giấy chứng nhận</h1>
			<p>Không tìm thấy giấy chứng nhận. Vui lòng nhập lại chính xác thông tin</p>
		</c:if>

		<c:if test="${ketqua == true}">
			<div class="bg_div">
				<h1 class="w3-text-teal" style="font-weight: bold;margin-left: 24rem;font-size: 3rem;">Giấy chứng nhận</h1>
				<ul class="wrapper">
					<li class="form-row">
						<p>Họ và tên: <span>${thisinh.hoten}</span></p>
					</li>

					<li class="form-row">
						<p>Ngày sinh: <span><fmt:formatDate value="${thisinh.ngaysinh}" pattern="dd/MM/yyyy" /></span></p>
					</li>

					<li class="form-row">
						<p>Đã tham dự <span>${khoaThi.tenkhoathi}</span>, trình độ <span>${tentrinhdo}</span>.</p>
					</li>

					<li class="form-row">
						<p>Ngày thi: <span><fmt:formatDate value="${khoaThi.ngaythi}" pattern="dd/MM/yyyy" /></span></p>
					</li>

					<li class="form-row">
						<p>Điểm thi trung bình: <span>${diemtb}</span> / 10</p>
					</li>

					<li class="form-row">
						<p>Nghe: <span>${diemnghe}</span> / 10; Đọc: <span>${diemdoc}</span> / 10</p>
					</li>

					<li class="form-row">
						<p>Nói: <span>${diemnoi}</span> / 10; Viết: <span>${diemviet}</span> / 10</p>
					</li>

				</ul>

			</div>
		</c:if>
	</div>
</div>

<style>
	.w3-sidebar {
		z-index: 3;
		width: 280px;
		top: 43px;
		bottom: 0;
		height: inherit;
	}

	.bg_div {
		background-image: url(https://i.ibb.co/fv541Th/bia-1.png);
		background-repeat: no-repeat;
		/*   background-attachment: fixed;  */
		padding: 10rem;
		background-size: 100%;
		font-size: 1.2rem;
		height: 1200px;
	}

	wrapper {
		background-color: whitesmoke;
		list-style-type: none;
		padding: 0;
		border-radius: 3px;
	}

	.form-row {
		display: flex;
		justify-content: flex-start;
		font-size: 1.5rem;
		margin-left: 10rem;
		/* 	padding: .5em; */
	}

	.form-row>label {
		padding: .5em 1em .5em 0;
		flex: 1;
	}

	.form-row>input {
		flex: 5;
	}

	.form-row>input, .form-row>button {
		padding: .5em;
	}

	.form-row>button {
		background: gray;
		color: white;
		border: 0;
	}
</style>
</body>

</html>