package socialmedia;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		
		Userinfo u=new Userinfo();
		u.setUid(101);
		u.setUname("shyam");
		u.setUpassword("shyamal@123");
		u.setUemail("shy@gmail.com");
		
		Socialmedia s=new Socialmedia();
		s.setSid(1);
		s.setSname("facebook");
		s.setLikes("40k");
		s.setFollowers("100M");
		s.setComments(200);
		
		Socialmedia s1=new Socialmedia();
		s1.setSid(2);
		s1.setSname("whatsapp");
		s1.setLikes("20k");
		s1.setFollowers("150M");
		s1.setComments(8000);
		
		List<Socialmedia> l=new ArrayList<Socialmedia>();
		l.add(s);
		l.add(s1);
		
		u.setL(l);
		
		
		et.begin();
		em.persist(u);
		em.persist(s);
		em.persist(s1);
		et.commit();
		System.out.println("Data saved...");
	}

}
