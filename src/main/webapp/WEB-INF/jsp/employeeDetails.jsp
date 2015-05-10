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

<script type="text/javascript" src="jquery-1.11.2.js"></script>
<script type="text/javascript">

	$(document).ready(
		function(){
			$.getJSON('<spring:url value="availableRoles.json"/>',{ajax : 'true'},
					
			function(data){
				var html = '<option value =""> -- please seletct one --</option>';
				var len = data.length;
				for(var i=0; i<len ; i++){
					html += '<option value ="' + data[i].roleName + '">'
							+ data[i].roleName + '</option>';
				}
				
				html += '</option>';
				$('#availableRoles').html(html);
			});
			
		});		

</script>

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
			
			<label for="textinput1">
	          Select Employee Type:
	        </label>	
			<form:select id ="availableRoles" path="activity"></form:select>
			<label for="textinput1">
	          Select Roles:
	        </label>	
			<form:checkboxes items="${roleNames}" path="rolenames" />
			<form:errors path="rolenames" cssClass="error" />
			</div>
			<input type="submit" class="btn" value="Add Employee"/>
	</form:form>
<%-- <h1>hello this is details page for ${currentEmployee}</h1> --%>
</div>
</body>
</html>