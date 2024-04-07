package com.shyam;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save2 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student s2=new Student();
		s2.setSid(102);
		s2.setName("Ruma paul");
		s2.setEmail("rum@gmail.com");
		
		Subject st1=em.find(Subject.class, 1);
		Subject st2=em.find(Subject.class, 2);
		
		Subject st3=new Subject();
		st3.setSubid(7);
		st3.setSubname("python");
		st3.setSubprice(1200);
		
		Subject st4=new Subject();
		st3.setSubid(8);
		st3.setSubname("AI & ML");
		st3.setSubprice(1500);
		
		List<Subject> l=Arrays.asList(st1,st2,st3,st4);
		s2.setSubject(l);
		et.begin();
		em.persist(s2);
		em.persist(st1);
		em.persist(st2);
		em.persist(st3);
		em.persist(st4);
		et.commit();
		System.out.println("Data saved");

		
	}

}
