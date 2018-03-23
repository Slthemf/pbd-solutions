import java.util.Scanner;

public class Adventure2 {
	public static void main( String[] args ) {
		Scanner input = new Scanner(System.in);
		
		int nextroom = 1;

		while (nextroom != 0 && nextroom != 19) {
		
			
			if (nextroom==1) {
				
				System.out.println("You woke up and found yourself in a strange ");
				System.out.println("bedroom. The room is dark and empty except ");
				System.out.println("for a single bed and a bookshelf. Do you want to go to ");
				System.out.println("the \"door\" or check the \"bookshelf\"?");
				System.out.print("> ");
				String choice = input.next();
				if (choice.equals("bookshelf")) 
					nextroom = 2;
				else if (choice.equals("door"))
					nextroom = 3;
				else
					System.out.println(choice+ "is not one of the choice. Please try again.");
			} 
			
			if (nextroom==2) {
				System.out.println("There are several books on the bookshelf. One book with ");
				System.out.println("a red cover caught your attention. There is a note saying");
				System.out.println("\"5011\".");
				nextroom = 1;
			} 
			
			if (nextroom==3) {
				System.out.println("The door is locked. There is a number pad.");
				System.out.print("> ");
				int password = input.nextInt();
				if (password == 5011) {
					System.out.println("Password accepted.");
					nextroom=4;
				} else {
					System.out.println("Nothing happened.");
					nextroom = 1;
				}
			
			} 
			
			if (nextroom==4) { //2ndFloor
				System.out.println("You walk out the door and there is a long hallway.On your left");
				System.out.println("side there is a \"washroom\" and there is a \"staircase\" in ");
				System.out.println("front of you. Which way do you want to go?");
				System.out.print("> ");
				String choice = input.next();
				if (choice.equals("washroom")) 
					nextroom = 5;
				else if (choice.equals("staircase"))
					nextroom = 6;
				else 
					System.out.println("You have to choose a destination from \"washroom\" or \"staircase\".");
			
			} 
			
			if (nextroom==5) { //washroom
				System.out.println("Inside the bathroom there is a half-opened closet. Do you want");
				System.out.println("to check the \"closet\" or go \"back\"?");
				System.out.print("> ");
				String choice = input.next();
				if (choice.equals("closet")) {
					System.out.println("You open the closet. A bloody hand appears and grabs your");
					System.out.println("neck, you try to fight back but it is not working. Slowly,");
					System.out.println("you can feel the pain, you can only see darkness now.");
					nextroom = 0;
				} 
				
				if (choice.equals("back"))
					nextroom = 4;
			
			} 
			
			if (nextroom==6) { //downstairs
				System.out.println("You walk down the staircase and you can see the main door. You");
				System.out.println("try to open it but it is locked. You look back and there is a ");
				System.out.println("grand piano in the dining room. There is also a way to the");
				System.out.println("guest bedroom. Do you want to check the \"piano\" or the");
				System.out.println("\bedroom\"?");
				System.out.print("> ");
				String choice = input.next();
				if (choice.equals("piano")) 
					nextroom = 7;
				else if (choice.equals("bedroom"))
					nextroom = 8;
				else
					System.out.println(choice + " is not an option. Try again.");
			} 
			
			if (nextroom==7) { //piano
				System.out.println("You walk towards the piano, and the music play automatically,");
				System.out.println("Do you want to go take a closer \"look\" at the piano or \"play \" it? \nYou can also choose to do nothing.(\"back\")");
				System.out.print("> ");
				String choice = input.next();
				if (choice.equals("look")) {
					System.out.println("On the white keyboard, there is several notes that are ");
					System.out.println("covered with blood. ;You read the notes that are covered");;
					System.out.println("in blood: \"D\", \"E\", \"A\", \"D\".");
					System.out.println("You are dead.");
					nextroom = 0;
				} else if (choice.equals("play")) {
					System.out.println("You try to play the song that are played by the piano.");
					System.out.println("There is a \"click\" sound. Seems like something is opened.");
					nextroom = 10;
				} else if (choice.equals("back")) { 
					nextroom = 9;
				} else {
					System.out.println("Please choose one from look or play.");
				}
			} 
			
			if (nextroom==8){ //lockedDoor
				System.out.println("The door is locked.\n");
				nextroom = 9;
				
			} 
			
			if (nextroom==9) { //front
				System.out.println("You return to the main entrance. The main door is still locked.");
				System.out.println("Do you want to check the \"piano\" or the \"bedroom\"?");
				System.out.print("> ");
				String choice = input.next();
				if (choice.equals("piano"))
					nextroom = 7;
				else if (choice.equals("bedroom"))
					nextroom = 9;
				else 
					System.out.println(choice + " is not one of the option.");
			} 
			
			if (nextroom==10) { //bedroom
				System.out.println("You open the door of the bedroom. It is similar to the main ");
				System.out.println("bedroom upstairs, empty. There is a \"painting\" hanging on ");
				System.out.println("the wall. There is also a \"window\" Which one do you want to");
				System.out.println("check?");
				System.out.print("> ");
				String choice = input.next();
				if (choice.equals("painting")) 
					nextroom = 12;
				else if (choice.equals("window")) 
					nextroom = 13;
				
			} 
			
			if (nextroom==11) { //2ndbedroom
				System.out.println("You look back to the bedroom. Do you want to see the \"painting\" \nor the \"window\"? You can also go \"back\"?");
				System.out.print("> ");
				String choice = input.next(); 
				if (choice.equals("painting"))
					nextroom = 12;
				else if (choice.equals("window"))
					nextroom = 13;
				else if (choice.equals("back"))
					nextroom = 9;
			} 
			
			if (nextroom==12) { //painting
				System.out.println("The painting is called \"A Upside-down man\". The man's 	\neyes are filled with emptiness and desperation. \nHe is wearing a prisoner's clothes. The number on his clothes is 6891."); 
				System.out.println("\nYou walk out the bedroom and check the main door.");
					nextroom = 15;
			} 
			
			if (nextroom==13) { //window
				System.out.println("The window is opened. Seems like you can climb over it. /nDo you want to go through the window? (\"yes\" or \"back\")");
					System.out.print("> ");
					String choice = input.next();
					if (choice.equals("yes")) {
						System.out.println("You squeeze through the window, and you start running \nlike crazy. Outside is a deep forest. Although you are running straight, \n, you feel like you are keep returning to the same place. Finally, you \ncannot feel your legs anymore. You slow down and pass out. ");
						nextroom = 0;
					} else if (choice.equals("back")) 
						nextroom = 11;
					  else
						  System.out.println(choice + "is not one of the option."); 
			} 
			
			if (nextroom==14) {
				System.out.println("Do you want to \"try\" again or \"check\" other rooms?");
				String choice = input.next();
				if (choice.equals("try"))
					nextroom = 15;
				else if (choice.equals("check"))
					nextroom = 9;
			} 
		
			if (nextroom==15) { //passwordDoor
				System.out.println("There is a number pad on the door.");
				System.out.print("> ");
				int password = input.nextInt();
				if (password==1689) {
					System.out.println("Password accepted.");
					nextroom = 19;
				} else {
					System.out.println("Incorrect password. Do you want to try \nagain? (\"yes\" or \"no\")");
					String choice = input.next();
					if (choice.equals("yes")) 
						nextroom = 15;
					else if (choice.equals("no"))
						nextroom = 9;
					else 
						System.out.println(choice +" is not one of the option.");
				}
			}	
			
		}   
		
		if (nextroom==0)
			System.out.println("You died. Game over.");
		else if (nextroom==19)
			System.out.println("Congrats! You escape!");
	}
}
			