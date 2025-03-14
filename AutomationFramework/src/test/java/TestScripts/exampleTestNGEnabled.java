package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class exampleTestNGEnabled {
	
	
	
	@Test (invocationCount=1, priority = 3)
	public void TestCase1() {
		System.out.println("This is test case 01");
		
	}
	@Test(priority = 1)
	public void TestCase2() {
		
		System.out.println("This is test case 02");
	}
	
	@Test (invocationCount=1, priority = 2)
	public void TestCase3() {
		System.out.println("This is test case 03");
		
	}
	
	
	

}
