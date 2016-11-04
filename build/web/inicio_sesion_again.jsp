<%-- 
    Document   : inicio_sesion
    Created on : 29-nov-2015, 8:37:39
    Author     : JuanCarlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ingeniería de Software II</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>


        <style>

            body{
                margin: 0;
                padding: 0;
                background: #fff;
                color: #fff;
                font-family: Arial;
                font-size: 12px;
            }

            .body{
                position: absolute;
                top: -20px;
                left: -20px;
                right: -40px;
                bottom: -40px;
                width: auto;
                height: auto;
                background-image: url(http://acantiladodebarranco.pe/configtest/img/fotito2.jpg);
                background-size: cover;
                -webkit-filter: blur(3px);
                z-index: 0;
            }


        </style>

    </head>
    <body>
        <div class="body"></div>
        <div class="container">
            <div class="row" style="margin-top: 175px;">
                <div class="col-lg-4 col-md-3 col-sm-2 col-xs-2">

                </div>
                <div class="col-lg-4 col-md-6 col-sm-8 col-xs-8">
                    <img class="img-responsive" style="margin: 0 auto;" src="img/logo.png" alt=""/>
                </div>
                <div class="col-lg-4 col-md-3 col-sm-2 col-xs-2">

                </div>

            </div>
            <div class="row">
                <div class="col-lg-4 col-md-3 col-sm-2 col-xs-2">

                </div>
                <div class="col-lg-4 col-md-6 col-sm-8 col-xs-8">
                    <div class="row">
                        <div class="col-lg-12">
                            <form method="POST" action="validarlogueo">
                                <input class="form-control" style="opacity: 0.9;" type="text" required="" placeholder="Usuario" name="username"><br>
                                <input class="form-control" style="opacity: 0.9;" type="password" required="" placeholder="Password" name="password"><br>
                                <input class="form-control" style="color: #fff; background-color: #9d0d2f;" value="Ingresar" type="submit"/>
                                <p style="margin-top: 10px; text-align: center;">¡ El usuario o contraseña es incorrecta !</p>
                                <p style="margin-top: 10px; text-align: center;"><a style="text-align: center;" href="#"><font color=white>¿Olvidó su contraseña?</font></a></p>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

