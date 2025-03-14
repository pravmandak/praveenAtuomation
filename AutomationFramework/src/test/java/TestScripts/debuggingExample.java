package TestScripts;

public class debuggingExample {
	
	
	public void multiply() {
		int X =10;
		int Y =20;
		System.out.println(X - Y);
	}
	
	public void sub() {
		int M =10;
		int N =20;
		System.out.println(N-M);
	}

	public static void main(String[] args) {
		
		debuggingExample obj = new debuggingExample();
		
		int A =10;
		int B =20;
		int C = A + B;
		
		
		System.out.println(C);
		
		obj.multiply();
		obj.sub();
		
		
		

	}

}
