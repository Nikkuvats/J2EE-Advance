<script type="text/javascript">
         var flag = new Boolean(false); 
         document.write( "flag.valueOf is : " + flag.valueOf() ); 
      </script>
      
      
      <script type="text/javascript">
         function book(title, publisher, price)
         {
            this.title = title;
            this.publisher = publisher;
            this.price = price;
         }
         
         var newBook = new book("Perl","Leo Inc",200); 
         document.write(newBook.toSource()); 
      </script>