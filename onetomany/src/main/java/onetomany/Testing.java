package onetomany;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;

public class Testing 
{
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("shyam");
	System.out.println(emf);

}
}
