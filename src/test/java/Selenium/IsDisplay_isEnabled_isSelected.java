package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplay_isEnabled_isSelected 
{
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Create New Account']")).click();
		//driver.switchTo().frame(12);
		Thread.sleep(30);
		Boolean element=   driver.findElement(By.name("firstname")).isDisplayed();
		System.err.println("Is Display :: "+ element);
		Boolean element2=   driver.findElement(By.name("firstname")).isEnabled();
		System.err.println("is Enabled  :: "+element2);
		
          WebElement male=  driver.findElement(By.cssSelector("#u_7_2_pU"));
          WebElement female=driver.findElement(By.xpath("#u_7_3_MJ"));
		   System.out.println("Before selecting :: "+male.isSelected());
		   System.out.println("Before selecting :: "+female.isSelected());
		   
		   male.click();
		   System.out.println("After selecting :: "+male.isSelected());
		   System.out.println("After selecting :: "+female.isSelected());
		   
		   
		   
	}

}
