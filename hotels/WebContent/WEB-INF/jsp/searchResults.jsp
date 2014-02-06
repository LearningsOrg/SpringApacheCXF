<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Spring 3 MVC Series - Contact Manager</title>
</head>
<body>



	<form:form>

		<h3>Hotels</h3>
		<c:if test="${!empty hotelList}">
			<table class="data">
				<tr>
					<th><spring:message code="label.hotelName" /></th>
					<th><spring:message code="label.hotelAddress" /></th>
					<th><spring:message code="label.hotelRent" /></th>
					<th>&nbsp;</th>
				</tr>
				<c:forEach items="${hotelList}" var="hotel">
					<tr>
						<td>${hotel.hotelName}</td>
						<td>${hotel.hotelAddress}</td>
						<td>${hotel.roomRent}</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>

	</form:form>
</body>
</html>