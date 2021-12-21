<%@page contentType="text/html"%>
	<!DOCTYPE html>
	<html lang="es" class="no-js">
	<head>
		<!-- Mobile Specific Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Favicon-->
		<link rel="shortcut icon" href="img/fav.png">
		<!-- Author Meta -->
		<meta name="author" content="colorlib">
		<!-- Meta Description -->
		<meta name="description" content="">
		<!-- Meta Keyword -->
		<meta name="keywords" content="">
		<!-- meta character set -->
		<meta charset="UTF-8">
		<!-- Site Title -->
		<title>Crear usuario</title>

		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
			<!--
			CSS
			============================================= -->
			<link rel="stylesheet" href="css/linearicons.css">
			<link rel="stylesheet" href="css/font-awesome.min.css">
			<link rel="stylesheet" href="css/bootstrap.css">
			<link rel="stylesheet" href="css/magnific-popup.css">
			<link rel="stylesheet" href="css/jquery-ui.css">				
			<link rel="stylesheet" href="css/nice-select.css">							
			<link rel="stylesheet" href="css/animate.min.css">
			<link rel="stylesheet" href="css/owl.carousel.css">				
			<link rel="stylesheet" href="css/main.css">
		</head>
		<body>
                    <% HttpSession miSession = request.getSession();
                    String usu = (String) miSession.getAttribute("nombre_usuario");
                    if (usu == null){
                        response.sendRedirect("index.jsp");
                    }else{
                     %>
			<header id="header">
				<div class="header-top">
					<div class="container">
			  		<div class="row align-items-center">
			  			<div class="col-lg-6 col-sm-6 col-6 header-top-left">
			  				<ul>
			  					<li><a href="#">Visit Us</a></li>
			  					<li><a href="#">Buy Tickets</a></li>
			  				</ul>			
			  			</div>
			  			<div class="col-lg-6 col-sm-6 col-6 header-top-right">
							<div class="header-social">
								<a href="#"><i class="fa fa-facebook"></i></a>
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-dribbble"></i></a>
								<a href="#"><i class="fa fa-behance"></i></a>
							</div>
			  			</div>
			  		</div>			  					
					</div>
				</div>
				<div class="container main-menu">
					<div class="row align-items-center justify-content-between d-flex">
				      <div id="logo">
				        <a href="index.html"><img src="img/logo.png" alt="" title="" /></a>
				      </div>
				      <nav id="nav-menu-container">
				        <ul class="nav-menu">
                                          <li><a href="indexEmpleados.jsp">Home</a></li>
				          <li><a href="SvConsultarEmpleados">Empleados</a></li>
				        </ul>
				      </nav><!-- #nav-menu-container -->					      		  
					</div>
				</div>
			</header><!-- #header -->
			
			<!-- start banner Area -->
			<section class="banner-area relative">
				<div class="overlay overlay-bg"></div>				
				<div class="container">
					<div class="row fullscreen align-items-center justify-content-between">
						
                                                <!-- ACÁ EMPIEZA EL FORMULARIO -->
                                            
                                                <div class="col-lg-8 col-md-8 banner-left">
                                                    <form class="row g-3 needs-validation text-white" action="SvCrearUsuario" method="POST" novalidate>
                                                      <div class="col-md-3">
                                                        <label for="validationCustom01" class="form-label">Nombre</label>
                                                        <input type="text" class="form-control" id="validationCustom01" value="Marcos" name="nombre" required>
                                                        <div class="valid-feedback">
                                                          ¡Se ve bien!
                                                        </div>
                                                      </div>
                                                      <div class="col-md-3">
                                                        <label for="validationCustom02" class="form-label">Apellido</label>
                                                        <input type="text" class="form-control" id="validationCustom02" value="Pérez" name="apellido" required>
                                                        <div class="valid-feedback">
                                                          ¡Se ve bien!
                                                        </div>
                                                      </div>
                                                      <div class="col-md-3">
                                                        <label for="validationCustom03" class="form-label">Nombre de usuario</label>
                                                        <input type="text" class="form-control" id="validationCustom03" value="Marquitos" name="nombre_usu" required>
                                                        <div class="valid-feedback">
                                                          ¡Se ve bien!
                                                        </div>
                                                      </div>
                                                      <div class="col-md-3">
                                                        <label for="validationCustom04" class="form-label">Fecha de nacimiento</label>
                                                        <input type="text" class="form-control" id="validationCustom04" value="dd/mm/aaaa" name="fecha_nac" required>
                                                        <div class="valid-feedback">
                                                          ¡Se ve bien!
                                                        </div>
                                                      </div>
                                                      <div class="col-md-4">
                                                        <label for="validationCustom05" class="form-label">Dirección</label>
                                                        <input type="text" class="form-control" id="validationCustom05" value="Av. Libertador 337" name="direccion" required>
                                                        <div class="valid-feedback">
                                                          ¡Se ve bien!
                                                        </div>
                                                      </div>
                                                      <div class="col-md-4">
                                                            <label for="validationCustom06" class="form-label">Dni</label>
                                                        <input type="text" class="form-control" id="validationCustom06" value="30300300" name="dni" required>
                                                        <div class="valid-feedback">
                                                          ¡Se ve bien!
                                                        </div>
                                                      </div>
                                                      <div class="col-md-4">
                                                        <label for="validationCustom07" class="form-label">Nacionalidad</label>
                                                        <input type="text" class="form-control" id="validationCustom07" value="Argentina" name="nacionalidad" required>
                                                        <div class="valid-feedback">
                                                          ¡Se ve bien!
                                                        </div>
                                                      </div>
                                                      <div class="col-md-4">
                                                        <label for="validationCustom08" class="form-label">Celular</label>
                                                        <input type="text" class="form-control" id="validationCustom08" value="2235001122" name="celular" required>
                                                        <div class="valid-feedback">
                                                          ¡Se ve bien!
                                                        </div>
                                                      </div>
                                                      <div class="col-md-4">
                                                        <label for="validationCustom09" class="form-label">Email</label>
                                                        <input type="text" class="form-control" id="validationCustom09" value="marcos@gmail.com" name="email" required>
                                                        <div class="valid-feedback">
                                                          ¡Se ve bien!
                                                        </div>
                                                      </div>
                                                      <div class="col-md-4">
                                                        <label for="validationCustom10" class="form-label">Cargo</label>
                                                        <input type="text" class="form-control" id="validationCustom10" value="Vendedor" name="cargo" required>
                                                        <div class="valid-feedback">
                                                          ¡Se ve bien!
                                                        </div>
                                                      </div>
                                                      <div class="col-md-4">
                                                        <label for="validationCustom11" class="form-label">Sueldo</label>
                                                        <input type="text" class="form-control" id="validationCustom11" value="80000.0" name="sueldo" required>
                                                        <div class="valid-feedback">
                                                          ¡Se ve bien!
                                                        </div>
                                                      </div>
                                                      <div class="col-md-4">
                                                        <label for="validationCustom12" class="form-label">Contraseña</label>
                                                        <input type="password" class="form-control" id="validationCustom12" name="contrasenia" required>
                                                        <div class="valid-feedback">
                                                          ¡Se ve bien!
                                                        </div>
                                                      </div>
                                                      <div class="col-md-4">
                                                        <button class="primary-btn text-uppercase" type="submit">Crear usuario</button>
                                                      </div>
                                                    </form>
						</div>
                                                
                                                <!-- ACÁ TERMINA EL FORMULARIO -->
					</div>
				</div>					
			</section>
			<!-- End banner Area -->
                        
                        

			<!-- start footer Area -->		
			<footer class="footer-area section-gap">
				<div class="container">

					<div class="row">
						<div class="col-lg-3  col-md-6 col-sm-6">
							<div class="single-footer-widget">
								<h6>About Agency</h6>
								<p>
									The world has become so fast paced that people don?t want to stand by reading a page of information, they would much rather look at a presentation and understand the message. It has come to a point 
								</p>
							</div>
						</div>
						<div class="col-lg-3 col-md-6 col-sm-6">
							<div class="single-footer-widget">
								<h6>Navigation Links</h6>
								<div class="row">
									<div class="col">
										<ul>
											<li><a href="#">Home</a></li>
											<li><a href="#">Feature</a></li>
											<li><a href="#">Services</a></li>
											<li><a href="#">Portfolio</a></li>
										</ul>
									</div>
									<div class="col">
										<ul>
											<li><a href="#">Team</a></li>
											<li><a href="#">Pricing</a></li>
											<li><a href="#">Blog</a></li>
											<li><a href="#">Contact</a></li>
										</ul>
									</div>										
								</div>							
							</div>
						</div>							
						<div class="col-lg-3  col-md-6 col-sm-6">
							<div class="single-footer-widget">
								<h6>Newsletter</h6>
								<p>
									For business professionals caught between high OEM price and mediocre print and graphic output.									
								</p>								
								<div id="mc_embed_signup">
									<form target="_blank" action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01" method="get" class="subscription relative">
										<div class="input-group d-flex flex-row">
											<input name="EMAIL" placeholder="Email Address" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email Address '" required="" type="email">
											<button class="btn bb-btn"><span class="lnr lnr-location"></span></button>		
										</div>									
										<div class="mt-10 info"></div>
									</form>
								</div>
							</div>
						</div>
						<div class="col-lg-3  col-md-6 col-sm-6">
							<div class="single-footer-widget mail-chimp">
								<h6 class="mb-20">InstaFeed</h6>
								<ul class="instafeed d-flex flex-wrap">
									<li><img src="img/i1.jpg" alt=""></li>
									<li><img src="img/i2.jpg" alt=""></li>
									<li><img src="img/i3.jpg" alt=""></li>
									<li><img src="img/i4.jpg" alt=""></li>
									<li><img src="img/i5.jpg" alt=""></li>
									<li><img src="img/i6.jpg" alt=""></li>
									<li><img src="img/i7.jpg" alt=""></li>
									<li><img src="img/i8.jpg" alt=""></li>
								</ul>
							</div>
						</div>						
					</div>

					<div class="row footer-bottom d-flex justify-content-between align-items-center">
						<p class="col-lg-8 col-sm-12 footer-text m-0"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
						<div class="col-lg-4 col-sm-12 footer-social">
							<a href="#"><i class="fa fa-facebook"></i></a>
							<a href="#"><i class="fa fa-twitter"></i></a>
							<a href="#"><i class="fa fa-dribbble"></i></a>
							<a href="#"><i class="fa fa-behance"></i></a>
						</div>
					</div>
				</div>
			</footer>
			<!-- End footer Area -->	

			<script src="js/vendor/jquery-2.2.4.min.js"></script>
			<script src="js/popper.min.js"></script>
			<script src="js/vendor/bootstrap.min.js"></script>			
			<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA"></script>		
 			<script src="js/jquery-ui.js"></script>					
  			<script src="js/easing.min.js"></script>			
			<script src="js/hoverIntent.js"></script>
			<script src="js/superfish.min.js"></script>	
			<script src="js/jquery.ajaxchimp.min.js"></script>
			<script src="js/jquery.magnific-popup.min.js"></script>						
			<script src="js/jquery.nice-select.min.js"></script>					
			<script src="js/owl.carousel.min.js"></script>							
			<script src="js/mail-script.js"></script>	
			<script src="js/main.js"></script>
                    <% } %>
                </body>
	</html>