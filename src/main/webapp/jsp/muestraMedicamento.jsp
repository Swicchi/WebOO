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


							<!-- Main -->
									<a href="/WebOOProject">X</a>
									<h1 class="major">Medicamento</h1>
								    <h2>Nombre Generico del medicamento:</h2>
								     <h3>${list[0].nombreGenerico}</h3>
								     <h2>Nombre Comercial del medicamento:</h2>
								     <h3>${list[0].nombreComercial}</h3>
								     
								     <h2 class="major">Farmacias asociadas</h2>
									<div id="contenedor_tabla_farmacias" style="color: rgb(85, 255, 85);">	<table class="display data-table dataTable" id="example">
											<thead>
												<tr>
													<th style="text-align:center;">Nombre farmacia</th>
													<th style="text-align:center;">Direccion</th>
													<th style="text-align:center;">Precio</th>
													<th style="text-align:center;">Stock</th>
												</tr>
											</thead>
											<tbody>
												<tr>
														   <c:forEach var="med" items="${list}">  
							                                    <tr class="odd gradeX">
							                                        <td>${med.nombreFarmacia}</td> 
																	<td>${med.ubicacion}</td>
																	<td>${med.precio}</td> 
																	<td>${med.stock}</td>
							                                    </tr>
							                                 </c:forEach>                                   
												</tr>	
											</tbody>
											
										</table></div>
                                           
			</div>
							
					


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
