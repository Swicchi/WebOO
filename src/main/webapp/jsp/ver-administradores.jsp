
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
                        <h1 class="page-header">Ver administrador</h1>
                    </div>
                    <!-- /.col-lg-12 -->
					<div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Administradores
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                             <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                    
                                        <th>Rut</th>
                                        <th>Nombre</th>
                                        <th>Apellidos</th>
                                        <th>Telefono</th>
                                        <th>Email</th>
                                        <th>Direccion</th>
										<th>Opciones </th>
										
                                    </tr>
                                </thead>
                                <tbody>
                                 <c:forEach var="admin" items="${list}">  
                                    <tr class="odd gradeX">
                                        <th>${admin.rut}</th>
                                        <th>${admin.nombre}</th>
                                        <th>${admin.apellidoPaterno} ${admin.apellidoMaterno}</th>
                                        <th>${admin.telefono}</th>
                                        <th>${admin.correo}</th>
                                        <th>${admin.direccion}</th>
										<td><a href="editadmin?id=${admin.idAdministrador}" class="btn btn-success">Editar</a> <a href="deleteadmin?id=${admin.idAdministrador}"  onclick="return validar();" class="btn btn-danger">Eliminar</a></td>
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
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
<jsp:include page="footer.jsp"/>