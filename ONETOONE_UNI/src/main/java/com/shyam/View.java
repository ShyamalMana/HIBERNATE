package com.shyam;

import java.util.Scanner;

public class View 
{
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Controller c=new Controller();
		while(true)
		{
			System.out.println("Enter your choice:");
			System.out.println("1.save car and engine-:");
			System.out.println("2.update car and engine:");
			System.out.println("3.delete car and engine:");
			System.out.println("4.find car and engine");
			System.out.println("5.thank you");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				Car c1=createcarobject();
				Engine e=createengineobject();
				c1.setEngine(e);
				c.save(c1, e);
				System.out.println("Data saved");

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;

			default:
				break;
			}
			
		}
		
	}
	public static Engine createengineobject() 
	{
		Engine e=new Engine();
		System.out.println("Enter engine id");
		long id=sc.nextLong();
		System.out.println("Enter engine name:");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter engine price:");
		long price=sc.nextLong();
				return e;
	}
	public static Car createcarobject()
	{
		Car c=new Car();
		System.out.println("Enter the car id:");
		long id=sc.nextLong();
		System.out.println("Enter car name:");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter the car price: ");
		long price=sc.nextLong();
		
		return c;
		
	}

}
