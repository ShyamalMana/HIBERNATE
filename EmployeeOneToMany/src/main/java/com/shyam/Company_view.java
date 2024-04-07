package com.shyam;

import java.util.List;
import java.util.Scanner;

public class Company_view 
{
	public Company entercompanyinfo(Scanner sc)
	{
		System.out.println("Enter company id:");
		long id=sc.nextLong();
		System.out.println("Enter company name:");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter company address:");
		String add=sc.nextLine();
		
		Company c=new Company();
		c.setCid(id);
		c.setCname(name);
		c.setCaddress(add);
		return c;
		
	}
	
	public Employee enterEmployeeInfo(Scanner sc)
	{
		System.out.println("Enter emp id:");
		long id=sc.nextLong();
		System.out.println("Enter emp name:");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter emp shift:");
		String shift=sc.nextLine();
		System.out.println("Enter emp salary:");
		long sal=sc.nextLong();
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setShift(shift);
		e.setSalary(sal);
		return e;
		
	}
	
	public void displayCompanyInfo(Company c)
	{
		System.out.println("=======================COUNTRY INFORMATION===========================");
		System.out.println("country id:"+c.getCid());
		System.out.println("country name:"+c.getCname());
		System.out.println("country code:"+c.getCaddress());
	
		System.out.println("=====================================================================");
		List<Employee> listOfEmployee=c.getList();
		for(Employee e:listOfEmployee)
		{
			System.out.println("====================STATE INFORMATION=============================");
			System.out.println("State id:"+e.getId());
			System.out.println("State name:"+e.getName());
			System.out.println("State code:"+e.getShift());
			System.out.println("State language:"+e.getSalary());
			System.out.println("===================================================================");
		}
	}
	
	
	public static void main(String[] args) 
	{
		Company_controller cc=new Company_controller();
		Company_view cv=new Company_view();
		Scanner sc =new Scanner(System.in);
		
		
		
	}
	

}
