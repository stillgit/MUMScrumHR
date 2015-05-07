<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Add Employee Page</title>
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
          <a class="brand" href="#">
            Add Employee
          </a>
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
    <div class="container">
      <div>
        <h1>
          Add Employee
        </h1>
        <p>
          Add Employee and select his/her role in the team.
          <br>
          &nbsp;
        </p>
      </div>
      
      <form:form commandName="employee">
		<form:errors path="*" cssClass="errorblock" element="div" />
			<label for="textinput1">
	          First Name:
	        </label>	
			<form:input path="firstName" cssErrorClass="error" />
			<form:errors path="firstName" cssClass="error" />
			<br/>
			<label for="textinput1">
	          Last Name:
	        </label>	
			<form:input path="lastName" cssErrorClass="error" />
			<form:errors path="lastName" cssClass="error" />
			<br/>
<%-- 			<label for="textinput1">
	          Select Employee Type:
	        </label>	
			<form:select id ="availableRoles" path="role"></form:select>
			<br/>
			<label for="textinput1">
	          Select Roles:
	        </label>	
			<form:select id ="availableRoles" path="role"></form:select>
			<br/> --%>
			<input type="submit" class="btn" value="Add Employee"/>
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