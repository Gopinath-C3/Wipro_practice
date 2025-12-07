package servlet;



import dao.ContactDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class DeleteContactServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        if(ContactDAO.deleteContact(id)) {
            request.setAttribute("message", "Contact deleted successfully!");
        } else {
            request.setAttribute("message", "Failed to delete contact!");
        }
        RequestDispatcher rd = request.getRequestDispatcher("contactList.jsp");
        rd.forward(request, response);
    }
}

