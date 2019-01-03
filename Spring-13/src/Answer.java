import java.util.Date;


public class Answer {
	
	private int id;
	private String answer;
	private Date date;
	
	public Answer(int id,String answer,Date date)
	{
		id=id;
		answer=answer;
		date=date;
	}
	
	public String toString()
	{
		return "id:"+id+"answer:"+answer+"date"+date;
	}
}
