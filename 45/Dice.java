import java.util.Random;

public class Dice {
	public static void main (String[] args) {
		Random r = new Random();
		
		System.out.println("HERE COMES THE DICE!\n");
		
		int num1 = 1+r.nextInt(6); 
		int num2 = 1+r.nextInt(6);
		
		System.out.println("Roll #1: "+);
		System.out.println("Roll #2: "+num2);
		System.out.println("The total is "+(num1+num2));
	}
}
		
		