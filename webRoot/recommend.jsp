<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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

<style>

#chart {
  text-align: left;
  box-shadow: 0px 2px 8px rgba(0, 0, 0, 0.2);
  border: 1px solid #aaa;
  margin: 32px auto;
  background: white;
}

</style>
  <script src='js/jquery.js'></script>
<script src="js/index.js"></script>



</head>
<body> <!-- header -->

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
						 <li><a href="home.jsp" >Home</a></li>
						 <li><a href="#about">Course</a></li>
						<li><a href="recommend.jsp">Recommend</a></li>
						<li><a href="AboutUs.jsp">ContactUs</a></li>
					<s:if test="null==#session.currentUser||#session.currentUser.isEmpty()">
  							<li><a href="login.jsp" >Login</a></li>
                        	<li><a href="register.jsp">Register</a></li>
						</s:if>
						<s:else>
							<li><a href="userProfile" ><s:property value="#session.currentUser.userName" /></a></li>
                        	<li><a href="loginOut">LogOut</a></li>
						</s:else>
						
                      
					</ul>
				</div>
				<!--/.navbar-collapse-->
			</nav>
		</div>
</div>
	<!-- /header-bottom -->

<!-- header -->

<!-- portfolio -->
<div class="gallery" id="gallery">
		<div class="container">
			<h3>Recommend accoding to your input </h3>
				<div class="col-md-6">
						<div class="lt-from lt-box">
							<form role="form" action="recommendBaseOnKnowledge" method="post">
						
								<div class="radio-custom radio-default">
									<p class="lead text-muted" style="font-size: 35px;color: white;"> Diffculty</p>
									<input type="radio" id="radioExample1" name="recommend.difficulty" value="1"  checked="checked"><label for="radioExample1">Very hard</label><br/>
									<input type="radio" id="radioExample1" name="recommend.difficulty" value="2"><label for="radioExample1">Hard</label><br/>
									<input type="radio" id="radioExample1" name="recommend.difficulty" value="3"><label for="radioExample1">Normal</label><br/>
									<input type="radio" id="radioExample1" name="recommend.difficulty" value="4"><label for="radioExample1">Easy</label><br/>
									<input type="radio" id="radioExample1" name="recommend.difficulty" value="5"><label for="radioExample1">Very easy</label><br/>
									
								</div>
								<div class="radio-custom radio-default">
									<p class="lead text-muted" style="font-size: 35px;color: white;">  recommendation</p>
									<input type="radio" id="radioExample1" name="recommend.recommendation" value="1"  checked="checked"><label for="radioExample1">Strongly recommend</label><br/>
									<input type="radio" id="radioExample1" name="recommend.recommendation" value="2"><label for="radioExample1">Very Recommend</label><br/>
									<input type="radio" id="radioExample1" name="recommend.recommendation" value="3"><label for="radioExample1">Recommend</label><br/>
									<input type="radio" id="radioExample1" name="recommend.recommendation" value="4"><label for="radioExample1">Lower recommend</label><br/>
									<input type="radio" id="radioExample1" name="recommend.recommendation" value="5"><label for="radioExample1">Not recommend for some reason</label><br/>
									
								</div>
								<div class="radio-custom radio-default">
									<p class="lead text-muted" style="font-size: 35px;color: white;"> practicability</p>
									<input type="radio" id="radioExample1" name="recommend.practicability" value="1" checked="checked"><label for="radioExample1">Execellent</label><br/>
									<input type="radio" id="radioExample1" name="recommend.practicability" value="2"><label for="radioExample1">Very good</label><br/>
									<input type="radio" id="radioExample1" name=recommend.practicability value="3"><label for="radioExample1">Good</label><br/>
									<input type="radio" id="radioExample1" name="recommend.practicability" value="4"><label for="radioExample1">Fair</label><br/>
									<input type="radio" id="radioExample1" name="recommend.practicability" value="5"><label for="radioExample1">Poor</label><br/>
									
								</div>
								<div class="checkbox-custom checkbox-default">
								
									<p class="lead text-muted" style="font-size: 35px;color: white;">focusArea</p>
									<input type="checkbox" id="checkboxExample1" value="Cloud Computing" name="recommend.focusArea"><label for="checkboxExample1">Cloud Computing</label></br>
									<input type="checkbox" id="checkboxExample1" value="Databases" name="recommend.focusArea"><label for="checkboxExample1">Databases</label></br>
									<input type="checkbox" id="checkboxExample1" value="
Gaming and Simulation" name="recommend.focusArea"><label for="checkboxExample1">
Gaming and Simulation</label></br>
									<input type="checkbox" id="checkboxExample1" value="Mobile Systems" name="recommend.focusArea"><label for="checkboxExample1">Mobile Systems</label></br>
									
									<input type="checkbox" id="checkboxExample1" value="
Modeling and Simulation" name="recommend.focusArea"><label for="checkboxExample1">
Modeling, Simulation, and Visualization</label></br>
	<input type="checkbox" id="checkboxExample1" value="Network and Systems Administration" name="recommend.focusArea"><label for="checkboxExample1">Network and Systems Administration</label></br>
								

									<input type="checkbox" id="checkboxExample1" value="Secure Systems" name="recommend.focusArea"><label for="checkboxExample1">Secure Systems</label></br>
									<input type="checkbox" id="checkboxExample1" value="Software Development" name="recommend.focusArea"><label for="checkboxExample1">Software Development</label></br>
									
									<input type="checkbox" id="checkboxExample1" value="Web Application Development" name="recommend.focusArea"><label for="checkboxExample1">Web Application Development</label></br>
								
								</div>
								<button type="submit" class="btn btn-primary-alt">Submit</button>
							</form>
						</div>
	
		</div>
	</div>
<!-- /portfolio -->


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