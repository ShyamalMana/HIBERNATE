package hibernate_assignmentone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAll 
{
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select s from Student s");
		List<Student> l=q.getResultList();
		for(Student s:l)
		{
			System.out.println(s.getId()+" "+s.getName()+" "+s.getEmail()+" "+s.getGender()+" "+s.getAge());
		}
	}

}
