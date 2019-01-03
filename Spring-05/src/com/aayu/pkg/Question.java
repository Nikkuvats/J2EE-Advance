package com.aayu.pkg;
import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String question;
	private List<Answer> answer;
	
	public Question(int id,String name,List<Answer> answer)
	{
	this.id=id;
	this.question=name;
	this.answer=answer;
	}
	
	public void displayInfo()
	{
		System.out.println(id+":"+question);
		System.out.println("Answers are:");
		
		Iterator<Answer> iterator=answer.iterator();
		while(iterator.hasNext()) 
			{
			System.out.println(iterator.next());
		    }
	}
}
