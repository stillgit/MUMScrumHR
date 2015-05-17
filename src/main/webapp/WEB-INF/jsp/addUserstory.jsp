<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


 	<link href="assets/css/bootstrap.css" rel="stylesheet">
	<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
<title>Add UserStory</title>
<script type="text/javascript" src="jquery-1.11.2.js"></script>
 
 
</head>
<body>
    <div class="navbar navbar-fixed-top navbar-inverse">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="#">
            Add UserStory
          </a>
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
    
    <div class="container">
   
      
 <spring:url value="/addUserStory.html" var="action" />
<form:form action="${action}" method="POST" modelAttribute="userStory">
<form:errors  path="*"  cssClass= "errorblock" element="div"/>
			<label for="textinput1">
	          UserStory Name:
	        </label>	
			<form:input path="name" cssErrorClass="error" />
			<form:errors path="name" cssClass="error" />
			<br/>
			
			<input type="submit" class="btn" value="Add UserStory"/>
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