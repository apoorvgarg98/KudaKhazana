<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
	background-color:rgb(66,66,66,0.3);
}
.form1{
	position: absolute;
	top: 20%;
    left: 40%;
    height: 200px;
	width:300px;
	padding:8px;
	box-shadow:5px 10px #888888;
	background-color:white;
  }
  .text{
    margin:6px;
    padding:8px;	
	border: 0;
	border-bottom: 1px solid black; 
	width:80%;
  }
  .radio{
     margin:none;
     padding:none;
  }
  .label{
  	positon:relative;
  	margin-left : 10px;
  	color : blue;   
  	visibility: hidden;
  }
  .btn{
  	margin-top : 10px;
  	margin-left : 25%;
  	width: 100px;
  	height: 30px;
  	font-family : sans-serif;
  }
  .element{
  	padding: 10px 12px;
  	border: 1px solid black;
  	background-color: #
  }
</style>
</head>
<body>
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
</script>
<div class="form1">
	<div class="tab">
		<span class="element">User</span>
		<span class="element">NGOs</span>
	</div>
  <form method="post" action="AdminLoginCheck" >
      <br><label id="uname" class="label">UserName</label>
      <input id="uname1" class="text" type="text" name="userName" placeholder="Enter UserName" onclick="change('uname')" required><br>
      <label id="pass" class="label">Password</label><br>
      <input id="pass1" class="text" type="password" name="password" placeholder="Enter Password" onclick="change('pass')" required><br>
      <button class="btn" type="submit">Login</button>
   </form>
   </div>
</body>
</html>