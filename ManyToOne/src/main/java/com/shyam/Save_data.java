package com.shyam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save_data
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		// save data
		
		Product p=new Product();
		p.setId(1);
		p.setName("bat");
		p.setPrice(5000);
		
		Review r1=new Review();
		r1.setId(1);
		r1.setMsg("good quality");
		r1.setProduct(p);
		
		Review r2=new Review();
		r2.setId(2);
		r2.setMsg("average");
		r2.setProduct(p);
		
		Review r3=new Review();
		r3.setId(3);
		r3.setMsg("extra_ordinary");
		r3.setProduct(p);
		
		
		et.begin();
		em.persist(p);
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		et.commit();
		System.out.println("data saved...");
		
		
	}

}
