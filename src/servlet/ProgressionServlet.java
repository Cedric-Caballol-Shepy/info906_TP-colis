package servlet;

import ejb.ColisEJB;
import model.Colis;
import model.Position;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ProgressionServlet")
public class ProgressionServlet extends HttpServlet {
    @EJB
    ColisEJB ejb;

    public void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        request.setAttribute("idColis",request.getParameter("idColis"));
        request.getRequestDispatcher("/progression.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        long id = Long.parseLong(request.getParameter("idColis"));
        float latitude = Float.parseFloat(request.getParameter("latitude"));
        float longitude = Float.parseFloat(request.getParameter("longitude"));
        String emplacement = request.getParameter("emplacement");
        Position p = new Position(latitude, longitude, emplacement);
        Colis c = ejb.findColis(id);
        c.setOrigine(p);
        ejb.updateColis(c);
        response.sendRedirect(request.getContextPath() + "/SuiviServlet?idColis="+id);
    }
}
