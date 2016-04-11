<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>ofCourse--Stevens course evaluation system</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Thronged Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />

<script type="applijewelleryion/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />	
<script src="js/jquery-1.11.1.min.js"></script>
<!--webfonts-->
<link href='http://fonts.googleapis.com/css?family=Antic' rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,400,300,600,700|Six+Caps' rel='stylesheet' type='text/css' />
   <!--//webfonts-->
<script type="text/javascript" src="js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="css/default.css">
<link rel="stylesheet" type="text/css" href="css/search-form.css">

<!------ Light Box ------>
<link rel="stylesheet" href="css/swipebox.css">
    <script src="js/jquery.swipebox.min.js"></script> 
    <script type="text/javascript">
		jQuery(function($) {
			$(".swipebox").swipebox();
		});
	</script>
    <!------ Eng Light Box ------>
<script type="text/javascript" src="js/move-top.js"></script>
       <script type="text/javascript" src="js/easing.js"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
				});
			});
		</script>
		<script type="text/javascript">
		$(document).ready(function() {
				/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
				*/
		$().UItoTop({ easingType: 'easeOutQuart' });
});
</script>
<script type="text/javascript">
	function searchToggle(obj, evt){
		var container = $(obj).closest('.search-wrapper');

		if(!container.hasClass('active')){
			  container.addClass('active');
			  evt.preventDefault();
		}
		else if(container.hasClass('active') && $(obj).closest('.input-holder').length == 0){
			  container.removeClass('active');
			  // clear input
			  container.find('.search-input').val('');
			  // clear and hide result container when we press close
			  container.find('.result-container').fadeOut(100, function(){$(this).empty();});
		}
	}

	function submitFn(obj, evt){
		value = $(obj).find('.search-input').val().trim();

		_html = "Yup yup! Your search text sounds like this: ";
		if(!value.length){
			_html = "Yup yup! Add some text friend :D";
		}
		else{
			_html += "<b>" + value + "</b>";
		}

		$(obj).find('.result-container').html('<span>' + _html + '</span>');
		$(obj).find('.result-container').fadeIn(100);

		evt.preventDefault();
	}
</script>


</head>
<body>
 <!-- header -->

	 <!-- header-bottom -->
	<div class="header-bottom">
		<div class="container">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div>
				<!--/.navbar-header-->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
					 <li><a href="index.html" class="scroll">Major</a></li>
						 <li><a href="#about" class="scroll">Course</a></li>
						<li><a href="#gallery" class="scroll">Unisersity</a></li>
						<li><a href="#contact" class="scroll">ContactUs</a></li>
                        <li><a href="login.jsp" >Login</a></li>
                        <li><a href="register.jsp">Register</a></li>
                        
					</ul>
				</div>
				<!--/.navbar-collapse-->
			</nav>
		</div>
</div>
	<!-- /header-bottom -->

<!-- header -->
<!-- banner -->
	<div class="banner">
		<div class="container">	
			
			<div class="logo">
				<h1><a href="index.html">ofCourse</a></h1>
			</div>
			<div class="banner-info">
				<h2>Professional</h2>
				<p>We will provide reliable, skilled information about course and help you make wise decision.</p>
				<a class="hvr-shutter-in-horizontal" href="AboutUs.jsp">Read More</a>
			</div>
          
				<form onSubmit="submitFn(this, event);">
		<div class="search-wrapper">
			<div class="input-holder">
				<input type="text" class="search-input" placeholder="Type to search" />
				<button class="search-icon" onClick="searchToggle(this, event);"><span></span></button>
			</div>
			<span class="close" onClick="searchToggle(this, event);"></span>
			<div class="result-container">

			</div>
		</div>
</form>

			</div>
</div>
	</div>
<!-- banner -->
<div>


