
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
                        <h1 class="page-header">Ver farmacias</h1>
                    </div>
                    <!-- /.col-lg-12 -->
					<div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Farmacias
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                        <th>Nombre</th>
                                           <th>Direcci�n</th>
                                           
                                           <th>Telefono</th>
                                           <th>Estado de turno</th>
										<th>Acci�n </th>
										
                                    </tr>
                                </thead>
                                <tbody>
                               <c:forEach var="farmacia" items="${list}">
								<tr>
									<td>${farmacia.nombre}</td>
									<td>${farmacia.ubicacion}</td>
									<td>${farmacia.telefono}</td>
									<td><c:if
											test="${farmacia.estadoTurno == 1}">
											<p>EN TURNO</p>
											
										</c:if> <c:if test="${farmacia.estadoTurno != 1}">
											<p>FUERA DE TURNO</p>
										</c:if></td>
										<td><a href="editfarm?id=${farmacia.idFarmacia}" class="btn btn-success">Editar</a> <a href="deletefarm?id=${farmacia.idFarmacia}"  onclick="return validar();" class="btn btn-danger">Eliminar</a> <a href="estadofarm?id=${farmacia.idFarmacia}"  onclick="return validar2();" class="btn btn-danger">Cambiar Estado </a></td>
                               
								</tr>
							</c:forEach>                                
                                </tbody>
                            </table>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->

      
	<jsp:include page="footer.jsp"/>
