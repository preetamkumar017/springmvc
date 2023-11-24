<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	//String name = (String) request.getAttribute("name");
	//int id = (Integer) request.getAttribute("id");
	List<String> arr = (List<String>) request.getAttribute("list");
	out.println(arr.toString());
	%>
	<%=arr%>


	<h1>Items:</h1>
	<ul>
		<%
		for (String p : arr) {
		%>
		<h1><%=p%></h1>
		<%
		}
		%>
	</ul>
</body>
</html>