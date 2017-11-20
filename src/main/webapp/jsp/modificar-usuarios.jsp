    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
	<jsp:include page="layout.jsp"/>

        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Modificar usuario</h1>
                    </div>
                    <!-- /.col-lg-12 -->
					<form role="form" action="modUser" method="post">
                                        
                                        <div class="form-group">
                                            <label>Nombres</label>
                                            <input class="form-control" required value="${user.nombre}" placeholder="Ingrese su nombre" name="nombres-usuarios" id="">
                                        </div>
										<div class="form-group">
                                            <label>Apellido Paterno</label>
                                            <input class="form-control" required value="${user.apellidoPaterno}" placeholder="Ingrese su apellido paterno" name="apellido-paterno-usuarios" id="">
                                        </div>
										<div class="form-group">
                                            <label>Apellido Materno</label>
                                            <input class="form-control" required value="${user.apellidoMaterno}" placeholder="Ingrese su apellido materno" name="apellido-materno-usuarios" id="">
                                        </div>
										<div class="form-group">
                                            <label>Rut</label>
                                            <input class="form-control" required value="${user.rut}" oninput=" return checkRut(this)" placeholder="Ingrese su rut" name="rut-usuarios" id="">
                                        </div>
										<div class="form-group">
                                            <label>Correo Electronico</label>
                                            <input class="form-control" required value="${user.correo}" placeholder="Ingrese su correo electronico" name="email-usuarios" id="">
                                        </div>
								        <div class="form-group">
                                            <label>Dirección</label>
                                            <input class="form-control" required value="${user.direccion}" placeholder="Ingrese su direcciÃ³n" name="direccion-usuarios" id="">
                                        </div>                                
                                        <div class="form-group">
                                            <label>Telefono</label>
                                            <input class="form-control" required  minlength="8" value="${user.telefono}" placeholder="Ingrese su numero telefonico" name="telefono-usuarios" id="">
                                        </div>
										<div class="form-group">
                                            <label>Contraseña</label>
                                            <input class="form-control" required  minlength="8" value="${user.clave}" placeholder="Ingrese su contraseÃ±a" type="password" name="contrasena-usuarios" id="">
                                        </div>
                                                                                    <input class="form-control" type="hidden" value="${user.idUsuario}" placeholder="Ingrese su contraseÃ±a" name="id" id="">
                                        
                                        <button type="submit" class="btn btn-default">Enviar</button>
                                        <button type="reset" class="btn btn-default">Borrar todo el formulario</button>
                                    </form>
									<br>
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->

  <jsp:include page="footer.jsp"/>