package bank_management_system;

import java.util.Arrays;
import java.util.List;

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
		
		Bank b= new Bank();
		b.setBid(101);
		b.setBname("SBI");
		b.setBifsc("SBI00004000");  
		
		Accounts a1=new Accounts();
		a1.setAcid(1);
		a1.setAcname("shyam");
		a1.setAcstatus("current");
		
		a1.setBank(b);
		
		Accounts a2=new Accounts();
		a2.setAcid(2);
		a2.setAcname("arnab");
		a2.setAcstatus("saving");
		a2.setBank(b);
		
		Accounts a3=new Accounts();
		a3.setAcid(3);
		a3.setAcname("rajat");
		a3.setAcstatus("saving");
		a3.setBank(b);
		
		List<Accounts> l=Arrays.asList(a1,a2,a3);
		b.setList(l);
		
		et.begin();
		em.persist(b);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		et.commit();
		System.out.println("Data saved...");
		
	}

}
