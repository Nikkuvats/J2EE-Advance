<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script>

 </script>

<style>
.myheading{
    background-color: #feb04c;
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
</style>

 <h1 class="myheading" style="text-align:center;">Student Details</h1>
 <div style="border-top:none; border-bottom: none;">
   <ul id="mynav" class="nav nav-stacked">
     <li><a href='javascript:void(0)' onclick='loadProfile("${admin.regNo}")'>Student Profile</a></li>
     <li><a href='javascript:void(0)' onclick='loadLeaveDetails("${admin.regNo}")'>Leave/Break</a></li>
     <li><a href='javascript:void(0)' onclick='loadCertificate("${admin.regNo}")'>Certificate</a></li>
     <li><a href='javascript:void(0)' onclick='loadFeeDetails("${admin.regNo}")'>Fee detail</a></li>
     <li><a href='javascript:void(0)' onclick='loadSyllabusDetail("${admin.regNo}")'>Syllabus detail</a></li>
     <li><a href='javascript:void(0)'>Online Test</a></li>
     <li><a href='javascript:void(0)'>Placement Details</a></li>
     <li><a href='javascript:void(0)'>Refer To Friend</a></li>
     <li><a href='javascript:void(0)'>Feedback</a></li>
     <li><a href='javascript:void(0)'>Testimonial</a></li>
   </ul>
 </div>
   
 