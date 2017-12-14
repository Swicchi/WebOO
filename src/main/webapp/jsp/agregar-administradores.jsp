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
                        <h1 class="page-header">Agregar administradores</h1>
                    </div>
                    <!-- /.col-lg-12 -->
					<form role="form" action="addAdmin" method="post">
                                        
                                        <div class="form-group">
                                            <label>Nombres</label>
                                            <input class="form-control" required placeholder="Ingrese su nombre" name="nombres-administradores" id="">
                                        </div>
										<div class="form-group">
                                            <label>Apellido Paterno</label>
                                            <input class="form-control" required placeholder="Ingrese su apellido paterno" name="apellido-paterno-administradores" id="">
                                        </div>
										<div class="form-group">
                                            <label>Apellido Materno</label>
                                            <input class="form-control" required  placeholder="Ingrese su apellido materno" name="apellido-materno-administradores" id="">
                                        </div>
										<div class="form-group">
                                            <label>Rut</label>
                                            <input class="form-control" required oninput=" return checkRut(this)"  placeholder="Ingrese su rut" name="rut-administradores" id="">
                                        </div>
										<div class="form-group">
                                            <label>Correo Electronico</label>
                                            <input class="form-control" type="email"  required  placeholder="Ingrese su correo electronico" name="email-administradores" id="">
                                        </div>
								        <div class="form-group">
                                            <label>Dirección</label>
                                            <input class="form-control" required  placeholder="Ingrese su direcci�n" name="direccion-administradores" id="">
                                        </div>                                
                                        <div class="form-group">
                                            <label>Telefono</label>
                                            <input class="form-control" type="number"  required placeholder="Ingrese su numero telefonico" name="telefono-administradores" id="">
                                        </div>
										<div class="form-group">
                                            <label>Contrase�a</label>
                                            <input class="form-control" minlength="8" type="password" required  placeholder="Ingrese su contrase�a" name="contrasena-administradores" id="">
                                        </div>

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
