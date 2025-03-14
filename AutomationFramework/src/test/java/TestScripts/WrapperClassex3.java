package TestScripts;

public class WrapperClassex3 {

	public static void main(String[] args) {
		
		Character ch = '*';
		
		//Upper Case;
		
		//System.out.println(ch.toUpperCase(ch));
		
		//I want to check whether the value is alpahbet or not
		
		if(Character.isAlphabetic(ch)) {
			System.out.println("This is alphabet");
		}else {
			System.out.println("This is not an alphabet");
		};
		
		
		//I want to check whether the value is numeric or not
		
		if(Character.isDigit(ch)) {
			System.out.println("This is a number");
		}else {
			System.out.println("This is not an number");
		};
		
		if(Character.isAlphabetic(ch)) {
			System.out.println("This is alphabet");
		}else if (Character.isDigit(ch)) {
			System.out.println("This is a digit");
		}
		
		//I want to to whether it is a special character
	
		if(!Character.isDigit(ch) && (!Character.isAlphabetic(ch))){
			System.out.println("IT IS A SPECIAL CHARACTER");
		} else {
			System.out.println("It is a not a special Character");
		}
		
		String S = "Praveen123";
		
		//Can you count how many numerci values are there in above string ...
		
		
		
		
		
		

	}

}
