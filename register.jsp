<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<center>
<h1>user registration form</h1>
<form:form action="/register" method="POST" modelAttribute="users">
Name:<form:input path="name"/><p></p>
password:<form:password path="password"/><p></p>
Email:<form:input path="email"/><p></p>
Mobile no:<form:input path="mobileno"/><p></p>
Address:<form:input path="address"/><p></p>
<input type="submit" value="Register">
</form:form>
</center>