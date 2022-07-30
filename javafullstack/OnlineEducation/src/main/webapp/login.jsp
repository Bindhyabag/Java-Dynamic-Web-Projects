<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Education Webpage</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- swiper css link  -->
<link rel="stylesheet"
	href="https://unpkg.com/swiper@8/swiper-bundle.min.css" />

<!-- font awesome cdn link  -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">

<!-- custom css file link  -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<% 
	   String status =(String)session.getAttribute("status");
	%>
	<!-- header section starts  -->

	<header class="header">

		<section class="flex">

			<a href="#" class="logo">edu...</a>

			<!-- <nav class="navbar">
        <a href="index.html">home</a>
        <a href="about.html">about</a>
        <a href="courses.html">courses</a>
        <a href="teachers.html">teachers</a>
        <a href="contact.html">Contact Us</a>
      </nav> -->

			<div id="menu-btn" class="fas fa-bars"></div>

		</section>

	</header>
	<!-- contact section starts  -->

	<section class="contact" id="login" style="margin-top: 60px;">

		<h1 class="heading">
			<span>Login</span> us
		</h1>

		<div class="row">

			<div class="image">
				<img src="images/contact-img.svg" alt="">
			</div>

			<form action="login" method="post">
				<span>your email</span> 
				<input type="email" required
					placeholder="enter your valid email" maxlength="50" name="email"
					class="box"> 
					<span>your Password</span> 
					<input type="password" required placeholder="enter your valid password"
					max="15" min="8" name="password" class="box"
					onkeypress="if(this.value.length == 8) return false;"> <input
					type="submit" value="Login" class="btn" name="send"> <a
					href="register.html" class="btn">Sign up</a>
			</form>

		</div>

	</section>

	<!-- contact section ends -->

	<!-- footer section starts  -->

	<footer class="footer">

		<section>

			<div class="share">
				<a href="https://www.facebook.com/" class="fab fa-facebook-f"></a> <a
					href="https://twitter.com/" class="fab fa-twitter"></a> <a
					href="https://www.linkedin.com/" class="fab fa-linkedin"></a> <a
					href="https://www.instagram.com" class="fab fa-instagram"></a> <a
					href="https://www.youtube.com/" class="fab fa-youtube"></a>
			</div>

			<div class="credit">&copy; copyright @ 2022</div>

		</section>

	</footer>

	<!-- footer section ends -->
	<!-- swiper js link  -->
	<script src="https://unpkg.com/swiper@8/swiper-bundle.min.js"></script>

	<!-- custom js file link  -->
	<script src="js/script.js"></script>
	<script>
		alert("<%=status%>");
	</script>
</body>
</html>