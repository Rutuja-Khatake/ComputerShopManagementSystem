<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--favicon-->
<link rel="icon" href="resoures/assets/images/favicon-32x32.png"
	type="image/png" />
<!--plugins-->
<link
	href="resources/assets/plugins/vectormap/jquery-jvectormap-2.0.2.css"
	rel="stylesheet" />
<link href="resources/assets/plugins/simplebar/css/simplebar.css"
	rel="stylesheet" />
<link
	href="resources/assets/plugins/perfect-scrollbar/css/perfect-scrollbar.css"
	rel="stylesheet" />
<link href="resources/assets/plugins/metismenu/css/metisMenu.min.css"
	rel="stylesheet" />
<!-- loader-->
<link href="resources/assets/css/pace.min.css" rel="stylesheet" />
<script src="resources/assets/js/pace.min.js"></script>
<!-- Bootstrap CSS -->
<link href="resources/assets/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/assets/css/bootstrap-extended.css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&amp;display=swap"
	rel="stylesheet">
<link href="resources/assets/css/app.css" rel="stylesheet">
<link href="resources/assets/css/icons.css" rel="stylesheet">
<!-- Theme Style CSS -->
<link rel="stylesheet" href="resoures/assets/css/dark-theme.css" />
<link rel="stylesheet" href="resoures/assets/css/semi-dark.css" />
<link rel="stylesheet" href="resoures/assets/css/header-colors.css" />
<title>Riyality Software Services</title>
</head>

<body>
	<!--wrapper-->
	<div class="wrapper">
		<!--sidebar wrapper -->
		<div class="sidebar-wrapper" data-simplebar="true">
			<div class="sidebar-header">
				<div>
					<img src="resources/assets/images/logo-icon.png" class="logo-icon"
						alt="logo icon">
				</div>
				<div>
					<h4 class="logo-text">Riyality</h4>
				</div>
				<div class="toggle-icon ms-auto">
					<i class='bx bx-arrow-back'></i>
				</div>
			</div>


			<!--navigation-->
			<ul class="metismenu" id="menu">
				<li><a href="javascript:;" class="">
						<div class="parent-icon">
							<i class='bx bx-product-alt'></i>
						</div>
						<div class="menu-title"><b>Product Details</b></div>
				</a>
					<ul>
						<li><a href="add"><i class='bx bx-radio-circle'></i>AddProduct</a>
						</li>
						<li><a href="showAllList"><i class='bx bx-radio-circle'></i>Show</a>
						</li></li>
			</ul>
		
			<li><a href="javascript:;" class="">
					<div class="parent-icon">
						<!-- <i class='bx bx-home-alt'></i> -->
					</div>
					<div class="menu-title"><b>Purchase Details</b></div>
			</a>
				<ul>
				<!-- <li><a href="addPurchaseProduct"><i class='bx bx-radio-circle'></i>Purchase Product</a>
						</li>	 -->

					<li><a href="addPurchaseProduct"><i
							class='bx bx-radio-circle'></i>add Purchase</a></li>
							
							<li><a href="showPurchaseProduct"><i
							class='bx bx-radio-circle'></i>show Purchase</a></li>

				</ul></li>


			<li><a href="javascript:;" class="">
					<div class="parent-icon">
						<!-- <i class='bx bx-home-alt'></i> -->
					</div>
					<div class="menu-title"><b>Vendor Details</b></div>
			</a>
				<ul>
					<li><a href="vendorDetails"><i class='bx bx-radio-circle'></i>Add
							Vendor</a></li>

					<li><a href="getAllVendors"><i class='bx bx-radio-circle'></i>All
							Vendor</a></li>

				</ul></li>


			<li><a href="javascript:;" class="">
					<div class="parent-icon">
						<!-- <i class='bx bx-home-alt'></i> -->
					</div>
					<div class="menu-title"><b>Customer Details</b></div>
			</a>
				<ul>
					<li><a href="addCustomers"><i class='bx bx-radio-circle'></i>Add
							Customer</a></li>


					<li><a href="showAllListCustomer"><i
							class='bx bx-radio-circle'></i>All Customer</a></li>
				</ul></li>

			<!--end navigation-->
		</div>

	</div>

	<!--end sidebar wrapper -->
	<!--start header -->
	<header>
		<div class="topbar d-flex align-items-center"></div>
	</header>
	<!--end header -->

</body>
</html>