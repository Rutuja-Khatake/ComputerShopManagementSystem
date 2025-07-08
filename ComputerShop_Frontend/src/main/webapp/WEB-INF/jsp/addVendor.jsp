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
                    <h4 class="mb-4 text-center"> Vendor</h4>
                   <form class="row g-3" action="addVendor" method="post">
                  

    <div class="col-md-12">
    
        <label class="form-label">Vendor Name</label>
        <input type="text" name="vendorName" class="form-control" placeholder="Vendor Name">
    </div>

   

    <div class="col-md-12">
        <label class="form-label">Mobile No.</label>
        <input type="text" name="mobileNumber" class="form-control" placeholder="MobileNumber">
    </div>

    <div class="col-md-12">
        <label class="form-label">Address</label>
        <input type="text" name="address" step="0.01" class="form-control" placeholder="Address">
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
