/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ulima.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.model.Cliente;
import pe.edu.ulima.model.GestionDAO;
import pe.edu.ulima.model.Reserva;

/**
 *
 * @author juancarlos
 */
public class GrabarReserva extends HttpServlet {

       
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
         GestionDAO gestion = new GestionDAO();

        String nombre = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        int telefono = Integer.parseInt(request.getParameter("telefono"));
        String email = request.getParameter("email");
        
        Cliente clientito = new Cliente(nombre, apellidos, telefono, email);
        gestion.registrarCliente(clientito);
        
        String comentario = request.getParameter("comentario");
        int pax = Integer.parseInt(request.getParameter("pax"));
        int dia = Integer.parseInt(request.getParameter("dia"));
        String mes = request.getParameter("mes");
        int ano = Integer.parseInt(request.getParameter("ano"));
        String hora = request.getParameter("hora");
        
        
        Reserva reservita = new Reserva(clientito, comentario, pax, dia, mes, ano, hora);
        gestion.registrarReserva(reservita);
       
        //Este servlet envía los datos a "cartelera.jsp"
        RequestDispatcher rd = request.getRequestDispatcher("reservaguardada.jsp");   
        rd.forward(request, response);   
    }

   

}
