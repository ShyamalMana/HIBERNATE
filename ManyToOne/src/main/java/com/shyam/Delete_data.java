package com.shyam;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete_data 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("shyam");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query q=em.createQuery("select r from Review r where Product_id=1");
		List<Review> l=q.getResultList();
		
		for(Review r:l)
		{
			r.setProduct(null);
		}
		
		Product p = em.find(Product.class, 1);
		if(p!=null)
		{
			et.begin();
			em.remove(p);
			et.commit();
		}
		
		
	}

}
