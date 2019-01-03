package com.akv.pkg;

class Bike{  
	   Bike()
	    {
	  	 System.out.println("bike is created");
	    }  
	   void changeGear()
	   {
	     System.out.println("gear changed");
	   }  
	 }  
	  
	 class Honda extends Bike
	 {  
	 
	 }  
	 class Demo
	 {  
	 public static void main(String args[])
	 {  
	  Bike obj = new Honda();  
	  obj.changeGear();  
	 }  
	}  