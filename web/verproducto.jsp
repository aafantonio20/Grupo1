<%-- 
    Document   : nuevoproducto
    Created on : 06/10/2016, 08:50:13 PM
    Author     : juancarlos
--%>

<%@page import="pe.edu.ulima.model.Producto"%>
<%@page import="java.util.List"%>
<%@page import="pe.edu.ulima.model.Proveedor"%>
<%@page import="pe.edu.ulima.model.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Acantilado de Barranco</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/menu.css" rel="stylesheet" type="text/css"/>
    </head>
    <body style="background-color: #551213;">

        <div class="container">

            <div class="row">
                <div class="col-md-1">
                </div>
                <div class="col-md-10">
                    <div class="row" style="background-color: #600a0b;">
                        <div class="col-md-12" >
                            <img style="width: 100%; height: auto; margin-left: auto; margin-right: auto;" src="img/banner-logo.jpg" alt=""/>
                        </div>
                    </div>
                </div>
                <div class="col-md-1">
                </div>
            </div>

            <div class="row">
                <div class="col-md-1 color-fondo-menu">

                </div>
                <div class="col-md-10 color-fondo-menu">
                    <header>
                        <input type="checkbox" id="btn-menu" checked>
                        <label for="btn-menu"><img src="img/menu_icon.png" alt=""/></label>
                        <nav class="menu">
                            <ul>
                                <li><a href="bienvenido.html">Inicio</a></li>
                                <li><a href="obtenerproductos">Gestionar Productos</a></li>
                                <li><a href="obtenerpedidos">Gestionar Pedidos</a></li>
                                <li><a href="obtenerreservas">Gestionar Reservas</a></li>
                                <li><a href="#">Gestionar Reportes</a></li>  
                            </ul>
                        </nav>
                    </header>
                </div>
                <div class="col-md-1 color-fondo-menu">

                </div>
            </div>

            <main>

                <div class="row">
                    <% Producto producto = (Producto) request.getAttribute("producto"); %>
                    <% Categoria categoria = (Categoria) request.getAttribute("categoria"); %>
                    <% Proveedor proveedor = (Proveedor) request.getAttribute("proveedor"); %>
                    <form method="POST" action="#">                        
                        <div class="col-md-1">

                        </div>
                        <div class="col-md-10 color_fondo table-responsive">
                            <div class="row" style="margin-top: 30px;">
                                <div class="col-lg-12">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <p style="font-size: 16px; font-weight: 600; color: #e59201;">
                                                DETALLES DEL PRODUCTO:
                                            </p>
                                        </div>        
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-6" style="margin-top: 20px;">
                                            <label for="usr" style="font-size: 14px; font-weight: 600; color: #e59201;">Nombre:</label>
                                            <input type="text" class="form-control" id="usr" name="nombre" value="<%=producto.getNombre()%>" disabled="">
                                        </div>
                                        <div class="col-lg-6" style="margin-top: 20px;">
                                            <label for="usr" style="font-size: 14px; font-weight: 600; color: #e59201;">Categoría</label>
                                            <input type="text" class="form-control" id="usr" name="categoria" value="<%=categoria.getNombre()%>" disabled="">
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-6" style="margin-top: 20px;">
                                            <label for="usr" style="font-size: 14px; font-weight: 600; color: #e59201;">Precio:</label>
                                            <input type="text" class="form-control" id="usr" name="precio" value="<%=producto.getPrecio()%>" disabled="">
                                        </div>
                                        <div class="col-lg-6" style="margin-top: 20px;">
                                            <label for="usr" style="font-size: 14px; font-weight: 600; color: #e59201;">Proveedor:</label>
                                            <input type="text" class="form-control" id="usr" name="proveedor" value="<%=proveedor.getNombre()%>" disabled="">
                                        </div>
                                    </div>
                                    <div class="row" style="margin-top: 20px;">
                                        <div class="col-lg-6">
                                            <label for="usr" style="font-size: 14px; font-weight: 600; color: #e59201;">Estado:</label>
                                            <input type="text" class="form-control" id="usr" name="estado" value="<%=producto.getEstado()%>" disabled="">
                                        </div>
                                        <div class="col-lg-6">
                                            <label for="usr" style="font-size: 14px; font-weight: 600; color: #e59201;">Preparación:</label>
                                            <textarea class="form-control" rows="5" id="comment" name="preparacion" disabled=""><%=producto.getPreparacion()%></textarea>
                                        </div>                                    
                                    </div><br>
                                    <div class="row">
                                        <div class="col-lg-12">
                                              <a href="obtenerproductos" style="color: #ffc831; font-size: 18px; ">REGRESAR</a> 
                                        </div>
                                    </div>
                                    <div class="row">
                                        <br>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-1">

                        </div>
                    </form>
                </div>                
            </main>
            <div class="row">
                <div class="col-md-1 col-sm-1 col-xs-1"></div>
                <div class="col-md-4 col-sm-5 col-xs-5">
                    <p style="color: #e59201; padding: 0 20px 0 20px; text-align: justify;">Ingeniería de Software II</p>
                </div>

                <div class="col-md-2 col-sm-1 col-xs-1"></div>
            </div>
        </div>


        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
