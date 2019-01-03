<script>

function validate()
{	
var n=document.my.name.value;
var p=document.my.pass.value;

if(n==null || n=="")
	{
	alert("name must fill");
	}
else if(p.length < 6)
		{
		alert("password must be min 6");
		return false;
		}
}

</script>
<form name="my">
Name:<input type="text" name="name"><br>
Password:<input type="password" name="pass"><br>
<input type="button" value="login" onclick="validate()">
</form>