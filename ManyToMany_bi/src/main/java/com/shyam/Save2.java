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
		s2.setSname("arnab");
		s2.setSemail("a@gmail.com");
		
	Subject	sub1=em.find(Subject.class, 1l);
	Subject	sub2=em.find(Subject.class, 3l);
	
	Subject sub3=new Subject();
	sub3.setSubid(5);
	sub3.setSubname("hibernate");
	sub3.setSubprice(5000);
	
	List<Subject> l=Arrays.asList(sub1,sub2,sub3);
	s2.setSubjects(l);
	
	et.begin();
	em.persist(s2);
	em.persist(sub1);
	em.persist(sub2);
	em.persist(sub3);
	et.commit();
	
	}

}
