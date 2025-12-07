package servlet;


import dao.ContactDAO;
import model.Contact;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddContactServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        Contact contact = new Contact();
        contact.setName(name);
        contact.setEmail(email);
        contact.setPhone(phone);

        if(ContactDAO.addContact(contact)) {
            request.setAttribute("message", "Contact added successfully!");
        } else {
            request.setAttribute("message", "Failed to add contact!");
        }
        RequestDispatcher rd = request.getRequestDispatcher("contactList.jsp");
        rd.forward(request, response);
    }
}

