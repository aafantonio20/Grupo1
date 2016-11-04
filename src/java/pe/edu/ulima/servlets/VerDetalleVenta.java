package pe.edu.ulima.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.model.Categoria;
import pe.edu.ulima.model.DetalleVenta;
import pe.edu.ulima.model.GestionDAO;
import pe.edu.ulima.model.Personal;
import pe.edu.ulima.model.Producto;
import pe.edu.ulima.model.Proveedor;
import pe.edu.ulima.model.Venta;

@WebServlet(name = "VerDetalleVenta", urlPatterns = {"/VerDetalleVenta"})
public class VerDetalleVenta extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        GestionDAO gestion = new GestionDAO();

        List<Personal> personales = new GestionDAO().obtenerPersonal();

        int idVenta = Integer.parseInt(request.getParameter("idVenta"));
        
        List<DetalleVenta> listaDetalles = new GestionDAO().obtenerDetVentasSegunIdVenta(idVenta);
        
        Venta ventita = gestion.obtenerVentaSegunID(idVenta);

        //Este servlet envía los datos a "cartelera.jsp"
        RequestDispatcher rd = request.getRequestDispatcher("verdetallepedido.jsp");
        request.setAttribute("listaPersonales", personales);
        request.setAttribute("listaDetalles", listaDetalles);
        request.setAttribute("venta", ventita);
        rd.forward(request, response);

    }

}
