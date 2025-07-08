<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="../modules/userHeader.jsp" />
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Cards Layout</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<style>
.main {
	display: flex;
	gap: 20px;
	justify-content: center;
	flex-wrap: wrap;
	padding: 20px;
	margin-top: 50px;
	margin-left: 250px;
}

.card {
	flex: 0 0 auto;
	border: 1px solid black;
	box-shadow: 2px 2px 2px black;
}
</style>
</head>
<body>
	<div class="main">
		<div class="card" style="width: 16rem;">
			<img
				src="https://wallpapers.com/images/featured/laptop-murjp1nk4lp1idlt.jpg"
				class="card-img-top" alt="...">
			<div class="card-body">
				<h5 class="card-title">Card title 1</h5>
				<p class="card-text">Some quick example text to build on the
					card title and make up the bulk of the card's content.</p>
				<a href="#" class="btn btn-primary">Go somewhere</a>
			</div>
		</div>

		<div class="card" style="width: 16rem;">
			<img
				src="https://wallpapers.com/images/featured/laptop-murjp1nk4lp1idlt.jpg"
				class="card-img-top" alt="...">
			<div class="card-body">
				<h5 class="card-title">Card title 2</h5>
				<p class="card-text">Some quick example text to build on the
					card title and make up the bulk of the card's content.</p>
				<a href="#" class="btn btn-primary">Go somewhere</a>
			</div>
		</div>
		<div class="card" style="width: 16rem;">
			<img
				src="https://wallpapers.com/images/featured/laptop-murjp1nk4lp1idlt.jpg"
				class="card-img-top" alt="...">
			<div class="card-body">
				<h5 class="card-title">Card title 3</h5>
				<p class="card-text">Some quick example text to build on the
					card title and make up the bulk of the card's content.</p>
				<a href="#" class="btn btn-primary">Go somewhere</a>
			</div>
		</div>
	</div>
</body>
</html>

<jsp:include page="../modules/footer.jsp" />
