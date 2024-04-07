package socialmedia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Update 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
		EntityManager em=emf.createEntityManager();
		
		Userinfo u=em.find(Userinfo.class, 101);
		if(u!=null)
		{
			u.setUemail("smana8084@gmail.com");
			System.out.println("data updated...");
			List<Socialmedia> s=u.getL();
			if(s!=null)
			{
//				s.set(0, null)
			}
		}
		
	}

}
