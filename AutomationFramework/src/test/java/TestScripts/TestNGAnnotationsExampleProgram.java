package TestScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class TestNGAnnotationsExampleProgram {
	
	//1
	@BeforeSuite
	public void BS() {
		System.out.println("I am Before Suite Code");
	}
	
	//2
	@BeforeTest
	public void BT() {
		System.out.println("I am Before Test Code");
	}
	
	//3
	@BeforeClass
	public void BC() {
		System.out.println("I am Before Class Code");
	}
	
	//4
	@BeforeMethod
	public void BM() {
		System.out.println("I am Before Method Code");
	}
	
	
	//5 //7
	@Test
	public void TC01() {
		System.out.println("I am Test Case 01");
	}
	
	//8
	@Test
	public void TC02() {
		System.out.println("I am Test Case 02");
	}
	
	@Test
	public void TC03() {
		System.out.println("I am Test Case 03");
	}
	
	//6 //9
	@AfterMethod
	public void AM() {
		System.out.println("I am After Method Code");
	}
	
	
	//10
	@AfterClass
	public void AC() {
		System.out.println("I am After Class Code");
	}
	
	//11
	@AfterTest
	public void AT() {
		System.out.println("I am After Test Code");
	}
	
	
	//12
	@AfterSuite
	public void AS() {
		System.out.println("I am After Suite Code");
	}
	

}
