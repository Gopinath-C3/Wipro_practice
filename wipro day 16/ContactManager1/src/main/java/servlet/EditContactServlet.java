package servlet;


import dao.ContactDAO;
import model.Contact;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class EditContactServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Contact contact = ContactDAO.getContactById(id);
        request.setAttribute("contact", contact);
        RequestDispatcher rd = request.getRequestDispatcher("editContact.jsp");
        rd.forward(request, response);
    }
}

