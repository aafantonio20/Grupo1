package pe.edu.ulima.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.model.Categoria;
import pe.edu.ulima.model.GestionDAO;
import pe.edu.ulima.model.Producto;
import pe.edu.ulima.model.Proveedor;
import pe.edu.ulima.model.Reserva;

public class VerDetalleReserva extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        GestionDAO gestion = new GestionDAO();
        int idReserva = Integer.parseInt(request.getParameter("idReserva"));
        Reserva reservita = gestion.obtenerReservaSegunID(idReserva);
        RequestDispatcher rd = request.getRequestDispatcher("verreserva.jsp");
        request.setAttribute("reserva", reservita);
        rd.forward(request, response);

    }

}
