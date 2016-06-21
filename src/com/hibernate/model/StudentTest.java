package com.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentTest {
	public static void main(String[] args){
		StudentPK pk=new StudentPK();
		pk.setId(1);
		pk.setName("s1");
		Student s=new Student();
		s.setPk(pk);
		s.setAge(5);
		
		Configuration cfg=new Configuration();
		SessionFactory sf=cfg.configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
	
}
