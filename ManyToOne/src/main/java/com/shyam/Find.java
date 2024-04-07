package com.shyam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

public class Find 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em= emf.createEntityManager();
		
		Review	r=em.find(Review.class, 1);
		if(r!=null)
		{
			System.out.println("==========================================");
			System.out.println(r.getId()+" "+r.getMsg());
			System.out.println("==========================================");
			Product	p=r.getProduct();
			if(p!=null)
			{
				System.out.println("==========================================");
				System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
				System.out.println("==========================================");
			}
			else
			{
				System.out.println("record not found");
			}
		
		}
		
	}

}
