<html>
    <head>
        <title>User Registration</title>
    </head>
    <body>
        <noscript>Java Script functionality disabled, Please enable it</noscript>
        <form id="formRegistration" action="MySetServlet" method="post">
            <table id="registrationTable">
                <caption>Please fill the details to Register</caption>
                <tr>
                    <td>Mail Id:<span class="required1"><sup>*</sup></span></td>
                    <td><input type="text" name="mailID" required="required" /></td>
                </tr>
                <tr>
                    <td>Country<span class="required1"><sup>*</sup></span></td>
                    <td><input type="text" name="country"  required="required" /></td>
                </tr>
                <tr>
                    <td>Password:<span class="required1"><sup>*</sup></span></td>
                    <td><input type="password" name="passwd" required="required" /></td>
                </tr>
                <tr>
                    <td>Confirm Password<span class="required1"><sup>*</sup></span></td>
                    <td><input type="password" name="confPasswd" required="required" /></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="Register"  /></td>
                    <td><input type="reset" value="Clear Data" /></td>             
                </tr>
            </table>
        </form>
    </body>
</html>