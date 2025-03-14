package Utitlities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonMethods {
	
	WebDriver driver;

	public void CaptureScreenShot() throws IOException {
		
		 TakesScreenshot  shot  = ((TakesScreenshot)driver);
		    
		    File SrcFile = shot.getScreenshotAs(OutputType.FILE); //this method will capture SS from Web
		    
		    File  DestLocation = new File("/Users/mpk/Desktop/testSelenium/AutomationFramework/Reports/Sample.png");
		    
		    FileUtils.copyFile(SrcFile, DestLocation);
		
		
	}
	
	public void switchToFrame() {
		///code ...
	}

}
