package hibernate_assignmentfour;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Car c= em.find(Car.class, 101);
		if(c!=null)
		{
			c.setCprice(6000);
			et.begin();
			em.merge(c);
			et.commit();
			System.out.println("Car table data updated..");
			
			Engine e=c.getEngine();
			if(e!=null)
			{
				e.setEcc(600);
				et.begin();
				em.merge(e);
				et.commit();
				System.out.println("Engine table data updated..");
			}
		}
		
	}

}
