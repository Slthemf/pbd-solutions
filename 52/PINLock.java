import java.util.Scanner;

public class PINLock {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int pin = 1015;
		int tries = 0;
		
		System.out.println("Enter your PIN to unlock your phone.");
		System.out.print("Your four code PIN: ");
		int entry = input.nextInt();
		tries++;
		
		while (entry!=pin && tries < 5) {
			System.out.println("\nINCORREECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = input.nextInt();
			tries++;
		}
		
		 if (entry==pin) 
			System.out.println("\nPIN ACCEPTED.");
		 if (tries == 5) 
			System.out.println("WRONG PIN ENTERED 5 TIMES.");
	}
}