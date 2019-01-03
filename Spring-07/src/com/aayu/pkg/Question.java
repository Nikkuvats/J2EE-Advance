package com.aayu.pkg;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int id;
	private String question;
	private Map<Answer,User> answers;
	
	public Question(int id,String question,Map<Answer,User> answers)
	{
		this.id=id;
		this.question=question;
		this.answers=answers;
	}
	
	public void displayInfo()
	{
	System.out.println(id+":"+question);
	System.out.println("Answers are....");
	
	 Set<Entry<Answer, User>> set=answers.entrySet();  
	    Iterator<Entry<Answer, User>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<Answer, User> entry=itr.next();  
	        Answer ans=entry.getKey();  
	        User user=entry.getValue();  
	        System.out.println("Answer Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	    }  
	}
}
