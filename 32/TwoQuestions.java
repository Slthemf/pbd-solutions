import java.util.Scanner;

public class TwoQuestions {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");
		
		System.out.println("Question 1: Is it an animal, vegetable, or mineral?\n");
		System.out.print("> ");
		String x =input.next();
		
		System.out.println("Question 2: Is the object smaller than a shoe box?\n");
		System.out.print("> ");
		String y =input.next();
		
		if (x.equals("animal")) {
			if (y.equals("yes")) {
				System.out.println("My guess is that you are thinking of a hamster.");
			} else if (y.equals("no")) {
				System.out.println("My guess is that you are thinking of a moose.");
			} else {
				System.out.println("Error.");
			}
		}
		if (x.equals("vegetable")) {
			if (y.equals("yes")) {
				System.out.println("My guess is that you are thinking of an apple.");
			} else if (y.equals("no")) {
				System.out.println("My guess is that you are thinking of a pumpkin.");
			} else {
				System.out.println("Error.");
			}	
		}
		if (x.equals("mineral")) {
			if (y.equals("yes")) {
				System.out.println("My guess is that you are thinking of an eraser.");
			} else if (y.equals("no")) {
				System.out.println("My guess is that you are thinking of a computer.");
			} else {
				System.out.println("Error.");
			}
		}			
			
			System.out.println("I would ask you if I'm right, but I don't care actually.");
		
	}
}
			