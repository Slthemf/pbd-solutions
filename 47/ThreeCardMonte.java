import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash. \nHe glances at you out of the corner of his eye and starts shuffling. \nHe lays down three cards.");
		System.out.println("\nWhich one is the ace?");
		System.out.println("\n");
		System.out.println("	##  ##  ##");
		System.out.println("	##  ##  ##");
		System.out.println("	1   2   3");
		
		System.out.print("\n> ");
		int guess = input.nextInt();
		int ace = 1+r.nextInt(3);
		if (ace == guess) {
			System.out.println("Congrats! You nailed it! The ace number is "+ace+ "!");
		} else {
			System.out.println("Ha! Fast Eddie wins again! ");
		}
		
		if (ace==1) {
			System.out.println("	AA  ##  ##");
			System.out.println("	AA  ##  ##");
			System.out.println("	1   2   3");
		}
		if (ace==2) {
			System.out.println("	##  AA  ##");
			System.out.println("	##  AA  ##");
			System.out.println("	1   2   3");
		}
		if (ace==3) {
			System.out.println("	##  ##  AA");
			System.out.println("	##  ##  AA");
			System.out.println("	1   2   3");
		}
	}
}