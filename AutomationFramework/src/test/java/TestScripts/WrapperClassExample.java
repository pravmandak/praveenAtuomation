package TestScripts;

public class WrapperClassExample {

	public static void main(String[] args) {
		
		int Bonus = 10;
		
		String Sal = "2000";    //Salary ....
		
		System.out.println(Bonus + Sal);   
		
		//First We have to convert the String value to int .....then we can add
		
		int newSal = Integer.parseInt(Sal);
		
		System.out.println(Bonus + newSal);  
		
	}

}
