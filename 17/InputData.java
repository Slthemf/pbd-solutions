import java.util.Scanner;
public class InputData {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter the following information to sign up.");
		
		System.out.print("First name: ");
		String firstName=input.next();
		
		System.out.print("Last name: ");
		String lastName=input.next();
		
		System.out.print("Grade (9-12): ");
		int grade=input.nextInt();
		
		System.out.print("Student ID: ");
		int ID=input.nextInt();
		
		System.out.print("Login: ");
		String login=input.next();
		
		System.out.print("GPA (0.0-4.0)");
		double GPA=input.nextDouble();
		
		System.out.println("Your information:");
		System.out.println("	Login :"+login);
		System.out.println("	ID    :" +ID);
		System.out.println("	Name  :"+firstName+ ", "+lastName);
		System.out.println("	GPA   :"+GPA);
		System.out.println("	Grade :"+grade);
	}
}
		