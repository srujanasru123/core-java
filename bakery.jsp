<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Bakery Application</title>
    <style>
        body {
            background-color: black;
        }

        .bakery {
            padding-left: 10px;
            color: green;
            font-size: 24px;
        }

        .form {
            background-color:white;
            width: 400px;
            padding: 20px;
            margin: 0 auto;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
        }

        .form label {
            display: white;
            margin-top: 10px;
            font-weight: bold;
        }

        .form input[type="text"],
        .form select,
        .form input[type="date"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .form input[type="submit"] {
            background-color: green;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .form input[type="submit"]:hover {
            background-color: darkgreen;
        }
    </style>
    <script type="text/javascript">
    function handleName(){
    	console.log("Name value")
    	const valid=document.getElementById("name").value;
    	const button=document.getElementById("Submit");
    	if(valid.length>3 && valid.length<20){
    		console.log("Name is valid")
    		document.getElementById("N").innerHTML="It is valid";
    		button.removeAttribute("disabled");
    	}else{
    		document.getElementById("N").innerHTML="It is invalid";
    		button.setAttribute("disabled","disabled");
    	}
    }
    function handleprice(){
    	console.log("Price value")
    	const validprice=document.getElementById("price").value;
    	const button=document.getElementById("Submit");
    	if(validprice>10 && validprice<1000)
    		{
    		console.log(" It is valid")
    		document.getElementById("P").innerHTML="It is valid";
    		button.removeAttribute("disabled");
    		}else{
    			console.log("It is Invalid")
    			document.getElementById("P").innerHTML="It is Invalid ";
    			button.setAttribute("disabled","disabled");
    		}
    	
    }
    function handleQuantity(){
    	const Quanti=document.getElementById("quantity").value;
    	const button=document.getElementById("Submit");
    	if(Quanti!="choose..."){
    		document.getElementById("Q").innerHTML="it is valid";
    		button.removeAttribute("disabled");
    	}else{
    		document.getElementById("Q").innerHTML="It is InValid";
    		button.setAttribute("disabled","disabled");
    	}
    }
    function handlediscount(){
    	console.log("Discount value")
    	const Di=document.getElementById("discount").value;
    	const button=document.getElementById("Submit");
    	if(Di!="choose...")
    		{
    		document.getElementById("D").innerHTML="It is valid";
    		button.removeAttribute("disabled");
    		}else{
    			document.getElementById("D").innerHTML="It Is Invalid";
    			button.setAttribute("disabled","disabled");
    		}
    }
    function GST(){
    	console.log("GST Value")
    	const validG=document.getElementById("gst").value;
    	const button=document.getElementById("Submit");
    	if(validG.length>6 && validG.length<30){
    		console.log("GST is Valid")
    		document.getElementById("G").innerHTML="It is valid";
    		button.removeAttribute("disabled");
    	}else{
    		console.log("Gst is Invalid")
    		document.getElementById("G").innerHTML="It is Invalid";
    		button.setAttribute("disabled","disabled");
    	}
    }
    function handleManf(){
    	console.log("Manf Date Value")
    	const MMM=document.getElementById("manf").value;
    	const button=document.getElementById("Submit");
    	if(MMM!=''){
    		console.log("Manf date is Valid")
    		document.getElementById("M").innerHTML="It is Valid";
    		button.removeAttribute("disabled");
    	}else{
    		console.log("Manf Date is Invalid")
    		document.getElementById("M").innerHTML="It Is Invalid";
    		button.setAttribute("disabled","disabled");
    		}
    }
    function handleExpiry(){
    	console.log("Expiry Date Value")
    	const EEE=document.getElementById("expiry").value;
    	const MMM=document.getElementById("manf").value;
    	const button=document.getElementById("Submit");
    	if(EEE!='' ){
    		console.log("Expiry date is Valid")
    		document.getElementById("E").innerHTML="It is Valid";
    		button.removeAttribute("disabled");
    	}else{
    		console.log("Expiry Date is Invalid")
    		document.getElementById("E").innerHTML="It Is Invalid";
    		button.setAttribute("disabled","disabled");
    		}
    }
    
    </script>
</head>
<body>
<div class="bakery">Bakery Application</div>
<form action="Attach" method="post" class="form">
<p id="N"/>
    <div>
        <label>Item Name</label>
        <input type="text" placeholder="Name" name="Name" onblur="handleName()" id="name">
    </div>
    <p id="P"/>
    <div>
        <label>Item Price</label>
        <input type="text" placeholder="Price" id="price" name="price" onblur="handleprice()">
    </div>
    <p id="Q"/>
    <div>
        <label>Quantity</label>
        <select name="quantity"  id="quantity" onblur="handleQuantity()">
            <option>choose...</option>
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
            <option>6</option>
            <option>7</option>
            <option>8</option>
            <option>9</option>
            <option>10</option>
        </select>
    </div>
    <p id="D"/>
    <div>
        <label>Discount</label>
        <select name="discount" id="discount" onblur="handlediscount()">
            <option>choose...</option>
            <option>5</option>
            <option>10</option>
            <option>15</option>
            <option>20</option>
            <option>50</option>
        </select>
    </div>
    <p id="G"/>
    <div>
        <label>GST</label>
        <input type="text" placeholder="GST" name="gst" id="gst" onblur="GST()">
    </div>
    <p id="M"/>
    <div>
        <label>Manf Date</label>
        <input type="date" placeholder="Date" name="Manf" id="manf" onblur="handleManf()" >
    </div>
    <p id="E"/>
    <div>
        <label>Expiry Date</label>
        <input type="date" placeholder="Date" name="Expiry" id="expiry" onblur="handleExpiry()">
    </div>
    <input type="submit" value="Save" id="Submit" disabled>
</form>
</body>


</html>