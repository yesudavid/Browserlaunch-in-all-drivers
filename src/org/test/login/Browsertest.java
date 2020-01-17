package org.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Browsertest {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.ie.driver", "C:\\Users\\dell\\eclipse-workspace\\Testrowser\\driverie\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.myntra.com/");
		
		

		
		
	}

}
