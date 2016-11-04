<%-- 
    Document   : reservas
    Created on : 04/11/2016, 02:15:52 AM
    Author     : juancarlos
--%>

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
                <form method="POST" action="guardarreserva">
                    <div class="row">
                        <div class="col-md-1">

                        </div>
                        <div class="col-md-10 color_fondo">

                            <div class="row" style="margin-top: 20px;">
                                <div class="col-md-6">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <p style="font-size: 22px; color: #ffc831;">!La reserva fue guardada exitosamente!</p>
                                            <p style="font-size: 16px; font-weight: 600; color: #e59201;">
                                                Nuevo producto:
                                            </p>
                                        </div>        
                                    </div>
                                    <div class="row">            
                                        <div class="col-md-10">
                                            <p style="color: #e59201; padding: 0 20px 0 0; font-size: 18px; font-weight:400;">
                                                DATOS PERSONALES:
                                            </p>
                                            <label style="color: #9c917a">Nombres:</label>
                                            <input id='nombres' name="nombres" required class="form-control">
                                            <label style="color: #9c917a">Apellidos:</label>
                                            <input id='apellidos' name="apellidos" required class="form-control">
                                            <label style="color: #9c917a">Teléfono:</label>
                                            <input id='telefono' name="telefono" required class="form-control">
                                            <label style="color: #9c917a">Email:</label>
                                            <input type="email" id='email' name="email" required class="form-control">   
                                        </div>
                                        <div class="col-md-2"></div>
                                    </div>
                                </div>


                                <div class="col-md-6">

                                    <div class="row">
                                        <div class="col-md-12">
                                            <p style="color: #e59201; font-size: 18px; font-weight:400;">
                                                DATOS DE LA RESERVA:
                                            </p>
                                            <label style="color: #9c917a">Número de personas:</label>

                                            <input style="width: 80px;" required id='nombres' name="pax" class="form-control">
                                        </div>
                                        <div class="col-md-12">
                                            <label style="color: #9c917a;">Fecha:</label>
                                            <div class="row">
                                                <div class="col-md-4"> 
                                                    <select class="form-control" name="dia" style="width: 80px;">
                                                        <option value="No se ha seleccionado">Día</option>
                                                        <option value="1">1</option>
                                                        <option value="2">2</option>
                                                        <option value="3">3</option>
                                                        <option value="4">4</option>
                                                        <option value="5">5</option>
                                                        <option value="6">6</option>
                                                        <option value="7">7</option>
                                                        <option value="8">8</option>
                                                        <option value="91">9</option>
                                                        <option value="10">10</option>
                                                        <option value="11">11</option>
                                                        <option value="12">12</option>
                                                        <option value="13">13</option>
                                                        <option value="14">14</option>
                                                        <option value="15">15</option>
                                                        <option value="16">16</option>
                                                        <option value="17">17</option>
                                                        <option value="18">18</option>
                                                        <option value="19">19</option>
                                                        <option value="20">20</option>
                                                        <option value="21">21</option>
                                                        <option value="22">22</option>
                                                        <option value="23">23</option>
                                                        <option value="24">24</option>
                                                        <option value="25">25</option>
                                                        <option value="26">26</option>
                                                        <option value="27">27</option>
                                                        <option value="28">28</option>
                                                        <option value="29">29</option>
                                                        <option value="30">30</option>
                                                        <option value="31">31</option>
                                                    </select>
                                                </div>
                                                <div class="col-md-4">
                                                    <select class="form-control" name="mes" style="width: 80px;">
                                                        <option value="No se ha seleccionado">Mes</option>
                                                        <option value="Enero">Enero</option>
                                                        <option value="Febrero">Febrero</option>
                                                        <option value="Marzo">Marzo</option>
                                                        <option value="Abril">Abril</option>
                                                        <option value="Mayo">Mayo</option>
                                                        <option value="Junio">Junio</option>
                                                        <option value="Julio">Julio</option>
                                                        <option value="Agosto">Agosto</option>
                                                        <option value="Septiembre">Septiembre</option>
                                                        <option value="Octubre">Octubre</option>
                                                        <option value="Noviembre">Noviembre</option>
                                                        <option value="Diciembre">Diciembre</option>         
                                                    </select>
                                                </div>
                                                <div class="col-md-4">
                                                    <select class="form-control" name="ano" style="width: 80px;">
                                                        <option value="No se ha seleccionado">Año</option>
                                                        <option value="2016">2016</option>
                                                        <option value="2017">2017</option>
                                                        <option value="2018">2018</option>      
                                                    </select>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-12">
                                            <label style="color: #9c917a;">Hora:</label>
                                            <select class="form-control" name="hora" style="width: 80px;">
                                                <option value="No se ha seleccionado">-- : --</option>
                                                <option value="15:00">15:00</option>
                                                <option value="15:30">15:30</option>
                                                <option value="16:00">16:00</option>
                                                <option value="16:30">16:30</option>
                                                <option value="17:00">17:00</option>
                                                <option value="17:30">17:30</option>
                                                <option value="18:00">18:00</option>
                                                <option value="18:30">18:30</option>
                                                <option value="19:00">19:00</option>
                                                <option value="19:30">19:30</option>
                                                <option value="20:00">20:00</option>
                                                <option value="20:30">20:30</option>
                                                <option value="21:00">21:00</option>
                                                <option value="21:30">21:30</option>
                                                <option value="22:00">22:00</option>
                                                <option value="22:30">22:30</option>
                                                <option value="23:00">23:00</option>
                                                <option value="23:30">23:30</option>
                                            </select>

                                        </div>
                                    </div>


                                </div>
                            </div>
                            <div class="row" style="margin-top: 20px;">
                                <div class="col-md-6">
                                    <div class="row">            
                                        <div class="col-md-10">
                                            <p style="color: #e59201; padding: 0 20px 0 0; font-size: 18px; font-weight:400;">
                                                INGRESE SU MENSAJE:
                                            </p>
                                            <textarea class="form-control" name="comentario" rows="6"></textarea>


                                        </div>
                                        <div class="col-md-2"></div>
                                    </div>
                                    <div class="row"><br>
                                        <div class="col-lg-12">
                                            <input type="submit" class="btn btn-warning" value="Guardar"/>                                       
                                        </div>
                                        <div class="col-lg-12"><br>
                                            <a href="obtenerreservas" style="color: #ffc831; font-size: 18px; ">REGRESAR</a> 
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <p style="color: #e59201; padding: 0 20px 0 0; font-size: 16px; font-weight:400;">
                                                HORARIO DE VERANO:
                                            </p>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-12">
                                            <p style="margin: 0; color: #fff;">Lunes a Jueves:5 pm a 1 am</p>
                                            <p style="margin: 0; color: #fff;">Viernes y sábado: 5 pm a 3 am</p>       
                                            <p style="margin: 0; color: #fff;">Domingo: 3 pm a 12 pm</p>  
                                            <p style="margin: 0; color: #fff;">Teléfono: 247 - 2145</p>  
                                            <p style="margin: 0; color: #fff;">RPC: 994 069 559</p>  
                                            <p style="margin: 0; color: #fff;">Email: reservas@acantiladodebarranco.pe</p>  
                                            <p style="margin: 0; color: #e59201;">* Las reservas por este medio se realizan como mínimo con 24 horas de anticipación.</p>  
                                            <p style="margin: 0; color: #e59201;">* No hay reservaciones en feriados.</p>  
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="row">

                                <div class="col-md-12" style="margin-top: 20px;">
                                    <p style="color: #e59201; padding: 0 20px 0 0; text-align: justify;">
                                        Visítenos y relájese en el rincón más romántico de Barranco.
                                    </p>

                                </div>

                            </div>

                        </div>
                        <div class="col-md-1">

                        </div>
                    </div>
                </form>
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

