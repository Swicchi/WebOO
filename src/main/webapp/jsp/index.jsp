<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!--
	Dimension by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>SISTEMA DE GESTI�N DE FARMACIAS</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
		
	</head>
	<body>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<div class="logo">
							<span class="icon fa-medkit"></span>
						</div>
						<div class="content">
							<div class="inner">
								<h1>Sistema de Gesti�n de Farmacias</h1>
								<p>Farmacia de Turno: ${turno}  <a href="verfarmacia?id=${id}" > VER DETALLE</a></p>
							</div>
						</div>
						<nav>
							<ul>
								<li><a href="#intro">Quienes somos</a></li>
								<li><a href="#work">Farmacias asociadas</a></li>
								<li><a href="#about">Consulta medicamentos</a></li>
								<li><a href="login">Ingreso</a></li>
								<!--<li><a href="#elements">Elements</a></li>-->
							</ul>
						</nav>
					</header>

				<!-- Main -->
					<div id="main">

						<!-- Intro -->
							<article id="intro">
								<h2 class="major">Quienes somos</h2>
								<p>Aenean ornare velit lacus, ac varius enim ullamcorper eu. Proin aliquam facilisis ante interdum congue. Integer mollis, nisl amet convallis, porttitor magna ullamcorper, amet egestas mauris. Ut magna finibus nisi nec lacinia. Nam maximus erat id euismod egestas. By the way, check out my <a href="#work">awesome work</a>.</p>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis dapibus rutrum facilisis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Etiam tristique libero eu nibh porttitor fermentum. Nullam venenatis erat id vehicula viverra. Nunc ultrices eros ut ultricies condimentum. Mauris risus lacus, blandit sit amet venenatis non, bibendum vitae dolor. Nunc lorem mauris, fringilla in aliquam at, euismod in lectus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. In non lorem sit amet elit placerat maximus. Pellentesque aliquam maximus risus, vel sed vehicula.</p>
							</article>

						<!-- Work -->
							<article id="work" width: 858.6666px>
								<h2 class="major">Farmacias asociadas</h2>
									<div id="contenedor_tabla_farmacias" style="color: rgb(85, 255, 85);">	<table class="display data-table dataTable" id="example">
											<thead>
												<tr>
													<th style="text-align:center;">Nombre farmacia</th>
													<th style="text-align:center;">Direccion</th>
													<th style="text-align:center;">Estado</th>
													<!-- <th style="text-align:center;">Horario Apertura</th>
													<th style="text-align:center;">Horario Intermedio</th>
													<th style="text-align:center;">Horario Reanudación</th>
													<th style="text-align:center;">Horario Cierre</th> -->
												</tr>
											</thead>
											<!-- <tbody>
												<tr>
															<td style="width:250px">AHUMADA</td>
															<td>CINCO DE ABRIL N°702</td>
															<td>+56422216984</td>
															<td>09:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>23:30:00</td>
														</tr>	<tr>
															<td style="width:250px">AHUMADA</td>
															<td>AVDA. COLLÍN N°698, L-12 Y 14 (LIDER)</td>
															<td>+56422240242</td>
															<td>09:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>22:00:00</td>
														</tr>	<tr>
															<td style="width:250px">AHUMADA</td>
															<td>CINCO DE ABRIL N° 711</td>
															<td>+564226313063</td>
															<td>09:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>22:00:00</td>
														</tr>	<tr>
															<td style="width:250px">FARMA REBAJA</td>
															<td>EL ROBLE Nº 770, LOCAL 6</td>
															<td>+564226313186</td>
															<td>10:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>22:00:00</td>
														</tr>	<tr>
															<td style="width:250px">CRUZ VERDE</td>
															<td>CINCO DE ABRIL N°731</td>
															<td>+56422210150</td>
															<td>08:30:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>22:00:00</td>
														</tr>	<tr>
															<td style="width:250px">CRUZ VERDE</td>
															<td>EL ROBLE N°770, L-101</td>
															<td>+56422248595</td>
															<td>10:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>21:00:00</td>
														</tr>	<tr>
															<td style="width:250px">CRUZ VERDE</td>
															<td>CINCO DE ABRIL N° 701</td>
															<td>+56422228423</td>
															<td>08:30:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>22:00:00</td>
														</tr>	<tr>
															<td style="width:250px">CRUZ VERDE</td>
															<td>AVDA. ECUADOR Nº 599, LOCAL 1060 (TOTTUS)</td>
															<td>+56422275447</td>
															<td>08:30:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>21:30:00</td>
														</tr>	<tr>
															<td style="width:250px">BARRIOSALUD</td>
															<td>ARAUCO N°637</td>
															<td>+56422246737</td>
															<td>09:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>21:00:00</td>
														</tr>	<tr>
															<td style="width:250px">EL LEON</td>
															<td>CINCO DE ABRIL N°795</td>
															<td>+56422423544</td>
															<td>09:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>20:00:00</td>
														</tr>	<tr>
															<td style="width:250px">EL LEON</td>
															<td>MAIPÓN N°799</td>
															<td>+56422423499</td>
															<td>09:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>19:30:00</td>
														</tr>	<tr>
															<td style="width:250px">EL LEON EXPRESS</td>
															<td>EL ROBLE N° 674</td>
															<td>+56422423466</td>
															<td>09:30:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>20:00:00</td>
														</tr>	<tr>
															<td style="width:250px">SALCOBRAND</td>
															<td>EL ROBLE N°699</td>
															<td>+56422218167</td>
															<td>08:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>00:00:00</td>
														</tr>	<tr>
															<td style="width:250px">SALCOBRAND</td>
															<td>FRANCISCO RAMÍREZ Nº 1</td>
															<td>+56422214412</td>
															<td>08:30:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>22:00:00</td>
														</tr>	<tr>
															<td style="width:250px">SANTOS</td>
															<td>CINCO DE ABRIL N° 775</td>
															<td>+56422232690</td>
															<td>09:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>20:30:00</td>
														</tr>	<tr>
															<td style="width:250px">SANTOS</td>
															<td>CINCO DE ABRIL 749 LOCAL 11</td>
															<td>+56422320655</td>
															<td>09:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>22:00:00</td>
														</tr>	<tr>
															<td style="width:250px">DR. SIMI</td>
															<td>MAIPON 723</td>
															<td>+56422235595</td>
															<td>09:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>20:30:00</td>
														</tr>	<tr>
															<td style="width:250px">BARRIO SALUD</td>
															<td>ISABEL RIQUELME N° 602 LOCAL 1</td>
															<td>+56422211768</td>
															<td>09:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>21:00:00</td>
														</tr>	<tr>
															<td style="width:250px">CRUZ VERDE</td>
															<td>MAIPON 801</td>
															<td>+560</td>
															<td>08:30:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>20:00:00</td>
														</tr>	<tr>
															<td style="width:250px">FARMACIA HUEPE</td>
															<td>ARGENTINA 440</td>
															<td>+56</td>
															<td>10:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>20:30:00</td>
														</tr>	<tr style="width:250px">
														<td style="width:250px">BARRIO-SALUD</td>
														<td>CINCO DE ABRIL N° 676</td>
														<td>+560</td>
														<td>09:00:00</td>
														<td style="text-align:center;">-</td>
														<td style="text-align:center;">-</td>
														<td>08:59:00</td>
													</tr>
											</tbody> -->
											<tbody>
                                 <c:forEach var="farmacia" items="${list}">  
                                    <tr class="odd gradeX">
                                        <td>${farmacia.nombre}</td>
                                        <td>${farmacia.ubicacion}</td>
                                        <td style="text-align:center;"><c:if test="${farmacia.estado == 1}"> <p>EN TURNO</p><td></td> </c:if><c:if test="${farmacia.estado != 1}"><p>FUERA DE TURNO</p></c:if></td>
                                    </tr>
                                    </c:forEach>                                   
                                </tbody>
										
											
											
												<!-- <tr>
															<td style="width:250px">AHUMADA</td>
															<td>AVDA. LONG. NORTE N°134, L-1003 (JUMBO)</td>
															<td>+56422270627</td>
															<td>09:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>22:00:00</td>
														</tr>	<tr>
															<td style="width:250px">CRUZ VERDE</td>
															<td>AVDA. LONGITUDINAL NORTE N°134 (JUMBO)</td>
															<td>+5642270750</td>
															<td>09:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>22:00:00</td>
														</tr>	<tr>
															<td style="width:250px">SALCOBRAND</td>
															<td>PAUL HARRIS Nº1155, L-3 (LIDER EXPRESS)</td>
															<td>+56422279401</td>
															<td>08:30:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>22:00:00</td>
														</tr>	<tr>
															<td style="width:250px">REDFARMA</td>
															<td>AVDA. LOS PUELCHES N°349</td>
															<td>+56422221760</td>
															<td>10:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>20:00:00</td>
														</tr>	<tr>
															<td style="width:250px">DEL FORMULARIO</td>
															<td>AVDA. LOS PUELCHES Nº 1695</td>
															<td>+56422231214</td>
															<td>09:30:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>22:00:00</td>
														</tr>	<tr>
															<td style="width:250px">SALUD NATURAL</td>
															<td>CINCO DE ABRIL N° 569</td>
															<td>+56422231942</td>
															<td>09:30:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>20:00:00</td>
														</tr>	<tr>
															<td style="width:250px">KNOP</td>
															<td>CINCO DE ABIRL Nº 749</td>
															<td>+56422212567</td>
															<td>09:00:00</td>
															<td style="text-align:center;">-</td>
															<td style="text-align:center;">-</td>
															<td>21:00:00</td>
														</tr> -->
											
										</table></div>
							</article>

						<!-- About -->
							<article id="about">
								<h2 class="major">Consulta medicamentos</h2>
						<form method="post" action="muestraMedicamento">
									<div class="field half first">
										<label for="name">Nombre Medicamento</label> 
										<input type="text" name="name" id="name" />
										<ul class="actions">
										<br>	
										<li><input type="submit" value="Buscar" class="special" /></li>
									</ul>


									</div>
										
									
								</form>
							</article>

						<!-- Contact -->
							<article id="contact">
								<h2 class="major">Ingreso al Sistema</h2>
								
								
							</article>

						<!-- Elements -->
							<article id="elements">
								<h2 class="major">Elements</h2>

								<section>
									<h3 class="major">Text</h3>
									<p>This is <b>bold</b> and this is <strong>strong</strong>. This is <i>italic</i> and this is <em>emphasized</em>.
									This is <sup>superscript</sup> text and this is <sub>subscript</sub> text.
									This is <u>underlined</u> and this is code: <code>for (;;) { ... }</code>. Finally, <a href="#">this is a link</a>.</p>
									<hr />
									<h2>Heading Level 2</h2>
									<h3>Heading Level 3</h3>
									<h4>Heading Level 4</h4>
									<h5>Heading Level 5</h5>
									<h6>Heading Level 6</h6>
									<hr />
									<h4>Blockquote</h4>
									<blockquote>Fringilla nisl. Donec accumsan interdum nisi, quis tincidunt felis sagittis eget tempus euismod. Vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing accumsan faucibus. Vestibulum ante ipsum primis in faucibus lorem ipsum dolor sit amet nullam adipiscing eu felis.</blockquote>
									<h4>Preformatted</h4>
									<pre><code>i = 0;

