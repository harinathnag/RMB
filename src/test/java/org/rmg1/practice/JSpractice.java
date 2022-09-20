package org.rmg1.practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sdet40.genericUtility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSpractice {
	
	       public static void main(String[] args) {
			
	    	    WebDriverManager.firefoxdriver().setup();
                WebDriver driver = new FirefoxDriver();	  
                driver.manage().window().maximize();
                
                WebdriverUtility webdriver = new WebdriverUtility();
                driver.manage().window().maximize();
                

	    	   
	    	   
	    	   
		}

}
