<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<script type="text/javascript">
function personalDetailUpdate(regNo){

var	formData= $("#student-presonal-info-form").serialize();
$.ajax({
	type:"POST",
	url:ctxPath+"/Master/Ajax/presonalInfoUpdate",
	data:formData,
	success:function(res){
	//alert(res);
	loadProfile(regNo);
	return false;
	$("#profile").html(res);
	},error:function(){
		alrt(arguments[2]);
	}
}); 
}



$(".edit-qualification, .edit-document").click(function(){
	//alert("this");
	$(this).siblings().show();
	$(this).hide();
	$(this).parent().siblings().children(".divs").hide();
	$(this).parent().siblings().children(".text-divs").show();
});
$(".cancel-qualification, .cancel-document").click(function(){
	$(this).siblings(".edit-qualification, .edit-document").show();
	$(this).siblings(".save-qualification, .save-document").hide();
	$(this).hide();
	$(this).parent().siblings().children(".text-divs").hide();
	$(this).parent().siblings().children(".divs").show();
});


function updateStdEducationInfo(regNo,thisObj){
	var formId = $(thisObj).parent().parent().parent().attr("id");
	var	formData= $("#"+formId).serialize();
	//alert(formData);
//alert(regNo);
	$.ajax({
		type:"POST",
		url:ctxPath+"/Master/Ajax/updateStdEducationInfo",
		data:formData,
		success:function(res){
		//	alert("ok");
			loadProfile(regNo);
		},error:function(){
			alrt(arguments[2]);
		}
	});
	
}

function showDocument(docUrl){
	//alert(docUrl);
	$("#show-doc-modal").modal("show");
	$("#document-div").attr("src",docUrl);
}
</script>
<style>
.wsfrm {

	display: none;
}
</style>






