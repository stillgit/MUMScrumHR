<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Add Role Page</title>
 	<link href="assets/css/bootstrap.css" rel="stylesheet">
	<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
</head>
<body>
    <div class="navbar navbar-fixed-top navbar-inverse">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="addRole.html">
            Add Role
          </a>
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
    <div class="container">
      <div>
        <h1>
          Add Role
        </h1>
        <p>
          Add role name.
          <br>
          &nbsp;
        </p>
      </div>
      
      <form:form commandName="role">
		<form:errors path="*" cssClass="errorblock" element="div" />
			<div class="control-group">
			<label for="textinput1">
	          Enter Role Name:
	        </label>	
			<form:input path="roleName" cssErrorClass="error" />
			<form:errors path="roleName" cssClass="error" />
		
			</div>
			<input type="submit" class="btn" value="Add Role"/>
 		 </form:form>
     
      <div class="control-group">
      </div>
    </div>

     <script src="jquery-1.8.3.js">
    </script>
    <script src="assets/js/bootstrap.js">
    </script>
  </body>
</html>