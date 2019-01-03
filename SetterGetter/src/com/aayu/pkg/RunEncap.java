package com.aayu.pkg;

public class RunEncap 
{
	public static void main(String[] args) {
	
		EncapTest obj=new EncapTest();
		obj.setName("Aayush");
		obj.setPass("devesh33");
		obj.setEmail("deveshvatsa@gmail.com");
		
		System.out.println("Name : "+obj.getName()+ "\npassword : "+obj.getPass()+"\nEmail : "+obj.getEmail());
	}
}
