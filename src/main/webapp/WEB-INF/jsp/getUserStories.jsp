<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of UserStories</title>
<link href="assets/css/bootstrap.css" rel="stylesheet">
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
</head>
<body>
    <div class="navbar navbar-fixed-top navbar-inverse">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="addEmployee.html">
            UserStories
          </a>
          <ul class="nav">
          </ul>
        </div>
      </div>
    </div>
<div class ="container">
	<table class="table table-striped table-hover">
		<tr>
		 	 <th>Id</th><th>Name</th><th>ProductBacklogId</th> 
		</tr>
		
		<c:forEach items="${userStories}" var="userStory">
			<tr>
				<td>${userStory.id}</td><td>${userStory.name}</td><!-- <td>$ {userStory.productBacklog.id}</td>  -->
				
				<td>
				
					<a href="editProductBacklog/${userStory.id}.html"> Edit </a> 
					
					<a href="deleteUserStory/${userStory.id}.html"> Delete </a>
					
					<a href="addUserStory/${userStory.id}.html"> Assign Developer </a>
					
					<a href="addUserStory/${userStory.id}.html"> Assign Tester </a>
			    
			    </td>
				 
			
				
			</tr>
		
		</c:forEach>
	
	</table>
</div>
</body>
</html>