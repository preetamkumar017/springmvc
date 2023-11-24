<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name = (String) request.getAttribute("name");
int id = (Integer) request.getAttribute("id");
List<String> arr = (List<String>) request.getAttribute("list");
%>

<h1><%= name %></h1>
<h1><%= id %></h1>

<%

	for(String p:arr)
	{
		out.println(p);
	}
%>


</body>
</html>