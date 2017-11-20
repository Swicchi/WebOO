
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
                        <h1 class="page-header">Agregar farmacia</h1>
                    </div>
                    <!-- /.col-lg-12 -->
									<form role="form">
                                        
                                        <div class="form-group">
                                            <label>Nombre de la Farmacia</label>
                                            <input class="form-control" placeholder="Ingrese el nombre de la farmacia" name="nombres-farmacias" id="">
                                        </div>
										<div class="form-group">
                                            <label>Dirección de la Farmacia</label>
                                            <input class="form-control" placeholder="Ingrese la dirección de la farmacia" name="direccion-farmacia" id="">
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