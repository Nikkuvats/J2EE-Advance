<%! int day=3; %>
<% 
	switch(day)
	{
	case 0:
	out.println("sunday");
	break;
	
	case 1:
	out.println("monday");
	break;
	
	case 2:
	out.println("tuesday");
	break;
	
	case 3:
	out.println("wednesday");	
	break;
	
	case 4:
	out.println("thrusday");	
	break;
		
	case 5:
	out.println("friday");	
	break;
	
	case 6:
	out.println("saturday");	
	break;
	}
%>