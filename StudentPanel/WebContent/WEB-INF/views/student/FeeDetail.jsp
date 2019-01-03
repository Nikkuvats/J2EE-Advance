<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
</script>
<style>
.hd
{
  margin-top:15px;
  background:#fff;
}
.be
{
  height:20px;
  background:#f4f4f4;
}
.mt
{
  height:200px;
  background:#fff;
}
</style>
<div class='col-xs-36 hd'></div>
<div class='col-xs-36 be'>
  <div class='col-xs-9'>Technology</div>
  <div class='col-xs-9'>Package Type</div>
  <div class='col-xs-9'>Course Type</div>
  <div class='col-xs-9'>Fee Calculate</div>
</div>
<div class='col-xs-36 mt'>
  <div class='col-xs-9'>Core java</div>
  <div class='col-xs-9'>PK</div>
  <c:forEach var="cname" items="${courselist}">
    <div class='col-xs-9'>${cname.course.courseName}</div>
  </c:forEach>
  <div class='col-xs-9'>3000</div>
</div>
<div class='col-xs-36 be'>
  <div class='col-xs-9'>Fee Calculator</div>
</div>
<div class='col-xs-36 mt'>
  <div class='col-xs-36'>Total Fee</div>
  <div class='col-xs-36'>Service Tax</div>
  <div class='col-xs-36'>Mgt Disc</div>
  <div class='col-xs-36'>Total Amount</div>
</div>