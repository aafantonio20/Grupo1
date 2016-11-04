
package pe.edu.ulima.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.model.GestionDAO;
import pe.edu.ulima.model.Personal;

public class ObtenerPersonal extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Personal> listaPersonal = new GestionDAO().obtenerPersonal();
            
        RequestDispatcher rd = request.getRequestDispatcher("nuevaventa.jsp");
        request.setAttribute("listaPersonal", listaPersonal);             
        rd.forward(request, response);      
    }

}