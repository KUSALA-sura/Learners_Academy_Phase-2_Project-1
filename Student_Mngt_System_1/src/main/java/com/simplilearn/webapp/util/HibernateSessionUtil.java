package com.simplilearn.webapp.util;

import org.hibernate.SessionFactory;




import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.simplilearn.webapp.model.Classes;
import com.simplilearn.webapp.model.Student;
import com.simplilearn.webapp.model.Subjects;
import com.simplilearn.webapp.model.Teacher;

public class HibernateSessionUtil {

	private static SessionFactory factory;
	
	public static SessionFactory buildSessionFactory() {		
		// load configuration
		factory = new Configuration().configure("hibernate.cfg.xml")
				//add mapping
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Teacher.class)
				.addAnnotatedClass(Classes.class)
			.addAnnotatedClass(Subjects.class)
				
				.buildSessionFactory();
		
		return factory;
	}
}