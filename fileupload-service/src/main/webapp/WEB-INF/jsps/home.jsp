<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>File Upload</title>
</head>
<body>
   <c:url var="url" value="/" />
	<form method="POST" action="${baseUrl}/files"
		enctype="multipart/form-data">
		<input type="file" name="file" /><input type="submit" value="Submit" />
	</form>
</body>
</html>