<%@ page language="java" %>
<%@ page import="dao.ContactDAO, model.Contact, java.util.List" %>
<%
    List<Contact> contacts = ContactDAO.getAllContacts();
    String message = (String) request.getAttribute("message");
%>
<html>
<head><title>Contact List</title></head>
<body>
<h2>All Contacts</h2>
<% if(message != null) { %>
    <p style="color:green;"><%= message %></p>
<% } %>
<table border="1">
    <tr>
        <th>ID</th><th>Name</th><th>Email</th><th>Phone</th><th>Actions</th>
    </tr>
    <% for(Contact c : contacts) { %>
    <tr>
        <td><%=c.getId()%></td>
        <td><%=c.getName()%></td>
        <td><%=c.getEmail()%></td>
        <td><%=c.getPhone()%></td>
        <td>
            <a href="EditContactServlet?id=<%=c.getId()%>">Edit</a> | 
            <a href="DeleteContactServlet?id=<%=c.getId()%>">Delete</a>
        </td>
    </tr>
    <% } %>
</table>
<a href="addContact.jsp">Add New Contact</a>
</body>
</html>
