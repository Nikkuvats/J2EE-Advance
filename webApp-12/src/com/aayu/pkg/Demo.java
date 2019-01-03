package com.aayu.pkg;

 class Test 
{
	  void show()
	{
		System.out.println("show");
	}
}
	class Temp extends Test
	{
		void show(){
			System.out.println("aaaaaaaaaaa");
		}
	 void show(int i)
	{
		System.out.println("int argo show");
		
	}
	}
	public class Demo{
	public static void main(String[] args) {
		
	Temp d=new Temp();
	d.show('a');
	}

}