<div class='av-row' style="overflow: hidden;">
	<div class='' style="background-color: white;">
			<div class='av-row' >
				<table style=" border-bottom:1px solid #fcfcfc; font-size:11px; margin-bottom: 0px" class='table table-hover'>
				<tr style="background-color:#fcfcfc">
		<th>Personal Detail <i data-toggle="modal" data-target="#stdPersonalDetailUpdate" class="glyphicon glyphicon-edit" style="float: right;margin-right: 18px"></i></th>
				</tr>
				</table>
		</div>
				</div>
				

			
	<div id=''>
		<form >
			<Br>
			<input type="hidden" id='std-reg-profile-pic' name='profilePic' />
			<div class='row'>
				<div class='col-xs-1'></div>
				<div class='col-xs-6'></div>
				<div class='col-xs-10'>
					<span class='text-danger' id='errorFname'></span>
				</div>
				<div class='col-xs-2'></div>
				<div class='col-xs-6'></div>
				<div class='col-xs-10'>
					<span class='text-danger' id='errorLname'></span>
				</div>
			</div>
			<div class='row' style="margin-bottom: 5px">
				<div class='col-xs-1'></div>
				<div class='col-xs-6'>
					<label>First Name</label>
				</div>
				<div class='col-xs-10'>${regDetail.fname}
				<%-- 	<input id='fname' maxlength="45" value="${regDetail.fname}"
						onkeypress='return checkForAlphabet(event)' name='fname'
						type="text" class="form-control"> --%>
				</div>
				<div class='col-xs-2'></div>
				<div class='col-xs-6'>
					<label>Last Name</label>
				</div>
				<div class='col-xs-10'>${regDetail.lname}
				<%-- 	<input id='lname' maxlength="45" value="${regDetail.lname}"
						onkeypress='return checkForAlphabet(event)' name='lname'
						type="text" class="form-control">--%>
				</div> 
			</div>


			<div class='row'>
				<div class='col-xs-1'></div>
				<div class='col-xs-6'></div>
				<div class='col-xs-10'>
					<span class='text-danger' id='errorMobile'></span>
				</div>
				<div class='col-xs-2'></div>
				<div class='col-xs-6'></div>
				<div class='col-xs-10'></div>
			</div>
			<div class='row' style="margin-bottom: 5px">
				<div class='col-xs-1'></div>
				<div class='col-xs-6'>
					<label>Mobile Number</label>
				</div>
				<div class='col-xs-10'>${regDetail.mobile}
					<!-- <input type="text" maxlength="10"
						onkeypress='return checkForInt(event)' id='mobile' name='mobile'
						class="form-control"> -->
				</div>
				<div class='col-xs-2'></div>
				<div class='col-xs-6'>
					<label>Date of birth</label>
				</div>
				<div class='col-xs-10'>${regDetail.dob}
				<!-- 	<div class="input-group" style="width: 100%">
						<input type="date" id='dob' name='dob' class="form-control">
						<span class="input-group-addon" id="basic-addon1"
							style="width: 25px"><i class="fa fa-calendar"></i></span>
					</div> -->
				</div>
			</div>


			<div class='row'>
				<div class='col-xs-1'></div>
				<div class='col-xs-6'></div>
				<div class='col-xs-10'>
					<span class='text-danger' id='errorEmail'></span>
				</div>
				<div class='col-xs-2'></div>
				<div class='col-xs-6'></div>
				<div class='col-xs-10'></div>
			</div>
			<div class='row' style="margin-bottom: 5px">
				<div class='col-xs-1'></div>
				<div class='col-xs-6'>
					<label>Email Id</label>
				</div>
				<div class='col-xs-10'>${regDetail.emailId}
			<!-- 		<input type="text" id='emailId' maxlength="100" name='emailId'
						class="form-control"> -->
				</div>

				<div class='col-xs-2'></div>
				<div class='col-xs-6'>
					<label>Registration Date</label>
				</div>
				<div class='col-xs-10'>
					<div class="input-group" style="width: 100%">${regDetail.regDate}
					<!-- 	<input type="date" name='regDate'
						 class="form-control">
						<span class="input-group-addon" id="basic-addon1"
							style="width: 25px"><i class="fa fa-calendar"></i></span> -->
					</div>

				</div>
			</div>



			<div class='row'>
				<div class='col-xs-1'></div>
				<div class='col-xs-6'></div>
				<div class='col-xs-10'>
					<span class='text-danger' id='errorFather'></span>
				</div>
				<div class='col-xs-2'></div>
				<div class='col-xs-6'></div>
				<div class='col-xs-10'></div>
			</div>
			<div class='row' style="margin-bottom: 5px">
				<div class='col-xs-1'></div>
				<div class='col-xs-6'>
					<label>Father Name</label>
				</div>
				<div class='col-xs-10'>${regDetail.fatherName}
					<!-- <input type='text' class='form-control' name='fatherName'
						id='fatherName' /> -->
				</div>
				<div class='col-xs-2'></div>
				<div class='col-xs-6'>
					<label>Gender</label>
				</div>
				<div class='col-xs-10'>${regDetail.gender}
				<!-- 	<select name='gender' class='form-control'>
						<option>Male</option>
						<option>Female</option>
					</select> -->
				</div>
			</div>

			<div class='row' style="margin-bottom: 5px">
				<div class='col-xs-1'></div>
				<div class='col-xs-6'>
					<label>Emrg Number</label>
				</div>
				<div class='col-xs-10'>${regDetail.emrgNo}
				<!-- 	<input type="text" maxlength="10"
						onkeypress='return checkForInt(event)' id='emrgNumber'
						name='emrgNumber' class="form-control"> -->
				</div>
				<div class='col-xs-2'></div>
				<div class='col-xs-6'>
					<label>Working Status</label>
				</div>
				<div class='col-xs-10'>${regDetail.workingStatus}
			
				</div>
			</div>








			<hr>

			

			<div class='row' style="margin-bottom: 5px">
				<div class='col-xs-1'></div>
				<div class='col-xs-6'>
					<label>Pmt Address</label>
				</div>
				<div class='col-xs-10'>${regDetail.pAddress} /
					<!-- <textarea name='pAddress' id='pAddress' class='form-control padd'
						rows="4" cols=""></textarea> -->
				</div>
				<div class='col-xs-2'>
					<!-- <input id='addressCheck' type="checkbox"
						onclick='makeAddressDisabled(this)' /> -->
				</div>
				<div class='col-xs-6'>
					<label>Current Address</label>
				</div>
				<div class='col-xs-10'>${regDetail.cAddress}
					<!-- <textarea name='cAddress' id='cAddress' class='form-control cadd'
						rows="4" cols=""></textarea> -->
				</div>

			</div>

			<div class='row' style="margin-bottom: 5px">
				<div class='col-xs-1'></div>
				<div class='col-xs-6'>
					<label>City</label>
				</div>
				<div class='col-xs-10'>${regDetail.cCity}
					<!-- <input type="text" name='pCity' id='pCity'
						class="form-control padd"> -->

				</div>
				<div class='col-xs-2'></div>
				<div class='col-xs-6'>
					<label>State</label>
				</div>
				<div class='col-xs-10'>${regDetail.cState}
				<!-- 	<input type="text" name='cCity' id='cCity'
						class="form-control cadd"> -->
				</div>
			</div>

			<div class='row' style="margin-bottom: 5px">
				<div class='col-xs-1'></div>
				<div class='col-xs-6'>
					<label>Country</label>
				</div>
				<div class='col-xs-10'>${regDetail.cCountry}
					<!-- <input type="text" name='pState' id='pState'
						class="form-control padd"> -->
				</div>
				<div class='col-xs-2'></div>
				<div class='col-xs-6'>
					<label>PinCode</label>
				</div>
				<div class='col-xs-10'>${regDetail.cPin}
				<!-- 	<input type="text" name='cState' id='cState'
						class="form-control cadd">
 -->
				</div>
			</div>

