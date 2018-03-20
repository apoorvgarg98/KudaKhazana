<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="Shortcut Icon" href="images/11111.png">
<link rel="stylesheet" href="css/nav.css">
<link rel="stylesheet" href="css/index.css">
<title>Kuda Khazana</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
   
</style>
</head>
<body>
<div class="icon">
			<a class="logo-link" href="index.jsp">
				<img class= "image1"src="images/11111.png" height="130px" width="130px">
				<span id="logo">Kuda Khazaana</span>
			</a>
</div>
<script type="text/javascript">
function change(n){
    if(n=='uname'){
        document.getElementById("pass").style.visibility = 'hidden';
        document.getElementById(n).style.visibility = 'visible';
        document.getElementById('uname1').placeholder='';
        document.getElementById('pass1').placeholder='Enter Password';
    }
    else{
        document.getElementById("uname").style.visibility = 'hidden';
        document.getElementById(n).style.visibility = 'visible';
        document.getElementById('uname1').placeholder='Enter UserName';
        document.getElementById('pass1').placeholder='';
    }
   
}
function nchange(n){
    if(n=='ngo-id'){
        document.getElementById("password").style.visibility = 'hidden';
        document.getElementById(n).style.visibility = 'visible';
        document.getElementById('ngo-id1').placeholder='';
        document.getElementById('password1').placeholder='Enter Password';
    }
    else{
        document.getElementById("ngo-id").style.visibility = 'hidden';
        document.getElementById(n).style.visibility = 'visible';
        document.getElementById('ngo-id1').placeholder='Enter NGO ID';
        document.getElementById('password1').placeholder='';
    }
   
}
 
function formchange(n){
    if(n=='user'){
        document.getElementById('ngo-form').style.display="none";
        document.getElementById('user-form').style.display="block";
        document.getElementById('ngo').style.backgroundColor='#FFFFFF';
        document.getElementById('user').style.backgroundColor='#33d150';
        document.getElementById('ngo').style.color='#000000';  
        document.getElementById('user').style.color='#FFFFFF';
    }
    else{
        document.getElementById('user-form').style.display="none";
        document.getElementById('ngo-form').style.display="block";
       
        document.getElementById('user').style.backgroundColor='#FFFFFF';   
        document.getElementById('ngo').style.backgroundColor='#33d150';
       
        document.getElementById('ngo').style.color='#FFFFFF';  
        document.getElementById('user').style.color='#000000';
    }
   
}
</script>
<div class="form1">
    <div class="tab">
        <div id="user" class="element" onClick="formchange('user');">User</div>
        <div id="ngo" class="element right" onClick="formchange('ngo');">NGOs</div>
        
    </div>
  
    <div id="user-form">
  <form  method="post" action="UserLogin" >
      <br><label id="uname" class="label">UserName</label>
      <input id="uname1" class="text" type="text" name="userName" placeholder="Enter UserName" onclick="change('uname')" required><br>
      <label id="pass" class="label">Password</label><br>
      <input id="pass1" class="text" type="password" name="password" placeholder="Enter Password" onclick="change('pass')" required><br>
      <button class="btn" type="submit">Login</button>
      <a class="link-btn" href="UserSignUp.html">SignUp</a>
    </form>
   </div>
   <div id="ngo-form">
 <form  method="post" action="NGOLogin" >
      <br><label id="ngo-id" class="label">NGO ID</label>
      <input id="ngo-id1" class="text" type="text" name="ngo-id" placeholder="Enter NGO ID" onclick="nchange('ngo-id')" required><br>
      <label id="password" class="label">Password</label><br>
      <input id="password1" class="text" type="password" name="password" placeholder="Enter Password" onclick="nchange('password')" required><br>
      <button class="btn" type="submit">Login</button>
      <a class="link-btn" href="NGOSignUp.html">SignUp</a>
   </form>
  </div>
   </div>
</body>
</html>