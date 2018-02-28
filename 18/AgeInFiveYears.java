import java.util.Scanner;

public class AgeInFiveYears {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Hello. What is your name?");
		String name=input.next();
		
		System.out.print("Hi, "+name+ "! How old are you?");
		int age=input.nextInt();
		
		System.out.println("DId you know that in five years you will be " +(age+5)+ "years old?");
		System.out.println("And five years ago you were " +(age-5)+"! Imagine that!");
	}
}
		
		