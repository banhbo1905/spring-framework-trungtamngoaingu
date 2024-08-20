<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/common/taglib.jsp" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<title>Trang Chủ</title>

</head>

<body>

	<!-- Overlay effect when opening sidebar on small screens -->
	<div class="w3-overlay w3-hide-large" onclick="w3_close()"
		style="cursor: pointer" title="close side menu" id="myOverlay"></div>

	<!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
	<div class="w3-main" style="margin-left: 280px">

		<div class="w3-row w3-padding-64">
			<div class="w3-twothird w3-container">
				<h1 class="w3-text-teal">Trung tâm ngoại ngữ 2022</h1>
				
			</div>
			<div class="w3-third w3-container">
				<p><img src="<c:url value='/template/web/images/anh1.jpeg'/>"  width="350" height="210"></img></p>
				<p><img src="<c:url value='/template/web/images/anh2.jpeg'/>"  width="350" height="210"></img></p>
<!-- 				<p><img th:src="@{/images/anh2.jpg}" width="200" height="120"></img></p> -->
<!-- 				<p class="w3-border w3-padding-large w3-padding-32 w3-center">AD</p> -->
<!-- 				<p class="w3-border w3-padding-large w3-padding-64 w3-center">AD</p> -->
			</div>
		</div>

		<div class="w3-row">
			<div class="w3-twothird w3-container">
				<h1 class="w3-text-teal">ENGLISH  Co.,Ltd   </h1>
				<p>- Việt Nam đang trong thời kỳ hội nhập cực kỳ mạnh mẽ. Đây vừa là một thách thức, vừa mở ra những cơ hội việc làm cho bất cứ cá nhân nào có đủ năng lực. Chìa khóa cho sự thành công ở thời buổi hiện nay chính là khả năng Tiếng Anh và kỹ năng mềm. THE TIMES ý thức được sứ mệnh này, nên đã và đang góp một phần sức lực của mình trong việc đào tạo nguồn nhân lực giỏi tiếng Anh, sẵn sàng hội nhập toàn cầu.
				</p>
			</div>
			<div class="w3-third w3-container">
				<p><img src="<c:url value='/template/web/images/anh3.jpeg'/>"  width="350" height="210"></img></p>
<!-- 				<p class="w3-border w3-padding-large w3-padding-32 w3-center">AD</p> -->
<!-- 				<p class="w3-border w3-padding-large w3-padding-64 w3-center">AD</p> -->
			</div>
		</div>

		<div class="w3-row w3-padding-64">
			<div class="w3-twothird w3-container">
<!-- 				<h1 class="w3-text-teal">Heading</h1> -->
				<p>
				- Xây dựng và tổ chức thực hiện kế hoạch phát triển Trung tâm phù hợp với định hướng phát triển của Nhà trường.
				- Chương trình ngoại ngữ: phối hợp với các khoa Ngoại ngữ, và các đơn vị, cá nhân có liên quan để tổ chức giảng dạy các lớp Ngoại ngữ cho sinh viên và cho những người có nhu cầu.
				- Các chương trình bồi dưỡng ngoại ngữ khác đáp ứng nhu cầu của người học.
				- Tổ chức thi và cấp chứng chỉ quốc tế khác theo chương trình liên kết của Trung tâm với các tổ chức, cơ sở giáo dục nước ngoài đã được cơ quan thẩm quyền phê duyệt.
				- Điều tra, đánh giá nhu cầu học ngoại ngữ, trong và ngoài Trường để có kế hoạch đào tạo phù hợp.
				- Quản lý tài sản của Trung tâm theo qui định của pháp luật và của nhà trường.
				- Đóng góp tài chính cho sự nghiệp phát triển của trường theo quy định.
				- Thực hiện các nhiệm vụ khác khi được Hiệu trưởng giao.
				</p>
			</div>
			<div class="w3-third w3-container">
				<p><img src="<c:url value='/template/web/images/anh4.jpeg'/>" width="350" height="210"></img></p>
<!-- 				<p class="w3-border w3-padding-large w3-padding-32 w3-center">AD</p> -->
<!-- 				<p class="w3-border w3-padding-large w3-padding-64 w3-center">AD</p> -->
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
</style>

</body>

</html>