<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<nav
		class="w3-sidebar w3-bar-block w3-collapse w3-large w3-theme-l5 w3-animate-left"
		id="mySidebar">
		<a href="javascript:void(0)" onclick="w3_close()"
			class="w3-right w3-xlarge w3-padding-large w3-hover-black w3-hide-large"
			title="Close Menu"> <i class="fa fa-remove"></i>
		</a>
		<h4 class="w3-bar-item">
			<b>Danh sách chức năng</b>
		</h4>
		<a class="w3-bar-item w3-button w3-hover-black" href=""> <img  src="<c:url value='/template/web/images/iconhome.png'/>"
			 width="32" height="32"></img>&nbsp;Trang chủ
		</a> <a class="w3-bar-item w3-button w3-hover-black" href="<c:url value="/tra-cuu"/>"> <img src="<c:url value='/template/web/images/icons8-tour-guide-48.png'/>"
			 width="32" height="32"></img>&nbsp;Tra cứu thông tin thí sinh
		</a> <a class="w3-bar-item w3-button w3-hover-black" href="<c:url value="/chung-nhan"/>"> <img src="<c:url value='/template/web/images/icons8-employee-64.png'/>"
			 width="32" height="32"></img>&nbsp;Xem giấy chứng nhận kết quả thi
		</a> <a class="w3-bar-item w3-button w3-hover-black" href="<c:url value="/danh-sach"/>"> <img src="<c:url value='/template/web/images/icons8-employee-64.png'/>"
			 width="32" height="32"></img>&nbsp;Xem danh sách thí sinh theo phòng
		</a> <a class="w3-bar-item w3-button w3-hover-black" href="<c:url value="/thong-ke"/>"><img src="<c:url value='/template/web/images/chart-icon.png'/>"
			 width="32" height="32"></img>&nbsp;Thống kê theo trình độ</a>
	</nav>