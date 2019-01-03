package com.aayu.pkg;

public class Student {
	private String name; 
	private String college;
	  
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getName() {  
	    return name;  
	}  
	  
	public void setName(String name) {  
	    this.name = name;  
	}  
	  
	public void displayInfo(){  
	    System.out.println("Hello: "+name); 
	    System.out.println("college:"+college);
	}  
}
