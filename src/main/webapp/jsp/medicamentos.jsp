<!DOCTYPE html>
<html lang="en">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Consulta medicamentos</title>
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
                    <img class="img-responsive" src="img/consulta-medicamentos-blanco.png" alt="">
					<div class="intro-text">

					<div class="row">
               <div class="col-lg-12">
                    <div class="panel panel-default">
                        
                        <div class="panel-body">
                            
							<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>Nombre Comercial</th> 
                <th>Nombre Generico</th> 
                <th>Precio</th>
                <th>Stock</th>
                <th>Farmacia</th>
                <th>Ubicación</th>
                <th>Acción</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <th>Nombre Comercial</th> 
                <th>Nombre Generico</th>
                <th>Precio</th>
                <th>Stock</th>
                <th>Farmacia</th>
                <th>Ubicación</th>
                <th>Acción</th>
            </tr>
        </tfoot>
        <tbody>
        
							<c:forEach var="medicamento" items="${list}">
								<c:if test="${fn:length(medicamento.farmaciaxmedicamentos)>0}">
								
									<c:forEach var="medicamento2" items="${medicamento.farmaciaxmedicamentos}">
									<tr><td>${medicamento.nombreComercial}</td>
									<td>${medicamento.nombreGenerico}</td>
                						
										<td>${medicamento2.precio}</td>
										<td>${medicamento2.stock}</td>
										<td>${medicamento2.farmacia.nombre}</td>
										<td>${medicamento2.farmacia.ubicacion}</td>
										<td><a href="loginuser?id=${medicamento2.id}"  onclick="return validar();" class="btn btn-danger">Solicitar</a></td>
									</tr>
									</c:forEach>
								</c:if>
							</c:forEach>
			 </tbody>
    </table>
							
							
							
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
					
                        
                    </div>
					
					
					
					
					
					
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
  <!-- DataTable JavaScript -->

        <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.7.1.min.js"></script>
        <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.0/jquery.dataTables.min.js"></script>
    <script>
	$(document).ready(function() {
    $('#example').DataTable();
	
	} );
	</script>


<script>
		function myFunction() {
			var x = document.getElementById("snackbar")
			x.className = "show";
			setTimeout(function() {
				x.className = x.className.replace("show", "");
			}, 3000);
		}
		function validar(){
	        //Ingresamos un mensaje a mostrar
	       var mensaje = confirm('¿Desea solicitar este medicamento?');
	       //Detectamos si el usuario acepto el mensaje
	       if (mensaje) {
	           return true;
	       }
	       //Detectamos si el usuario denegó el mensaje
	       else {
	           return false;
	       }
	    }
	</script>


</body>

</html>
