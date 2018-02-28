import java.util.Scanner; 

public class GenderGame {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("What is your gender(M or F): ");
		String gender = input.next();
		
		System.out.print("First name: ");
		String first = input.next();
		
		System.out.print("Last name: ");
		String last = input.next();
		
		System.out.print("Age: ");
		int age = input.nextInt(); 
		
		System.out.print("\nAre you married, " +first+ "? y or n ");
		String married = input.next();
		
		if (gender.equals("F")) {
			if (age<20) {
				System.out.println("Then I shall call you "+(first)+" "+(last)+ ".");
			} else if (age>=20) { 
				if (married.equals("y")) {
					System.out.println("Then I shall call you Mrs. " +last+".");
				} else if (married.equals("n")) {
					System.out.println("Then I shall call you Ms. " +last+".");
				} else {
				System.out.println("Please enter y or n.");
			}
			}
		}
		
		else if (gender.equals("M")) {
			if (age<20) {
				System.out.println("Then I shall call you"+(first)+" " +(last)+ ".");
			} else if (age>=20) { 
				System.out.println("Then I shall call you Mr. " +last+".");
			}
		} else {
			System.out.println("...");
		}
	}
}
		
		
		
		
		