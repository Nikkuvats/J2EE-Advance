package com.ms.master.business;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;


public class Genreator {

	private static GregorianCalendar gc=null;
	private static Random rd=null;
	private static DecimalFormat df=null;
	
	static{
		rd=new Random();
		df=new DecimalFormat("00");
		gc=new GregorianCalendar();
	}
	
	private Genreator(){}
	
	public static String getCurrentDateInStr(){
		GregorianCalendar gc = new GregorianCalendar();
    	Date date= new Date(gc.getTime().getTime());
    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	return dateFormat.format(date);
	}
	public static int calculateDays(Date date1, Date date2){
		Calendar cal1= Calendar.getInstance();
		Calendar cal2= Calendar.getInstance();
		
		cal1.setTime(date1);
		cal2.setTime(date2);
		
		long miliSecond1 = cal1.getTimeInMillis();
		long miliSecond2 = cal2.getTimeInMillis();
		
		long diffMiliSecond = miliSecond2 - miliSecond1;
		
		long diffInDay = diffMiliSecond / (24*60*60*1000);
		return (int) diffInDay;
	}
	public static Date addDays(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return (cal.getTime());
    }
	public static String genreateActionTrId(){
		return getCurrentDateTime()+rd.nextInt(100000);
	}
	
	public static String genreateFileId(){
		return getCurrentDateTime()+rd.nextInt(100000);
	}
	
	/*public static String genreateDateTime(){
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sd.format(new Date());
	}
	
	public static String genreateDate(){
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		return sd.format(new Date());
	}
	
	public static String genreateTime(){
		SimpleDateFormat sd=new SimpleDateFormat("HH:mm:a");
		return sd.format(new Date());
	}*/
	
	public static String genreateFirtDateOfMonth(){
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		java.util.Calendar c= Calendar.getInstance();   // this takes current date
	    c.set(Calendar.DAY_OF_MONTH, 1);
		return sd.format(c.getTime());
	}
	
	public static String genreateStudentId(int StudentRegNo, String branchCode, String fname, String lname){
		int year=gc.get(GregorianCalendar.YEAR)%100;
		//fname=fname.trim();
		/*char c1=fname.charAt(0);
		char c2=' ';
		if(lname==null||lname.trim().equals("")){
			c2=fname.charAt(1);
		}else{
			c2=lname.trim().charAt(0);
		}*/
		String stdId = branchCode+year+String.format("%04d", StudentRegNo);
		return stdId.toUpperCase();
	}
	
	public static String getCurrentDateTime(){
		int year=gc.get(GregorianCalendar.YEAR);
		String month=df.format(gc.get(GregorianCalendar.MONTH));
		String date=df.format(gc.get(GregorianCalendar.DATE));
		String hours=df.format(gc.get(GregorianCalendar.HOUR));
		String mins=df.format(gc.get(GregorianCalendar.MINUTE));
		String secs=df.format(gc.get(GregorianCalendar.SECOND));
		String milisec=df.format(gc.get(GregorianCalendar.MILLISECOND));
		return year+month+date+hours+mins+secs+milisec;
	}
	
}
