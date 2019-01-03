<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script>
function validation()
{
	
	var stdate=$("#sdate").val();
	var endate=$("#edate").val();
	
	$("#sdate").css("border-color","#cccccc");
	$("#edate").css("border-color","#cccccc");
	if($.trim(stdate)=='')
	{
		$("#sdate").css("border-color","red");
		return false;
	}
	else if($.trim(endate)=='')
	{
		$("#edate").css("border-color","red");
		return false;
	}
	else
	{
		$("#sdate").css("border-color","#cccccc");
		applyLeave();
		return true;
	}
}
function applyLeave()
{
	 var sDate=new Date($("#sdate").val());
	 var eDate=new Date($("#edate").val());
	 var timeDiff=(eDate.getTime()-sDate.getTime());
	 var Days=timeDiff/(1000*3600*24);
	 var type=$("#leave").val();
	 
	 if(type=="Leave")
	 {
		 if(Days>15)
		 {
			alert("pls select leave type break because days is greater than 15");
		 }
		 else
		 {
			 var formdata=$("#leave-break").serialize();
			 var regNo=$("#stdRegno").val();
			 
			 $.ajax({
				 type:"POST",
				 url:ctxPath+"/Master/Ajax/applyleaveinfo",
				 data:formdata,
				 success:function(res){
					 
					 if(res=="ok"){
						 $("#leave-break")[0].reset(); 
						 alert("leave apply successfull");
						 loadLeaveDetails(regNo);
					 }
					 else
					 {
						 $("#leave-break")[0].reset(); 
						 alert(res);
				     }
				 },
				 error:function(){
					 alert(arguments[2]);
				 }
			 })	 
		 } 
	}
	else if(type=="Break")
	{
		 if(Days<=15)
		 {
			 alert("pls select leave type leave because days is less than 15");
		 }
		 else
		 {
			 var formdata=$("#leave-break").serialize();
			 var regNo=$("#stdRegno").val();
			 
			 $.ajax({
				 type:"POST",
				 url:ctxPath+"/Master/Ajax/applybreakinfo",
				 data:formdata,
				 success:function(res){
					 
					 if(res=="ok"){
						 $("#leave-break")[0].reset(); 
						 alert("break apply successfull");
						 loadLeaveDetails(regNo);
					 }
					 else
					 {
						 $("#leave-break")[0].reset(); 
						 alert(res);
				     }
				 },
				 error:function(){
					 alert(arguments[2]);
				 }
			 })	 
		 } 
		 
	}
	else
	{
	  alert("Please select leave type...");	
	}
}  
 $(function(){
	 $('#edate').change(function() {
		 var sDate=new Date($("#sdate").val());
		 var eDate=new Date($("#edate").val());
		 var timeDiff=(eDate.getTime()-sDate.getTime());
		 if(sDate<eDate)
		 {
			 var diffDays=timeDiff/(1000*3600*24);
			 $("#nod").val(diffDays);
		 }
		 else
		 {
			 alert("End date must be greater than start date");
			 $("#sdate").val("");
			 $("#edate").val("");
		 }
		
	}); 
	
 });
 function showMessage(reson)
 {
	 //alert(reson);
	$("#show-full-msg").fadeIn("show");
	$("#load-message").html(reson);
 }
 $(function(){
	 $("#msg-close").click(function(){
		 $("#show-full-msg").fadeOut();
	 })
 }) 
</script>
<style>
.un
{ 
   height:30px;
   border-bottom:1px solid #d1d1d1;
}
.ar
{
  margin-top:15px;
}
.in
{
  border:1px solid #d1d1d1; 
  height:240px;
  margin-top:5px;
  padding:0px;
}
.ins
{
  border:1px solid #d1d1d1; 
  height:80px;
  margin-top:10px;
  padding:0px;
}
.bt
{
  margin-bottom:2px;
  margin-top:2px;
  width:70px;
}
.hd
{
  background:#f4f4f4;
  height:20px;
}
.ml
{
  height:100px; width:400px; 
  top:200px; left:500px;
}
.msg
{
  height:80px;
  border:1px solid #d1d1d1;
  background:#f4f4f4;
}
</style>
<form id='leave-break' onsubmit="return false;" method="post">
<input type="hidden" id="stdRegno" value="${admin.regNo}" name="studentRegNo">
<div class='col-xs-36 un'>
  <div class='col-xs-8' style="border-right:1px solid #d1d1d1"><b>Apply for leave or break</b></div>
  <div class='col-xs-28'>
   Note:For 15 days or less than you will be select leave if more than 15 days you will be select break
  </div>
