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
        Configuration con=new Configuration().configure();
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	
    	Transaction tx= session.beginTransaction();
    	
    	Student s= new Student();
    	s.setSname("Rushii");
    	s.setScity("Pune");
    	s.setSpercentage(78.33);
    	
    	session.save(s);
    	
    	tx.commit();
    	session.close();
    	
    	
    	
    }
}
