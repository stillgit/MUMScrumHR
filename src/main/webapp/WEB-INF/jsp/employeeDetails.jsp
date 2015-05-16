<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees Detail</title>
<link href="assets/css/bootstrap.css" rel="stylesheet">
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">

</head>
<body>
    <div class="navbar navbar-fixed-top navbar-inverse">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="addEmployee.html">
            Add Employees
          </a>
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
<div class ="container">

<spring:url value="/update.html" var="action" />
<form:form action="${action}" modelAttribute="employee">
<form:errors  path="*"  cssClass= "errorblock" element="div"/>
<div class="control-group">
			<label for="textinput1">
	          First Name:
	        </label>	
			<form:input path="firstName" cssErrorClass="error" />
			<form:errors path="firstName" cssClass="error" />
			
			<label for="textinput1">
	          Last Name:
	        </label>	
			<form:input path="lastName" cssErrorClass="error" />
			<form:errors path="lastName" cssClass="error" />
			</div>
			<div class="control-group">			
			<label for="textinput1">
	            Select Roles:
	        </label>	
				
			<form:checkboxes items="${roleNames}" path="roleNames"></form:checkboxes>

			<label for="textinput1">
	          	Select Employee Type:
	        </label>	
			<form:select items="${empTypeNames}" path="activity" />
			<form:errors path="activity" cssClass="error" />
			</div>
			<input type="submit" class="btn" value="Update"/>
	</form:form>
<%-- <h1>hello this is details page for ${currentEmployee}</h1> --%>
</div>
</body>
</html>