</div>
<div class='col-xs-36 ar'>
  <div class='col-xs-4'><b>From</b></div>
  <div class='col-xs-8'>
    <input type="date" class='form-control' id="sdate" name='startDate'>
  </div>
  
  <div class='col-xs-2'><b>To</b></div>
  <div class='col-xs-8'>
    <input type="date" class='form-control' id="edate" name='endDate'>
  </div>
  <div class='col-xs-4'><b>No Of Days</b></div>
  <div class='col-xs-4'>
    <input type="text" class='form-control' id="nod" name="nodays" placeholder="N.O.Days">
  </div>
</div>
<div class='col-xs-36 ar'>
   <div class='col-xs-4'>
     <b>Leave Type</b>
   </div>
   <div class='col-xs-8'>
      <select class='form-control' id='leave' name='leaveType'>
         <option value="select">Select Type</option>
         <option value="Leave">Leave</option>
         <option value="Break">Break</option>
      </select>
   </div>
</div>
<div class='col-xs-36 ar'>
  <div class='col-xs-36'><b>Write The Following For Reason</b></div>
  <div class='col-xs-36'>
   <textarea rows="4"  class='col-xs-36' name="reason"></textarea>
  </div>
</div>
<div class='col-xs-36 un'>
  <div class='col-xs-32'></div>
  <div class='col-xs-4'>
    <button class='btn btn-info bt' onclick="validation()">Apply</button>
  </div>
</div>
</form>
<div class='col-xs-36'>
<div class='col-xs-36 av-row in'>
 <div class="col-xs-36 hd"><b>Details for leave</b></div>
 <div class='col-xs-36' style="background:#4aaaa6;height:20px">
   <div class='col-xs-9'>Date</div>
   <div class='col-xs-2'>N.O.D</div>
   <div class='col-xs-18'>Reason</div>
   <div class='col-xs-4'>Leave Type</div>
   <div class='col-xs-3'>Status</div>
 </div>
 <div class='col-xs-36'>
 
  <c:forEach var="leave" items="${leavList}">
  <div class='col-xs-36' style="border-bottom:1px solid #d1d1d1">
    <div class='col-xs-9'>${leave.stratDate},${leave.endDate}</div>
    <div class='col-xs-2'>${leave.nodays}</div>
    <div class='col-xs-19 btn av-row' onclick="showMessage('${leave.reason}')" 
      title="Show full message on click">${leave.reason}</div>
    <div class='col-xs-3'>${leave.leaveType}</div>
    <c:choose>
     <c:when test="${leave.status eq 0}">
      <div class='col-xs-3'>Pending</div>
     </c:when>
     <c:otherwise>
      <div class='col-xs-3'>Approved</div>
     </c:otherwise>
    </c:choose>
  </div>
  </c:forEach>
  
 </div>
</div>

<%-- <div class='col-xs-36 av-row ins'>
 <div class="col-xs-36 hd"><b>Details for break</b></div>
 <div class='col-xs-36' style="background:#4aaaa6;height:20px">
   <div class='col-xs-9'>Date</div>
   <div class='col-xs-2'>N.O.D</div>
   <div class='col-xs-18'>Reason</div>
   <div class='col-xs-4'>Leave Type</div>
   <div class='col-xs-3'>Status</div>
 </div>
 <div class='col-xs-36 av-row'>
  <c:forEach var="brek" items="${brekList}">
  <div class='col-xs-36' style="border-bottom:1px solid #d1d1d1">
  
    <div class='col-xs-9'>${brek.stratDate},${brek.endDate}</div>
    <div class='col-xs-2'>${brek.nodays}</div>
    <div class='col-xs-19'>${brek.reason}</div>
    <div class='col-xs-3'>${brek.leaveType}</div>
    <c:choose>
     <c:when test="${brek.status eq 0}">
      <div class='col-xs-3'>Pending</div>
     </c:when>
     <c:otherwise>
      <div class='col-xs-3'>Approved</div>
     </c:otherwise>
    </c:choose>
    
  </div>
  </c:forEach>
 </div>
</div> --%>
</div>
<div class='col-xs-36 modal ml' id="show-full-msg">
  <div class='col-xs-36 bg-success' style="height:20px;">
    <div class='col-xs-5' style="float:left"><b>Message</b></div>
    <div class='col-xs-2' style="float:right;">
     <span class='btn fa fa-close' id="msg-close"></span>
    </div>
  </div>
  <div class='col-xs-36 msg' id='load-message'></div>
</div>
