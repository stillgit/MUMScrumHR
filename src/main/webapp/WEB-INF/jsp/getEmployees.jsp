<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees Report</title>
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
	<table class="table table-striped table-hover">
		<tr>
		 	 <th>ID</th><th>FirstName</th><th>LastName</th>
		</tr>
		
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.id}</td><td>${employee.firstName}</td><td>${employee.lastName}</td>
				<td>
					<table>
						<tr>
							<th>Rele ID</th><th>Role Name</th>
						</tr>
							<c:forEach items="${employee.roles}" var="role">
								<tr>
									<td>${role.id}</td><td>${role.roleName}</td>
								</tr>
							</c:forEach>
						
					</table>
				</td> 
				<td>
				
					<a href="editEmployee/${employee.id}.html"> edit </a> 
					
					<a href="deleteEmployee/${employee.id}.html"> delete </a>
			    
			    </td>
				 
			
				
			</tr>
		
		</c:forEach>
	
	</table>
</div>
</body>
</html>