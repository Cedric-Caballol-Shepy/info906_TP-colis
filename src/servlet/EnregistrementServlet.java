package servlet;

import ejb.ColisEJB;

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
        request.setAttribute("test", "test");
        request.getRequestDispatcher("/enregistrement.jsp").forward(request,response);
    }

    //TODO
    protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

}
