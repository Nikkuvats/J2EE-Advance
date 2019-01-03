<head>
	<script>
		function book(title,author)
		{
			this.title=title;
			this.author=author;
		}
	</script>
</head>
<body>
	<script>
	var mybook=new book("perl","Mohatish");
	document.write("Book title:"+mybook.title+"<br>");
	document.write("Book author:"+mybook.author+"<br>");
	</script>
</body>