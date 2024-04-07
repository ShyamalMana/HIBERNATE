package hibernate_assignmentfour;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Find 
{
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
	EntityManager em=emf.createEntityManager();
	
	Car c=em.find(Car.class, 101);
	if(c!=null)
	{
		System.out.println("car info:-"+c.getCid()+" "+c.getCname()+" "+c.getCprice());
		Engine e=c.getEngine();
		if(e!=null)
		{
			System.out.println("engine info:-"+e.getEid()+" "+e.getEname()+" "+e.getEcc());
		}
		else
		{
			System.out.println("record not found");
		}
	}
	else
	{
		System.out.println("record not found...");
	}
	
	}
}
