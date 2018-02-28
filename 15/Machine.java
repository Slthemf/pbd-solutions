import java.util.Scanner;

public class Machine {
		public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
			
			System.out.print("Give me a word!");
			String word1=input.next();
			
			System.out.println("Give me a second word!");
			String word2=input.next();
			
			System.out.print("Okay, then what's your favourite number?");
			int no1=input.nextInt();
			
			System.out.println("How about your second favourite number?");
			int no2=input.nextInt();
			
			System.out.println("Woohoo! Wasn't that fun?");
	}
}
			
			
			