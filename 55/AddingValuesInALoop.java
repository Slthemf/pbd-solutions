import java.util.Scanner;

public class AddingValuesInALoop {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
	System.out.println("I'll add up the numbers you give me. ");
	System.out.print("Number: ");
	int num = input.nextInt();
	int sum = (num);
	System.out.println("The total is " +sum+ " so far ");
	
	while (num!=0) {
		System.out.print("Number: ");
		num = input.nextInt();
		sum = (sum+num);
		System.out.println("The total is "+(sum)+ " so far.");
	}
	if (num==0)
		System.out.println("\nThe total is "+sum );
	}
}