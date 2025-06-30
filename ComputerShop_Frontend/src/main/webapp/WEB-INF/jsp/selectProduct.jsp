<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<jsp:include page="modules/header.jsp" />
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>

	<div class="page-wrapper">
		<div class="page-content">

			<h6 class="mb-0 text-uppercase">Show All Product</h6>
			<hr />
			<div class="card">
				<div class="card-body">
					<div class="table-responsive">
						<table id="example2" class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>Product Id</th>
									<th>Product Name</th>
									<th>Category</th>
									<th>Brand</th>
									<th>Purchase Rate</th>
									<th>Selling Rate</th>
									<td>Stock Quality</td>
									<td>Action</td>
								</tr>
							</thead>

							<tbody>
								<c:forEach items="${productList}" var="list">
									<tr>
										<td>${list.id}</td>
										<td>${list.product_Name}</td>
										<td>${list.category}</td>
										<td>${list.brand}</td>
										<td>${list.purchase_rate}</td>
										<td>${list.selling_rate}</td>
										<td>${list.stock}</td>
										<td><a href="fetchForm?id=${list.id}" >
											<button>Edit</button> </a>
											<a href="deleteForm?id=${list.id}">	
											<button>Delete</button></a></td>
									</tr>

								</c:forEach>
							</tbody>


						</table>
					</div>
				</div>
			</div>


		</div>
	</div>
	<!--end page wrapper -->

</body>

<jsp:include page="modules/footer.jsp" />
</html>
