<%@ page language="java" %>
<html>
<head><title>Add Contact</title></head>
<body>
<h2>Add New Contact</h2>
<form action="AddContactServlet" method="post">
    Name: <input type="text" name="name" required><br>
    Email: <input type="email" name="email" required><br>
    Phone: <input type="text" name="phone" required><br>
    <input type="submit" value="Add Contact">
</form>
<a href="contactList.jsp">Back to Contacts</a>
</body>
</html>
