<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Address Page</title>
</head>
<style>
h2{
color:green;
}

</style>
<body>
    <h1>Address Page</h1>
    
    <%-- Retrieve the user's ID from the session or request attribute --%>
    <%
        String userId = (String) request.getAttribute("userId");
    %>
    
    <p>Welcome</p>
    
  
        <h2>Address sent Successfully!!</h2>
        
        <h3>Address Information:</h3>
        <p>no: ${number}</p>
        <p>state: ${state}</p>
        <p>street: ${street}</p>
        <p>country: ${country}</p>
        <p>city: ${city}</p>
  
  
    
    <form method="get" action="LoginSuccess.jsp">
        <button type="submit">Home</button>
    </form>
</body>
</html>