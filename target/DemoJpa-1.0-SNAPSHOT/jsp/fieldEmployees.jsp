<%-- 
    Document   : fieldEmployees
    Created on : Apr 9, 2018, 9:43:21 AM
    Author     : manuela.mondelli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="charset=UTF-8">
        <title>Field Employees Page</title>
    </head>
    <body>
        <form action="../allEmployees" method="post">
            <h1>Fields Employees</h1>

            <p>Choose a field</p>

            <input type="checkbox" id="first_name" name="first_name" value="check"/>First Name
            <br>
            <input type="checkbox" id="last_name" name="last_name" value="check"/>Last Name
            <br>
            <input type="checkbox" id="department_name" name="department_name" value="check"/>Department Name
            <br>
            <input type="checkbox" id="city" name="city" value="check" unchecked>City
            <br>
            <input type="checkbox" id="state_province" name="state_province" value="check"/>State Province
            <br>
            <input type="checkbox" id="country_name" name="country_name" value="check"/>Country Name
            <br>
            <input type="checkbox" id="region_name" name="region_name" value="check"/>Region Name
            <br>
            <br>
            <td><input type="submit" name="print" value="Print"/>

        </form>
    </body>
</html>
