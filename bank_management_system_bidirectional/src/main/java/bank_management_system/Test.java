package bank_management_system;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test 
{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em=emf.createEntityManager();
		System.out.println(emf);
		
	}

}
