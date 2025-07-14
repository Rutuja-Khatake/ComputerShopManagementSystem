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

			<h6 class="mb-0 text-uppercase">Show All Customers</h6>
			<hr />
			<div class="card">
				<div class="card-body">
					<div class="table-responsive">
						<table id="example2" class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>Customer Id</th>
									<th>Customer Name</th>
									<th>Mobile number</th>
									<th>Address</th>
									<th>Action</th>

								</tr>
							</thead>

							<tbody>
								<c:forEach items="${list}" var="list">
									<tr>
										<td>${list.id}</td>
										<td>${list.customerName}</td>
										<td>${list.mobileNumber}</td>
										<td>${list.address}</td>
										<td>
										<a href="fetchCustomerForm?id=${list.id }">
												<button>Edit</button>
										</a>
										 <a href="<%-- deleteForm?id=${list.id } --%>">
												<button>Delete</button>
										</a></td>

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
