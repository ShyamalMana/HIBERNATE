package com.shyam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Company_controller 
{
	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
	private EntityManager em= emf.createEntityManager();
    private	EntityTransaction et=em.getTransaction();
    private static Scanner sc=new Scanner(System.in);
    Company_view cv=new Company_view();
	public void saveCompany()
	{
		Company c=cv.entercompanyinfo(sc);
		Employee e1=cv.enterEmployeeInfo(sc);
		Employee e2=cv.enterEmployeeInfo(sc);
		Employee e3=cv.enterEmployeeInfo(sc);
		List<Employee> l=new ArrayList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		c.setList(l);
		et.begin();
		em.persist(c);
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		et.commit();
		System.out.println("Data saved---");
		
	}
	
	public Company find(long id)
	{
	Company	c=em.find(Company.class, id);
	if(c!=null)
	{
		return c;
	}
		return null;
		
	}
	
	public void update(long cid,long eid,long newsal,String newcaddress)
	{
	Company	c=em.find(Company.class, cid);
	if(c!=null)
	{
		c.setCaddress(newcaddress);
		
		List<Employee>l=c.getList();
		for(Employee e:l)
		{
			if(e.getId()==eid)
			{
				e.setSalary(newsal);
				et.begin();
				em.merge(e);
				et.commit();
			}
		}
	}
	}

}
