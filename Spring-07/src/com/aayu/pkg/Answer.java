package com.aayu.pkg;

import java.util.Date;

public class Answer {
	
	private int id;
	private String answer;
	private Date date;

	public Answer(int id,String answer,Date date)
	{
		this.id=id;
		this.answer=answer;
		this.date=date;
	}
	
	public String toString()
	{
		return "id:"+id+":"+answer+":"+date;
	}
}
