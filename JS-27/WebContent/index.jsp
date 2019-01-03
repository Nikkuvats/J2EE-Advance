<script type="text/javascript">

var str = new String( "This is string" );
document.writeln( str.charAt(0)); 
document.writeln( str.charCodeAt(2));

var str1 = "For more information, see Chapter 3.4.5.1";
var re = /(chapter \d+(\.\d)*)/i;
var found = str1.match( re );

document.write(found ); 
</script>
