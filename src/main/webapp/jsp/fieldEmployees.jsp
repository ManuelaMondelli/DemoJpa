<%-- 
    Document   : fieldEmployees
    Created on : Apr 9, 2018, 9:43:21 AM
    Author     : manuela.mondelli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Field Employees Page</title>
    </head>
    <body>
        <form action="../allEmployees" method="post">
            <h1>Fields Employees</h1>

            <p>Choose a field</p>

            <input onclick="name()" type="checkbox" id="first_name" name="first_name" value="first_name" checked=""/>First Name
            <br>
            <input onclick="surname()" type="checkbox" id="last_name" name="last_name" value="last_name" checked=""/>Last Name
            <br>
            <input onclick="department()" type="checkbox" id="department_name" name="department_name" value="department_name" checked=""/>Department Name
            <br>
            <input onclick="city()" type="checkbox" id="city" name="city" value="city" checked=""/>City
            <br>
            <input onclick="state()" type="checkbox" id="state_province" name="state_province" value="state_province" checked=""/>State Province
            <br>
            <input onclick="country()" type="checkbox" id="country_name" name="country_name" value="country_name" checked=""/>Country Name
            <br>
            <input onclick="region()" type="checkbox" id="region_name" name="region_name" value="region_name" checked=""/>Region Name
            <br>
            <br>
            <td><input type="submit" name="print" value="Print"/>

        </form>
    </body>
</html>
