package hibernate_assignmentone;

import java.util.Scanner;

public class Student_view 
{
private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Student_controller st=new Student_controller();
		while(true)
		{
			System.out.println("enter your choice:");
			System.out.println("1.save Students:");
			System.out.println("2.update students:");
			System.out.println("3.find student by id:");
			System.out.println("4.delete student by id:");
			System.out.println("5.exit:");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				Student s=createStudentObject();
				st.save_students(s);
				break;
			case 2:
				System.out.println("enter the id:");
				int id=sc.nextInt();
				System.out.println("enter new email:");
				sc.nextLine();
				String newEmail=sc.nextLine();
				System.out.println("enter the gender:");
				String newGender=sc.nextLine();
				st.update_student(id, newEmail,newGender);
				break;
			case 3:
				System.out.println("enter the id:");
			Student	sr=st.find_students(sc.nextInt());
			if(sr!=null)
			{
				System.out.println(sr.getId()+" "+sr.getName()+" "+sr.getEmail()+" "+sr.getGender()+" "+sr.getAge());
			}
			else
			{
				System.out.println("record not found..");
			}
				break;
			case 4:
				System.out.println("enter the id:");
				st.delete_students(sc.nextInt());
				break;
			case 5:
				System.out.println("thank you....");
				return;

			default:
				System.out.println("invalid choice....");
				break;
			}
		}
	}

	public static Student createStudentObject() {
		Student s=new Student();
		System.out.println("enter the id:");
		s.setId(sc.nextInt());
		System.out.println("enter the name:");
		sc.nextLine();
		s.setName(sc.nextLine());
		System.out.println("enter the email:");
		s.setEmail(sc.nextLine());
		System.out.println("enter the gender:");
		s.setGender(sc.nextLine());
		System.out.println("enter the age:");
		s.setAge(sc.nextInt());
		return s;
	}

}
