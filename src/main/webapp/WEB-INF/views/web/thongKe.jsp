<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<title>Thống Kê</title>

</head>

<body>

<!-- Overlay effect when opening sidebar on small screens -->
	<div class="w3-overlay w3-hide-large" onclick="w3_close()"
		style="cursor: pointer" title="close side menu" id="myOverlay"></div>

	<!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
	<div class="w3-main" style="margin-left: 280px">

		<div class="w3-row w3-padding-64 center-table">

			<h1 class="w3-text-teal">Thống kê</h1>
			<form action="thong-ke-ket-qua" method="post">
				<label>Danh sách khóa thi:</label>&nbsp;&nbsp;
				<select name="makhoathi">
					<c:forEach items="${khoathiList}" var="khoathi">
						<option value="${khoathi.makhoathi}">${khoathi.tenkhoathi}</option>
					</c:forEach>
				</select> <br> <br>
				 
				<label>Trình độ:</label>&nbsp;&nbsp;
				<select name="trinhdo">
					<option value="A2">A2</option>
					<option value="B1">B1</option>
				</select><br> <br>
				<input style="padding: 8px;" type="submit"
					value="Thống kê">
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