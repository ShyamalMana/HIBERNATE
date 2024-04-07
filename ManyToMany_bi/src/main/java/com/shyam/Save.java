package com.shyam;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student();
		s1.setSid(101);
		s1.setSname("shyam");
		s1.setSemail("s@gmail.com");
		
		Subject sub1=new Subject();
		sub1.setSubid(1);
		sub1.setSubname("java");
		sub1.setSubprice(5000);
		
		Subject sub2=new Subject();
		sub2.setSubid(2);
		sub2.setSubname("manual");
		sub2.setSubprice(4000);
		
		Subject sub3=new Subject();
		sub3.setSubid(3);
		sub3.setSubname("sql");
		sub3.setSubprice(3500);
		
		List<Subject> list=Arrays.asList(sub1,sub2,sub3);
		s1.setSubjects(list);
		
		et.begin();
		em.persist(s1);
		em.persist(sub1);
		em.persist(sub2);
		em.persist(sub3);
		et.commit();
		System.out.println("data saved");
	}

}
