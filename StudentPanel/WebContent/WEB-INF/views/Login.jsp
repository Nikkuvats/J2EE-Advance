<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%request.getServletContext().setAttribute("ctxPath", request.getContextPath());%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Login</title>
<link href='<%=request.getContextPath() %>/css/bootstrap.css'
	rel='stylesheet' type='text/css'>
<script type="text/javascript"
	src="<%=request.getContextPath() %>/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath() %>/js/FormValidation.js"></script>
</head>

<c:if test="${admin != null }">
	<c:redirect url="/Master"></c:redirect>
</c:if>

<script type="text/javascript">
function validate(){
	//alert($("#loginForm").serialize());
	if(!RequiredFieldTextBox("studentId","studentIdError","Please Enter Student Id")){
		return false;
	}else if(!RequiredFieldTextBox("password","passwordError","Please Enter Your Password")){
		return false;
	}
	
	$.ajax({
		type:"POST",
		url:$("#ctxPath").val()+"/Ajax/Login",
		data:$("#loginForm").serialize(),
		success:function(res){
			//alert(res);
			if(res=="ok"){
				//window.open($("#ctxPath").val()+"/Master","_self");
				location.reload();
			
			}else{
				$("#studentIdError").html(res);
			}
		},error:function(){
			alert(arguments[2]);
		}
	});
	
	return false;
}
	
</script>
<body id='body' style="background-color: #f4f4f4">
	<input type="hidden" value="<%=request.getContextPath()%>" id='ctxPath'>
	<center></center>
	<br><br><br><br><br><br>
	
	<div class='container'>
		<div class='row'>
			<div class='col-xs-12'></div>
			<div class='col-xs-12'>
			   <div  style='background-color:#fff; height: 170px'>
				<div class="av-row-10" style='background-color:#4aaaa6;height: 36px;padding-top: 9px'>
			      <span style='font-size: 16px;color:white;margin-left: 120px;'>Student Panel</span>
				</div>
				<div class="av-row-90" style=' padding: 10px;'>
			
					<form id='loginForm' action="Login" method="post" onsubmit="return validate()">
						<span class='text-danger' id='studentIdError'></span> 
						<input name='StudentName' maxlength="12" id='studentId' type="text" placeholder='Enter Student Id' value="jai" class="form-control input-lg" style="margin-bottom: 10px" /> 
						<span class='text-danger' id='passwordError'></span>
						<input name='StudentIds' maxlength="100" id='password' type="password" placeholder='Enter Password' value="2" class="form-control input-lg" style="margin-bottom: 10px" />
						<button class=' btn-md' style="float: right;"><i class='glyphicon glyphicon-lock'style="color: #736d63"></i>Login</button>
						
					</form>
                </div>
			  </div>
			</div>
			<div class='col-xs-12'></div>
		</div>
	</div>

</body>
</html>