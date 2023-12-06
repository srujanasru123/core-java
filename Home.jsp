<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Navbar Example</title>

<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
	<style>
	.form{
	background-color:bisque;
	weidth:200px;
	}
	
	</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-black bg-dark">
		<a class="navbar-brand" href="#"> <img src="xworkzLogo.png"
			width="100" height="30" class="d-inline-block align-top" alt="Logo">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="home.jsp">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="aboutUs.jsp">About
						Us</a></li>
				<li class="nav-item"><a class="nav-link" href="gallery.jsp">Gallery</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="contact.jsp">Contact</a>
				</li>
			</ul>
		</div>


		<form class="form-inline">
			<input class="form-control mr-2" type="search" placeholder="Search"
				aria-label="Search">
			<button class="btn btn-outline-success" type="submit">Search</button>
		</form>


		</li>
		<li class="nav-item"><a class="nav-link" href="profile.jsp">Profile
		</a></li>
	</nav>


	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<form action="Attach" method="post" class="form" onSubmit=" return validateForm()">
					<span style='color: green;' id="N"></span>
					<div class="form-group">

						<label for="name">Name</label> <input type="text"
							class="form-control" id="name" name="name"
							placeholder="Enter your name" onblur="handleName()" >
					</div>
					<br>
					<p id="Nu" />
					<div class="form-group">

						<label for="mobile">Mobile Number</label> <input type="text"
							class="form-control" id="mobile" name="mobile"
							placeholder="Enter your mobile number" onblur="handleNumber()" >
					</div>
					<br>
					<p id="E" />
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Email
							address</label> <input type="email" class="form-control"  onblur="Email()"name="email"
							id="exampleInputEmail1" aria-describedby="emailHelp" >
						<div id="emailHelp" class="form-text">We'll never share your
							email with anyone else.</div>
						  
					</div>
					<br>
					<p id="D"/>
					<div class="form-group">
						<label for="dob">Date of Birth</label> <input type="date"
							class="form-control" id="dob" name="dob"
							onblur="handleFromGroup()" >
					</div>
					<br>
					<p id="C" />
					<div class="col-md-3">
						<label for="location" class="form-label" >location</label>
						<select class="form-select" id="location" name="Location"onblur="handleLocation()" >
							<option selected disabled value="">Choose...</option>
							<option>Karwar</option>
							<option>Honnavar</option>
							<option>Ujire</option>
							<option>Manglore</option>
						</select>
					</div>
					<br>
					<p id="P" />
					<div class="form-group">
						<label for="password">Password</label> <input type="password"
							class="form-control" id="password" name="password"
							placeholder="Enter your password" onblur="handlePassword()" >
					</div>
					<br>
					<p id="Pa" />
					<div class="form-group">
						<label for="confirmPassword">Confirm Password</label> <input
							type="password" class="form-control" id="confirmPassword"
							name="confirmPassword" placeholder="Confirm your password"
							onblur="handleConfirm()" >
					</div>
					<br>
					<div class="g-recaptcha"
						data-sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI" id="captcha1" onblur="Error()"></div>
						<span>Copyright@2023</span>

					<br>


					<input type="reset" value="Cancle">

					<button type="submit" value="Submit"
					 class="btn btn-primary" id="Submit" disabled>Submit</button>
					
				</form>
			</div>
		</div>
	</div>
	<script>
	function handleFromGroup(){
		const date=document.getElementById("dob").value;
		const button=document.getElementById("Submit");
		if(date===''){
			console.log("date is Invalid")
			document.getElementById("D").innerHTML="It is InValid";
			button.setAttribute("disabled","disabled");
			
		}else{
			console.log("Date is valid...")
			document.getElementById("D").innerHTML="It is valid";
			button.removeAttribute("disabled");
		}
		
	}
    function handleName(){
    	const Name=document.getElementById("name").value;
    	const button=document.getElementById("Submit");
    	if(Name.length>3 && Name.length<20){
    		console.log("Name is valid")
    		document.getElementById("N").innerHTML="It is Valid";
    		button.removeAttribute("disabled");
    		
    	}else{
    		console.log("Name is Invalid")
    		document.getElementById("N").innerHTML="It is in Valid";
    		button.setAttribute("disabled","disabled");
    	}
    }
    function Email(){
    	const verifyEmail=document.getElementById("exampleInputEmail1").value;
    	const button=document.getElementById("Submit");
    	if(verifyEmail=="yashuprethu80@gmail.com")
    	 {
    		 console.log("Email is Valid")
    		 document.getElementById("E").innerHTML="It is Valid";
     		button.removeAttribute("disabled");
    	 }else{
    		 console.log("Email is Invalid")
     		document.getElementById("E").innerHTML="It is in Valid";
     		button.setAttribute("disabled","disabled");
    		
    	 }
    }
    function handleNumber(){
    	const Number=document.getElementById("mobile").value;
    	const button=document.getElementById("Submit");
    	if(Number>1000000000 && Number<9999999999)
    		{
    		console.log("Number is valid")
    		document.getElementById("Nu").innerHTML="It is Valid";
    		button.removeAttribute("disabled");
    		}else{
    			console.log("Number is Invalid")
    			document.getElementById("Nu").innerHTML="It is in Valid";
    			button.setAttribute("disabled","disabled");
    			}
    }
    function handleLocation(){
    	const checkLocation=document.getElementById("location").value;
    	const button=document.getElementById("Submit");
    	if(checkLocation==='Choose...'){
    		console.log("Location is InValid")
    		button.setAttribute("disabled","disabled");
    		document.getElementById("C").innerHTML="It is inValid";
    	}else{
    		console.log("Location is Valid")
    		document.getElementById("C").innerHTML="It is Valid";
    		button.removeAttribute("disabled");
    	}
    }
    function handlePassword(){
    	const checkPassword=document.getElementById("password").value;
    	
    	const button=document.getElementById("Submit");
    	if(checkPassword.length>3&& checkPassword.length<20)
    		{
    		console.log("Password is valid")
    		document.getElementById("P").innerHTML="It  is Valid";
    		button.removeAttribute("disabled");
    		}else{
    			console.log("password is Invalid")
        		document.getElementById("P").innerHTML="It is Valid";
    			
    		}
    }
   function handleConfirm(){
	   const ConfirmPassword=document.getElementById("confirmPassword").value;
	   const checkPassword=document.getElementById("password").value;
   	const button=document.getElementById("Submit");
   	if(ConfirmPassword!=checkPassword)
   		{
   		console.log("ConfirmPassword is invalid")
		document.getElementById("Pa").innerHTML="It is Valid";
   		button.setAttribute("disabled","disabled");
		}else{
			console.log("ConfirmPassword is valid")
    		document.getElementById("Pa").innerHTML="It is InValid";
			button.removeAttribute("disabled");
			
		}
   		
   }
   function Error(){
	   
	   const error=grecaptcha.getResponse();
	   const button=document.getElementById("Submit");
	   if(error.length===0){
		   button.setAttribute("disabled","disabled");
	   }else{
		   button.removeAttribute("disabled");
	   }
   }
   
   function validateForm() {
	  //  alert('hi');
	    console.log('validateForm>>>');
	   // alert('hi');
	    const date=document.getElementById("dob").value;
	    const Name=document.getElementById("name").value;
	    const verifyEmail=document.getElementById("exampleInputEmail1").value;;
	    const Number=document.getElementById("mobile").value;
	    const checkLocation=document.getElementById("location").value;
	    const checkPassword=document.getElementById("password").value;
	    const ConfirmPassword=document.getElementById("confirmPassword").value;
	    const error=grecaptcha.getResponse();
	    const button=document.getElementById("Submit");
	    console.log(error.length);
	    console.log(Number.length);
	    console.log(location);
	    console.log(password);
	    console.log(confirmPassword);
	     
	    if(Name.length>3 && Name.length<20 && Number>1000000000 && Number<9999999999 && verifyEmail=="rsrujana392@gmail.com" && date!='' &&
	    		checkLocation!='Choose...'  && checkPassword.length>3&& checkPassword.length<20  && error.length!=0){
	    console.log('im in if');
	document.getElementById("captcha1").innerHTML = "<span style='color:blue'>info is valid</span>";
	button.removeAttribute("disabled");
	return true;
	} else {
	    console.log('im in else');
	document.getElementById("captcha1").innerHTML = "";
	button.setAttribute("disabled","disabled");
	return false;
	}
	} 

    
    
    
    </script>
	<script src='https://www.google.com/recaptcha/api.js'></script>

	<!-- Add Bootstrap JS Links -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>