<%-- 
    Document   : listEmployees
    Created on : Apr 6, 2018, 10:40:28 AM
    Author     : manuela.mondelli
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List employees Page</title>
    </head>
    <body>
        <h1>List employees</h1>
        <table cellspacing="1" cellpadding="10" align="center" border="1" >
            <thead>
                <tr>
                    <th><strong>First Name</strong></th>
                    <th><strong>Last Name</strong></th>
                    <th><strong>Department Name</strong></th>
                    <th><strong>City</strong></th>
                    <th><strong>State Province</strong></th>
                    <th><strong>Country Name</strong></th>
                    <th><strong>Region Name</strong></th>
                </tr>
            <thead>
            <tbody>
            <c:forEach var="emp" items="${listPersonal}" varStatus="index">
                <tr>
                <c:if var="name" value="check">          
                <c:set var="firstName" scope="session" value="${first_name}"/>
                <td><c:out value="${emp.first_name}"></c:out></td>
                </c:if>

                <c:set var="lastName" scope="session" value="${last_name}"/>
                <td><c:out value="${emp.last_name}"></c:out></td>
                
                <c:set var="dept" scope="session" value="${dept}"/>
                <td><c:out value="${emp.department_name}"></c:out></td>
                
                <c:set var="c" scope="session" value="${c}"/>
                <td><c:out value="${emp.city}"></c:out></td>
                
                <c:set var="s" scope="session" value="${s}"/>
                <td><c:out value="${emp.state_province}"></c:out></td>

                <c:set var="count" scope="session" value="${count}"/>
                <td><c:out value="${emp.country_name}"></c:out></td>
                
                <c:set var="r" scope="session" value="${r}"/>
                <td><c:out value="${emp.region_name}"></c:out></td>
                </tr>	
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