</form>

	</div>
	
	
<%-- 	<div class='av-row-20' style="background-color: white;margin-top: 40px">
			<div class='av-row' >
			<table style="font-size:11px; margin-bottom: 0px" class='table'>
				<tr style="background-color: #fcfcfc">
					<th class='text-center' style="width: 20px">SN </th>
					<th style="width: 90px;padding-left: 10px" >Course Name</th>
					<th style="width: 90px">RollNo</th>
					<th style="width: 90px">Board</th>
					<th style="width: 90px">Passing Year</th>
					<th style="width: 70px" class="text-center"> Percentage</th>
				</tr>
				
				
				
		<c:forEach var="ec" items="${eduDetail}" varStatus="status" > 
	  		<tr>
				<td class='text-center'>${status.count}.</td>
					<td style='padding-left: 10px'>
					${ec.courseName}
					</td>
					<td><b class='text-primary'>${ec.rollNo}</b></td>
					<td>
					${ec.unvBoard}
					</td>
					<td>${ec.endYear}</td>
					<td style="padding-left: 30px">
					${ec.percentage}
					</td>
				</tr>
		 </c:forEach> 
		</table>
	</div>
	</div> --%>
	
	<!-- 	<div class="row" style="margin:0px;padding:4px 4px 0px;">
			<div class="col-xs-7 content">
			Course Name
			</div>
			<div class="col-xs-7 content">
			Board
			</div>
			<div class="col-xs-5 content">
			Roll No
			</div>
			<div class="col-xs-3 content">
		 Name
			</div>
			<div class="col-xs-3 content">
			year
			</div>
			<div class="col-xs-4 content">
				Program
			</div>
			<div class="col-xs-4 content">
			Percentage
			</div>
			<div class="col-xs-3 text-center">
			</div> -->
			
							
				
	<div class='' style="background-color: white;margin-top: 40px">
			<div class='av-row' >
				<table style=" border-bottom:1px solid #fcfcfc; font-size:11px; margin-bottom: 0px" class='table table-hover'>
				<tr style="background-color:#fcfcfc">
		<th style="width: 190px;padding-left: 5px">Course</th>
		<th style="width: 180px;padding-left: 10px">Board </th>
		<th style="width: 140px;padding-left: 18px">Roll No </th>
		<th style="width: 90px;padding-left: 12px">Begin</th>
		<th style="width: 70px;padding-left: 0px">End </th>
		<th style="width: 90px;">Program </th>
		<th style="width: 190px;padding-left: 8px">Percentage </th>
		
				</tr>
				</table>
				</div>
	
		
		
	
	<c:forEach var="stuEdu" items="${eduDetail}">
	<form id="stdEducation-updateForm${stuEdu.qualificationId}">
		<div class="row" style="margin:0px;padding:4px 4px 0px;">
			<div class="col-xs-7 content">
				<div class="divs">${stuEdu.courseName}</div>
				<div class="text-divs" style="display: none">
					<input type="hidden" value="${stuEdu.qualificationId}" name="qualificationId"> 
					<input type="hidden" value="${stuEdu.studentRegNo}" name="stdRegNo">
					<input type="text" value="${stuEdu.courseName}" class="form-control" name="courseType" readonly="readonly" />
				</div>
			</div>
			<div class="col-xs-7 content">
				<div class="divs">${stuEdu.unvBoard}</div>
				<div class="text-divs" style="display: none">
					<input type="text" value="${stuEdu.unvBoard}" class="form-control" name="unvBoard"/>
				</div>
			</div>
			<div class="col-xs-5 content">
				<div class="divs">${stuEdu.rollNo}</div>
				<div class="text-divs" style="display: none">
					<input type="text" value="${stuEdu.rollNo}" class="form-control" name="rollNo"/>
				</div>
			</div>
			<div class="col-xs-3 content">
				<div class="divs">${stuEdu.beginYear}</div>
				<div class="text-divs" style="display: none">
					<input type="text" value="${stuEdu.beginYear}" class="form-control" name="beginYear"/>
				</div>
			</div>
			<div class="col-xs-3 content">
				<div class="divs">${stuEdu.endYear}</div>
				<div class="text-divs" style="display: none">
					<input type="text" value="${stuEdu.endYear}" class="form-control" name="endYear"/>
				</div>
			</div>
			<div class="col-xs-4 content">
				<div class="divs">${stuEdu.program}</div>
				<div class="text-divs" style="display: none">
					<input type="text" value="${stuEdu.program}" class="form-control" name="programType"/>
				</div>
			</div>
			<div class="col-xs-4 content">
				<div class="divs">${stuEdu.percentage}</div>
				<div class="text-divs" style="display: none">
					<input type="text" value="${stuEdu.percentage}" class="form-control" name="percentage" readonly="readonly"/>
				</div>
			</div>
			<div class="col-xs-3 text-center">
				<span class="glyphicon glyphicon-edit edit edit-qualification" title="edit"></span>
				<span class="glyphicon glyphicon-floppy-save save save-qualification" onclick="updateStdEducationInfo('${admin.regNo}',this)" title="save" style="display: none"></span>
				<span class="glyphicon glyphicon-remove-circle cancel cancel-qualification" title="cancel" style="display: none"></span>
			</div>
		</div>
	</form>
