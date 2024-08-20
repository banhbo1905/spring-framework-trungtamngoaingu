<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<title>Kết Quả Tra Cứu</title>

</head>

<body>
	<!-- Overlay effect when opening sidebar on small screens -->
	<div class="w3-overlay w3-hide-large" onclick="w3_close()"
		style="cursor: pointer" title="close side menu" id="myOverlay"></div>

	<!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
	<div class="w3-main" style="margin-left: 280px">

		<div class="w3-row w3-padding-64 center-table">

			<h1 class="w3-text-teal">
				Họ tên: <span>
					${hoten}, SĐT: ${sdt}</span>
			</h1>

			<c:if test="${coKetQua == false}">
				<p>Không tìm được kết quả bạn nhập. Mời bạn thử lại!</p>
			</c:if>
			<c:if test="${coKetQua == true}">
				<div class="row-33">
					<span>Giới tính: ${thisinh.gioitinh}</span>&nbsp;&nbsp;&nbsp;&nbsp;
					<span>Ngày Sinh: <fmt:formatDate value="${thisinh.ngaysinh}" pattern="dd/MM/yyyy" /></span>&nbsp;&nbsp;&nbsp;&nbsp;
					<span>Nơi sinh: ${thisinh.noisinh}</span>
				</div>
				<div class="row-33">
					<span>CMND: ${thisinh.cmnd}</span>&nbsp;&nbsp;&nbsp;&nbsp;
					<span>Nơi cấp: ${thisinh.noicap}</span>&nbsp;&nbsp;&nbsp;&nbsp;
					<span>Ngày cấp: <fmt:formatDate value="${thisinh.ngaycap}" pattern="dd/MM/yyyy" /></span>
				</div>

 				<h4>Phòng thi</h4>
				<c:forEach var="phong" items="${phongthiList}">
				<table class="table table-bordered table-hover table-striped"
					border="1">
					<thead>
						<tr>
							<th>Tên Phòng Thi</th>
							<th>Số Lượng</th>
							<th>Trình Độ</th>
							<th>Mã Khóa Thi</th>
							<th>Tên Khóa Thi</th>
							<th>Ngày Thi</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td style="text-align: center;">${phong.tenphongthi}</td>
							<td style="text-align: center;">${phong.soluong}</td>
							<td style="text-align: center;">${phong.tentrinhdo}</td>
							<td style="text-align: center;">${phong.makhoathi}</td>
							<td style="text-align: center;">${phong.khoathi.tenkhoathi}</td>
							<td style="text-align: center;"><fmt:formatDate value="${phong.khoathi.ngaythi}" pattern="dd/MM/yyyy" /></td>
						</tr>
					</tbody>
				</table>
				</c:forEach>

				<h4>Kết quả thi - theo thứ tự khoá thi ở bảng trên</h4>
					<c:forEach var="baithi" items="${baithiList}">
					<table class="table table-bordered table-hover table-striped"
						border="1">
						<thead>
							<tr>
								<!-- 							<th>Mã Phòng Thi</th> -->
								<th>Tên Phần Thi</th>
								<th>Điểm</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="diemthi" items="${baithi.diemthi}">
							<tr>
								<td style="text-align: center;">${diemthi.tenphanthi}</td>
								<td style="text-align: center;">${diemthi.diem}</td>

							</tr>
							</c:forEach>
						</tbody>
					</table>
					</c:forEach>
			</c:if>
			</div>

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

th, td {
	padding: 8px;
}
.row-33 {
	width:80%;
	display:flex;
	justify-content:space-evenly;
	font-size: 1.3rem;
}
</style>
</body>

</html>