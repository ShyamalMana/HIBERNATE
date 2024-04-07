package com.shyam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		Student s=new Student();
		s.setSname("shyam");
		et.begin();
		em.persist(s);
		et.commit();
	}

}
