current Date and time<span id="txt"></span>
<script>  
var s1="avbcdefgh";  
var s2=s1.slice(2,5);
var s3=s1.trim();
document.write(s2);
document.write("<br>"+s3);

var today=new Date();
var h=today.getHours();
var m=today.getMinutes();
var s=today.getSeconds();
document.getElementById("txt").innerHTML=h+":"+m+":"+s;
</script>  