</c:forEach>
	</div>
			<div class='av-row-20' style="background-color: white;margin-top: 40px;;">
		<div >
				<table style="border-bottom:1px solid #ccc; font-size:11px; margin-bottom: 0px" class='table'>
				<tr style="background-color: #fcfcfc">
					<th class='text-center' style="width: 20px">SN </th>
					<th style="padding-left: 10px">Document Name<i data-toggle="modal" data-target="#stdDocUpdate" class="glyphicon glyphicon-save" style="float: right;margin-right:25px"></i></th>
					<th class='text-center' style="width: 20px">view</th>
				</tr>
				
			
				
		<c:forEach var="dc" items="${docDetail}" varStatus="status" > 
	  		<tr  class='av-row'>
				<td class='text-center'>${status.count}.</td>
					<td style='padding-left: 10px'>
					${dc.docName}
					</td>
			<td style=""><i class="fa fa-eye" onclick="showDocument('${dc.docUrl}')"></i></td>
				</tr>
		 </c:forEach> 
		
		</table>
	</div>
	</div>
</div>




	



<!-- <----------------------------Pop up-------------------------  -->


<div class="modal" id="show-doc-modal" tabindex="-1" style="z-index: 6000"
	role="dialog" aria-labelledby="avAlertLabel">
	<div class="modal-dialog" role="document" style="margin-top:5px;">
		<div class="modal-content">
			<div class="modal-body">
				<img id="document-div" onerror="if(this.src != 'error.jpg') this.src=ctxPath+'/images/default_userpic.png'"  width='100%' height='100%'/>
			</div>
		</div>
	</div>
