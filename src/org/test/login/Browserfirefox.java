package org.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfirefox {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\eclipse-workspace\\Testrowser\\driversel\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com/");

		
	}
}
