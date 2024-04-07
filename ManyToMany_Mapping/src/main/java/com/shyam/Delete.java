package com.shyam;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Query q=em.createQuery("select s from Student s");
		
		List<Student> l=q.getResultList();
		
		for(Student s:l)
		{
			
			List<Subject> sub=s.getSubject();
			Iterator<Subject> i=sub.iterator();
			while(i.hasNext())
			{
				Subject s1=i.next();
				if(s1.getSubid()==8)
				{
					i.remove();
				}
			}
			s.setSubject(sub);
			et.begin();
			em.merge(s);
			et.commit();
		}
		Subject s=em.find(Subject.class, 8);
		if(s!=null)
		{
			et.begin();
			em.remove(s);
			et.commit();
			System.out.println("Data deleted...");
		}
	}
	
}
