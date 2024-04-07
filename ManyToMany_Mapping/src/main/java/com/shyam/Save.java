package com.shyam;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student();
		s1.setSid(101);
		s1.setName("Rahul");
		s1.setEmail("rahul@gmail.com");
		s1.setSubject(null);
		
		
		
		Student s3=new Student();
		s3.setSid(103);
		s3.setName("Ohid");
		s3.setEmail("ohi@gmail.com");
		
		Subject st1=new Subject();
		st1.setSubid(1);
		st1.setSubname("JAVA");
		st1.setSubprice(500);
		
		Subject st2=new Subject();
		st2.setSubid(2);
		st2.setSubname("SQL");
		st2.setSubprice(400);
		
		Subject st3=new Subject();
		st3.setSubid(3);
		st3.setSubname("MANUAL");
		st3.setSubprice(300);
		
		Subject st4=new Subject();
		st4.setSubid(4);
		st4.setSubname("ADV JAVA");
		st4.setSubprice(1000);
		
		Subject st5=new Subject();
		st5.setSubid(5);
		st5.setSubname("SDLC");
		st5.setSubprice(600);
		
		Subject st6=new Subject();
		st6.setSubid(6);
		st6.setSubname("WEB TECH");
		st6.setSubprice(800);
		
		
		List<Subject>listofobject =Arrays.asList(st1,st2,st3,st4,st6);
		s1.setSubject(listofobject);
		
		
		et.begin();
		em.persist(s1);
		em.persist(st1);
		em.persist(st2);
		em.persist(st3);
		em.persist(st4);
		em.persist(st6);
		et.commit();
		System.out.println("Data saved");

		
		
		


		
		
	}

}
