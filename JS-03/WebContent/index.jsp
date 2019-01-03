<script>
function emp(id,name,salary)
{
this.id=id;
this.name=name;
this.salary=salary;

this.changeSalary=changeSalary;
function changeSalary(othersalary)
	{
	this.salary=othersalary;
	}
}	
e=new emp(103,"Aayush",20000);
document.write(""+e.id+","+e.name+","+e.salary);

e.changeSalary(50000);
document.write("<br>"+e.id+""+e.name+""+e.salary);
</script>