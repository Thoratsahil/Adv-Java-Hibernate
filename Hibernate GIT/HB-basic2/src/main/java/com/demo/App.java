package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con= new Configuration().configure();  
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
        Employee e=new Employee();
        
        e.setEname("Lolak");
        e.setEdesignation("Supply Chain devloper");
        e.setEcompany("Flex");
        e.setEsalary(50000);
        
        session.save(e);
        
        tx.commit();
        
        session.close();  
        
        
    }   
}
