import java.util.Scanner;
import java.util.Random;

public class HiLoLimited {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		Random r = new Random();
		int tries = 0;
		
		int num =1+r.nextInt(100);
		System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
		System.out.print("First Guess: ");
		int guess = input.nextInt();
		tries++; 
		
		while (guess!=num && guess<num && tries<7) {
			tries++;
			System.out.println("Sorry, you are too low.");
			System.out.print("Guess #"+tries+": ");
		    guess = input.nextInt();
		} 
		
		while (guess!=num && guess>num && tries<7) {
			tries++;
			System.out.println("Sorry, you are too high.");
			System.out.print("Guess #"+tries+": ");
		    guess = input.nextInt();
		} 
		
		if (guess==num && tries<=7)
			System.out.println("\nYou guessed it! Congrats!");
		
   		if (guess!=num && tries== 7)
			System.out.println("\nSorry, you have ran out of guesses. You lose. ");
	}
}
		
		
		
		
		