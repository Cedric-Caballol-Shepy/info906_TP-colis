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

@WebServlet("/SuiviServlet")
public class SuiviServlet extends HttpServlet {
    @EJB
    ColisEJB ejb;

    //TODO
    public void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        long id = Long.parseLong(request.getParameter("idColis"));
        request.setAttribute("id", id);
        Colis c = ejb.findColis(id);
        request.setAttribute("poids",c.getPoids());
        request.setAttribute("valeur",c.getValeur());
        Position pCurr = c.getOrigine();
        request.setAttribute("latCurr",pCurr.getLatitude());
        request.setAttribute("longCurr",pCurr.getLongitude());
        request.setAttribute("emplCurr",pCurr.getEmplacement());
        Position pDest = c.getDestination();
        request.setAttribute("latDest",pDest.getLatitude());
        request.setAttribute("longDest",pDest.getLongitude());
        request.setAttribute("emplDest",pDest.getEmplacement());
        request.setAttribute("etat", c.getEtat());
        request.getRequestDispatcher("/suivi.jsp").forward(request,response);
    }
}
