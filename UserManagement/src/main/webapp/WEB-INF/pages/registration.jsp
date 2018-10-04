<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Hello World with Spring 3 MVC</title>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
    </head>
    <body>
        <h1>Registration Form</h1><br />
        <form:form action="formSubmit" method="post" modelAttribute="user">
            <table>
                <tr><td colspan="2"><form:errors path="*" cssStyle="color : red;"/></td></tr>
                <tr><td>First Name: </td><td><form:input path="firstName"/></td></tr>
                <tr><td>Last Name : </td><td><form:input path="lastName" /></td></tr>
                <tr><td>Address1 : </td><td><form:input path="address1" /></td></tr>
                <tr><td>Address2 : </td><td><form:input path="address2" /></td></tr>
                <tr><td>Address3 : </td><td><form:input path="address3" /></td></tr>
                <tr><td>Zip code : </td><td><form:input path="zipcode" /></td></tr>
                <tr><td>Mobile Number : </td><td><form:input path="mobileNumber" /></td></tr>
                <tr><td>Email Id : </td><td><form:input path="emailId" /></td></tr>
               <%--  <tr><td>Age : </td><td><form:input path="age" /></td></tr>
                <tr><td>Sex : </td><td><form:select path="sex">
                        <form:option value="Male"/>
                        <form:option value="Female"/>
                    </form:select></td></tr>
                    <tr><td>Password : </td><td><form:input path="password" /></td></tr>
                    <tr><td>Conformation Password : </td><td><form:input path="conformationPassword" /></td></tr> --%>
                <tr><td colspan="2"><input type="submit" value="Register" /></td></tr>
            </table>
        </form:form>
    </body>
</html>
