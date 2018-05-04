<%-- 
    Document   : index
    Created on : Apr 5, 2018, 12:35:54 PM
    Author     : manuela.mondelli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index Page</title>
    </head>
    <body>
        <form action="login" method="post">
            <h1>Login</h1>
            <fieldset class="fieldsetStyle">
                <table cellspacing="0" cellpadding="0">
                    <tr>
                        <td><label class="userStyle">Username</label></td>
                        <td><input id="name" type="text" name="username" value="SKING"></td>
                    </tr>
                    <tr>
                    </tr>
                    <tr>
                        <td><label class="passStyle">Password</label></td>
                        <td><input type="password" name="password" value="S.King100"></td>
                    </tr>
                    <tr>
                        <td>&nbsp</td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" name="login"></td> 
                    </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>
