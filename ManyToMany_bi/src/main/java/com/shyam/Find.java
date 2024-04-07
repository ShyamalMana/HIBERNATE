package com.shyam;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("shyam");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student s = em.find(Student.class, 101l);
		if(s!=null)
		{
			System.out.println("==========================================");
			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getSemail());
			List<Subject>sub=s.getSubjects();
			for(Subject s1:sub)
			{
				if(s1!=null)
				{
					System.out.println("=================================================");
					System.out.println(s1.getSubid()+" "+s1.getSubname()+" "+s1.getSubprice());
				}
			}
			
		
		
		}

	}

}
