package com.project.test.java;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Song s1 = new Song();
		
		s1.setSongId(122);
		s1.setSongName("rab ne");
		s1.setSinger("venkat");
		
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Song.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(s1);
		session.getTransaction().commit();
		session.close();
		
		

	}

}
