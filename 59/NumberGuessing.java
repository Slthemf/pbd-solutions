import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
	public static void main (String []args) {
		Scanner input = new Scanner (System.in);
		Random r = new Random();
		
		int tries = 0;
		int num = 1+r.nextInt(10);
		System.out.println("I have chosen a number from 1 to 10. Try to guess it.");
		System.out.print("Your guess: ");
		int guess = input.nextInt();
		tries++;
		
		
		while (num==guess) {
			tries++;
			System.out.print("That's right! You are a good guesser!")pub;
			guess = input.nextInt();
			}
		 do {
			tries++;
			System.out.println("INCORRECT!");
			System.out.print("Your guess: ");
			guess = input.nextInt();
		} while (guess!=num); {
			System.out.println("That's right! You are a good guesser.");
			System.out.println("It only took you "+tries+ " times.");
		}
		
	}
}
			
			
			