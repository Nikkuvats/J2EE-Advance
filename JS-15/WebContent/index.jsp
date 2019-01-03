<script>  
function validate() 
{
	var data="Name:<input type='text' name='name'><br>Comment:<textarea rows='5' cols='80'></textarea><br><input type='submit' value='comment'>";  
	document.getElementById("mylocation").innerHTML=data;
}
</script> 
<form name="myform">
<input type="button" value="comment" onclick="validate()">
<div id="mylocation"></div>
</form>