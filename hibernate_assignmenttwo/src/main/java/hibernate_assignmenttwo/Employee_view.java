package hibernate_assignmenttwo;

import java.util.Scanner;

public class Employee_view 
{
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Employee_controller ec=new Employee_controller();
		while(true)
		{
			System.out.println("Enter your choice:");
			System.out.println("1:-Save employee");
			System.out.println("2:-Update employee");
			System.out.println("3:-Find employee:-");
			System.out.println("4:-Delete employee:-");
			System.out.println("5:-find all employee:");
			System.out.println("6:-exit");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				Employee e=createEmployeeObject();
				ec.save_employee(e);
				break;
			case 2:
				System.out.println("enter the id:-");
				int id=sc.nextInt();
				System.out.println("enter the email:-");
				sc.nextLine();
				String newEmail=sc.nextLine();
				System.out.println("enter your ammount:-");
				int newSalary=sc.nextInt();
				ec.update_employee(id, newEmail, newSalary);
				break;
			case 3:
					System.out.println("enter the id:-");
					int id2=sc.nextInt();
					Employee ed=ec.find_employee(id2);
					if(ed!=null)
					{
						System.out.println("INFO:-"+ed.getId()+" "+ed.getName()+" "+ed.getEmail()+" "+ed.getAge()+" "+ed.getSalary());
					}
					else
					{
						System.out.println("record not found...");
					}
				break;
			case 4:
					System.out.println("enter the id");
					ec.delete_employee(sc.nextInt());
				break;
			case 5:
				
				 ec.findAll();
				break;
			case 6:
					System.out.println("thank you.....");
				return;

			default:
				System.out.println("invalid choice");
				break;
			}
			
		}
		
	}
	public static Employee createEmployeeObject() 
	{
		Employee e=new Employee();
	System.out.println("enter your id:-");
	e.setId(sc.nextInt());
	System.out.println("enter the name:-");
	sc.nextLine();
	e.setName(sc.nextLine());
	System.out.println("enter the email:-");
	e.setEmail(sc.nextLine());
	System.out.println("enter the age:-");
	e.setAge(sc.nextInt());
	System.out.println("enter the ammount:-");
	e.setSalary(sc.nextInt());
		return e;
	}
}
