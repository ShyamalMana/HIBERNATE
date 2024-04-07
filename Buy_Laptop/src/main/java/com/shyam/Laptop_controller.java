package com.shyam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Laptop_controller 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	// insert operation
	
	public void Save_laptop(Laptop l)
	{
		et.begin();
		em.persist(l);
		et.commit();
		System.out.println("Data saved...");
	}
	public void Save_ssd(Ssd s)
	{
		et.begin();
		em.persist(s);
		et.commit();
		System.out.println("Data saved...");
	}
	
	
	// find operation
	
	
	
	public Laptop find_laptop(int lid)
	{
		return em.find(Laptop.class, lid);
		
	
	}
	public Ssd find_ssd(int sid)
	{
		return em.find(Ssd.class, sid);
		
	
	}
	
	//update operation
	
	
	public boolean update_laptop(int id,int price,String color)
	{
	Laptop	l=em.find(Laptop.class, id);
	if(l!=null)
	{
		l.setLcolor(color);
		l.setLprice(price);
		et.commit();
		em.merge(l);
		et.commit();
		System.out.println("data updated");
		return true;
	}
	return false;
		
	}
	
	public boolean update_ssd(int id,String memory)
	{
	Ssd	s=em.find(Ssd.class, id);
	if(s!=null)
	{
		s.setSmemory(memory);
		et.commit();
		em.merge(s);
		et.commit();
		System.out.println("data updated");
		return true;
	}
	return false;
		
	}
	
	
	//Delete operation
	
	public void delete_laptop(int id)
	{
		Laptop l=em.find(Laptop.class, id);
		if(l!=null)
		{
			et.begin();
			em.remove(l);
			et.commit();
			System.out.println("Data removed..");
		}
	}
	
	public void delete_ssd(int id)
	{
		Ssd s=em.find(Ssd.class, id);
		if(s!=null)
		{
			et.begin();
			em.remove(s);
			et.commit();
			System.out.println("Data removed..");
		}
	}

}
