<<<<<<< HEAD
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
                <tr>
                <c:forEach var="emp" items="${listPersonal}" varStatus="index">
                    
                <c:if  test="${name != null}">
                <c:set var="name" scope="session" value="${first_name}"/>
                <td><c:out value="${emp.first_name}"></c:out></td>
                </c:if>
         
                <c:if test="${surname != null}">
                <c:set var="surname" scope="session" value="${last_name}"/>
                <td><c:out value="${emp.last_name}"></c:out></td>
                </c:if>
                
                <c:if test="${department != null}">
                <c:set var="department" scope="session" value="${dept}"/>
                <td><c:out value="${emp.department_name}"></c:out></td>
                </c:if>
                
                <c:if test="${city != null}"> 
                <c:set var="city" scope="session" value="${c}"/>
                <td><c:out value="${emp.city}"></c:out></td>
                </c:if>
                
                <c:if test="${state != null}"> 
                <c:set var="state" scope="session" value="${s}"/>
                <td><c:out value="${emp.state_province}"></c:out></td>
                </c:if>
                
                <c:if test="${country != null}">
                <c:set var="country" scope="session" value="${count}"/>
                <td><c:out value="${emp.country_name}"></c:out></td>
                </c:if>
                
                <c:if test="${region != null}">
                <c:set var="region" scope="session" value="${r}"/>
                <td><c:out value="${emp.region_name}"></c:out></td>
                </c:if>
                <continue>
 	 </c:forEach>
           </continue>
        </tbody>
    </table>
</body>
</html>
