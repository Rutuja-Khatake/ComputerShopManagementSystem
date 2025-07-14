	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		
	<%-- <jsp:include page="modules/header.jsp" /> --%>
		 <%
  String role = (String) session.getAttribute("role");
  if ("Admin".equals(role)) {
%>
    <jsp:include page="modules/header.jsp" />
<%
  } else if ("User".equals(role)) {
%>
    <jsp:include page="modules/userHeader.jsp" />
<%
  } else {
%>
    <%-- You can include guest home or do nothing here --%>
   <%--  <jsp:include page="guest_home.jsp" /> --%>
<%
  }
%>

	 
	
		<!--e
			<!--start page wrapper -->
	<div class="page-wrapper">
		<div class="page-content">
	
	
	
			<div class="row"></div>
	
		</div>
	</div>
	
	
	
	
	<jsp:include page="modules/footer.jsp" />
	
