package com.av.pkg;

import javax.mail.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData 
{
	public static void main(String[] args) 
	{
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		org.hibernate.classic.Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setId(15);
		e1.setFname("Aayush");
		e1.setLName("vats");
		
		session.persist(e1);
		t.commit();
		session.close();
		System.out.println("successfully saved");
	}
}
