package TestScripts;

public class ExceptionHandlingINJava {

	public static void main(String[] args) {

	/*	try {
			int[] Arr = new int[5];

			Arr[1] = 10;
			Arr[2] = 12;
			Arr[3] = 13;
			Arr[4] = 13;

			System.out.println(Arr[1]);

			Arr[6] = 11;
			System.out.println(Arr[6]);

			System.out.println(Arr[2]);
			System.out.println(Arr[3]);
			System.out.println(Arr[4]);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		finally {
			System.out.println("Which executes after the exception handled");
		}*/
		
		/*try {
		int A = 100;
		int B = 0;
		
		System.out.println(A/B);
		
		}
		
		catch(ArithmeticException ex) {
			System.out.println("it is infinity ");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("it is Array not in range ");
		}
		
		
		int X =100;
		int Y =200;
		System.out.println(X*Y);*/
		
		
		int Salary = 1000;
		int Deductions = 200;
		String tax = "20";
		
		System.out.println(Salary + Deductions); //1200
		System.out.println(Deductions + tax);  //20020
		
		//How to convert a string to int...
		
		int covn = Integer.parseInt(tax);
		
		System.out.println(Deductions + covn); 
		
	}

}
