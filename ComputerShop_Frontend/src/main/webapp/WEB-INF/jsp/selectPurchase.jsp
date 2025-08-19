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

			<h6 class="mb-0 text-uppercase">Show All</h6>
			<hr />
			<div class="card">
				<div class="card-body">
					<div class="table-responsive">
						<table id="example2" class="table table-striped table-bordered">
							<thead>
							<thead>
								<tr>
									<th>Purchase Id</th>
									<th>Vendor Id</th>
									<th>Vendor Name</th>
									<th>Product Id</th>
									<th>Product Name</th>
									<th>Quantity</th>
									<th>Rate</th>
									<th>Total</th>
									<th>Purchase Date</th>
									<th>Action</th>
									
								</tr>
							</thead>



							<tbody>
								<c:forEach items="${PurchaseList}" var="list">
									<tr>
										<td>${list.purchaseId}</td>
										<td>${list.vendorId}</td>
										<td>${list.vendorName}</td>
										<td>${list.productId}</td>
										<td>${list.productName}</td>
										<td>${list.quantity}</td>
										<td>${list.rate}</td>
										<td>${list.total}</td>
										<td>${list.purchaseDate}</td>
										<td>
									<a href="updatePurchaseData?purchaseId=${list.purchaseId}">
											    <button>Edit</button>
									</a>

										<a href="">
										<button>Delete</button>
										</a>
										</td>
										
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
