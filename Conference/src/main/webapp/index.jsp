<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Conference Registration</title>
    <link rel="stylesheet" href="resources/css/bootstrap.css">
  </head>
</head>
<body>
<div class="container text-center  bg-danger align-items-center" >


    <form  method="post" action="Register" id="registration">
           <h1>Registration</h1>
	    <div class ="  form-group ">
	    
	    <input type="text" class="form-control" id="name" placeholder="User Name">
	    <small class="text-form text-muted" style="color: red;visibility: false" id="nerr"> field shouldn't be empty</small>
	    </div>
	    
	    <div class ="form-group">
	    
	    <input type="email" class="form-control" id="email" placeholder="Email">
	    	    <small class="text-form text-muted" style="color: red;visibility: false" id="merr"> field shouldn't be empty</small>
	    
	    </div>
	    
	    <div class ="form-group">
	    <label>Password</label>
	    <input type="password" class="form-control" placeholder="Password">
	    <small class="text-form text-muted" style="color: red;visibility: false" id="perr"> field shouldn't be empty</small>
	    
	    </div>
         <div class ="form-group">
         <input type="submit" class="btn btn-primary" onclick=validateForm();>
         </div>
    </form>
</div>



    <script src="resources/js/jquery-3.7.1.min.js"></script>
    <script src="resources/js/popper.min.js"></script>
    <script src="resources/js/bootstrap.js"></script>
    <script src="resources/js/validate.js"></script>
  </body>
</html>