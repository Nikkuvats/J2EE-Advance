 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<jsp:forward page="/Login"></jsp:forward>
<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href='css/bootstrap.css' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="js/FormValidation.js"></script>
</head>
<script type="text/javascript">
	function validate(){
		if(!RequiredFieldTextBox("employeeId","employeeIdError","Please Enter EmployeeId")){
			return false;
		}else if(!RequiredFieldTextBox("password","passwordError","Please Enter Your Password")){
			return false;
		}
	
		$.ajax({
			type:"POST",
			url:"Ajax/Login",
			data:$("#loginForm").serialize(),
			success:function(res){
				if(res=="ok"){
					window.open("Master","_self");
				}else{
					$("#employeeIdError").html(res);
				}
			},error:function(){
				alert(arguments[2]);
			}
		})
		
		return false;
	}
</script>
<body style="background-image: url('images/home-bg.jpg')">
	<center>
		
	</center>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<div class='container'>
	<div class='row'>
		<div class='col-xs-23'></div>
		<div class='col-xs-12'>
			<div style='background-color: white; padding:10px; box-shadow:0px 0px 5px rgb(241,241,241)'>
				<label style='font-size: 18px' class="text-primary" >Avalon Master</label>
				<form id='loginForm' action="Login" method="post" onsubmit="return validate()" >
				<span class='text-danger' id='employeeIdError'></span>
				<input name='employeeId' maxlength="12" id='employeeId' type="text" placeholder='Enter Employee Id' class="form-control input-lg" style="margin-bottom:10px" />
				<span class='text-danger' id='passwordError'></span>
				<input name='password' maxlength="100" id='password' type="password" placeholder='Enter Password' class="form-control input-lg" style="margin-bottom:10px" /> 
				<button class='btn btn-primary btn-lg'> <i class='glyphicon glyphicon-lock'></i> Secure Login</button>
				<button class='btn btn-link btn-lg'> Forget Password..??</button>
				</form>
				
			</div>
		</div>
		<div class='col-xs-1'></div>
	</div>
	</div>
	
	
	
	
</body>
</html> --%>