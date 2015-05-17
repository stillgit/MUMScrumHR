<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of ProductBacklogs</title>

</head>
<body>
  
<div class ="container">
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