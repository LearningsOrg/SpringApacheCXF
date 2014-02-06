<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<p>
	<spring:message code="label.menu" />
</p>
<form:form method="post" action="find.html" commandName="newSearch">
<form:errors path="*" cssClass="errorblock" element="div" />

	<table>
		<tr>
			<td><form:label path="location">
					<spring:message code="label.location" />
				</form:label></td>
			<td><form:input path="location" /></td>
			<td><form:errors path="location" cssClass="error" />
		</tr>
		<tr>
			<td><form:label path="checkIn">
					<spring:message code="label.checkIn" />
				</form:label>(dd-MMM-yyyy)</td>
			<td><form:input path="checkIn" /></td>
			<td><form:errors path="checkIn" cssClass="error" />
		</tr>
		<tr>
			<td><form:label path="checkOut">
					<spring:message code="label.checkOut" />
				</form:label>(dd-MMM-yyyy)</td>
			<td><form:input path="checkOut" /></td>
			<td><form:errors path="checkOut" cssClass="error" />
		</tr>
		<tr>
			<td><form:label path="noOfRooms">
					<spring:message code="label.noOfRooms" />
				</form:label></td>
			<td><form:input path="noOfRooms" /></td>
			<td><form:errors path="noOfRooms" cssClass="error" />
		</tr>
		<tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.search"/>"/>
        </td>
	</table>
</form:form>