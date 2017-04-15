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
<script src="js/jquery.emojiRatings.js"></script>
<script>
	$(function() {
		$("#element1").emojiRating({
			emoji: 'U+270C',
			fontSize: 80,
			count: 5
		});
		$("#element2").emojiRating({
			emoji: 'U+2764',
			fontSize: 80,
				count: 5
		});
		$("#element3").emojiRating({
			emoji: 'U+1F604',
			fontSize: 80,
				count: 6
		});
		$("#element4").emojiRating({
			emoji: 'U+1F680',
			fontSize: 80,
				count: 8
		});
		$("#element5").emojiRating({
			emoji: 'U+2B50',
			fontSize: 80,
				count:10
		});
	});
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
						 <li><a href="courseListByTest">Course</a></li>
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

<%--<!-- portfolio -->
<div class="gallery" id="gallery">
		<div class="container">
			<a href="rateACourse?id= ${course.courseId}"><h3>${course.name}</h3></a>
			
		<div class="project-top">
		    <div class="col-md-6 project-right"></div>
				<div class="col-md-6 project-left">  </div>
					<h2><span class="col-md-6 project-right"></span></h2>
					<span class="col-md-6 project-right">					
							<h2><p>CODE : ${course.code}</p><BR/>	</h2>
						<h2><p><a href="findATeacher?id=${teacher.teacherId}">Teacher:${teacher.teacherName}</a></p><BR/></h2>
						<h2>Session : <s:if test="#request.course.session == 1">Fall</s:if>
						
						<s:if test="#request.course.session == 2"> Spring</s:if>
						<s:if test="#request.course.session == 3"> Fall + Spring</s:if>
						</h2>
						<h2><p>Credits : ${course.credits}</p><BR/></h2>
						<h2><p>Is Core Course?:  <s:if test="#request.course.core == 1"> NO</s:if><s:if test="#request.course.core == 2"> YES</s:if></p><BR/></h2>
						<p>
							Introduction:${course.intro}
						
						</p>
					</span>
				
			</div>
		</div>
	</div>
<!-- /portfolio -->
--%><!-- project -->
	<div class="project" id="about">
		<div class="container">
		<h1 align="center">${course.name}</h1>
		<form action="rateACourse?id=${course.courseId}" method="post">
	<div class="application">

<div class="col-md-5 appli-left">
				<div class="app-lft">
					
			Over All recommend  <div class="zzsc-container">
								<div class="zzsc-content"><div id="element5" class="emoji5"></div>
							</div></div>

				</div>
					
			</div>
			<div class="col-md-5 appli-left">
				<div class="app-lft">
getGoodGrades
	 	
	

				</div>
			</div>
			<div class="col-md-5 appli-left">
				<div class="app-lft">

	 		difficulty
	

	
				</div>
			</div>
			<div class="col-md-5 appli-left">
				<div class="app-lft">

	 		assigment
	
				</div>
			</div>
			<div class="col-md-5 appli-left">
				<div class="app-lft">

	 	pronunciation
	
				</div>
			</div>
			<div class="col-md-5 appli-left">
				<div class="app-lft">

	 	recommendation
	
				</div>
			</div>
			<div class="col-md-5 appli-left">
				<div class="app-lft">

	 	practicability
	
				</div>
			</div>
		
	</div>
	</form>
<!-- /application -->
		</div>
		
	</div>
<!-- /project -->



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