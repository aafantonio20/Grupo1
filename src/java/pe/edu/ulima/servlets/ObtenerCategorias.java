
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
import pe.edu.ulima.model.Proveedor;

/**
 *
 * @author juancarlos
 */

public class ObtenerCategorias extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        List<Categoria> categorias = new GestionDAO().obtenerCategorias();   
        List<Proveedor> proveedores = new GestionDAO().obtenerProveedores();
        //Este servlet envía los datos a "cartelera.jsp"
        
        RequestDispatcher rd = request.getRequestDispatcher("nuevoproducto.jsp");
        request.setAttribute("listaCategorias", categorias);       
        request.setAttribute("listaProveedores", proveedores);       
        rd.forward(request, response);   
    }
}
