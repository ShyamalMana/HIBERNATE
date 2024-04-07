package hibernate_assignmentone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Student_controller 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void save_students(Student s)
	{
		et.begin();
		em.persist(s);
		et.commit();
		System.out.println("data inserted..");
	}
	
	public Student find_students(int id)
	{
		return em.find(Student.class, id);
	}
	public boolean update_student(int id,String email,String gender)
	{
		Student s=em.find(Student.class, id);
		if(s!=null)
		{
			s.setEmail(email);
			s.setGender(gender);
			et.begin();
			em.merge(s);
			et.commit();
			System.out.println("data updated.");
			return true;
		}
		return false;
	}
	public void delete_students(int id)
	{
		Student s=em.find(Student.class, id);
		if(s!=null)
		{
			et.begin();
			em.remove(s);
			et.commit();
			System.out.println("data removed..");
		}
	}


}
