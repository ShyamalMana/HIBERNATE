package com.shyam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		Student s=em.find(Student.class, 2);
		if(s!=null)
		{
			et.begin();
			em.remove(s);
			et.commit();
		}
	}

}
