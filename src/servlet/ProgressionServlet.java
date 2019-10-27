package servlet;

import ejb.ColisEJB;
import model.Colis;
import model.Etat;
import model.Position;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/ProgressionServlet")
public class ProgressionServlet extends HttpServlet {
    @EJB
    ColisEJB ejb;

    public void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        long idColis = Long.parseLong(request.getParameter("idColis"));
        request.setAttribute("idColis", idColis);

        Colis c = ejb.findColis(idColis);
        request.setAttribute("currentEtat", c.getEtat());

        List<Etat> etatsList = new ArrayList<Etat>(Arrays.asList(Etat.values()));
        request.setAttribute("etatsList", etatsList);

        request.getRequestDispatcher("/progression.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        long id = Long.parseLong(request.getParameter("idColis"));
        float latitude = Float.parseFloat(request.getParameter("latitude"));
        float longitude = Float.parseFloat(request.getParameter("longitude"));
        String emplacement = request.getParameter("emplacement");
        Position p = new Position(latitude, longitude, emplacement);
        String e = request.getParameter("etat");
        Colis c = ejb.findColis(id);
        c.setOrigine(p);
        c.setEtat(Etat.valueOf(e));
        ejb.updateColis(c);
        response.sendRedirect(request.getContextPath() + "/SuiviServlet?idColis="+id);
    }
}
