 package hibernate_assignmentfour;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_engine_object 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car c=em.find(Car.class, 101);
		if(c!=null)
		{
			
			Engine e=c.getEngine();
			
			c.setEngine(null);
			if(e!=null)
			{
				
				et.begin(); 
				em.remove(e);
				et.commit();
				System.out.println("data deleted...");
			}
			
		}
	}

}
