<!-- Navigation -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
	<nav id="mainNav"
		class="navbar navbar-default navbar-fixed-top navbar-custom">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header page-scroll">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> Menu <i
						class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand" href="inicio">Inicio</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li class="hidden"><a href="#page-top"></a></li>
					
					<li class="page-scroll"><a href="medicamentos">Consulta
							medicamentos</a></li>
					<li class="page-scroll"><a href="farmacias">Farmacias
							Asociadas</a></li>
							<c:if test="${usuario!=null}">
							
					<li class="page-scroll"><a href="verMedicamentosSolxUser">Historial</a></li>
					<li class="page-scroll"><a href="signout">Cerrar Sesi�n</a></li>
					</c:if>
					<c:if test="${usuario==null}">
							
					<li class="page-scroll"><a href="verMedicamentosSolxUser">Ingreso Usuario</a></li>
					</c:if>
					<li class="page-scroll"><a href="login">Ingreso Administrador</a></li>
					
					
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>