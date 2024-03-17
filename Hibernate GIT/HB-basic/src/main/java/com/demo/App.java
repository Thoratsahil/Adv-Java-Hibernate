package com.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;
	
public class App 
{
    public static void main( String[] args )
    {
        Configuration con=new Configuration().configure(); //to load cfg class
    	SessionFactory sf=con.buildSessionFactory(); //build connection
    	Session session=sf.openSession(); //foe our object
    	
    	Transaction tx= session.beginTransaction();
    	
    	Student s= new Student();
    	s.setSname("Rushii"); //set data
    	s.setScity("Pune");
    	s.setSpercentage(78.33);
    	
    	session.save(s);
    	
    	tx.commit(); //tx for save data in db

		//Student ss= session.get(Student.class,2);  //for fetching student from database
    	//System.out.println(ss);

    	session.close();
    	
    	
    	
    }
}
