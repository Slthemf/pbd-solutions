import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main (String[] args) {
		Random r =new Random();
		Scanner input=new Scanner (System.in);
		
		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.print("Your guess: ");
		int guess = input.nextInt();
		System.out.println();
		
		int think = 1 + r.nextInt(10);
		
		if (guess==think) {
			System.out.println("That's right! I'm thinking of "+guess);
		} if (guess!=think) {
			System.out.println("Sorry, but I'm thinking of "+think);
		}
	}
}
		
		