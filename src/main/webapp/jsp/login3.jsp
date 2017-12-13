<!DOCTYPE html>
<html lang="en">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Ingreso al Sistema</title>
	<link rel="icon" type="image/gif" href="img/icono.png" />

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/freelancer.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
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

<body  Onload="myFunction();" id="page-top" class="index">

    
<c:if test="${error!=null}">

				<div id="snackbar" class="alert alert-warning">${error}</div>
			</c:if>
			<jsp:include page="layout2.jsp"/>
           

    <!-- Header -->
    <header>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <img class="img-responsive" src="img/login-blanco.png" alt="">
                    <div class="intro-text">
                        <hr class="star-light">
                    </div>
                </div>

				

				
				<form class="form-horizontal" method="post" action="loginUsuario">
						  <div class="form-group form-group-lg">
							<label class="col-sm-2 control-label" for="formGroupInputLarge">Correo</label>
							<div class="col-sm-10">
							  <input class="form-control" name="user" type="text" id="formGroupInputLarge" placeholder="ejemplo@ejemplo.cl">
							</div>
						  </div>
						  <div class="form-group form-group-lg">
							<label class="col-sm-2 control-label" for="formGroupInputSmall">Contraseña</label>
							<div class="col-sm-10">
							  <input class="form-control" name="pass" type="password" id="formGroupInputSmall" placeholder="***********">
							</div>
						  </div>

					  <input class="btn btn-default" type="submit" value="Ingresar">

				</form>

				<br>
				<p>¿No tienes cuenta? Registrate aca</p> 
				<a class="btn btn-default" href="registro" role="button">Registrate!</a>

				
				</div>
            </div>
        </div>
    </header>

    

    <!-- Footer -->
    <footer class="text-center">
        
        <div class="footer-below">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
        Hecho con&nbsp;<i style="color:rgb(231, 76, 60)" class="fa fa-heart"></i>&nbsp;en <a href="http://www.chileestuyo.cl/destino/chillan-playas-y-montanas/" target="_blank">Chillán, Chile </a>
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


    <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

    <!-- Theme JavaScript -->
    <script src="js/freelancer.min.js"></script>
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
