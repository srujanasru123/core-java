<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
    <style>
        .success-message {
            color: green;
            font-size: 40px;
        }
    </style>
</head>
<body>
    <h1>Welcome Page</h1>
    
    <%-- Retrieve the user's ID from the session or request attribute --%>
    <%
        String userId = (String) request.getAttribute("userId");
    %>
     <p class="success-message">Login Success!!</p>
    <p>Welcome</p>
    
    <form method="get" action="Address.jsp">
        <button type="submit">Address</button>
    </form>
</body>
</html>