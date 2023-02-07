package com.prac1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		//step 1 - configuration object + configuration file
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		//step 2 - build session factory from configuration object
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		//step 3 - open session from sessionFactory object
		Session session = sessionFactory.openSession();
		
		//step 4 - begin transaction from session object
		Transaction transaction = session.beginTransaction();
		
		//step 5 - create pojo and initialize
		Student student = new Student();
		student.setFirstName("Kalpana");
		student.setLastName("Ghorpade");
		
		//step 6 - save the session + commit transaction + close the session
		session.save(student);
		transaction.commit();
		session.close();
		System.out.println("Records added...");
	}

}
