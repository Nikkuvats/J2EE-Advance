<script>
function validate() 
{
	var f1=document.myform.pass.value;
	var f2=document.myform.rpass.value;
	
	if(f1==f2)
		{
		return true;
		}
	else
	{
	alert("password must same");
	return false;
	}
}
</script>
<form name="myform" action="register.jsp" onsubmit="return validate()">
FirstPassword:<input type="password" name="pass"><br>
RetypePassword:<input type="password" name="rpass"><br>
<input type="submit">
</form>