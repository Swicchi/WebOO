<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!--
	Dimension by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>SISTEMA DE GESTIÓN DE FARMACIAS</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
		
	</head>
	<body>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<article id="intro">
								<h2 class="major">${farmacia.nombre}</h2>
								<p>Ubicación:         ${farmacia.ubicacion}</p>
								<p>Telefono Contacto: ${farmacia.telefono}</p>
								<p>Hora Apertura:     ${farmacia.horaEntrada}</p>
								<p>Hora Descanso:     ${farmacia.horaDescanso}</p>
								<p>Hora Reanudación:  ${farmacia.horaReanudacion}</p>
								<p>Hora Termino:      ${farmacia.horaSalida}</p>
								
								  <a href="inicio">X</a>
						</article>
					</header>
					
				
				<!-- Footer -->
					<footer id="footer">
						<p class="copyright">&copy; Universidad del BÍO-BÍO</p>
					</footer>

			</div>

		<!-- BG -->
			<div id="bg"></div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>
