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
<!--  雷达     -->
<script>
$(function(){
  $('#chart').radarChart({
    size: [500, 400],
    step: 1,
    title: "radiaChar",
    values: {
      "JavaScript": 4.1,
      "Node.js": 3.5,
      "jQuery": 4,
      "PHP": 3,
      "C++": 2.5,
      "Problem Solving": 3.5,
      "DHTML": 4
    },
    showAxisLabels: true
  });
});
</script>
<!-- 饼状图    -->
<script type="text/javascript" src="js/jsapi.js"></script>
<script type="text/javascript" src="js/corechart.js"></script>		
<script type="text/javascript" src="js/jquery.gvChart-1.0.1.min.js"></script>
<script type="text/javascript" src="js/jquery.ba-resize.min.js"></script>


<script type="text/javascript">
gvChartInit();
$(document).ready(function(){
		$('#myTable1').gvChart({
			chartType: 'PieChart',
			gvSettings: {
			vAxis: {title: 'No of players'},
			hAxis: {title: 'Month'},
			width: 300,
			height: 350
		}
	});
});
</script>

<script type="text/javascript">
gvChartInit();
$(document).ready(function(){
		$('#myTable2').gvChart({
			chartType: 'PieChart',
			gvSettings: {
			vAxis: {title: 'No of players'},
			hAxis: {title: 'Month'},
			width: 300,
			height: 350
		}
	});
});
</script>

<script type="text/javascript">
gvChartInit();
$(document).ready(function(){
		$('#myTable3').gvChart({
			chartType: 'PieChart',
			gvSettings: {
			vAxis: {title: 'No of players'},
			hAxis: {title: 'Month'},
			width: 300,
			height: 350
		}
	});
});
</script>

<script type="text/javascript">
gvChartInit();
$(document).ready(function(){
		$('#myTable4').gvChart({
			chartType: 'PieChart',
			gvSettings: {
			vAxis: {title: 'No of players'},
			hAxis: {title: 'Month'},
			width: 300,
			height: 350
		}
	});
});
</script>




</head>
<body>
 <!-- header -->

	 <!-- header-bottom -->
	<div class="header-bottom">
		<div class="container">
			<nav class="navbar navbar-default" role="navigation">
			
                
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
					 <li><a href="index.html" class="scroll">Major</a></li>
						<li><a href="#services" class="scroll">Self</a></li>
						 <li><a href="#about" class="scroll">Course</a></li>
						<li><a href="#gallery" class="scroll">Unisersity</a></li>
						<li><a href="#contact" class="scroll">ContactUs</a></li>
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
			<h3>${course.name}</h3>
			
		<div class="project-top">
		    <div class="col-md-6 project-right"></div>
				<div class="col-md-6 project-left">  </div>
					<h2><span class="col-md-6 project-right"><div id="chart"></div>
			</div>
		</div>
	</div>
<!-- /portfolio -->
<!-- project -->
	<div class="project" id="about">
		<div class="container">
		
	<div class="application">

<div class="col-md-3 appli-left">
				<div class="app-lft">
					

	 		 <table id='myTable1'>
			<caption>会员性别分布</caption>
			<thead>
				<tr>
					<th></th>
					<th>男</th>
					<th>女</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>1000</th>
					<td>450</td>
					<td>550</td>
					</tr>
			</tbody>
		</table>  
	

				</div>
					<a class="hvr-shutter-in-horizontal" href="#">Read More</a>
			</div>
			<div class="col-md-3 appli-left">
				<div class="app-lft">

	 		 <table id='myTable2'>
			<caption>会员性别分布</caption>
			<thead>
				<tr>
					<th></th>
					<th>男</th>
					<th>女</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>1000</th>
					<td>420</td>
					<td>550</td>
					</tr>
			</tbody>
		</table>  
	

				</div>
					<a class="hvr-shutter-in-horizontal" href="#">Read More</a>
			</div>
			<div class="col-md-3 appli-left">
				<div class="app-lft">

	 		 <table id='myTable3'>
			<caption>会员性别分布</caption>
			<thead>
				<tr>
					<th></th>
					<th>男</th>
					<th>女</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>1000</th>
					<td>450</td>
					<td>550</td>
					</tr>
			</tbody>
		</table>  
	

	
				</div>
					<a class="hvr-shutter-in-horizontal" href="#">Read More</a>
			</div>
			<div class="col-md-3 appli-left1">
				<div class="app-lft">

	 		 <table id='myTable4'>
			<caption>会员性别分布</caption>
			<thead>
				<tr>
					<th></th>
					<th>男</th>
					<th>女</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>1000</th>
					<td>450</td>
					<td>550</td>
					</tr>
			</tbody>
		</table>  
	
				</div>
					<a class="hvr-shutter-in-horizontal" href="#">Read More</a>
			</div>
				<div class="clearfix"></div>
		
	</div>
<!-- /application -->
		</div>
	</div>
<!-- /project -->
<!-- case -->
	<div class="case">
		<div class="container">
			<h3>RecommendPart.</h3>
			<div class="case-top">
			<s:iterator value="recommendList" var="cc">
		  	<div class="col-md-4 case-left">
						<a href="">
					<span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>
					<div class="ca-rt">
						<h5> <a href="findOneCourse?id=${cc.courseId}" > ${cc.name}</a> </h5>
					</div>
                   </a>
				</div>
				</s:iterator>
				
					<div class="clearfix"></div>
			</div>
			<!-- specifications -->

<!-- /project -->
		</div>
	</div>
<!-- /case -->


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