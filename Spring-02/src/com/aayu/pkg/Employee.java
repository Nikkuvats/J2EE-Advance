package com.aayu.pkg;

public class Employee {

	private int id;
	private String name;
	
	public Employee()
	{
	System.out.println("def cons");	
	}
	public Employee(int id,String name)
	{
	this.name=name;	
	this.id=id;
	}
	void show()
	{
	System.out.println(id+":"+name);	
	}
}
