<head>
<script type="text/javascript">

	function book(title,author)
	{
	this.title=title;
	this.author=author;
	}
</script>
</head>
<body>
<script>
	
	var b=new book("Java","James Gosline");
	book.price=null;
	b.price=100;
	document.write("title is:"+b.title);
	document.write("<br>author is:"+b.author);
	document.write("<br>author is:"+b.price);	
</script>
</body>