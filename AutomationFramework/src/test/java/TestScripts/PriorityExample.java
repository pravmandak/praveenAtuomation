package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class PriorityExample {
	
	@BeforeTest
	public void LaunchURL() {
		System.out.println("URL opended successfully");
	}

	@BeforeMethod
	public void LoginToApp() {
		System.out.println("User Logged in successfully");
	}

	@Test (priority = 0)
	public void SearchForProducts() {
		System.out.println("Producsts Searched successfully");
	}

	@Test (priority = 0)
	public void AddProductsToCart() {
		System.out.println("Producsts Added to cart successfully");
	}

	@Test (priority = 1)
	public void VerifyPayments() {
		System.out.println("Payments is working successfully");
	}
	
	@Test (priority = 1)
	public void KerifyPaymentCC() {
		System.out.println("Payments is working successfully");
	}

	@AfterMethod
	public void LogoutApp() {
		System.out.println("UserLogged out successfully");  
	}

	@AfterTest
	public void CloseBrowser() {
		System.out.println("BrowserClosed");
	}
}
