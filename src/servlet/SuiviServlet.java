package servlet;

import ejb.ColisEJB;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SuiviServlet")
public class SuiviServlet extends HttpServlet {
    @EJB
    ColisEJB ejb;

    //TODO
    public void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        request.getRequestDispatcher("/suivi.jsp").forward(request,response);
    }

    //TODO
    protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {

    }
}
