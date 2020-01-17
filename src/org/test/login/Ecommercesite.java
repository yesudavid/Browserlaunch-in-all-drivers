package org.test.login;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommercesite {

		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\dell\\eclipse-workspace\\testing\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Sweatshirts for men");
			driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
			driver.findElement(By.xpath("//a[text()='Men Hooded Pullover Sweatshirt']")).click();
			String par=driver.getWindowHandle();
			Set <String> chld=driver.getWindowHandles();
			for (String x:chld)
			{
				if (!par.equals(x)) {
					driver.switchTo().window(x);
					
				}
			}
			
			driver.findElement(By.linkText("ADD TO BAG")).click();
		
		
		
	}
}