</div>
<!-- portfolio -->
<div class="gallery" id="gallery">
		<div class="container">
        <!--=============== section team ===============-->

			<h3>Courses</h3>
			<div class="portfolio">
					<div id="portfoliolist">
					<div class="portfolio logos mix_all wow bounceIn" data-wow-delay="0.4s" data-cat="logos" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper grid_box">		
							 <a href="course.jsp" > <img src="images/pic9.jpg" class="img-responsive" alt=""><span class="zoom-icon"></span> </a>
		                </div>
					</div>				
					<div class="portfolio logos mix_all wow bounceIn" data-wow-delay="0.4s" data-cat="logos" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper grid_box">		
								 <a href="course.jsp" >  <img src="images/pic8.jpg" class="img-responsive" alt=""><span class="zoom-icon"></span> </a>
		                </div>
					</div>					
					<div class="portfolio logos mix_all wow bounceIn" data-wow-delay="0.4s" data-cat="logos" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper grid_box">		
								 <a href="course.jsp" >  <img src="images/pic3.jpg" class="img-responsive" alt=""><span class="zoom-icon"></span> </a>
		                </div>
					</div>
					<div class="portfolio logos mix_all wow bounceIn" data-wow-delay="0.4s" data-cat="logos" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper grid_box">		
								 <a href="course.jsp" >  <img src="images/pic4.jpg" class="img-responsive" alt=""><span class="zoom-icon"></span> </a>
		                </div>
					</div>		
					<div class="portfolio logos mix_all wow bounceIn" data-wow-delay="0.4s" data-cat="logos" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper grid_box">		
							 	 <a href="course.jsp" >  <img src="images/pic5.jpg" class="img-responsive" alt=""><span class="zoom-icon"></span> </a>
		                </div>
					</div>	
					<div class="portfolio logos mix_all wow bounceIn" data-wow-delay="0.4s" data-cat="logos" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper grid_box">		
							 	 <a href="course.jsp" > <img src="images/pic6.jpg" class="img-responsive" alt=""><span class="zoom-icon"></span> </a>
		                </div>
					</div>	
					<div class="portfolio logos mix_all wow bounceIn" data-wow-delay="0.4s" data-cat="logos" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper grid_box">		
								 <a href="course.jsp" >  <img src="images/pic7.jpg" class="img-responsive" alt=""><span class="zoom-icon"></span> </a>
		                </div>
					</div>
					<div class="portfolio logos mix_all wow bounceIn" data-wow-delay="0.4s" data-cat="logos" style="display: inline-block; opacity: 1;">
						<div class="portfolio-wrapper grid_box">		
								 <a href="course.jsp" >  <img src="images/pic1.jpg" class="img-responsive" alt=""><span class="zoom-icon"></span> </a>
		                </div>
					</div>
				<div class="clearfix"></div>					
				</div>
		  <div class="clearfix"></div>
			</div>

		</div>
	</div>
<!-- /portfolio -->

<!-- case -->
	<div class="case">
		<div class="container">
			<h3>Make a type specimen book. It has survived.</h3>
			<div class="case-top">
				<div class="col-md-4 case-left">
						<span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>
					<div class="ca-rt">
						<h5>Making It</h5>
						<p>more-or-less</p>
					</div>
				</div>
				<div class="col-md-4 case-left">
				
					<span class="glyphicon glyphicon-globe" aria-hidden="true"></span>
				
					<div class="ca-rt">
						<h5>Opposed To</h5>
						<p>more-or-less</p>
					</div>
				</div>
				<div class="col-md-4 case-left1">
				
					<span class="glyphicon glyphicon-user" aria-hidden="true"></span>
			
					<div class="ca-rt">
						<h5>Making This </h5>
						<p>more-or-less</p>
					</div>
				</div>
					<div class="clearfix"></div>
			</div>
			<!-- specifications -->
	<div class="specifications">
		
				<div class="col-md-6 specifica-left">
					<h4>Containing Lorem Ipsum Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here'</h4>
					<p>Lorem Ipsum is that it has a more-or-less normal ,making it look has a more-or-less normal ,making like readable English. distribution of letters,like readable English. distribution of letters, as opposed to using 'Content here, content here', making it look like readable English as opposed to using 'Content here, content here', making it look like readable English.</p>
				</div>
				<div class="col-md-6 specifica-right">
					<h6>Making it look</h6>
					<ul>
						
						<li><a href="#">Lorem Ipsum is that it has a more-or-less</a></li>
						<li><a href="#">Lorem Ipsum is that it has a more-or-less</a></li>
						<li><a href="#">Lorem Ipsum is that it has a more-or-less</a></li>
						<li><a href="#">Lorem Ipsum is that it has a more-or-less</a></li>
					</ul>
				</div>
				
					<div class="clearfix"></div>
			
		
	</div>
<!-- /project -->
		</div>
	</div>
<!-- /case -->

