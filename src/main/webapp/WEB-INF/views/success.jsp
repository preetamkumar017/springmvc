<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="springmvc.model.User" %>
<%
    User user = (User) request.getAttribute("user");

    String header = (String) request.getAttribute("header");
    String desc = (String) request.getAttribute("desc");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <title>Submitted Data</title>
</head>
<body>

<div class="container mt-5">
    <div class="row justify-content-center">
    
        <div class="col-md-6">
        
    <h1><%=header %></h1>
    <h1><%=desc %></h1>
            <h2>Submitted Data</h2>
            <p>Email: <strong id="email"><%= user.getEmail() %></strong></p>
            <p>Name: <strong id="name"><%= user.getName() %></strong></p>
            <p>Password: <strong id="password"><%= user.getPassword() %></strong></p>
        </div>
    </div>
</div>

</body>
</html>
