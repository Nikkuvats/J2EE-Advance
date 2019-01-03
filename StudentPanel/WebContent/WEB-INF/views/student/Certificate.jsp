<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script>
function applyCertificate()
{
	var formdata=$("#certificate-name").serialize();
	alert(formdata);
	var regNo=$("#stdRegno").val();

	 $.ajax({
		 type:"POST",
		 url:ctxPath+"/Master/Ajax/applyCertificate",
		 data:formdata,
		 success:function(res){
			 
			 if(res=="ok"){
				 $("#certificate-name")[0].reset();
				 alrt("Certificate apply successfuly...");
				 loadCertificate(regNo);
			 }
			 else
			 {
				 alrt("some error...");
		     }
		 },
		 error:function(){
			 alert(arguments[2]);
		 }
	 })
}
</script>
<style>
.un{
  margin-top:12px;
}
.ht{
  height:200px;
}
.op
{
  height:25px;
}
.ws
{
  height:25px;
  width:50px;
}
</style>
<div class='col-xs-36 av-row'>
<form id="certificate-name" onsubmit="return false" method="post">
<input type="hidden" id="stdRegno" value="${admin.regNo}" name="studentRegNo">
  <div class='col-xs-36 un'>
    <div class='col-xs-14'>
     <select class='form-control op' id='certificateId' name="certificateId">
       <option>Select Certificate Type</option>
       <c:forEach var="name" items="${certicateName}">
       <option value="${name.certDtailId}">${name.certificateName}</option>
       </c:forEach>
     </select>
    </div>
    <div class='col-xs-22'>
     <button class='btn btn-info ws' onclick="applyCertificate()">Apply</button>
    </div>
  </div>
</form>
  <div class='col-xs-36 ht'></div>
  <div class='col-xs-36 ht'>
   <div class='col-xs-36' style="background:#4aaaa6">
     <div class='col-xs-2'>S.No</div>
     <div class='col-xs-6'>Certificate Type</div>
     <div class='col-xs-5'>Issue No</div>
     <div class='col-xs-5'>Status</div>
     <div class='col-xs-6'>Apply Date</div>
     <div class='col-xs-6'>Issue Date</div>
     <div class='col-xs-6'>Issue by</div>
   </div>
   <c:forEach var="list" items="${certiList}" varStatus="sn">
    <div class='col-xs-36' style="border-bottom:1px solid #d1d1d1">
     <div class='col-xs-2'>${sn.count}</div>
     <div class='col-xs-6'>${list.certName.certificateName}</div>
     <div class='col-xs-5'>${list.issuNo}</div>
     <div class='col-xs-5'>${list.status}</div>
     <div class='col-xs-6'>${list.appliedDate}</div>
     <div class='col-xs-6'>${list.issuDate}</div>
     <div class='col-xs-6'>${list.issuBy}</div>
    </div>
   </c:forEach>
  </div>
</div>