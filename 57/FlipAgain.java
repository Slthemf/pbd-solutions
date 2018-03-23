import java.util.Scanner; 
import java.util.Random;

public class FlipAgain {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random r = new Random(); 
		
		System.out.print("Do you want to flip a coin? (y/n)?");
		String again = input.next();
		do {
			int flip = 1+r.nextInt(2);
			if (flip==1) 
				System.out.println("You flip a coin and it is HEADS.");
			 else 
				System.out.println("You flip a coin and it is TAILS.");
			
			System.out.println("Would you like to flip again?(y/n)");
			again = input.next();
		} while (again.equals("y"));
	}
}
		
			
			