<head>

      <script type="text/javascript">
       
         function price(amount)
         {
        	this.pric=amount;
         }
         function book(title, author){
            this.title = title;
            this.author  = author;
            this.price=price;
         }
      </script>
<body>
   <script type="text/javascript">
         var b = new book("Perl", "Mohtashim");
         b.price(100);
         document.write("Book title is : " + b.title + "<br>");
         document.write("Book author is : " + b.author + "<br>");
         document.write("Book author is : " + b.pric + "<br>");
   </script> 
</body>