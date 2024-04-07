package com.shyam;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("shyam");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student	s=em.find(Student.class, 101l);
		if(s!=null)
		{
			s.setSemail("shyam@gmail.com");
		List<Subject>	sub=s.getSubjects();
		 for(Subject s1:sub)
		 {
			 if(s1.getSubid()==2)
			 {
				s1.setSubprice(3000);
				et.begin();
				em.merge(s1);
				et.commit();
				
			 }
		 }
		
		}
		System.out.println("Data updated");
	}

}
