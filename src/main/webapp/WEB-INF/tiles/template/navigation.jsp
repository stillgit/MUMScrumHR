<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<aside>
	<div id="sidebar" class="nav-collapse ">
		<!-- sidebar menu start-->
		<ul class="sidebar-menu" id="nav-accordion">
		
<%-- 			<li><a class="active" href="<spring:url value="/home.html"/>">
					<i class="fa fa-dashboard"></i> <span>Dashboard</span>
			</a></li>

			<li><a href="<spring:url value="/"/>"> <i class="fa fa-home"></i>
					<span>People </span>
			</a></li>

			<li class="sub-menu"><a href="javascript:;"> <i
					class="fa fa-comments-o"></i> <span>Product</span>
			</a>

				<ul class="sub">
					<li><a href="<spring:url value="/getProducts.html"/>">List
							of Products</a><a href="<spring:url value="/getProduct.html"/>">Add
							Product</a></li>
					<li><a
						href="<spring:url value="/addProductBacklog1/{id}.html"/>">Add
							ProductsBacklog</a></li>
					<li><a href="<spring:url value="/addProduct.html"/>">Add</a></li>
					<li><a href="<spring:url value="/editProduct/{id}"/>">Edit</a></li>
					<li><a href="<spring:url value="/deleteProduct/{id}"/>">Remove</a></li>
				</ul></li>

			<li class="sub-menu"><a href="javascript:;"> <i
					class="fa fa-comments-o"></i> <span>Product Backlog</span>
			</a>

				<ul class="sub">

					<li><a href="<spring:url value="/productBacklog/add"/>">Add</a></li>
					<li><a href="<spring:url value="/productBacklog/edit"/>">Edit</a></li>
					<li><a href="<spring:url value="/productBacklog/remove"/>">Remove</a></li>
					<li><a href="<spring:url value="/productBacklog/list"/>">Show
							UserStory</a></li>
					<li><a href="<spring:url value="/productBacklog/list"/>">Add
							UserStory</a></li>
				</ul></li>

			<li class="sub-menu"><a href="javascript:;"> <i
					class="fa fa-signal"></i> <span>User Story</span>
			</a>

				<ul class="sub">

					<li><a href="<spring:url value="/productBacklog/add"/>">Add</a></li>
					<li><a href="<spring:url value="/productBacklog/edit"/>">Edit</a></li>
					<li><a href="<spring:url value="/productBacklog/remove"/>">Remove</a></li>
					<li><a href="<spring:url value="/productBacklog/list"/>">Estimate
							Effort Time</a></li>
					<li><a href="<spring:url value="/productBacklog/list"/>">Update
							Effort Time</a></li>
				</ul></li>

			<li class="sub-menu"><a href="<spring:url value="/"/>"> <i
					class="fa fa-search"></i> <span>Release </span>
			</a>

				<ul class="sub">

					<li><a href="<spring:url value="/productBacklog/add"/>">Add</a></li>
					<li><a href="<spring:url value="/productBacklog/edit"/>">Edit</a></li>
					<li><a href="<spring:url value="/productBacklog/remove"/>">Remove</a></li>
					<li><a href="<spring:url value="/productBacklog/list"/>">Show
							UserStory</a></li>
					<li class="sub-menu"><a href="<spring:url value="/"/>"> <i
							class="fa fa-tasks"></i> <span>Assign UserStory </span>
					</a>
						<ul class="sub">
							<li><a href="<spring:url value="/productBacklog/list"/>">Assign
									to ScrumMaster</a></li>
							<li><a href="<spring:url value="/productBacklog/list"/>">Assign
									to Developer</a></li>
							<li><a href="<spring:url value="/productBacklog/list"/>">Assign
									to Tester</a></li>
						</ul></li>
				</ul></li>

			<li class="sub-menu"><a href="javascript:;"> <i
					class="fa fa-signal"></i> <span>Sprints </span>
			</a>

				<ul class="sub">

					<li><a href="<spring:url value="/sprint/add"/>">Add</a></li>
					<li><a href="<spring:url value="/sprint/edit"/>">Edit</a></li>
					<li><a href="<spring:url value="/sprint/remove"/>">Remove</a></li>
					<li><a href="<spring:url value="/sprint/"/>">Show
							UserStory</a></li>
				</ul></li>

			<li class="sub-menu"><a href="javascript:;"> <i
					class="fa fa-tasks"></i> <span>TaskBoard </span>
			</a>

				<ul class="sub">
					<li><a href="<spring:url value="/tasks/"/>">Show tasks</a></li>
					<li><a href="<spring:url value="/tasks/add"/>">Add</a></li>
					<li><a href="<spring:url value="/tasks/edit"/>">Edit</a></li>
					<li><a href="<spring:url value="/tasks/remove"/>">Remove</a></li>
				</ul></li>

			<li><a href="<spring:url value="/burndawnChart.html"/>"> <i
					class="fa fa-bar-chart-o"></i> <span>Burndown </span>
			</a></li> --%>
			<!--multi level menu end-->
			

	<li><h3>all Products</h3></li> 

   <c:forEach items="${products}" var="product">
			<li class="sub-menu"><a href="javascript:;"> <i
					class="fa fa-comments-o"></i> <span>${product.productName}</span>
			</a>

				<ul class="sub">

					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-comments-o"></i> <span>Product Backlog</span>
					</a>

						<ul class="sub">

							<li class="sub-menu"><a href="<spring:url value="/"/>">
									<i class="fa fa-tasks"></i> <span>releases </span>
							</a>
								<ul class="sub">

									<li class="sub-menu"><a href="<spring:url value="/"/>">
											<i class="fa fa-tasks"></i> <span>sprints </span>
									</a>
										<ul class="sub">

											<li class="sub-menu"><a href="<spring:url value="/"/>">
													<i class="fa fa-tasks"></i> <span>UserStory</span>
											</a>

											<li><a href="<spring:url value="#"/>">Add User Story</a></li>
										</ul></li>


									<li><a href="<spring:url value="#"/>">Add sprints</a></li>
								</ul></li>

							<li><a href="<spring:url value="#"/>">Add Releases</a></li>

						</ul></li>
					<li><a href="<spring:url value="/addProductBacklog2.html"/>">Add Product Backlog</a></li>
				</ul></li>
   </c:forEach>
   			
		<li><a href="<spring:url value="/addProduct.html"/>">Add Product</a></li>
												
   
		</ul>
		<!-- sidebar menu end-->
	</div>
</aside>