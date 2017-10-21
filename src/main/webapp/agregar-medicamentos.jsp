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
                        <h1 class="page-header">Agregar medicamento</h1>
                    </div>
                    <!-- /.col-lg-12 -->
					<form role="form" action="addMedic" method="post">
                                        
                                        <div class="form-group">
                                            <label>Nombre del medicamento</label>
                                            <input class="form-control" required placeholder="Ingrese el nombre" name="nombres-medicamentos" id="">
                                        </div>
										<!-- <div class="form-group">
                                            <label>Precio</label>
                                            <input class="form-control" placeholder="Ingrese el precio" name="precio-medicamentos" id="">
                                        </div>
										<div class="form-group">
                                            <label>Stock del medicamento</label>
                                            <input class="form-control" placeholder="Ingrese el stock" name="stock-medicamentos" id="">
                                        </div> -->
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