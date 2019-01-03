package com.aayu.pkg;

public class A {
	
	B b;
	
	A()
	{
	System.out.println("A is created");	
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	void print()
	{
	System.out.println("hello A");	
	}
	
	void display()
	{
	print();
	b.print();
	}
}
