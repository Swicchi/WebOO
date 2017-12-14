<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Solicitud</title>
	<link rel="icon" type="image/gif" href="img/icono.png" />

    		<!-- DataTable CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/dataTables.bootstrap.min.css" rel="stylesheet">
	
	
    <!-- Theme CSS -->
    <link href="css/freelancer.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
<style>
#snackbar {
	visibility: hidden;
	min-width: 250px;
	margin-left: -125px;
	background-color: #ffff11;
	color: #000;
	text-align: center;
	border-radius: 5px;
	padding: 32px;
	position: fixed;
	z-index: 1;
	left: 50%;
	bottom: 30px;
	font-size: 24px;
}

#snackbar.show {
	visibility: visible;
	-webkit-animation: fadein 0.5s, fadeout 0.5s 2.5s;
	animation: fadein 0.5s, fadeout 0.5s 2.5s;
}

@
-webkit-keyframes fadein {
	from {bottom: 0;
	opacity: 0;
}

to {
	bottom: 30px;
	opacity: 1;
}

}
@
keyframes fadein {
	from {bottom: 0;
	opacity: 0;
}

to {
	bottom: 30px;
	opacity: 1;
}

}
@
-webkit-keyframes fadeout {
	from {bottom: 30px;
	opacity: 1;
}

to {
	bottom: 0;
	opacity: 0;
}

}
@
keyframes fadeout {
	from {bottom: 30px;
	opacity: 1;
}

to {
	bottom: 0;
	opacity: 0;
}
}
</style>
</head>

<body Onload="myFunction();" id="page-top" class="index">

    	<c:if test="${error!=null}">
		<div id="snackbar" class="alert alert-warning">${error}</div>
	</c:if>
	<jsp:include page="layout2.jsp"/>

    <!-- Header -->
    <header>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    
			<h2>Se ha solicitado el medicamento <b>${medu.farmaciaxmedicamento.medicamento.nombreGenerico}</b></h2>
					<hr>
					<h2>perteniciente a la farmacia <b>${medu.farmaciaxmedicamento.farmacia.nombre}</b></h2>
					<hr>
					<h2>el medicamento a sido solicitado por <b>${medu.usuario.nombre}</b></h2>
					<hr>
					
					
					
                </div>
            </div>
        </div>
        
								<br>
									<br>
										<br>
											<br>
															<br>
																	<br>
																		<br>
																		<br>
												<br>
												<br>
												<br>
										<br>
											<br>
												<br>
															
												<br>	
    </header>

    

  <!-- Footer -->
    <footer class="text-center">
        
        <div class="footer-below">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
        Hecho con&nbsp;<i style="color:rgb(231, 76, 60)" class="fa fa-heart"></i>&nbsp;en <a href="http://www.chileestuyo.cl/destino/chillan-playas-y-montanas/" target="_blank">Chill�n, Chile </a>
                    </div>
                </div>
            </div>
        </div>
    </footer>

    <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
    <div class="scroll-top page-scroll hidden-sm hidden-xs hidden-lg hidden-md">
        <a class="btn btn-primary" href="#page-top">
            <i class="fa fa-chevron-up"></i>
        </a>
    </div>

  <!-- DataTable JavaScript -->

<script>
		function myFunction() {
			var x = document.getElementById("snackbar")
			x.className = "show";
			setTimeout(function() {
				x.className = x.className.replace("show", "");
			}, 3000);
		}
	</script>

</body>

</html>
