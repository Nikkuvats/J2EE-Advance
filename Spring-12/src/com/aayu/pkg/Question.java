package com.aayu.pkg;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int id;
	private String question;
	private Map<String,String> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}  
	
	public void displayInfo()
	{
		System.out.println("question id:"+id);
		System.out.println("question:"+question);
		System.out.println("answers....");
		
		Set<Entry<String,String>> set=answers.entrySet();
		Iterator<Entry<String, String>> itr=set.iterator();
		while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	}
}
