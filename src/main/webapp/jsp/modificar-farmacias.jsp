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
                        <h1 class="page-header">Modificar farmacia</h1>
                    </div>
                    <!-- /.col-lg-12 -->
					<form role="form" action="modFarm" method="post">
                                        
                                        <div class="form-group">
                                            <label>Nombre de la Farmacia</label>
                                            <input class="form-control"  required value="${farmacia.nombre}" placeholder="Ingrese el nombre de la farmacia" name="nombres-farmacias" id="">
                                        </div>
										<div class="form-group">
                                            <label>Direccion de la Farmacia</label>
                                            <input class="form-control"  required value="${farmacia.ubicacion}" placeholder="Ingrese la dirección de la farmacia" name="direccion-farmacia" id="">
                                        </div>
                                        <div class="form-group">
                                            <label>Telefono de la Farmacia</label>
                                            <input class="form-control" type="text" required value="${farmacia.telefono}"  placeholder="Ingrese el telefono de la farmacia" name="telefono-farmacia" id="">
                                        </div>
                                          <div class="form-group">
                                            <label>Administrador de la Farmacia</label>
                                             <select required  class="form-control" id="idadmin" name="idadmin">
                                             <option  value="${farmacia.administrador.idAdministrador}">${farmacia.administrador.nombre} ${farmacia.administrador.apellidoPaterno} ${farmacia.administrador.apellidoMaterno}</option>
				
				<c:forEach var="admin" items="${list}">  
				<c:if test="${admin.idAdministrador!=farmacia.administrador.idAdministrador}">
					<option  value="${admin.idAdministrador}">${admin.nombre} ${admin.apellidoPaterno} ${admin.apellidoMaterno}</option>
				</c:if>
				</c:forEach>
				</select> 
				  </div>
                                         <input class="form-control" value="${farmacia.idFarmacia}" placeholder="Ingrese el nombre" type="hidden" name="id" id="">
                                        
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