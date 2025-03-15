package TestScripts;

public class ChildClass extends ParentClass {
	
	int X= 100;
	int Y =200;
	
	public void test() {
		
		System.out.println(super.A);
		System.out.println(super.B);

		System.out.println(this.X);
		System.out.println(this.Y);
		
	}
	

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();

		obj.test();
		
        
	}

}
