package hibernate_assignmentthree;

import java.util.Scanner;

public class User_view 
{
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		User_controller uc=new User_controller();
		while(true)
		{
			System.out.println("Enter your choice:");
			System.out.println("1.save user:");
			System.out.println("2.update user:");
			System.out.println("3.delete user:");
			System.out.println("4.find user");
			System.out.println("5.thank you");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				User u=createUser_info();
				uc.save_user(u);
				break;
			case 2:
					System.out.println("enter the id:");
					int id=sc.nextInt();
					System.out.println("enter the password:");
					String newPassword=sc.nextLine();
					uc.update_user(id, newPassword);
				break;
			case 3:
					System.out.println("enter the id:");
					int id2=sc.nextInt();
					uc.delete_user(id2);
				break;
			case 4:
					System.out.println("enter the id:");
				User ur=uc.find_user(sc.nextInt());
				if(ur!=null)
				{
					System.out.println(ur.getId()+" "+ur.getName()+" "+ur.getGender()+" "+ur.getBalance()+" "+ur.getPassword());
				}
				break;
			case 5:
					System.out.println("thank you...");
				return;

			default:
				System.out.println("invalid choice");
				break;
			}
		}
	}
	public static User createUser_info() {
		User u=new User();
		System.out.println("enter the id:");
		u.setId(sc.nextInt());
		System.out.println("enter the name:");
		sc.nextLine();
		u.setName(sc.nextLine());
		System.out.println("enter the gender:");
		u.setGender(sc.nextLine());
		System.out.println("enter the balance:");
		u.setBalance(sc.nextInt());
		System.out.println("enter the password:");
		u.setPassword(sc.nextLine());
		return u;
	}

}
