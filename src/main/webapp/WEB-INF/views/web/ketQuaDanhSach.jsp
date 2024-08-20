<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<title>Kết Quả Danh Sách</title>

</head>

<body>
<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()"
	 style="cursor: pointer" title="close side menu" id="myOverlay"></div>

<!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
<div class="w3-main" style="margin-left: 280px">

	<div class="w3-row w3-padding-64 center-table">

		<!-- 			<h1 class="w3-text-teal"> -->
		<!-- 				Tra cứu thông tin thí sinh <span -->
		<!-- 					th:text="${userName} +', số điện thoại ' + ${userPhone}"></span> -->
		<!-- 			</h1> -->
		<c:if test="${ketqua == false}">
			<p>Không tìm được kết quả bạn nhập. Mời bạn thử lại!</p>
		</c:if>

		<c:if test="${ketqua == true}">
			<!-- 					<p>Có kết quả trả về.</p> -->
			<h3>Danh sách các thí sinh trong phòng thi:</h3>
			<table class="table table-bordered table-hover table-striped"
				   border="1">
				<thead>
				<tr>
					<!-- 							<th>Mã Phòng Thi</th> -->
					<th>Tên Phòng Thi</th>
					<th>Số Lượng</th>
					<th>Họ Tên</th>
					<th>Giới Tính</th>
					<th>Số Báo Danh</th>
					<!-- 							<th>CMND</th> -->
					<th>Xem chi tiết</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach var="thisinh" items="${thisinhList}">
				<tr>
					<td style="text-align: center;">${phongthi.tenphongthi}</td>
					<td style="text-align: center;">${phongthi.soluong}</td>
					<td style="text-align: center;">${thisinh.hoten}</td>
					<td style="text-align: center;">${thisinh.gioitinh}</td>
					<td style="text-align: center;">${thisinh.duthitheosbd.sbd}</td>

					<td style="text-align: center;">
						<a href="<c:url value='/tra-cuu-ket-qua?hoten=${thisinh.hoten}&sdt=${thisinh.sdt}'/>" class="infomation" style="color:blue;">Xem</a>
<%--						<form method="post" action="/tra-cuu-ket-qua" class="inline">--%>
<%--							<button type="submit" name="submit_param" value="submit_value" class="link-button">--%>
<%--								Xem--%>
<%--							</button>--%>
<%--						</form>--%>
						</td>
				</tr>
				</c:forEach>
				</tbody>
			</table>
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
	inline {
		display: inline;
	}

	.link-button {
		background: none;
		border: none;
		color: blue;
		text-decoration: underline;
		cursor: pointer;
		font-size: 1em;
		font-family: serif;
	}
	.link-button:focus {
		outline: none;
	}
	.link-button:active {
		color:red;
	}
</style>
</body>

</html>