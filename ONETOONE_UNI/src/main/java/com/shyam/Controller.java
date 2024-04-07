package com.shyam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	

	public void save(Car c,Engine e) 
	{
		et.begin();
		em.persist(c);
		em.persist(e);
		et.commit();
	
		
	}

}
