import java.util.Random;

public class DiceDouble {
	public static void main (String[] args) {
		Random r = new Random();
		
		int num1 = 1+r.nextInt(6); 
		int num2 = 1+r.nextInt(6);
		
		System.out.println("Roll #1: "+num1);
		System.out.println("Roll #2: "+num2);
		System.out.println("The total is "+(num1+num2));
		
		
		
		while (num1!=num2) {
			num1 = 1+r.nextInt(6); 
			num2 = 1+r.nextInt(6);
			System.out.println("Roll #1: "+num1);
			System.out.println("Roll #2: "+num2);
			System.out.println("The total is "+(num1+num2));
		}
		
	}
}
			
		

		