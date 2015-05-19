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
<title>Add ProductBacklog</title>
<!-- <script type="text/javascript" src="jquery-1.11.2.js"></script>
 
<script type="text/javascript">

	$(document).ready(
		function(){
			$.getJSON('<spring:url value="availableCategories.json"/>',{ajax : 'true'},
					
			function(data){
				var html = '<option value =""> -- please seletct one --</option>';
				var len = data.length;
				for(var i=0; i<len ; i++){
					html += '<option value ="' + data[i] + '">'
							+ data[i]+ '</option>';
				}
				
				html += '</option>';
				$('#categories').html(html);
			});
			
		});		

</script>  -->
</head>
<body>
    <div class="navbar navbar-fixed-top navbar-inverse">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="#">
            Add ProductBacklog
          </a>
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
    
    <div class="container">
   
      
      <form:form commandName="productBacklog">
		<form:errors path="*" cssClass="errorblock" element="div" />
			<label for="textinput1">
	          Product Name:
	        </label>	
			<form:input path="productName" cssErrorClass="error" />
			<form:errors path="productName" cssClass="error" />
			<br/>
			<label for="textinput1">
	          Start Date:
	        </label>	
			<form:input path="startDate" cssErrorClass="error" />
			<form:errors path="startDate" cssClass="error" />
			<br/>
			<label for="textinput1">
	          End Date:
	        </label>	
			<form:input path="endDate" cssErrorClass="error" />
			<form:errors path="endDate" cssClass="error" />
			<br/>
			<%-- <label for="textinput1">
	          Budget:
	        </label>	
			<form:input path="budget" cssErrorClass="error" />
			<form:errors path="budget" cssClass="error" /> --%>
			<br/>

			<div class="control-group">
          <label for="selectinput1">
            Select Product Category:
          </label>
          <form:select items="${categoryNames}" path="category" />
          </div>
			 
			<input type="submit" class="btn" value="Add ProductBacklog"/>
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