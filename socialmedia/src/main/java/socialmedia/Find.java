package socialmedia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Find 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em=emf.createEntityManager();

		
		Userinfo u=em.find(Userinfo.class, 101);
		if(u!=null)
		{
			System.out.println("===========================================");
			System.out.println("userinformation---"+u.getUid()+" "+u.getUname()+" "+u.getUemail()+" "+u.getUpassword());
			List<Socialmedia> l=u.getL();
			
			for(Socialmedia s:l)
			{
				System.out.println("=================================");
				System.out.println(s.getSid());
				System.out.println(s.getSname());
				System.out.println(s.getLikes());
				System.out.println(s.getFollowers());
				System.out.println(s.getComments());
			
			}
		
			
		}
		else
		{
			System.out.println("record not found");
		}

		
	}
}
