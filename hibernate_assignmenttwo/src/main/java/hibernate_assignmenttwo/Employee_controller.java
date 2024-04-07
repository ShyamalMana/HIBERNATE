package hibernate_assignmenttwo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Employee_controller 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void save_employee(Employee e)
	{
		et.begin();
		em.persist(e);
		et.commit();
		System.out.println("data inserted...");
	}
	public Employee find_employee(int id)
	{
		return em.find(Employee.class, id);
	}
	public boolean update_employee(int id,String email,int salary)
	{
		Employee e=em.find(Employee.class, id);
		if(e!=null)
		{
			e.setEmail(email);
			e.setSalary(salary);
			et.begin();
			em.merge(e);
			et.commit();
			System.out.println("data updated...");
			return true;
		}
		return false;
	}
	public void delete_employee(int id)
	{
		Employee e=em.find(Employee.class, id);
		if(e!=null)
		{
			et.begin();
			em.remove(e);
			et.commit();
			System.out.println("data removed...");
		}
		else
		{
			System.out.println("data not found...");
		}
		
	}
	public void findAll()
	{
		Query q=em.createQuery("select e from Employee e");
	List<Employee>	l=q.getResultList();
	System.out.println("INFO:-");
	for(Employee e:l)
	{
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getEmail()+" "+e.getAge()+" "+e.getSalary());
	}
	
	}

}
