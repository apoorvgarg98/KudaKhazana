<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>KudaKhazaana</title>
		<link rel="Shortcut Icon" href="images/11111.png">
		<link rel="stylesheet" href="css/nav.css">
		<link rel="stylesheet" href="css/home.css">
	</head>

	<body bgcolor="#33d150">
		<div id= "pagewrapper">
			<div class="icon">
			<a class="logo-link" href="nav.html">
				<img class= "image1"src="images/11111.png" height="130px" width="130px">
				<span id="logo">Kuda Khazaana</span>
			</a>
			</div>

			<div id="dropdown">
				<img id="acc-icon" src="images/account.png">
				<div class="dropdown-content">
					<a class="nav-link" href="">My orders</a>
					<a class="nav-link" href="">Add product</a>
					<a class="nav-link" href="">Logout</a>
				</div>
			</div>

			<div id="nav">
				<a class="nav-link1" href="">Clothing</a>
				<a class="nav-link1" href="">Food</a>
				<a class="nav-link1" href="">Books</a>
				<a class="nav-link1" href="">Electronics</a>
				<a class="nav-link1" href="">Sports</a>
				<a class="nav-link1" href="">Automobile</a>
				
			</div>

			<div class="slideshow">	
				<div class="group" id="g1">
					<img class="image" src="images/1.png" alt="image1"/>
					<span class="caption" id="c1">1/4</span>
				</div>
				<div class="group" id="g2">
					<img class="image" src="images/2.png" alt="image2"/>
					<span class="caption" id="c2">2/4</span>
				</div>
				<div class="group" id="g3">
					<img class="image" src="images/3.png" alt="image3"/>
					<span class="caption" id="c3">3/4</span>
				</div>
				<div class="group" id="g4">
					<img class="image" src="images/5.png" alt="image3"/>
					<span class="caption" id="c4">4/4</span>
				</div>

				<script type="text/javascript">
					var slide=1;
					show(1);

					function change(n){
						show(slide+=n);
					}

					function show(n){
						var i;
						var group = document.getElementsByClassName("group");
						if(n>group.length)
							n=1;
						else if(n<1)
							n=group.length;
						slide=n;
						for(i=0;i<group.length;i++){
							group[i].style.display="none";
						}

						group[n-1].style.display="block";
					}

				</script>

				<button class="button left" onclick="change(-1)"><img class="slide-button" src="images/left.png"></button>

				<button  class="button right" onclick="change(1)"><img class="slide-button" src=" images/right.png"></button>




			</div>
 
		</div>
	</body>
</html>