package servlet;

import ejb.ColisEJB;
import model.Colis;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RechercheServlet")
public class RechercheServlet extends HttpServlet {
    @EJB
    ColisEJB ejb;

    public void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        request.getRequestDispatcher("/recherche.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/choixProgressionSuivi.jsp?idColis=" + request.getParameter("idColis"));
    }
}
