package servlet;

import ejb.ColisEJB;
import model.Position;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EnregistrementServlet")
public class EnregistrementServlet extends HttpServlet {

    @EJB
    ColisEJB ejb;

    public void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        //TODO : enlever cet exemple (juste la ligne suivante) quand on aura utilisé un truc comme ça :
        request.setAttribute("test", "test123"); //TODO : et le faire aussi dans le HTML of course !
        request.getRequestDispatcher("/enregistrement.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        int poids = Integer.parseInt(request.getParameter("poids"));
        float valeur = Float.parseFloat(request.getParameter("valeur"));
        float latitudeOrig = Float.parseFloat(request.getParameter("latitudeOrig"));
        float longitudeOrig = Float.parseFloat(request.getParameter("longitudeOrig"));
        String emplacementOrig = request.getParameter("emplacementOrig");
        float latitudeDest = Float.parseFloat(request.getParameter("latitudeDest"));
        float longitudeDest = Float.parseFloat(request.getParameter("longitudeDest"));
        String emplacementDest = request.getParameter("emplacementDest");
        Position positionOrig = new Position(latitudeOrig, longitudeOrig, emplacementOrig);
        Position positionDest = new Position(latitudeDest, longitudeDest, emplacementDest);

        ejb.addColis(poids, valeur, positionOrig, positionDest);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

}
