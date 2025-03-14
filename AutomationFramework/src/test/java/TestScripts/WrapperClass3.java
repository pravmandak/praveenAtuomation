package TestScripts;

public class WrapperClass3 {

	public static void main(String[] args) {
		
		char A = '2';   
		int B = 5;  
		
		System.out.println(A);
		
		System.out.println( A + B);  // Second value is coming a ASCII
		
		
		//Convert the character to Integer
		
	    int newChar = Character.getNumericValue(A);
	    
	    System.out.println(newChar + B);
	    

	}

}
