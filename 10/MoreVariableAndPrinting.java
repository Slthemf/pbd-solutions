public class MoreVariableAndPrinting {
	public static void main(String [] args) {
		String myName, myEyes, myHair, myPhone;
		int myAge, myHeight;
		
		myName="Steffie";
		myAge=16; //true
		myHeight=160; //cm
		myEyes="Black";
		myHair="Black";
		myPhone="Pink";
		
		System.out.println("Let's talk about" +myName+ ".");
		System.out.println("She is "+myAge+ "-year-old.");
		System.out.println("She is "+myHeight+ " cm tall.");
		System.out.println("Nah, it is not really tall.");
		System.out.println("Her hair is "+myHair+" .");
		System.out.println("Her Eyes are "+myEyes+ " .");
		System.out.println("Ummm, that is same colour with her hair.");
		System.out.println("Her phone case is "+myPhone+ " .");
		
		System.out.println("If you add " +myAge+ " and " +myHeight+ " I get" +(myAge+myHeight)+ ". ");
	}
}