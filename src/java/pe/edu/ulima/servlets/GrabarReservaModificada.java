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
import pe.edu.ulima.model.Cliente;
import pe.edu.ulima.model.GestionDAO;
import pe.edu.ulima.model.Producto;
import pe.edu.ulima.model.Proveedor;
import pe.edu.ulima.model.Reserva;

public class GrabarReservaModificada extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        GestionDAO gestion = new GestionDAO();
        int idReserva = Integer.parseInt(request.getParameter("idReserva"));
        
        Cliente cliente = gestion.obtenerClienteSegunID(idReserva);

        
        String comentario = request.getParameter("comentario");
        int pax = Integer.parseInt(request.getParameter("pax"));
        int dia = Integer.parseInt(request.getParameter("dia"));
        String mes = request.getParameter("mes");
        int ano = Integer.parseInt(request.getParameter("ano"));
        String hora = request.getParameter("hora");
        
        Reserva serv = new Reserva(cliente, comentario, pax, dia, mes, ano, hora);
        gestion.modificarReserva(serv);
        
        RequestDispatcher rd = request.getRequestDispatcher("nuevareservaomodificada.jsp");
        rd.forward(request, response);

    }

}
