import java.util.Scanner;
 public class SafeSquareRoot {
	 public static void main (String[] args) {
	 
	 Scanner input = new Scanner(System.in); 
	 
	 System.out.println("SQUARE ROOT!");
	 System.out.print("Enter a number: ");
	 int num = input.nextInt();
	 
		if (num<=0) {
			System.out.println("Math error. The number inside the square root cannot be negative.");
			do {
				System.out.print("Try again: ");
				num = input.nextInt();
			} while(num<=0); {
				double ans=(Math.sqrt(num));
				System.out.println("The square root of "+num+ " is " +ans);
			}
		}
	 }
 }
				 
	 