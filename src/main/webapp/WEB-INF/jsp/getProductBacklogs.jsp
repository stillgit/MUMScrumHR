<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of ProductBacklogs</title>
<link href="assets/css/bootstrap.css" rel="stylesheet">
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
</head>
<body>

     <div class="navbar navbar-fixed-top navbar-inverse">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="addProductBacklog.html">
            Add ProductBacklog
          </a>
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
  
  
    	<ul class="nav nab-tabs nav-stacked span3">
    			<li class="active"><a href="#">product 1</a></li>
    			<li><a href="#">product 2</a></li>
    			<li><a href="#">product 3</a></li>
    	</ul>
   
    
<div class ="container span9">
	<table class="table table-striped table-hover">
		<tr>
		 	 <th>Product Name</th><th>Category</th><th>Budget</th>
		</tr>
		
		<c:forEach items="${productBacklogs}" var="productBacklog">
			<tr>
				<td>${productBacklog.productName}</td><td>${productBacklog.category}</td><%-- <td>${productBacklog.budget}</td> --%>
				
				<td>
				
					<a href="editProductBacklog/${productBacklog.id}.html"> Edit </a> 
					
					<a href="deleteProductBacklog/${productBacklog.id}.html"> Delete </a>
					
					<a href="addUserStory/${productBacklog.id}.html"> Add UserStory </a>
			    
			    </td>
				 	
				
			</tr>
		
		</c:forEach>
	
	</table>
</div>
</body>
</html>