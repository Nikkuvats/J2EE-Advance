package com.aayu.pkg;

public class A {

	private static final A obj=new A();
	private A()
	{
	System.out.println("private constructor");	
	}
	
	public static  A getA()
	{
	System.out.println("factory Method");
	return obj;	
	}
	public void msg()
	{
	System.out.println("hello user");	
	}
}
