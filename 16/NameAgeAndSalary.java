import java.util.Scanner;
public class NameAgeAndSalary {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Hi there. WHat's your name?");
		String name=input.next();
		
		System.out.print("Hi, "+name+"! How old are you?");
		int age=input.nextInt();
		
		System.out.println("So you're "+age+", eh? That's young!");
		System.out.println("How much do you make, "+name+"?");
		double salary=input.nextDouble();
		
		System.out.println(+salary+ "! I hope that is per hour not per day! LOL!");
	}
}