<!-- clients -->
<div class="client" id="clients">
		<div class="container">
			<h3>Clients</h3>
			<div class="nbs-flexisel-container"><div class="nbs-flexisel-inner"><div class="nbs-flexisel-container"><div class="nbs-flexisel-inner"><ul id="flexiselDemo1" class="nbs-flexisel-ul" style="left: -162.857142857143px; display: block;">			
					
					
					
					<li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/3.png" alt=" " class="img-responsive">
						</div>
					</li>
					<li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/Stevens.jpg" alt=" " class="img-responsive">
						</div>
					</li>
					<li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/6.png" alt=" " class="img-responsive">
						</div>
					</li>
					<li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/7.png" alt=" " class="img-responsive">
						</div>
					</li>
					<li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/Stevens.jpg" alt=" " class="img-responsive">
						</div>
					</li>
					<li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/r.jpg" alt=" " class="img-responsive">
						</div>
					</li>
					
					
					<li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/r1.jpg" alt=" " class="img-responsive">
						</div>
					</li><li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/r.jpg" alt=" " class="img-responsive">
						</div>
					</li><li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/Stevens.jpg " alt=" " class="img-responsive">
						</div>
					</li><li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/r1.jpg" alt=" " class="img-responsive">
						</div>
					</li>	<li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/Stevens.jpg" alt=" " class="img-responsive">
						</div>
					</li><li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/r1.jpg" alt=" " class="img-responsive">
						</div>
					</li>	<li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/Stevens.jpg" alt=" " class="img-responsive">
						</div>
					</li><li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/r1.jpg" alt=" " class="img-responsive">
						</div>
					</li>	<li class="nbs-flexisel-item" style="width: 162.857142857143px;">
						<div class="sliderfig-grid">
							<img src="images/Stevens.jpg" alt=" " class="img-responsive">
						</div>
					</li></ul><div class="nbs-flexisel-nav-left" style="top: -33px;"></div><div class="nbs-flexisel-nav-right" style="top: -33px;"></div></div></div>
<div class="nbs-flexisel-nav-left" style="top: 27.5px;"></div><div class="nbs-flexisel-nav-right" style="top: 27.5px;"></div></div></div>
					<script type="text/javascript">
							$(window).load(function() {
								$("#flexiselDemo1").flexisel({
									visibleItems: 7,
									animationSpeed: 1000,
									autoPlay: true,
									autoPlaySpeed: 3000,    		
									pauseOnHover: true,
									enableResponsiveBreakpoints: true,
									responsiveBreakpoints: { 
										portrait: { 
											changePoint:480,
											visibleItems: 2
										}, 
										landscape: { 
											changePoint:640,
											visibleItems:3
										},
										tablet: { 
											changePoint:768,
											visibleItems: 3
										}
									}
								});
								
							});
					</script>
					<script type="text/javascript" src="js/jquery.flexisel.js"></script>



		</div>
	</div>
<!-- /clients -->
	<div class="footer">
		<div class="container">
				<div class="col-md-4 contact-left">
					<div class="cont-tp">
						<span class="glyphicon glyphicon-map-marker" aria-hidden="true">
					</div>
					<h4>Address</h4>
					<address>
					219 New York Ave, Apt 5 
        <br>
						  Jersey City, NJ 07307<br>
						  <abbr title="Phone">P :</abbr> (551) 247-7786
						</address>
				</div>
				<div class="col-md-4 contact-left">
					<div class="cont-tp">
						<span class="glyphicon glyphicon-phone" aria-hidden="true">
					</div>
					<h4>Phone/Fax</h4>
					<p>Phone : +1 551 2477 7786</p>
					<p>Phone : +1 201 668 1367</p>
					<p>Fax : +1 201 668 1367 </p>
				</div>
				<div class="col-md-4 contact-left">
					<div class="cont-tp">
						<span class="glyphicon glyphicon-envelope" aria-hidden="true">
					</div>
					<h4>Email</h4>
					<p>Emai-1 : <a href="mailto:info@example.com">xli100@stevens.edu</a> </p>
					<p>Emai-2 : <a href="mailto:info@example.com">sblyr@stevens.edu</a> </p>
					<p>Emai-3 : <a href="mailto:info@example.com">sbxhy@stevens.edu</a> </p>
				</div>
				<div class="clearfix"></div>
			
			<div class="copyright">
			   <p>© 2016 ofCourse. All rights reserved</p>
</div>
		</div>
</div>
	<a href="#" id="toTop" style="display: block;"><span id="toTopHover" style="opacity: 0;"></span> <span id="toTopHover" style="opacity: 0;"> </span></a>
</body>
</html>