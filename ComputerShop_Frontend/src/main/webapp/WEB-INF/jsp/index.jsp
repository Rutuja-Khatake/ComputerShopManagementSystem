<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
 <jsp:include page="modules/header.jsp" />
 

	<!--e
		<!--start page wrapper -->
<div class="page-wrapper">
	<div class="page-content">
<p>Welcome, ${sessionScope.username}</p>
<p>Your role: ${sessionScope.role}</p>


		<div class="row"></div>

	</div>
</div>




<jsp:include page="modules/footer.jsp" />

