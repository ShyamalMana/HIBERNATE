package com.shyam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update 
{
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("shyam");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Review r = em.find(Review.class, 1);
		if (r != null)
		{
			r.setMsg("bad quality");
			Product p = r.getProduct();
			if (p != null) 
			{
				p.setPrice(10000);
			}

			et.begin();
			em.merge(r);
			em.merge(p);
			et.commit();
			System.out.println("data updated...");
		}

	}
	
	
	
	

}
