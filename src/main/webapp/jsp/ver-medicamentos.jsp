
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
	<jsp:include page="layout.jsp"/>
        <!-- Page Content -->
        <div id="page-wrapper">
           <c:if test="${error!=null}"><script>

    var x = document.getElementById("snackbar")
    x.className = "show";
    setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);

</script> <div id="snackbar" class="alert alert-warning">${error}</div></c:if>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Ver medicamentos</h1>
                    </div>
                    <!-- /.col-lg-12 -->
					<div class="row">
               <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Medicamentos
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                        <th>Nombre Comercial</th>
                                           <th>Nombre Generico</th>
										<th>Opciones </th>
										
                                    </tr>
                                </thead>
                                <tbody>
                                 <c:forEach var="medicamento" items="${list}">  
                                    <tr class="odd gradeX">
                                        <td>${medicamento.nombreComercial}</td> 
                                        <td>${medicamento.nombreGenerico}</td> 
										<td><a href="editmed?id=${medicamento.idMedicamento}"   class="btn btn-success">Editar</a> <a href="deletemed?id=${medicamento.idMedicamento}" onclick="return validar();" class="btn btn-danger">Eliminar</a></td>
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
      
      
	<jsp:include page="footer.jsp"/>