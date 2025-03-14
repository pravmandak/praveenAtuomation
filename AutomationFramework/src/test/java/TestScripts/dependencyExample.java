package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class dependencyExample {
	
	
	
	@Test (groups= {"SmokeTest"})
	public void TestCase1_Login() {
		System.out.println("This is Login");
		
	}
	@Test(groups= {"SmokeTest"})
	public void TestCase2_AddToCart() {
		
		System.out.println("This is Adding cart");
	}
	
	@Test( groups= {"RegressionTest"})
	public void TestCase4_CancelOrders() {
		
		System.out.println("This is CancelOrder");
	}
	
	@Test (groups= {"RegressionTest"})
	public void TestCase3_SignUp() {
		System.out.println("This is signup");
		
	}
	
	@Test (groups= {"SanityTest"})
	public void TestCase5_forgotPassword() {
		System.out.println("This is forgotpassword");
		
	}


}
