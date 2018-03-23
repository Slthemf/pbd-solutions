import java.util.Scanner;

public class CollatzSequence {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Starting number: ");
		int n = input.nextInt();
		int step = 0;
		
		while (n!=1) {
			if (n%2==0) {
				n = (n/2);
				System.out.print(+n+"\t");
				step++;
			} else {
				n = (3*n+1);
				System.out.print(+n+ "\t");
				step++;
			}
		}
		
		System.out.println("\nTerminated after "+step+" steps.");
	}
}