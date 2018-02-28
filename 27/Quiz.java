import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int correct=0;
		
		System.out.print("Type anything in to start the quiz. ");
		String x=input.next(); 
		
		System.out.println("Let's start the quiz!");
		
		System.out.println();

		System.out.println("Q1) Which is the symbol of Silver in a periodic table ?");
		System.out.println("	1) Au");
		System.out.println("	2) Sn");
		System.out.println("	3) Ag");
		System.out.print("Ans: ");
		int ans1 =input.nextInt();
		
		System.out.println();
	
		if (ans1==3){
			correct ++;
			System.out.println("That's right!");
		}
		else if (ans1==1) {
			System.out.println("Almost there! That is the symbol for Gold.");
		} 
		else if (ans1==2) 
		{
			System.out.println("Nah, that is the symbol for Tin.");
		}

		
		
		System.out.println("Q2) What is the Morse code for SOS? ");
		System.out.println("	1) ...---...");
		System.out.println("	2) ---...---");
		System.out.println("	3) .-....._.");
		System.out.print("Ans: ");
		int ans2=input.nextInt();
		
		System.out.println();
		
		if (ans2==1  ) {
			correct ++;
			System.out.println("Congrats!");
		} else {
			System.out.println("Wrong! Better remember this!");
		}
		
		System.out.println("3) What is 10+4*2");
		System.out.println("	1) 8");
		System.out.println("	2) 18");
		System.out.println("	3) 28");
		System.out.print("Ans: "); 
		int ans3=input.nextInt();
		
		System.out.println();
		
		if (ans3 == 2) {
			correct = correct+ 1;
			System.out.println("Right!");
		} else {
			System.out.println("Incorrect!");
		}
		
		System.out.println("Overall, you get " +correct+  " out of 3 correct.");
		System.out.println("Thanks for playing!");
	}
}
		
		
	
		
		
		
		
		
		