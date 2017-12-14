
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
                        <h1 class="page-header">Modificar administrador</h1>
                    </div>
                    <!-- /.col-lg-12 -->
					<form role="form" action="modAdmin" method="post">
                                        
                                        <div class="form-group">
                                            <label>Nombres</label>
                                            <input class="form-control" required value="${admin.nombre}" placeholder="Ingrese su nombre" name="nombres-administradores" id="">
                                        </div>
										<div class="form-group">
                                            <label>Apellido Paterno</label>
                                            <input class="form-control" required value="${admin.apellidoPaterno}" placeholder="Ingrese su apellido paterno" name="apellido-paterno-administradores" id="">
                                        </div>
										<div class="form-group">
                                            <label>Apellido Materno</label>
                                            <input class="form-control" required value="${admin.apellidoMaterno}" placeholder="Ingrese su apellido materno" name="apellido-materno-administradores" id="">
                                        </div>
										<div class="form-group">
                                            <label>Rut</label>
                                            <input class="form-control" required value="${admin.rut}" placeholder="Ingrese su rut" name="rut-administradores" id="">
                                        </div>
										<div class="form-group">
                                            <label>Correo Electronico</label>
                                            <input class="form-control" required value="${admin.correo}" placeholder="Ingrese su correo electronico" name="email-administradores" id="">
                                        </div>
								        <div class="form-group">
                                            <label>Dirección</label>
                                            <input class="form-control" required value="${admin.direccion}" placeholder="Ingrese su dirección" name="direccion-administradores" id="">
                                        </div>                                
                                        <div class="form-group">
                                            <label>Telefono</label>
                                            <input class="form-control" required value="${admin.telefono}" placeholder="Ingrese su numero telefonico" name="telefono-administradores" id="">
                                        </div>
										<div class="form-group">
                                            <label>Contraseña</label>
                                            <input class="form-control"  minlength="8" type="password"  required value="${admin.clave}" placeholder="Ingrese su contraseña" name="contrasena-administradores" id="">
                                        </div>
 <input class="form-control" value="${admin.idAdministrador}" placeholder="Ingrese el nombre" type="hidden" name="id" id="">
										
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