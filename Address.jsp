<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Address Page</title>
</head>
<body>
  
    <h2>Address Form:</h2>
    <form method="post" action="AttachAddress">
        <label for="no">no:</label>
        <input type="text" id="no" name="number" required><br><br>
        
        <label for="state">state:</label>
        <input type="text" id="state" name="state" required><br><br>
        
        <label for="street">street:</label>
        <input type="text" id="street" name="street" required><br><br>
        
        <label for="country">country:</label>
        <input type="text" id="country" name="country" required><br><br>
        
        <label for="city">city:</label>
        <input type="text" id="city" name="city" required><br><br>
        
        <input type="submit" value="Send">
    </form>
</body>
</html>