package com.shyam;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("shyam");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student	s=em.find(Student.class, 102l);
		
		if(s!=null)
		{
//			et.begin();
//			em.remove(s);
//			et.commit();
			List<Subject>l=	s.getSubjects();
			Iterator<Subject> i=l.iterator();
			while(i.hasNext())
			{
				Subject s1=i.next();
				if(s1.getSubid()==5)
				{	
					
					i.remove();
					et.begin();
					em.remove(s1);
					et.commit();
				}
			}
			s.setSubjects(l);
					
				}
			
		System.out.println("Data deleted");
		
	}

}