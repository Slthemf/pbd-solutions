import java.util.Scanner;
public class AskingQuestions {
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			
			System.out.print("How old are you?");
			int age=input.nextInt();
			
			System.out.print("How tall are you?");
			String height=input.next();
			
			System.out.print("What is your average mark now?");
			double mark=input.nextDouble();
			
			System.out.println("So you are " +age+ " old, " +height+ " tall and have a " +mark+" of average.");
		}
}