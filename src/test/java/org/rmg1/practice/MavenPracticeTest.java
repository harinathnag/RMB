package org.rmg1.practice;

import org.sdet40.genericUtility.WebdriverUtility;
import org.testng.annotations.Test;

public class MavenPracticeTest {
	
	  @Test(groups= "sanity")
	  public void SampleTest()
	  {
		  String browser = System.getProperty("b");
		 String url = System.getProperty("u");
		 System.out.println("brwser name is *****>>>>  "+browser);
		 System.out.println("URL is **********>>> "+url);
		 
		WebdriverUtility webDriverUtility = new WebdriverUtility();
		
		webDriverUtility.openBrowserWithApplication(browser, url);
		  
	  }

}
