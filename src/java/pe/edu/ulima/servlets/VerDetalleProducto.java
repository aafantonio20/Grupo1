
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


public class VerDetalleProducto extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        GestionDAO gestion = new GestionDAO();
        int idProducto = Integer.parseInt(request.getParameter("idProducto"));
        Producto productito = gestion.obtenerProductoSegunID(idProducto);
        
        Categoria categorita = gestion.obtenerCatSegunIDProd(idProducto);
        Proveedor proveedorcito = gestion.obtenerProSegunIDProd(idProducto);
      
        RequestDispatcher rd = request.getRequestDispatcher("verproducto.jsp");
        request.setAttribute("producto", productito);
        request.setAttribute("categoria", categorita);
        request.setAttribute("proveedor", proveedorcito);
        rd.forward(request, response);
        
    }
}
