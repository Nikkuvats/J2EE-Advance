<script>
 $(function(){
                $("#btnview").click(function(){
                    $(this).hide();
                    $("#btnback").show();
                   $("#content").hide();
                   $("#syllabus").show();
                 });
       
                    $("#btnback").click(function(){
                       $(this).hide();
                       $("#btnview").show();
                       $("#content").show();
                        $("#syllabus").hide();
                    });
       
       
            });
</script>

<style>
.myheading{
    background-color: #222;
    font:  Helvetica, sans-serif;
color: white;
text-indent: -3px;
-o-text-overflow: ellipsis;
text-overflow: ellipsis;
white-space: nowrap;
    padding: 0px;
    margin: 0px;
    padding: 7px;
    font-size:14px;
    color:white;
    font-family: sans-serif;
    text-shadow: 0px 0px 0px #CCCCCC;
    text-transform: uppercase;
  //  text-shadow: 2px 2px 2px #CCCCCC;
    
}
#mynav li a{
    padding:6px 8px;
    cursor:pointer;
}
#mynav li{
    border-bottom: 1px solid #d1d1d1;
}
.nav-stacked > li {
  float: none;
}
.nav-stacked > li + li {
  margin-top: 2px;
  margin-left: 0;
}

.nav {
  padding-left: 0;
  margin-bottom: 0;
  list-style: none;
}
.nav > li {
  position: relative;
  display: block;
}
.nav > li > a {
  position: relative;
  display: block;
  padding: 10px 15px;
}
.nav > li > a:hover,
.nav > li > a:focus {
  text-decoration: none;
  background-color: #eee;
}
.nav > li.disabled > a {
  color: #999;
}
.nav > li.disabled > a:hover,
.nav > li.disabled > a:focus {
  color: #999;
  text-decoration: none;
  cursor: not-allowed;
  background-color: transparent;
}
.nav .open > a,
.nav .open > a:hover,
.nav .open > a:focus {
  background-color: #eee;
  border-color: #428bca;
}
.nav .nav-divider {
  height: 1px;
  margin: 9px 0;
  overflow: hidden;
  background-color: #e5e5e5;
}
.nav > li > a > img {
  max-width: none;
}
.nav-tabs {
  border-bottom: 1px solid #ddd;
}
.nav-tabs > li {
  float: left;
  margin-bottom: -2px;
}
.nav-tabs > li > a {
border-right:1px solid #d1d1d1;
  border-radius: 0px;
   color: white;
   background-color:#222;
   font-family: Helvetica, sans-serif;
    font-size: 12px;
	padding:3px;
}
.nav-tabs > li > a:hover {
  background-color:#EF4446;
}
.nav-tabs > li.active > a,
.nav-tabs > li.active > a:hover,
.nav-tabs > li.active > a:focus {
  color:#EF4446;
  font-weight: bold;
  cursor: default;
  background-color: #fff;
  border: 1px solid #ddd;
  border-bottom-color: transparent;
}
.nav-tabs.nav-justified {
  width: 100%;
  border-bottom: 0;
}
.nav-tabs.nav-justified > li {
  float: none;
}
.nav-tabs.nav-justified > li > a {
  margin-bottom: 5px;
  text-align: center;
}
.nav-tabs.nav-justified > .dropdown .dropdown-menu {
  top: auto;
  left: auto;
}
@media (min-width: 768px) {
  .nav-tabs.nav-justified > li {
    display: table-cell;
    width: 1%;
  }
  .nav-tabs.nav-justified > li > a {
    margin-bottom: 0;
  }
}
.nav-tabs.nav-justified > li > a {
  margin-right: 0;
  border-radius: 4px;
}
.nav-tabs.nav-justified > .active > a,
.nav-tabs.nav-justified > .active > a:hover,
.nav-tabs.nav-justified > .active > a:focus {
  border: 1px solid #ddd;
}
@media (min-width: 768px) {
  .nav-tabs.nav-justified > li > a {
    border-bottom: 1px solid #ddd;
    border-radius: 4px 4px 0 0;
  }
  .nav-tabs.nav-justified > .active > a,
  .nav-tabs.nav-justified > .active > a:hover,
  .nav-tabs.nav-justified > .active > a:focus {
    border-bottom-color: #fff;
  }
}
.nav-pills > li {
  float: left;
}
.nav-pills > li > a {
  border-radius: 4px;
}
.nav-pills > li + li {
  margin-left: 2px;
}
.nav-pills > li.active > a,
.nav-pills > li.active > a:hover,
.nav-pills > li.active > a:focus {
  color: #fff;
  background-color: #428bca;
}
.nav-stacked > li {
  float: none;
}
.nav-stacked > li + li {
  margin-top: 2px;
  margin-left: 0;
}



</style>

<h1 class="myheading" style="text-align:center;">
                       Courses
                    </h1>
                    <div style="border-top:none; border-bottom: none;">
                         <ul id="mynav" class="nav nav-stacked">
                             <li><a href="javacourse.php"><span class="glyphicon glyphicon-paperclip"></span> Java Technology</a></li>
							 <li><a href="netcourse.php"><span class="glyphicon glyphicon-paperclip"></span> Dot net with C#</a></li>
                             <li><a href="phpcourse.php"><span class="glyphicon glyphicon-paperclip"></span> PHP Technology</a></li>
                             <li><a href="androidcourse.php"><span class="glyphicon glyphicon-paperclip"></span> Android Development</a></li>
							 
                             <li><a href="techCloud.php"><span class="glyphicon glyphicon-paperclip"></span> Cloud Computing</a></li>
                            <li><a href="techJquery.php"><span class="glyphicon glyphicon-paperclip"></span> JQuery</a></li>
                            <li><a href="techOracal.php"><span class="glyphicon glyphicon-paperclip"></span> Oracle</a></li>
                            <li><a href="techHibernate.php"><span class="glyphicon glyphicon-paperclip"></span> Hibernate</a></li>
                            <li><a href="techSpring.php"><span class="glyphicon glyphicon-paperclip"></span> Spring</a></li>
                            <li><a href="techStruts.php"><span class="glyphicon glyphicon-paperclip"></span> Struts</a></li>
                            
                        </ul>
                    </div>