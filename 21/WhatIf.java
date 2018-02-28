public class WhatIf {
	public static void main(String[] args) {
		int people=20;
		int kids=39;
		int dogs=15;
		
		if (people<kids) {
			System.out.println("There are too many kids!");
		}
		
		if (people>kids) {
			System.out.println("Not many kids! Finally!");
		}
		
		if (people<dogs) {
			System.out.println("The world is drooled on");
		}
		
		if (people>dogs) {
			System.out.println("The world is dry!");
		}
		
		dogs +=5;
		
		if (people >= dogs) {
			System.out.println("People are greater than or equal to dogs.");
		}
		
		if (people <= dogs) {
			System.out.println("People are less than or equal to dogs.");
		}
		
		if (people == dogs) {
			System.out.println("People are dogs.");
		}
	}
}