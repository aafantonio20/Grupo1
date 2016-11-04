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
import pe.edu.ulima.model.DetalleVenta;
import pe.edu.ulima.model.GestionDAO;
import pe.edu.ulima.model.Producto;
import pe.edu.ulima.model.Venta;

public class EliminarPedido extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        GestionDAO gestion = new GestionDAO();
        int idVenta = Integer.parseInt(request.getParameter("idVenta"));
        
        gestion.eliminarVentaSegunID(idVenta);      
        
        List<Venta> listaVenta = new GestionDAO().obtenerVenta();
        RequestDispatcher rd = request.getRequestDispatcher("gestionpedidos2.jsp");
        request.setAttribute("listaVenta", listaVenta);
        rd.forward(request, response);
        
        /*
        GestionDAO gestion = new GestionDAO();
        int idProducto = Integer.parseInt(request.getParameter("idProducto"));

        gestion.eliminarProductoSegunID(idProducto);
        
        List<Producto> productos = new GestionDAO().obtenerProductos();
        List<Categoria> categorias = new GestionDAO().obtenerCategorias();
        RequestDispatcher rd = request.getRequestDispatcher("gestionproductos2.jsp");
        request.setAttribute("listaProductos", productos);
        request.setAttribute("listaCategorias", categorias);
        
        rd.forward(request, response);
        */

    }

}
