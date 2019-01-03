<script>

function validate() 
{
var msg;
if(document.myform.pass.value.length>5)
	{
	msg="good";
	}
else
	{
	msg="poor";
	}
	document.getElementById("my").innerText=msg;
}

</script>

<form name="myform">
Password:<input type="password" name="pass" onkeyup="validate()">
Strength:<span id="my">No</span>
</form>