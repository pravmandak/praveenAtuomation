package TestScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {
	
	@DataProvider (name = "data-provider")
    public Object[][] dpMethod(){
	 return new Object[][] {{"Praveen"}, {"Hello@123"}};
    }
	
   @Test (dataProvider = "data-provider")
   public void myTest (String val) {
       System.out.println("Passed Parameter Is : " + val);
   }

}
