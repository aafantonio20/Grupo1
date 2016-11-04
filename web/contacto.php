<?php 
$errors = '';
$myemail = 'juanc.curo@gmail.com';//<-----Put Your email address here.
/*if(empty($_POST['nombres'])  || 
   empty($_POST['email']) || 
   empty($_POST['telefono']))
{
    $errors .= "\n Error: all fields are required";
}*/

$nombres = $_POST['nombres']; 
$apellidos = $_POST['apellidos']; 
$telefono = $_POST['telefono']; 
$email = $_POST['email']; 
$num_personas = $_POST['num_personas']; 
$dia = $_POST['dia']; 
$mes = $_POST['mes']; 
$ano = $_POST['ano']; 
$hora = $_POST['hora'];
$ambiente = $_POST['ambiente']; 
$mensaje = $_POST['mensaje']; 


if( empty($errors))
{
	$to = $myemail; 
	$email_subject = ":::::: RESERVA DESDE LA WEB - ACANTILADO DE BARRANCO ::::::";
	$email_body = "Estimado, has recibido un mensaje desde la Web. ".
	"\n\n------ DATOS PERSONALES DEL CLIENTE ------\nNombres: $nombres \nApellidos: $apellidos"
                . " \nTeléfono: $telefono \nEmail: $email "
                . "\n\n------DATOS DE LA RESERVA------ \nN° Personas: $num_personas "
                . "\nDía: $dia \nMes: $mes \nAño: $ano" 
                . "\nHora: $hora \nAmbiente: $ambiente \nMensaje: $mensaje"; 
	
	$headers = "From: $myemail\n"; 
	$headers .= "Reply-To: $email";
	
	mail($to,$email_subject,$email_body,$headers);
	//redirect to the 'thank you' page
	header('Location: reservas_enviado.html');
} 
?>
