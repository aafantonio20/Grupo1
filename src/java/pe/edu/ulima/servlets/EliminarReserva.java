package pe.edu.ulima.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.model.Categoria;
import pe.edu.ulima.model.GestionDAO;
import pe.edu.ulima.model.Producto;
import pe.edu.ulima.model.Reserva;

public class EliminarReserva extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        GestionDAO gestion = new GestionDAO();
        int idReserva = Integer.parseInt(request.getParameter("idReserva"));
        
        List<Reserva> listaReservas = new GestionDAO().obtenerReservas();

        gestion.eliminarReservaSegunID(idReserva);     
        RequestDispatcher rd = request.getRequestDispatcher("bienvenido.html");
        
        request.setAttribute("listaReservas", listaReservas);

        rd.forward(request, response);

    }

}
