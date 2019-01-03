package com.aayu.pkg;

public class LoginBean 
{
private String name;
private String pass;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

public boolean validate()
	{
		if(pass.equals("admin"))
		{
			return true;	
		}
		else
		{
			return false;
		}	
	}
}
