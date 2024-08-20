<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<title>Trang cứu</title>

</head>

<body>
<!-- Overlay effect when opening sidebar on small screens -->
	<div class="w3-overlay w3-hide-large" onclick="w3_close()"
		style="cursor: pointer" title="close side menu" id="myOverlay"></div>

	<!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
	<div class="w3-main" style="margin-left: 280px">

		<div class="w3-row w3-padding-64 center-table">

			<h1 class="w3-text-teal">Tra cứu thông tin thí sinh</h1>
			<form action="/tra-cuu-ket-qua" method="post">
				<ul class="wrapper">
					<li class="form-row"><label
						style="text-align: end;">Nhập họ tên thí sinh: </label><input
						id="inputName" type="text" name="hoten" required></li>

					<li class="form-row"><label
						style="text-align: end;">Nhập số điện thoại: </label> <input
						id="inputPhone" type="text" name="sdt" required></li>
					<li class="form-row" style="justify-content: center;"><input
						style="flex-grow: initial; flex-basis: 32.5%" type="submit"
						value="Tra cứu"></li>
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