</div>

<div class="modal" id="stdPersonalDetailUpdate" tabindex="-1"
	style="z-index: 6000" role="dialog" aria-labelledby="avAlertLabel">
	<div class="modal-dialog" role="document" style="margin-top: 100px;">
		<div class="modal-content">
			<div class="modal-header bg-success text-success" style="height: 30px">
				<label style='font-size: 13px; color: #111' id='avAlertTitle'>personal Detail</label>
			</div>
			<div class="modal-body">
						<div class='av-row' style="overflow:hidden;  ">
							<div id=''>
								<form id='student-presonal-info-form' onsubmit="return">
									<Br>
									<input type="hidden" value="${admin.regNo}" name="regId">
									<input type="hidden" value="${regDetail.gender}" name="gender">
									<input type="hidden" value="${regDetail.emrgNo}" name="emrgNumber">
									<input type="hidden" id='std-reg-profile-pic' name='profilePic' />
									<div class='row'>
										<div class='col-xs-1'></div>
										<div class='col-xs-6'></div>
										<div class='col-xs-10'>
											<span class='text-danger' id='errorFname'></span>
										</div>
										<div class='col-xs-2'></div>
										<div class='col-xs-6'></div>
										<div class='col-xs-10'>
											<span class='text-danger' id='errorLname'></span>
										</div>
									</div>
									<div class='row' style="margin-bottom: 5px">
										<div class='col-xs-1'></div>
										<div class='col-xs-6'>
											<label>First Name<span class="text-danger">*</span></label>
										</div>
										<div class='col-xs-10'>${regDetail.fname}
											<input id='fname' maxlength="45" value="${regDetail.fname}"
												onkeypress='return checkForAlphabet(event)' name='fname'
												type="hidden" class="form-control">
										</div>
										<div class='col-xs-2'></div>
										<div class='col-xs-6'>
											<label>Last Name</label>
										</div>
										<div class='col-xs-10'>${regDetail.lname}
											<input id='lname' maxlength="45" value="${regDetail.lname}"
												onkeypress='return checkForAlphabet(event)' name='lname'
												type="hidden" class="form-control">
										</div>
									</div>
						
						
									<div class='row'>
										<div class='col-xs-1'></div>
										<div class='col-xs-6'></div>
										<div class='col-xs-10'>
											<span class='text-danger' id='errorMobile'></span>
										</div>
										<div class='col-xs-2'></div>
										<div class='col-xs-6'></div>
										<div class='col-xs-10'></div>
									</div>
									<div class='row' style="margin-bottom: 5px">
										<div class='col-xs-1'></div>
										<div class='col-xs-6'>
											<label>Mob No.<span class="text-danger">*</span></label>
										</div>
										<div class='col-xs-10'>${regDetail.mobile}
											<input type="hidden" maxlength="10" value="${regDetail.mobile}"
												onkeypress='return checkForInt(event)' id='mobile' name='mobile'
												class="form-control">
										</div>
										<div class='col-xs-2'></div>
										<div class='col-xs-6'>
											<label>Date of birth</label>
										</div>
										<div class='col-xs-10'>${regDetail.dob}
											<div class="input-group" style="width: 100%">
												<input type="hidden" id='dob' name='dob' value="${regDetail.dob}" style="width: 135px" class="form-control">
												<!-- <span class="input-group-addon" id="basic-addon1"  
													style="width: 25px"><i class="fa fa-calendar"></i></span> -->
											</div>
										</div>
									</div>
						
						
									<div class='row'>
										<div class='col-xs-1'></div>
										<div class='col-xs-6'></div>
										<div class='col-xs-10'>
											<span class='text-danger' id='errorEmail'></span>
										</div>
										<div class='col-xs-2'></div>
										<div class='col-xs-6'></div>
										<div class='col-xs-10'></div>
									</div>
									<div class='row' style="margin-bottom: 5px">
										<div class='col-xs-1'></div>
										<div class='col-xs-6'>
											<label>Email Id<span class="text-danger">*</span></label>
										</div>
										<div class='col-xs-10'>${regDetail.emailId}
											<input type="hidden" id='emailId' maxlength="100" name='emailId'
											value="${regDetail.emailId}"	class="form-control">
										</div>
						
										<div class='col-xs-2'></div>
										<div class='col-xs-6'>
											<label>Father Name</label>
										</div>
										<div class='col-xs-10'>${regDetail.fatherName}
											<input type="hidden" class='form-control' name='fatherName'
											value="${regDetail.fatherName}"	id='fatherName' />
										</div>
							
									</div>
									<div class='row' style="margin-bottom: 5px">
										<div class='col-xs-1'></div>
										<div class='col-xs-6'>
											<label>Address<span class="text-danger">*</span></label>
										</div>
										<div class='col-xs-10'>${regDetail.pAddress} / ${regDetail.pCity} / ${regDetail.pState}
										
										</div>
						
										<div class='col-xs-2'></div>
										<div class='col-xs-6'>
											
										</div>
										<div class='col-xs-10'>
										</div>
									
									</div>
						
									<hr>
						
						
									<div class='row' style="margin-bottom: 5px">
										<div class='col-xs-1'></div>
										<div class='col-xs-6'>
											<label>Permanent Address</label>
										</div>
										<div class='col-xs-10'>
											<textarea name='pAddress' id='pAddress' class='form-control padd'
											rows="4" cols="">${regDetail.pAddress}</textarea>
										</div>
										<div class='col-xs-2'>
											
										</div>
										<div class='col-xs-6'>
											<label>Current Address</label>
										</div>
										<div class='col-xs-10'>
											<textarea name='cAddress' id='cAddress' class='form-control cadd'
												rows="4" cols="">${regDetail.cAddress}</textarea>
										</div>
						
									</div>
						
									<div class='row' style="margin-bottom: 5px">
										<div class='col-xs-1'></div>
										<div class='col-xs-6'>
											<label>City</label>
										</div>
										<div class='col-xs-10'>
											<input type="text" name='pCity' id='pCity'
											value="${regDetail.pCity}"	class="form-control padd">
						
										</div>
										<div class='col-xs-2'></div>
										<div class='col-xs-6'>
											<label>City</label>
										</div>
										<div class='col-xs-10'>
											<input type="text" name='cCity' id='cCity'
											value="${regDetail.cCity}"	class="form-control cadd">
										</div>
									</div>
						
									<div class='row' style="margin-bottom: 5px">
										<div class='col-xs-1'></div>
										<div class='col-xs-6'>
											<label>State</label>
										</div>
										<div class='col-xs-10'>
											<input type="text" name='pState' id='pState'
											value="${regDetail.pState}"	class="form-control padd">
										</div>
										<div class='col-xs-2'></div>
										<div class='col-xs-6'>
											<label>State</label>
										</div>
										<div class='col-xs-10'>
											<input type="text" name='cState' id='cState'
											value="${regDetail.cState}"	class="form-control cadd">
						
										</div>
									</div>
						
									<div class='row' style="margin-bottom: 5px">
										<div class='col-xs-1'></div>
										<div class='col-xs-6'>
											<label>Country</label>
										</div>
										<div class='col-xs-10'>
											<input type="text" name='pCountry' id='pCountry'
											value="${regDetail.pCountry}"	class="form-control padd">
										</div>
										<div class='col-xs-2'></div>
										<div class='col-xs-6'>
											<label>Country</label>
										</div>
										<div class='col-xs-10'>
											<input type="text" name='cCountry' id='cCountry'
											value="${regDetail.cCountry}"	class="form-control cadd">
						
										</div>
									</div>
						
									<div class='row' style="margin-bottom: 5px">
										<div class='col-xs-1'></div>
										<div class='col-xs-6'>
											<label>Pincode</label>
										</div>
										<div class='col-xs-10'>
											<input type="text" name='pPin' id='pPin' maxlength="6"
											value="${regDetail.pPin}"	onkeypress="return checkForInt(event)" class="form-control padd">
										</div>
										<div class='col-xs-2'></div>
										<div class='col-xs-6'>
											<label>Pincode</label>
										</div>
										<div class='col-xs-10'>
											<input type="text" name='cPin' id='cPin' maxlength="6"
											value="${regDetail.cPin}"	onkeypress="return checkForInt(event)" class="form-control cadd">
						
										</div>
									</div>
								</form>
						
							</div>
						</div>
						
			</div>
			<div class="modal-footer">
				<input type="submit" value="Update" class="btn btn-default"onclick='personalDetailUpdate("${admin.regNo}")'data-dismiss="modal">
				<button type="button" class="btn btn-default"onclick=''data-dismiss="modal">Cancel</button>
			</div>
		</div>
	</div>
