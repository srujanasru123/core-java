<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>x-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark bg-dark">
<h5 class="text-white h4"> X-workz</h5>

<nav aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item"><a class="btn btn-primary" href="Index.jsp" role="button">Home</a></li>
    <li class="breadcrumb-item active" aria-current="page"><a class="btn btn-primary" href="LoanApply.jsp" role="button">LoanApply</a></li>
  </ol>
</nav>
</nav>
	<h3> Application for applying Loan!!!</h3>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
		<form action="life" class="p-3 mb-2 bg-secondary text-white" method="post">
		<label>Name: </label> <input type="text" placeholder="name" name="name"/><br><br>
		<label>Amount: </label><input type="text" placeholder="Amount" name="amount"/><br><br>             
	    <label> Working: </label>  <input type="text" placeholder="Working" name="working"/><br><br> 
	    <label> Interest: </label>  <input type="text" placeholder="Interest" name="interest"/><br><br> 
	    <label> Surety: </label>  <input type="text" placeholder="Surety" name="surety"/><br><br> 
	    <label> Company: </label>  <input type="text" placeholder="Company" name="company"/><br><br> 
	    <label> Loan Tenure: </label>  <input type="text" placeholder="Loan Tenure" name="loanTenure"/><br><br> 
	    <label> Loan Type: </label>  <input type="text" placeholder="Loan Type" name="loanType"/><br><br> 
	   <div class="form-check">
		  <input class="form-check-input" type="checkbox" id="flexCheckDefault" name="term" value="yes" />
		  <label class="form-check-label" for="flexCheckDefault">
		    Accept The Terms
		  </label> </div><br>
		 <input type="submit" value="save" class="btn btn-success"/>
		  
		</form>
</body>
</html>