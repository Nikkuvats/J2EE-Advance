<script>
function Validate()
{
	var n=document.f.name.value;
	alert(n);
}
</script>

<form name="f">
Name:<input type="text" name="name">
<input type="button" value="submit" onclick="Validate()">
</form>