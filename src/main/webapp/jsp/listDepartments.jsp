<%-- 
    Document   : listDepartments
    Created on : Apr 6, 2018, 3:38:29 PM
    Author     : manuela.mondelli
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Departments Page</title>
    </head>
    <body>

        <h1>List Departments</h1>
        <table id="listDepartments" cellspacing="1" cellpadding="10" align="center" border="1" >
            <thead>
                <tr>
                    <th><strong>Department Name</strong></th>
                    <th><strong>City</strong></th>
                    <th><strong>State Province</strong></th>
                    <th><strong>Country Name</strong></th>
                    <th><strong>Region Name</strong></th>
                </tr>
            <thead>
            <tbody>
            <c:forEach var="dept" items="${listDept}">
                <tr>
                <td><c:out value="${dept.department_name}"></c:out></td> 
                <td><c:out value="${dept.city}"></c:out></td>
                <td><c:out value="${dept.state_province}"></c:out></td>
                <td><c:out value="${dept.country_name}"></c:out></td>
                <td><c:out value="${dept.region_name}"></c:out></td>
                </tr>	
            </c:forEach>
        </tbody>
    </table>

        <form action="Export" method="get">
        <input type ="submit" name="excel" value="Export in .XLS" />
        </form>

</body>
</html>
