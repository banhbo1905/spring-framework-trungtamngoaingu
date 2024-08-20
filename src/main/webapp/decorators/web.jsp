<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>ENGLISH Co.,Ltd</title>
<!-- Bootstrap core CSS -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" type="image/x-icon" href="<c:url value='/template/web/images/favicon2.ico'/>">
<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/css/theme.css'/>"/>
<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/css/styles.css'/>" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
</head>
<body>
	<!-- Navigation -->
	<%@ include file="/common/web/header.jsp" %>
    <%@ include file="/common/web/menu.jsp" %>

	 <dec:body/>

	<%-- <!-- Footer -->
	<%@ include file="/common/web/footer.jsp" %> --%>

	<!-- Bootstrap core JavaScript -->
</body>
</html>