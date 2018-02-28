import java.util.Scanner;

public class BMICategories {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Your height in m:");
		double height=input.nextDouble();
		
		System.out.print("Your weight in kg:");
		double weight=input.nextDouble();
		
		double BMI = (weight/(+height*height));
		
		System.out.println("Your BMI is " +(weight/(+height*height)));
		
		if (BMI < 15.0) {
			System.out.println("BMI Category: very severely underweight");
		} else if (BMI <= 16.0) {
			System.out.println("BMI Category: severely underweight");
		} else if (BMI <=18.4) {
			System.out.println("BMI Category: underweight");
		} else if (BMI <= 24.9) {
			System.out.println("BMI Category: normal weight");
		} else if (BMI <= 29.9) {
			System.out.println("BMI Category: overweight");
		} else if (BMI <= 34.9) {
			System.out.println("BMI Category: moderately obese");
		} else if (BMI <= 39.9) {
			System.out.println("BMI Category: severely obese");
		} else {
			System.out.println("BMI Category: very severely obese");
		}
	}
}