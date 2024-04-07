package hibernate_assignmentfour;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car c=new Car();
		c.setCid(102);
		c.setCname("honda");
		c.setCprice(2500);
		
		
		Engine e=new Engine();
		e.setEid(1);
		e.setEname("adani");
		e.setEcc(300);
		
		c.setEngine(e);
		
		et.begin();
		em.persist(c);
		em.persist(e);
		et.commit();
		
		System.out.println("data saved....");
		
	}

}
