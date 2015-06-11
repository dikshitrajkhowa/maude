<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<link rel="stylesheet" type="text/css" href="styles/login.css">


<head>
<title>Login</title>

</head>

<body onload='document.f.j_username.focus();'>
	
	<div class="container">

		<header>
		<h1>Maude Search Interface</h1>

		</header>
		<section>
		<div id="container_demo">

			<div id="wrapper">

				<c:if test="${not empty error}">
					<div class="errorblock">
						Your login attempt was not successful, try again.<br /> Caused :
						${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
					</div>
				</c:if>
				<div id="login" class="animate form">
					<form name='f' id="myForm" action="j_spring_security_check"
						method='POST'>
						<h1>Log in</h1>
						<p>
							<label for="j_username" class="uname"> Username </label> <input
								id="username" name="j_username" required="required" type="text"
								placeholder="username" />
						</p>
						<p>
							<label for="j_password" class="youpasswd"> Password </label> <input
								id="password" name="j_password" required="required"
								type="password" placeholder="password" />
						</p>
						<p class="keeplogin">
							<input type="checkbox" name="j_spring_security_remember_me"
								id="j_remember" /> <label for="j_remember">Remember me</label>
						</p>
						<p class="login button">
							<input type="submit" value="Login" />
						</p>

					</form>
				</div>

			</div>
		</div>
		</section>
	</div>
</body>
</html>