<%-- 
    Document   : error
    Created on : Apr 4, 2018, 2:37:53 PM
    Author     : manuela.mondelli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>error page</title>
    </head>
    <body>
        <form action="login" method="post">
            <h2>Login non effettuato</h2>
            <h3>Username e password non validi!</h3>
            <h3>Inserisci username e password</h3>
            <fieldset>
                <table cellspacing="0" cellpadding="0">
                    <tr>
                        <td><label>Username</label></td>
                        <td><input id="name" type="text" name="username" value=" "></td>
                    </tr>
                    <tr>
                        <td><label>Password</label></td>
                        <td><input type="password" name="password" value=""></td>
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
