<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ include file="/commons/taglibs.jsp"%>

<c:url value="/" var="URL"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value='template/web/web.css' />" rel="stylesheet"
	type="text/css" media="all" />
</head>
<body>


<!--     BEGIN CONTENT -->
<%@ include file="/commons/web/sidebar.jsp"%>
<sitemesh:write property="body"/>
</body>
</html>