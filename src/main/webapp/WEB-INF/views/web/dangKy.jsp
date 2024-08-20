<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<title>Đăng ký dự thi</title>

</head>

<body>
<!-- Overlay effect when opening sidebar on small screens -->
	<div class="w3-overlay w3-hide-large" onclick="w3_close()"
		style="cursor: pointer" title="close side menu" id="myOverlay"></div>

	<!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
	<div class="w3-main" style="margin-left: 280px">

		<div class="w3-row w3-padding-64 center-table">

			<h1 class="w3-text-teal">Điền thông tin thí sinh để đăng ký</h1>
			<form id="myForm" th:action="@{/DangKyThi/DangKyKhoaThi}" method="post">
				<ul class="wrapper">
					<li class="form-row"><label for="CMND"
						style="text-align: end;">CMND/CCCD: </label><input required
						type="text" name="CMND"></li>
						
					<li class="form-row"><label for="ngayCap"
						style="text-align: end;">Ngày cấp: </label><input type="date" name="ngayCap" value="2012-01-01"></li>
						
					<li class="form-row"><label for="noiCap"
						style="text-align: end;">Nơi cấp: </label><input name="noiCap" ></li>
						
					<li class="form-row"><label for="userName"
						style="text-align: end;">Nhập họ tên: </label><input
						type="text" name="userName"></li>
						
					<li class="form-row" style="justify-content: center;margin-right: 63.5%;"><label for="gioiTinh"
						style="flex-grow:0;">Giới tính: </label>
						<select name="gioiTinh">
							<option value="Nam">Nam</option>
							<option value="Nữ">Nữ</option>
						</select>
					</li>
					
					<li class="form-row"><label for="ngaySinh"
						style="text-align: end;">Ngày sinh: </label><input type="date" name="ngaySinh" value="2000-01-01"></li>
						
					<li class="form-row"><label for="noiSinh"
						style="text-align: end;">Nơi sinh: </label><input name="noiSinh"></li>

					<li class="form-row"><label for="userPhone"
						style="text-align: end;">Số điện thoại: </label> <input
						type="text" name="userPhone"></li>
						
					<li class="form-row"><label for="email"
						style="text-align: end;">Email: </label> <input
						type="text" name="email"></li>
						
					<li class="form-row" style="justify-content: center;"><input
						style="flex-grow: initial; flex-basis: 32.5%" type="submit"
						value="Tiếp tục"></li>
				</ul>
			</form>

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

wrapper {
	background-color: whitesmoke;
	list-style-type: none;
	padding: 0;
	border-radius: 3px;
}

.form-row {
	display: flex;
	justify-content: flex-end;
	padding: .5em;
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