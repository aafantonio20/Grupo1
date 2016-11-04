
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
/*
public class VerCartaActiva extends HttpServlet {   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String estado = "activo";
        List<Producto> productos = new GestionDAO().obtenerProductosActivos(estado);
        List<Categoria> categorias = new GestionDAO().obtenerCategorias();

        RequestDispatcher rd = request.getRequestDispatcher("gestionproductos2.jsp");
        request.setAttribute("listaCategorias", categorias);
        request.setAttribute("listaProductos", productos);
        rd.forward(request, response); 
    }

    
}
*/