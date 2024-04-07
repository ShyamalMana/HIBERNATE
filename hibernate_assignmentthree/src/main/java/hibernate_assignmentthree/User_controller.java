package hibernate_assignmentthree;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class User_controller 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void save_user(User u)
	{
		et.begin();
		em.persist(u);
		et.commit();
		System.out.println("Data saved...");
	}
	public User find_user(int id)
	{
		return em.find(User.class, id);
	}
	
	public boolean update_user(int id,String password)
	{
		User u=em.find(User.class, id);
		if(u!=null)
		{
			u.setPassword(password);
			et.begin();
			em.merge(u);
			et.commit();
			System.out.println("Data updated...");
			return true;
		}
		return false;
	}
	
	public void delete_user(int id)
	{
		User u=em.find(User.class, id);
		if(u!=null)
		{
			et.begin();
			em.remove(u);
			et.commit();
			System.out.println("Data removed...");
		}
	}
	public void findAll_user()
	{
	 	Query q=em.createQuery("select u from User u");
	 List<User>	l=q.getResultList();
	 for(User u:l)
	 {
		 System.out.println(u.getId()+" "+u.getName()+" "+u.getGender()+" "+u.getBalance()+" "+u.getPassword());
	 }
	}
	public void findByName()
	{
	Query	q=em.createQuery("select u from User u where name=?");
		
		User u=(User) q.getResultList();
		System.out.println(u.getId()+" "+u.getName()+" "+u.getGender()+" "+u.getBalance()+" "+u.getPassword());
	}
	public void findBy()
	{
		
	}
	

}
