package com.aayu;

class Demo extends Thread
{
	public void run()
	{
		System.out.println("run method");
	}
}
class MyThread
{
	public static void main(String[] args) 
	{
	Demo obj=new Demo();
	obj.start();
	}
}