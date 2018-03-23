import java.util.Scanner;

public class PIN {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int pin = 211105;
		
		System.out.println("Welcome to your account!");
		System.out.print("Please enter your PIN: ");
		int entry = input.nextInt();
		
		while (entry!=pin) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = input.nextInt();
		}
		System.out.println("\nPIN ACCEPTED.");
	}
}