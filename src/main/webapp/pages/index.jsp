<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Sistema de Farmacias Chillán</title>

    <!-- Bootstrap Core CSS -->
    <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Sistema de Farmacias Chillán</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> Perfil de usuario</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Salir</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li>
                            <a href="index.html"><i class="fa fa-star fa-fw"></i> Inicio</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-medkit fa-fw"></i> Medicamentos<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="ver-medicamentos.html">Ver</a>
                                </li>
                                <li>
                                    <a href="agregar-medicamentos.html">Agregar</a>
                                </li>
								<li>
                                    <a href="modificar-medicamentos.html">Modificar</a>
                                </li>
								<li>
                                    <a href="eliminar-medicamentos.html">Eliminar</a>
                                </li>
								
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
						<li>
                            <a href="#"><i class="fa fa-hospital-o fa-fw"></i> Farmacias<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="ver-farmacias.html">Ver</a>
                                </li>
                                <li>
                                    <a href="agregar-farmacias.html">Agregar</a>
                                </li>
								<li>
                                    <a href="modificar-farmacias.html">Modificar</a>
                                </li>
								<li>
                                    <a href="eliminar-farmacias.html">Eliminar</a>
                                </li>
							
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
						<li>
                            <a href="#"><i class="fa fa-user-md fa-fw"></i> Administradores<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="ver-administradores.html">Ver</a>
                                </li>
                                <li>
                                    <a href="agregar-administradores.html">Agregar</a>
                                </li>
								<li>
                                    <a href="modificar-administradores.html">Modificar</a>
                                </li>
								<li>
                                    <a href="eliminar-administradores.html">Eliminar</a>
                                </li>
								
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
						<li>
                            <a href="#"><i class="fa fa-users fa-fw"></i> Usuarios<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="ver-usuarios.html">Ver</a>
                                </li>
                                <li>
                                    <a href="agregar-usuarios.html">Agregar</a>
                                </li>
								<li>
                                    <a href="modificar-usuarios.html">Modificar</a>
                                </li>
								<li>
                                    <a href="eliminar-usuarios.html">Eliminar</a>
                                </li>
								
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Lorem ipsum</h1>
                    </div>
                    <!-- /.col-lg-12 -->
					<p> 
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent consectetur elit eget massa pharetra, id tempus nisi molestie. Duis non sapien vel arcu condimentum sollicitudin at ac felis. Curabitur ac tincidunt nulla, quis convallis erat. Nulla tellus est, faucibus id accumsan ac, tincidunt vel lacus. Maecenas tristique varius placerat. Mauris commodo, velit in porta vulputate, arcu odio hendrerit mauris, nec rhoncus est magna et tellus. Sed luctus pellentesque mi tempus ornare. Quisque a ipsum non dolor iaculis hendrerit et id mi. Sed vulputate tellus a ligula mollis, at mollis nulla aliquam. Nullam at arcu et sem scelerisque commodo et vel urna. Curabitur at nunc scelerisque erat vulputate laoreet gravida vitae mi. Integer nec commodo libero. Donec ultricies laoreet elit, sed vulputate ante tincidunt id. Nunc cursus nisl turpis, vitae faucibus tellus blandit sit amet.
					</p>
					<p>
					Ut id dapibus diam. In lorem est, cursus sed ultricies a, finibus ac urna. Sed sollicitudin tempus diam nec tempus. Aenean finibus arcu in lacus facilisis, sit amet eleifend mauris placerat. In sed libero quis elit ornare aliquam. Nunc ultrices, nisl quis tempor imperdiet, turpis risus facilisis diam, eu lacinia est quam at nisl. Etiam id lacinia quam. Duis mattis purus ante, a laoreet augue sollicitudin ut. Proin nec laoreet dolor. Phasellus sodales id nulla nec cursus. In justo lorem, eleifend sodales nibh id, gravida porttitor est.
					</p>
					<p>
					Aliquam tortor justo, porta vitae justo id, sollicitudin laoreet erat. Phasellus mollis pellentesque dignissim. Ut accumsan est non lectus porta tristique. Ut nec nisi blandit dui viverra aliquet eu vel tortor. Curabitur convallis non dui nec interdum. Proin consequat ultricies dui, vitae convallis justo lobortis at. Vestibulum nec commodo risus, vel faucibus diam. Sed sollicitudin lacus nulla. Integer pellentesque, ipsum vitae tristique ullamcorper, erat orci porta quam, sed dignissim quam arcu vitae urna. Aliquam erat volutpat. Pellentesque et est a ante tincidunt auctor. Maecenas vestibulum eros turpis.
					</p>
					<p>
					Cras a tempor nisi. Maecenas rutrum venenatis lacinia. Sed nec augue placerat, ullamcorper erat quis, luctus massa. Vestibulum nec felis quis justo sodales euismod. Proin consequat vel quam in porta. Nulla maximus feugiat enim, et pretium metus scelerisque at. Sed imperdiet dictum elit sit amet ultrices. Phasellus faucibus erat vel dui ullamcorper, et placerat ex dignissim. Sed interdum nulla nec est tincidunt, ac rhoncus purus finibus.
					</p>
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="../vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>

</body>

</html>