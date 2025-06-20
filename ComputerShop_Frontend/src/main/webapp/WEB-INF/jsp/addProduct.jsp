<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="modules/header.jsp" />

<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
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
                    <h4 class="mb-4 text-center">Add Product</h4>
                    <form class="row g-3" action="addProduct" method="post">
                        <div class="col-md-12">
                            <label for="input25" class="form-label">Product Name</label>
                            <input type="text" name="product_Name" class="form-control" id="input25" placeholder="Product Name">
                        </div>
                        <div class="col-md-12">
                            <label for="input26" class="form-label">Category</label>
                            <input type="text" name="category" class="form-control" id="input26" placeholder="Category">
                        </div>
                        <div class="col-md-12">
                            <label for="input27" class="form-label">Brand</label>
                            <input type="text"		 name="brand" class="form-control" id="input27" placeholder="Enter Brand">
                        </div>
                        <div class="col-md-12">
                            <label for="input28" class="form-label">Purchase Rate</label>
                            <input type="text" name="purchase_rate" class="form-control" id="input28" placeholder="Enter Purchase Rate">
                        </div>
                        <div class="col-md-12">
                            <label for="input29" class="form-label">Selling Rate</label>
                            <input type="text" name="selling_rate" class="form-control" id="input29" placeholder="Enter Selling Rate">
                        </div>
                        <div class="col-md-12">
                            <label for="input31" class="form-label">Stock</label>
                            <input type="text" name="stock" class="form-control" id="input31" placeholder="Enter Stock">
                        </div>
                       >
                        <div class="col-md-12 form-check">
                            <input class="form-check-input" type="checkbox" id="input34">
                            <label class="form-check-label" for="input34">Check me out</label>
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
