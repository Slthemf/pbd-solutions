import java.util.Scanner;

public class DumbCalculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("What is your first number?");
		Double no1=input.nextDouble();
		
		System.out.print("What is your second number?");
		Double no2=input.nextDouble();
		
		System.out.print("What is your third number?");
		Double no3=input.nextDouble ();
		
		System.out.print("( " +no1+ " + "+no2+" + "+no3+" ) / 2 is..." +((+no1+no2+no3)/2));
	}
}