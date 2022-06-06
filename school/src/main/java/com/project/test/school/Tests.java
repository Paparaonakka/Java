package com.project.test.school;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tests {

	public static void main(String[] args) {
		
	 Student s1 = new Student();
	 
	 
	 s1.setStudentRollno(1);
	 s1.setStudentName("Paparao");
	 s1.setEmail("paparao@gmail.com");
	 s1.setAge(21);
	 
	 
	 Configuration configuration =new Configuration();
	 configuration.configure();
	 configuration.addAnnotatedClass(Student.class);
	 
	 SessionFactory sessionFactory = configuration.buildSessionFactory();
	 
	 Session session = sessionFactory.openSession();
	 
	 session.beginTransaction();
	 session.save(s1);
	 session.getTransaction().commit();
	 session.close();
	 
	 
		

	}

}
