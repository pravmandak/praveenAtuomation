package TestScripts;

public class Sample {
	
	int A= 10;
	static int B = 20;
	
	
	public void test() {
		
		this.A = 100;  //In this class
		System.out.println(A);
		
		this.B = 200;
		System.out.println(B);
	}
	
	

	public static void main(String[] args) {
		
		Sample obj = new Sample();
		
		System.out.println(obj.A);
		System.out.println(obj.B);
		
		obj.test();
		
		

	}

}
