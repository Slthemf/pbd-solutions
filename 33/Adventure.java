import java.util.Scanner;

public class Adventure {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		System.out.println("You are in a creepy house now. Would you like to go 'upstairs' or go down to the 'basement'?");
		System.out.print("> ");
		String floor = input.next();
		
		if (floor.equals("upstairs")) {
			System.out.println("You walk upstairs and you see a hallway. At the end of the hallway is the master 'bedroom'. There is also a 'bathroom' on your left. Which way would you want to go?");
			System.out.print("> ");
			String room = input.next();
			if (room.equals("bedroom")) {
				System.out.println("The bedroom is simple and crude. The bedroom has several weird paintings on the wall. There is no furniture in the bedroom but a wooden closet. There is also a half-opened window. Which one do you prefer? 'closet' or 'window'"); 
				System.out.print("> ");
				String check = input.next();
				
				if (check.equals("closet")) {
					System.out.println("The closet is old, and the closet door is ajar. Do you want to open the closet? 'yes' or 'no'");
					System.out.print("> ");
					String open = input.next();
					
					if (open.equals("yes")) {
						System.out.println("You find a paper slip that says '5+9/3=?'");
						System.out.print("Please enter the passcode: ");
						int passcode = input.nextInt();
						if (passcode==8) {
						System.out.println("Good end! You escape the house successfully!");
						System.out.println("btw There are another passcode in the house. Wanna give another try?;)"); 
						} else {
							System.out.println("Dude, it is just simple math.");
							System.out.println("Bad end.");
						}
					}
					else if (open.equals("no")) {
						System.out.println("Then you will never know what is in the closet.");
						System.out.println("Bad end. Hint: You are very close to the end.");
					}
				}
				else if (check.equals("window")) {
					System.out.println("You walk towards the window and open the window. It is dark outside. Do you want to jump down? 'yes' or 'no'");
					System.out.print("> ");
					String jump = input.next();
					
					if (jump.equals("yes")) {
						System.out.println("Well, you are really brave. But obviously,you die from falling.");
						System.out.println("Bad end. Next try though.");
					} 
					else if (jump.equals("no")) {
					System.out.println("Wise choice. But it won't help with anything.");
					System.out.println("Bad end.");
				} else {
					System.out.println("Maybe you should follow my instructions.");
					System.out.println("You died. Bad end.");
				}
			}
			}
					
			
			if (room.equals("bathroom")) {
				System.out.println("The light bulb in the bathroom is broken, the light keeps flashing. Inside the bathroom, you can barely see a bathtub, and also a mirror cabinet. Would you like to look in the 'bathtub' or check the 'mirrorCabinet'?");
				System.out.print("> ");
				String open = input.next();
				if (open.equals("bathtub")) {
					System.out.println("There is nothing in the bathtub. Yet, you can choose to open the water tap or not. ('yes' or 'no')");
					String choose = input.next();
					if (choose.equals("yes")) {
						System.out.println("You turn the water tap on, but what comes out is blood.");
						System.out.println("Bad end.");
					} else if (choose.equals("no")) {
						System.out.println("Nothing happen. You are stuck in the bathroom.");
						System.out.println("Bad end.");
					} else {
						System.out.println("Maybe you should follow my instructions.");
						System.out.println("You died. Bad end.");
					}
				}
				
				else if (open.equals("mirrorCabinet")) {
					System.out.println("You are in front of the mirror cabinet. Do you want to open the cabinet or look in the mirror? 'open' or 'look'");
					System.out.print("> ");
					String choose = input.next();
					if (choose.equals("open")) {
						System.out.println("You open the mirror cabinet. A skeleton hand grab your neck.");
						System.out.println("Bad end.");
					} else if (choose.equals("look")) {
						System.out.println("You look in the mirror but you can see a thing, even yourself. You realize you are dead already.");
						System.out.println("True end.");
					} else {
						System.out.println("Maybe you should follow my instructions.");
						System.out.println("You died. Bad end.");
					}
				}
				else {
					System.out.println("Maybe you should follow my instructions.");
					System.out.println("You died. Bad end.");
			} 
			}
		}
			
	
		else if (floor.equals("basement")) {
			System.out.println("You walk down the basement and you see a 'storageRoom'. There is also a 'gameRoom' at the end of the hallway. Which way do you want to go?");
			System.out.print("> ");
			String room = input.next();
			
			if (room.equals("storageRoom")) {
				System.out.println("You walk inside the storage room, and you cough because of the dust floating in the air. In the storage room, you see a 'cabinet' with a lock on it. There are also paper 'boxes'. Which one do you want to check?");
				System.out.print("> ");
				String check = input.next();
				if (check.equals("cabinet")) {
					System.out.println("The cabinet is old and the door is broken. It looks like something is hidden inside. Do you want to open the cabinet? 'yes' or 'no'");
					System.out.print("> ");
					String choose = input.next();
					
					if (choose.equals("yes")) {
						System.out.println("I lied. There is nothing inside :p");
						System.out.println("btw, it's a bad end.");
					}
					else if (choose.equals("no")) {
						System.out.println("Then, you will never known what is inside in the cabinet.");
						System.out.println("Bad end");
					} else {
						System.out.println("Maybe you should follow my instructions.");
						System.out.println("You died. Bad end.");
					}
					
				}
				else if (check.equals("boxes")) {
				System.out.println("You open the paper box which is half-opened. It is filled with lots of balloons. There is a bright red one that caught your eyes. Do you want to 'poke' the balloon or 'read' the paper slip that is at the bottom of the box?");
				System.out.print("> ");
				String choose = input.next();
				
				if (choose.equals("poke")) {
					System.out.println("Boom! And you die :p");
					System.out.println("Bad end.");
				} else if (choose.equals("read")) {
					System.out.println("The paper slip said 'YOU SHOULD NOT LOOK AT ME.'");
					System.out.println("Bad end.");
				} else {
					System.out.println("Maybe you should follow my instructions.");
					System.out.println("You died. Bad end.");
				}
				}
			}
				
			else if (room.equals("gameRoom")) {
				System.out.println("Inside the game room, there is a billiard table. Do you want to take a look of the 'white' ball or the 'black' ball?");
				System.out.print("> ");
				String colour = input.next();
				
				if (colour.equals("white")) {
					System.out.println("On the white ball, it says '11*11=?'");
					int passcode = input.nextInt();
					if (passcode==121){
						System.out.println("Well done! You escape the creepy house!");
						System.out.println("Good end.");
					} else {
						System.out.println("Sorry, but you died. Why? Find out in your calculator.");
						System.out.println("Bad end.");
					}
				}
				else if (colour.equals("black")) {
					System.out.println("It is actually a small bomb.");
					System.out.println("Bomb! And You die.");
					System.out.println("Bad end.");
				}
				else {
					System.out.println("Maybe you should follow my instructions.");
					System.out.println("You died. Bad end.");
				}
			}
			
			    else {
					System.out.println("Maybe you should follow my instructions.");
					System.out.println("You died. Bad end.");
				}
		}
			
		else {
			System.out.println("Maybe you should follow my instructions.");
			System.out.println("You died. Bad end.");
			}
	
	System.out.println("Thanks for playing.");
	}
}

				
			
			
		
			
					
					
					
			