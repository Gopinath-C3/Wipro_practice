<%@ page language="java" %>
<%@ page import="model.Contact" %>
<%
    Contact contact = (Contact) request.getAttribute("contact");
%>
<html>
<head><title>Edit Contact</title></head>
<body>
<h2>Edit Contact</h2>
<form action="UpdateContactServlet" method="post">
    <input type="hidden" name="id" value="<%=contact.getId()%>">
    Name: <input type="text" name="name" value="<%=contact.getName()%>" required><br>
    Email: <input type="email" name="email" value="<%=contact.getEmail()%>" required><br>
    Phone: <input type="text" name="phone" value="<%=contact.getPhone()%>" required><br>
    <input type="submit" value="Update Contact">
</form>
<a href="contactList.jsp">Back to Contacts</a>
</body>
</html>