</div>



<div class="modal" id="stdDocUpdate" tabindex="-1"
	style="z-index: 6000" role="dialog" aria-labelledby="avAlertLabel">
	<div class="modal-dialog" role="document" style="margin-top: 240px;margin-left: 450px">
		<div class="modal-content">
			<div class="modal-header bg-success text-success" style="height: 30px">
				Document Add
			</div>
			<div class="modal-body">
            <form id="documentEdit" method="post" onsubmit="return false()">
				<div class='row' style="margin-bottom: 5px">
				
				<input type="hidden" value="${admin.regNo}" name="regId">
					<div class='col-xs-8'>
						<label>Document Name</label>
					</div>
					<div class='col-xs-11'>
						<input id='' maxlength="45" value=""  placeholder="Document Name"
							onkeypress='return checkForAlphabet(event)' name='docName'
							type="text" class="form-control"> 
					</div>
					<div class='col-xs-1'></div>
					
					<div class='col-xs-10'>
					<input type="hidden" value="" name="docUrl" id="docid">
					<input maxlength="45" value="" name='file' type="file" class="form-control" onchange="findStdNewDocument('#documentEdit')" accept="image/png,image/gif,image/jpeg,image/jpg,">
				</div> 
				<div class='col-xs-6'>
						<input type="submit" value="Submit" style="float: right;" onclick="StdDocumentUpload('${admin.regNo}')" data-dismiss="modal">
					</div>
			
			</div>
         </form>
	     </div>
		<div class="modal-footer">
				
		</div>
		</div>
	</div>
</div>

<script>
function findStdNewDocument(formObj){
	var formData = new FormData($(formObj)[0]);
	$.ajax({
		url:ctxPath+"/Master/Ajax/avalon_img_upload",
		type:"POST",
		data:formData,
		async: false,
		success:function(res){
			//alert(res);
			$("#docid").val(res);
		},
		error:function(a,b,c){
			alert("avalon_img_upload "+c);
		},
		cache: false,
        contentType: false,
        processData: false
	});
	
	return false;
}

function StdDocumentUpload(regNo){
	//alert(regNo);
	var	formData= $("#documentEdit").serialize();
	//alert(formData);
	$.ajax({
		type:"POST",
		url:ctxPath+"/Master/Ajax/StdDocumentUploads",
		data:formData,
		success:function(res){
		//alert(res);
			loadProfile(regNo);
			return false;
		},error:function(){
			alrt(arguments[2]);
		}
	});
	
}

</script>
