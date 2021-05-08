package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_Methods 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.navigate().refresh();
		Thread.sleep(300);
		System.err.println(" page title : "+driver.getTitle());
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(300);
		System.err.println(" page title : "+driver.getTitle());
		driver.navigate().back();
		Thread.sleep(300);
		System.err.println(" page title back  : "+driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(300);
		System.err.println(" page title forward : "+driver.getTitle());
	
		driver.quit();
	}

}