while (!deck.isInOrder()) {
    print 'Iteration ' + i;
    deck.shuffle();
    i++;
}

print 'It took ' + i + ' iterations to sort the deck.';</code></pre>
								</section>

								<section>
									<h3 class="major">Lists</h3>

									<h4>Unordered</h4>
									<ul>
										<li>Dolor pulvinar etiam.</li>
										<li>Sagittis adipiscing.</li>
										<li>Felis enim feugiat.</li>
									</ul>

									<h4>Alternate</h4>
									<ul class="alt">
										<li>Dolor pulvinar etiam.</li>
										<li>Sagittis adipiscing.</li>
										<li>Felis enim feugiat.</li>
									</ul>

									<h4>Ordered</h4>
									<ol>
										<li>Dolor pulvinar etiam.</li>
										<li>Etiam vel felis viverra.</li>
										<li>Felis enim feugiat.</li>
										<li>Dolor pulvinar etiam.</li>
										<li>Etiam vel felis lorem.</li>
										<li>Felis enim et feugiat.</li>
									</ol>
									<h4>Icons</h4>
									<ul class="icons">
										<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
										<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
										<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
										<li><a href="#" class="icon fa-github"><span class="label">Github</span></a></li>
									</ul>

									<h4>Actions</h4>
									<ul class="actions">
										<li><a href="#" class="button special">Default</a></li>
										<li><a href="#" class="button">Default</a></li>
									</ul>
									<ul class="actions vertical">
										<li><a href="#" class="button special">Default</a></li>
										<li><a href="#" class="button">Default</a></li>
									</ul>
								</section>

								<section>
									<h3 class="major">Table</h3>
									<h4>Default</h4>
									<div class="table-wrapper">
										<table>
											<thead>
												<tr>
													<th>Name</th>
													<th>Description</th>
													<th>Price</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>Item One</td>
													<td>Ante turpis integer aliquet porttitor.</td>
													<td>29.99</td>
												</tr>
												<tr>
													<td>Item Two</td>
													<td>Vis ac commodo adipiscing arcu aliquet.</td>
													<td>19.99</td>
												</tr>
												<tr>
													<td>Item Three</td>
													<td> Morbi faucibus arcu accumsan lorem.</td>
													<td>29.99</td>
												</tr>
												<tr>
													<td>Item Four</td>
													<td>Vitae integer tempus condimentum.</td>
													<td>19.99</td>
												</tr>
												<tr>
													<td>Item Five</td>
													<td>Ante turpis integer aliquet porttitor.</td>
													<td>29.99</td>
												</tr>
											</tbody>
											<tfoot>
												<tr>
													<td colspan="2"></td>
													<td>100.00</td>
												</tr>
											</tfoot>
										</table>
									</div>

									<h4>Alternate</h4>
									<div class="table-wrapper">
										<table class="alt">
											<thead>
												<tr>
													<th>Name</th>
													<th>Description</th>
													<th>Price</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>Item One</td>
													<td>Ante turpis integer aliquet porttitor.</td>
													<td>29.99</td>
												</tr>
												<tr>
													<td>Item Two</td>
													<td>Vis ac commodo adipiscing arcu aliquet.</td>
													<td>19.99</td>
												</tr>
												<tr>
													<td>Item Three</td>
													<td> Morbi faucibus arcu accumsan lorem.</td>
													<td>29.99</td>
												</tr>
												<tr>
													<td>Item Four</td>
													<td>Vitae integer tempus condimentum.</td>
													<td>19.99</td>
												</tr>
												<tr>
													<td>Item Five</td>
													<td>Ante turpis integer aliquet porttitor.</td>
													<td>29.99</td>
												</tr>
											</tbody>
											<tfoot>
												<tr>
													<td colspan="2"></td>
													<td>100.00</td>
												</tr>
											</tfoot>
										</table>
									</div>
								</section>

								<section>
									<h3 class="major">Buttons</h3>
									<ul class="actions">
										<li><a href="#" class="button special">Special</a></li>
										<li><a href="#" class="button">Default</a></li>
									</ul>
									<ul class="actions">
										<li><a href="#" class="button">Default</a></li>
										<li><a href="#" class="button small">Small</a></li>
									</ul>
									<ul class="actions">
										<li><a href="#" class="button special icon fa-download">Icon</a></li>
										<li><a href="#" class="button icon fa-download">Icon</a></li>
									</ul>
									<ul class="actions">
										<li><span class="button special disabled">Disabled</span></li>
										<li><span class="button disabled">Disabled</span></li>
									</ul>
								</section>

								<section>
									<h3 class="major">Form</h3>
									<form method="post" action="#">
										<div class="field half first">
											<label for="demo-name">Name</label>
											<input type="text" name="demo-name" id="demo-name" value="" placeholder="Jane Doe" />
										</div>
										<div class="field half">
											<label for="demo-email">Email</label>
											<input type="email" name="demo-email" id="demo-email" value="" placeholder="jane@untitled.tld" />
										</div>
										<div class="field">
											<label for="demo-category">Category</label>
											<div class="select-wrapper">
												<select name="demo-category" id="demo-category">
													<option value="">-</option>
													<option value="1">Manufacturing</option>
													<option value="1">Shipping</option>
													<option value="1">Administration</option>
													<option value="1">Human Resources</option>
												</select>
											</div>
										</div>
										<div class="field half first">
											<input type="radio" id="demo-priority-low" name="demo-priority" checked>
											<label for="demo-priority-low">Low</label>
										</div>
										<div class="field half">
											<input type="radio" id="demo-priority-high" name="demo-priority">
											<label for="demo-priority-high">High</label>
										</div>
										<div class="field half first">
											<input type="checkbox" id="demo-copy" name="demo-copy">
											<label for="demo-copy">Email me a copy</label>
										</div>
										<div class="field half">
											<input type="checkbox" id="demo-human" name="demo-human" checked>
											<label for="demo-human">Not a robot</label>
										</div>
										<div class="field">
											<label for="demo-message">Message</label>
											<textarea name="demo-message" id="demo-message" placeholder="Enter your message" rows="6"></textarea>
										</div>
										<ul class="actions">
											<li><input type="submit" value="Send Message" class="special" /></li>
											<li><input type="reset" value="Reset" /></li>
										</ul>
									</form>
								</section>

							</article>

					</div>

				<!-- Footer -->
					<footer id="footer">
						<p class="copyright">&copy; Universidad del B�O-B�O</p>
					</footer>

			</div>

		<!-- BG -->
			<div id="bg"></div>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>
