<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ProductBacklog Detail</title>
<link href="assets/css/bootstrap.css" rel="stylesheet">
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">

<script type="text/javascript" src="jquery-1.11.2.js"></script>
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

</script>

</head>
<body>
	<div class="navbar navbar-fixed-top navbar-inverse">
		<div class="navbar-inner">
			<div class="container">
				<a class="brand"> Update ProductBacklog </a>
				<ul class="nav">
				</ul>
			</div>
		</div>
	</div>
	<div class="container">

		<spring:url value="/updateProductBacklog.html" var="action" />
		<form:form action="${action}" modelAttribute="productBacklog">
			<form:errors path="*" cssClass="errorblock" element="div" />

			<div class="control-group">

				<label for="textinput1"> Product Name: </label>
				<form:input path="productName" cssErrorClass="error" />
				<form:errors path="productName" cssClass="error" />
				<br /> 
				<label for="textinput1"> Start Date: </label>
				<form:input path="startDate" cssErrorClass="error" />
				<form:errors path="startDate" cssClass="error" />
				<br />
				 <label for="textinput1"> End Date: </label>
				<form:input path="endDate" cssErrorClass="error" />
				<form:errors path="endDate" cssClass="error" />
				<br /> 
				<label for="textinput1"> Budget: </label>
				<form:input path="budget" cssErrorClass="error" />
				<form:errors path="budget" cssClass="error" />
				<br />

				<div class="control-group">
					<label for="selectinput1"> Select Product Category: </label>
					<form:select id="categories" path="category" />
				</div>


			</div>
			<input type="submit" class="btn" value="Add Employee" />
		</form:form>
		<%-- <h1>hello this is details page for ${currentEmployee}</h1> --%>
	</div>
</body>
</html>