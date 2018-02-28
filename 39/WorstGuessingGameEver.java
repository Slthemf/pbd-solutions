import java.util.Scanner;

public class WorstGuessingGameEver {
	public static void main (String[] args) {
		Scanner input=new Scanner (System.in);
		int secret = 6;
		System.out.println("THE WOREST GUESSING GAME EVER!!");
		
		System.out.print("\nI'm thinking of a number from 1-10. Try to guess! ");
		int guess = input.nextInt();
		
		System.out.println("");
		
		
	if (guess == 6 ) {
			System.out.println("You Got It! The number is " +secret+ "!");
		} else {
			System.out.println("Toooo Bad! The number should be "+secret);
		}
	}
}