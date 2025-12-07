package servlet;


import dao.ContactDAO;
import model.Contact;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class UpdateContactServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        Contact contact = new Contact(id, name, email, phone);
        if(ContactDAO.updateContact(contact)) {
            request.setAttribute("message", "Contact updated successfully!");
        } else {
            request.setAttribute("message", "Failed to update contact!");
        }
        RequestDispatcher rd = request.getRequestDispatcher("contactList.jsp");
        rd.forward(request, response);
    }
}

