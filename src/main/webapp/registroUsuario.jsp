<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Sistema de Farmacias Chillán</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
</head>
<body>

    <div id="wrapper">
    <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Registro usuario</h1>
                    </div>
                    <!-- /.col-lg-12 -->
					<form role="form" action="registroUsuario" method="post">
                                        
                                        <div class="form-group">
                                            <label>Nombres</label>
                                            <input class="form-control" placeholder="Ingrese su nombre" name="nombres-usuarios" id="">
                                        </div>
										<div class="form-group">
                                            <label>Apellido Paterno</label>
                                            <input class="form-control" placeholder="Ingrese su apellido paterno" name="apellido-paterno-usuarios" id="">
                                        </div>
										<div class="form-group">
                                            <label>Apellido Materno</label>
                                            <input class="form-control" placeholder="Ingrese su apellido materno" name="apellido-materno-usuarios" id="">
                                        </div>
										<div class="form-group">
                                            <label>Rut</label>
                                            <input class="form-control"  placeholder="Ingrese su rut" name="rut-usuarios" id="">
                                        </div>
										<div class="form-group">
                                            <label>Correo Electronico</label>
                                            <input class="form-control" type="email" placeholder="Ingrese su correo electronico" name="email-usuarios" id="">
                                        </div>
								        <div class="form-group">
                                            <label>Dirección</label>
                                            <input class="form-control"  placeholder="Ingrese su dirección" name="direccion-usuarios" id="">
                                        </div>                                
                                        <div class="form-group">
                                            <label>Telefono</label>
                                            <input class="form-control" type="number" placeholder="Ingrese su numero telefonico" name="telefono-usuarios" id="">
                                        </div>
										<div class="form-group">
                                            <label>Contraseña</label>
                                            <input class="form-control" placeholder="Ingrese su contraseña" name="contrasena-usuarios" id="" type="password">
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

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="dist/js/sb-admin-2.js"></script>
</body>
</html>