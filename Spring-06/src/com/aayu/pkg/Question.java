package com.aayu.pkg;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String question;
	private Map<String,String> answers;
	
	public Question(int id,String question,Map<String,String>answers)
	{
		this.id=id;
		this.question=question;
		this.answers=answers;
	}
	
	public void displayInfo()
	{
	System.out.println("Question id:"+id);
	System.out.println("Question name:"+question);
	System.out.println("Answers...");
	
	 Set<Entry<String, String>> set=answers.entrySet();  
	    Iterator<Entry<String, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<String,String> entry=itr.next();  
	        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
	    }  
	}
}
