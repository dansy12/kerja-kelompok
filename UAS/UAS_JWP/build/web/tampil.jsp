<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="net.tutorialpedia.model.ProdukModel"%>
<html>
	<head>
		<!-- CHANGE TITLE AND META ACCORDINGLY -->
		<title>Logitech</title>
		<meta name="theme-color" content="#ffffff">
		<meta content="width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes" name="viewport">
		<link rel="stylesheet" href="css/tidy.css">
		<link rel="stylesheet" href="css/animate.css">
		<script src="ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<script src="http://cdnjs.cloudflare.com/ajax/libs/gsap/latest/TweenMax.min.js"></script>
		<script src="http://cdnjs.cloudflare.com/ajax/libs/gsap/latest/plugins/ScrollToPlugin.min.js"></script>
		<script src="bower_components/webcomponentsjs/webcomponents.js"></script>
        <link href="//cdn.rawgit.com/noelboss/featherlight/1.3.2/release/featherlight.min.css" type="text/css" rel="stylesheet" title="Featherlight Styles" />
        <script src="//cdn.rawgit.com/noelboss/featherlight/1.3.2/release/featherlight.min.js" type="text/javascript" charset="utf-8"></script>
		<link rel="import" href=bower_components/paper-ripple/paper-ripple.html">
		<link rel="import" href="bower_components/paper-fab/paper-fab.html">
		<link rel="import" href="bower_components/iron-icons/iron-icons.html">
	</head>
	<body>
	<%
                        ProdukModel pm = new ProdukModel();
                        List<ProdukModel> data = new ArrayList<ProdukModel>();
                        String id = request.getParameter("id");
                        if (id != null) {
                            data = pm.tampilDenganId(id);
                        }
                        for (int x = 0; x < data.size(); x++) {
                    %>
		<div class="container" style="width: 100%">
			<!-- COVER IMAGE AND FLOATING BUTTON -->
			<div class="cover-image"></div>	
			<div class="desktop-fab-container ">
				<!-- REPLACE WITH YOUR APP URL -->
     			<a href="../index.html">
     				<paper-fab class="wow fadeInUp desktop-fab" icon="shop"></paper-fab>
     			</a>
			</div>
			
			<!-- ICON, NAME AND DESCRIPTION -->
			<div class="wow fadeInUp content-card">
				<!-- REPLACE WITH YOUR APP URL -->
				<a href="../index.html">
					<paper-fab class="mobile-fab" icon="shop"></paper-fab>
				</a>
				
				<div class="icon-and-title-flex">
					<img src="img/<%=data.get(x).getfoto1()%>"></img>
					<div class="title-container">
						<!-- REPLACE WITH YOUR APP NAME -->
						<span class="text-title"><%=data.get(x).getnama()%></span>
						<br><div class="intertext-padding"></div>
						<!-- REPLACE WITH YOUR DEV NAME -->
						<span class="text-subtitle"><%=data.get(x).getbrand()%></span>
						<br><div class="intertext-padding"></div>
						<!-- REPLACE WITH YOUR APP PRICE -->
						<span class="text-subtitle">Rp. <%=data.get(x).getharga()%></span>
					</div>	
				</div><br><br>
				<!-- REPLACE WITH YOUR APP DESCRIPTION -->
				<span class="text-description" style="font-size: 1.1em">Specifications:
				<%=data.get(x).getdes()%>
 		
			</div>
			
			
			
			<!-- OTHER APPS BY YOU -->
			<div class="wow fadeInUp content-works"> 
			    <div class="screenshot-item">
                    <a href="../img/1.png" data-featherlight="image">
                        <img src="img/<%=data.get(x).getfoto1()%>">
                    </a>
                </div>
                <div class="screenshot-item">
                    <a href="../img/2.jpeg" data-featherlight="image">
                        <img src=img/<%=data.get(x).getfoto2()%>">
                    </a>
                </div>
                <div class="screenshot-item">
                    <a href="../img/3.jpeg" data-featherlight="image">
                        <img src="img/<%=data.get(x).getfoto3()%>">
                    </a>
                </div>
                <div class="screenshot-item">
                    <a href="../img/4.jpeg" data-featherlight="image">
                        <img src="img/<%=data.get(x).getfoto4()%>">
                    </a>
                </div>
     	    </div>
		
		<!-- SPACE BELOW DETAILS -->	
		<div class="empty-space">
			<div class="meta-container wow fadeInUp">
				<div class="wow fadeInUp detail-item watermark credits">
						<span class="text-description credits-text" style="color: #ffffff"><a href="../key.html" style="color: #fff; font-weight: 700">Back</a></span>
				</div>
			</div>	
		</div>
			
			<% } %>
			
			
			
		<!-- ===================================================================================================== -->
			
		<!-- JAVASCRIPT -->
		
		<!-- Animations -->
		<script src="../js/wow.min.js"></script>
		<script>
			new WOW().init();
		</script>
		
		<!-- Scrollwheel Smoothing -->
		<script>
			$(function()
			{	
				var $window = $(window);
				var scrollTime = 0.2;
				var scrollDistance = 270;
				$window.on("mousewheel DOMMouseScroll", function(event)
				{
	
					event.preventDefault();	
					var delta = event.originalEvent.wheelDelta/120 || -event.originalEvent.detail/3;
					var scrollTop = $window.scrollTop();
					var finalScroll = scrollTop - parseInt(delta*scrollDistance);
					TweenMax.to($window, scrollTime, 
					{
						scrollTo : { y: finalScroll, autoKill:true }, ease: Power1.easeOut, overwrite: 5	 
						
					});
				});
			});
		</script>
	</body>
</html>	