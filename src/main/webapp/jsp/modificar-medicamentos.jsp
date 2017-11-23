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
                        <h1 class="page-header">Modificar medicamento</h1>
                    </div>
                    <!-- /.col-lg-12 -->
					<form role="form" action="modMedic" method="post">
                                        
                                        <div class="form-group" >
                                            <label>Nombre Comercial del medicamento</label>
                                            <input class="form-control" required value="${med.nombreComercial}" placeholder="Ingrese el nombre" name="nombre-comercial" id="">
                                        </div>
                                        <div class="form-group">
                                            <label>Nombre Generico del medicamento</label>
                                            <input class="form-control" required  value="${med.nombreGenerico}" placeholder="Ingrese el nombre generico" name="nombre-generico" id="">
                                        </div>
										 <input class="form-control" value="${med.idMedicamento}" placeholder="Ingrese el nombre" type="hidden" name="id" id="">
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