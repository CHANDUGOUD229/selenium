package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handles_Methods 
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String window	=	driver.getWindowHandle();//it return single window id 
		System.out.println(window);
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> handles =  driver.getWindowHandles();
		
		Iterator<String> iterator=handles.iterator();
	     String parentWindow=iterator.next();
	     String childWindow=iterator.next();

		System.out.println("parentWindow  >> "+parentWindow);
		System.out.println("childWindow  >> "+childWindow);
		
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//a[normalize-space()='Blog'])[3]")).click();
		
		Set<String> handless =  driver.getWindowHandles();
		
		Iterator<String> iterator2=handless.iterator();
	     String parentWindow2=iterator2.next();
	     String childWindow2=iterator2.next();
	     System.out.println("childWindow2  >> "+childWindow2);
		driver.switchTo().window(childWindow2);
		driver.findElement(By.xpath("//a[normalize-space()='Get a Free Demo']")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
		
		
	}
	

}
