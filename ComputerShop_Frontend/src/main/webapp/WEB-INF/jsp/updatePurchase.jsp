<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<jsp:include page="modules/header.jsp" />

<head>
<meta charset="UTF-8">
<title>Add Purchase</title>
<style>
.form-container {
	max-width: 600px;
	margin: auto;
	padding: 20px;
}

.form-label {
	font-weight: bold;
}

.form-control {
	height: 45px;
}
</style>
</head>

<body>
	<div class="page-wrapper">
		<div class="page-content">
			<div class="card form-container shadow">
				<div class="card-body p-4">
					<h4 class="mb-4 text-center">Purchase</h4>
					<form class="row g-3" action="updatePurchase" method="post">

						<%-- 					<input type="hidden" name="purchaseId" value="${product.id}" />
	 --%>
						<div class="col-md-12">
							<label class="form-label">Vendor Name</label> <select
								name="vendorName" class="form-control">
								<option value="">-- Select Vendor --</option>
								<c:forEach var="vendor" items="${vendorList}">
									<option value="${vendor.vendorName}">${vendor.vendorName}</option>
								</c:forEach>
							</select>
						</div>

						<div class="col-md-12">
							<label class="form-label">Product Name</label> <select
								name="productId" class="form-control">
								<option value="">-- Select Product --</option>
								<c:forEach var="product" items="${productList}">
									<option value="${product.productId}">${product.productName}</option>
								</c:forEach>
							</select>
						</div>

						<div class="col-md-12">
							<label class="form-label">Quantity</label> <input type="number"
								name="quantity" class="form-control" placeholder="Quantity">
						</div>

						<div class="col-md-12">
							<label class="form-label">Rate</label> <input type="number"
								name="rate" step="0.01" class="form-control" placeholder="Rate">
						</div>




						<div class="col-md-12">
							<label class="form-label">Purchase Date</label> <input
								type="date" name="purchaseDate" class="form-control"
								placeholder="Purchase Date">
						</div>

						<div class="col-md-12 d-md-flex justify-content-between">
							<button type="submit" class="btn btn-primary px-4">Submit</button>
							<button type="reset" class="btn btn-secondary px-4">Reset</button>
						</div>
					</form>

				</div>
			</div>
		</div>
	</div>
</body>

</html>

<jsp:include page="modules/footer.jsp" />
