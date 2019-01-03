<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%request.getServletContext().setAttribute("ctxPath", request.getContextPath());%>

<c:if test="${admin eq null }">
	<jsp:forward page="/Login"></jsp:forward>
</c:if>

<!DOCTYPE html>
<html>
<head>
<title><decorator:title default="SiteMesh Integration" /></title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link rel="SHORTCUT ICON"
	href="<%=request.getContextPath() %>/images/avalon.png">
<script src="${ctxPath }/js/jquery-1.11.2.min.js" type="text/javascript"></script>
<script type="text/javascript"
	src="<%=request.getContextPath() %>/js/FormValidation.js"></script>
<link href="${ctxPath }/css/bootstrap.css" rel="stylesheet"type="text/css" />

<link href="${ctxPath }/css/font-awesome.min.css" rel="stylesheet"
	type="text/css" />
<script src="${ctxPath }/js/layout.js" type="text/javascript"></script>
<script type="text/javascript"
	src="${ctxPath }/js/student-registration.js"></script>



<decorator:head />
<script type="text/javascript">
function loadProfile(regNo){
	//alert(regNo);
		$.ajax({
			type:"POST",
			url:ctxPath+"/Master/Ajax/LoadProfile",
			data:{regNo:regNo},
			success:function(res){
			//alert(res);
			$("#profile").html(res);
			},error:function(){
				alrt(arguments[2]);
			}
		});
}

  function loadFeeDetails(regNo){
	//alert(regNo);
		$.ajax({
			type:"POST",
			url:ctxPath+"/Master/Ajax/loadFeeDetails",
			data:{regNo:regNo},
			success:function(res){

			$("#profile").html(res);
			},error:function(){
				alrt(arguments[2]);
			}
		}); 
}
  function loadLeaveDetails(regNo)
  {
         //alert(regNo);
		 $.ajax({
			 type:"POST",
			 url:ctxPath+"/Master/Ajax/loadleavebreak",
			 data:{regNo:regNo},
			 success:function(res){
				 
				 $("#profile").html(res);
			 },
			 error:function(){
				 alert(arguments[2]);
			 }
		 })
  }
  
  function loadCertificate(regNo)
  {
	  $.ajax({
			 type:"POST",
			 url:ctxPath+"/Master/Ajax/loadCertificate",
			 data:{regNo:regNo},
			 success:function(res){
				 
				 $("#profile").html(res);
			 },
			 error:function(){
				 alert(arguments[2]);
			 }
		 })
  }
  
</script>
</head>
<body>

	<section style='display: none'>

		<jsp:include page="Header.jsp"></jsp:include>

		<div class='av-row av-row-92'>
			<div class='container'>
				<div class='row'>
				    <div class='col-xs-3' style='background-color: #fcfcfc'></div>
				    
					<div class='col-xs-7 av-row' style='background-color: #ffffff'>
						<div class='row'>
							<div class='col-xs-36 av-row' style='padding: 0px'>
								<div class='av-row' >
									<div class='av-row-100' id="load-date">
			                            <jsp:include page="StudentSearch.jsp"></jsp:include>
									</div>
								
								</div>
							</div>
						</div>
                    </div>
                    
					<div class='col-xs-23 av-row' style='padding: 0px;background-color: #ffffff'>
					   <div class='av-row-96 ' id="profile">
							<jsp:include page="StuProfile.jsp"></jsp:include>
							
					   </div>
					</div>
					
					<div class='col-xs-3 av-row' style='padding: 0px;background-color: #fcfcfc'></div>
				</div>
			</div>
		</div>
		<jsp:include page="Footer.jsp"></jsp:include>
	</section>

	<script src="<%=request.getContextPath() %>/js/bootstrap.min.js"
		type="text/javascript"></script>
</body>
</html>


<div class="modal" id="avAlert" tabindex="-1" style="z-index: 6000"
	role="dialog" aria-labelledby="avAlertLabel">
	<div class="modal-dialog modal-sm" role="document"
		style="margin-top: 100px;">
		<div class="modal-content">
			<div class="modal-header" style="background-color: #d1d1d1">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<label style='font-size: 16px; color: #111' id='avAlertTitle'>Alert
					Box</label>
			</div>
			<div class="modal-body"></div>
			<div class="modal-footer">
				<button type="button" class="btn btn-primary" style="width: 50px"
					data-dismiss="modal">OK</button>
			</div>
		</div>
	</div>
</div>


<div class="modal" id="stdRegSuccessModal" tabindex="-1"
	style="z-index: 6000" role="dialog" aria-labelledby="avAlertLabel">
	<div class="modal-dialog" role="document" style="margin-top: 100px;">
		<div class="modal-content">
			<div class="modal-header bg-success text-success">
				<label style='font-size: 16px; color: #111' id='avAlertTitle'>Registration
					Successfully</label>
			</div>
			<div class="modal-body">

				<label>Student Registration Successfully</label> <label>Student
					Id : <span id='stdRegIdForModal'></span>
				</label>

			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default"
					onclick='loadStudentPrintPrevPage($("#stdRegSuccessModal #stdRegIdForModal").html()); loadPage("StudentRegistration","Student Reg");'
					data-dismiss="modal">
					<i class='fa fa-print'></i> Print
				</button>
				<button type="button" class="btn btn-default"
					onclick='loadPage("StudentRegistration","Student Reg");'
					data-dismiss="modal">Cancel</button>
			</div>
		</div>
	</div>
</div>

<div class="modal" id="avLogin" tabindex="-1" style="z-index: 6000"
	role="dialog" aria-labelledby="avAlertLabel">
	<div class="modal-dialog" role="document" style="margin-top: 100px;">
		<div class="modal-content">
			<div class="modal-header" style="background-color: #d1d1d1">
				<label style='font-size: 16px; color: #111' id='avAlertTitle'>Login
					Again <label style="font-size: 10px" class="text-danger">(Your
						Session is Timeout)</label>
				</label>
			</div>
			<div class="modal-body">
				<label style='font-size: 18px' class="text-primary">Avalon
					Master</label>
				<form id='loginForm' action="Login" method="post"
					onsubmit="return validate()">
					<span class='text-danger' id='employeeIdError'></span> <input
						name='employeeId' maxlength="12" id='employeeId' type="text"
						placeholder='Enter Employee Id' class="form-control input-lg"
						style="margin-bottom: 10px" /> <span class='text-danger'
						id='passwordError'></span> <input name='password' maxlength="100"
						id='password' type="password" placeholder='Enter Password'
						class="form-control input-lg" style="margin-bottom: 10px" />
					<button class='btn btn-primary btn-lg'>
						<i class='glyphicon glyphicon-lock'></i> Secure Login
					</button>
					<button class='btn btn-link btn-lg'>Forget Password..??</button>
				</form>

			</div>
		</div>
	</div>
</div>

<%-- <jsp:include page='../enquiry/EnquireyModal.jsp'></jsp:include> --%>

<input type="hidden" id="reqContextPath"
	value="<%=request.getContextPath()%>">
<script>
            
               $("section").height(window.innerHeight);
               $("section").width(window.innerWidth);
               $("section").css("min-height","600px");
               $("section").css("min-width","1250px");
               $("section").fadeIn('fast',function(){
            	   $("#body").fadeIn("slow");   
               });
               var ctxPath = $("#reqContextPath").val();
               
               $( window ).resize(function() {
            	   $("section").height(window.innerHeight);
                   $("section").width(window.innerWidth);
                   $("section").css("min-height","600px");
                   $("section").css("min-width","1250px");
            	 });
               
        </script>






