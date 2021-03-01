package com.tech.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession  {
	
	public  Session register()
	{    
	    		  
		SessionFactory factory = new Configuration().configure("hibernate-cfg.xml").buildSessionFactory();
			    
		Session session = factory.openSession(); 
		
		return session; 
    }
	
	

}
