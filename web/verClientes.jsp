<%@page import="logica.Cliente"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                

                <!-- Bootstrap CSS (del form que saqué de Bootstrap) -->
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
                
                
		<!-- Site Title -->
                
		<title>Clientes</title>

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
			</header><!-- #header -->
			
			<!-- start banner Area -->
			<section class="banner-area relative">
				<div class="overlay overlay-bg"></div>				
				<div class="container">
					<div class="row fullscreen align-items-center justify-content-between">
                                            
                                            
                                            
                                            <div class="col-lg-6 col-md-6 banner-left">
                                            
                                            <h1 class="text-white">Clientes</h1>
                                            
                                            </div>
                                              
                                            <div class="col-lg-4 col-md-6 banner-right">
							<ul class="nav nav-tabs" id="myTab" role="tablist">
                                                          <li class="nav-item">
							    <a class="nav-link" id="flight-tab"  href="indexEmpleados.jsp">Home</a>
							  </li>
							  <li class="nav-item">
                                                            <a class="nav-link" id="hotel-tab" href="crearCliente.jsp" >Crear cliente</a>
							  </li>
							</ul>
                                            </div>
                                            
                                            <!-- ACÁ EMPIEZA LA TABLA DE CLIENTES -->
                                            
                                            <table class="table table-dark table-striped">
                                              <thead>
                                                <tr>
                                                  <th scope="col">Nombre</th>
                                                  <th scope="col">Dirección</th>
                                                  <th scope="col">Dni</th>
                                                  <th scope="col">Nacionalidad</th>
                                                  <th scope="col">Celular</th>
                                                  <th scope="col">Email</th>
                                                  <th scope="col">Fecha nac.</th>
                                                </tr>
                                              </thead>
                                              <tbody>
                                                <% List<Cliente> listaClientes = (List) request.getSession().getAttribute("listaClientes");
                                                for (Cliente clie : listaClientes) { %>
                                                <tr>
                                                  <% String nombreComp = clie.getNombre() + " " + clie.getApellido(); %>
                                                  <td> <%=nombreComp %> </td>
                                                  <% String direccion = clie.getDireccion(); %>
                                                  <td> <%=direccion %> </td>
                                                  <% String dni = clie.getDni(); %>
                                                  <td> <%=dni %> </td>
                                                  <% String nacionalidad = clie.getNacionalidad(); %>
                                                  <td> <%=nacionalidad %> </td>
                                                  <% long celular = clie.getCelular(); %>
                                                  <td> <%=celular %> </td>
                                                  <% String email = clie.getEmail(); %>
                                                  <td> <%=email %> </td>
                                                  <% Date fecha_nac = clie.getFecha_nac();
                                                     SimpleDateFormat pasando = new SimpleDateFormat("dd/MM/yyyy");
                                                     String fecha_nac_nueva = pasando.format(fecha_nac); %>
                                                     
                                                  <td> <%=fecha_nac_nueva %> </td>
                                                  <% long id_cliente = clie.getId_cliente(); %>
                                                  
                                                  <td>
                                                      <form action="#" method="POST">
                                                          <input type="hidden" name="id_cliente" value="<%=id_cliente %>">
                                                          <button type="submit" class="primary-btn text-uppercase">Eliminar</button>
                                                      </form>
                                                  </td>
                                                  <td>
                                                      <form action="#" method="POST">
                                                          <input type="hidden" name="id_cliente" value="<%=id_cliente %>">
                                                          <button type="submit" class="primary-btn text-uppercase">Modificar</button>
                                                      </form>
                                                  </td>
                                                </tr>
                                                
                                                <% } %>
                                              </tbody>
                                            </table>
                        
                                            <!-- ACÁ TERMINA LA TABLA DE CLIENTES -->
                                            
					</div>
				</div>
			</section>
			<!-- End banner Area -->

			
                        <!-- Start price Area -->
			<section class="price-area section-gap">
				<div class="container">
		            <div class="row d-flex justify-content-center">
		                <div class="menu-content pb-70 col-lg-8">
		                    <div class="title text-center">
		                    </div>
		                </div>
		            </div>						
					
				</div>	
			</section>
			<!-- End price Area -->
                        
                        

			<!-- start footer Area -->		
			<footer class="footer-area section-gap">
				<div class="container">

					<div class="row">
						<div class="col-lg-3  col-md-6 col-sm-6">
							<div class="single-footer-widget">
								<h6>About Agency</h6>
								<p>
									The world has become so fast paced that people don’t want to stand by reading a page of information, they would much rather look at a presentation and understand the message. It has come to a point 
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
                        
                        
                        <!-- Script del form de bootstrap -->
                        <!-- Option 1: Bootstrap Bundle with Popper -->
                        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
                    <% } %>
                </body>
	</html>