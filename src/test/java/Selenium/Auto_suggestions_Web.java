package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_suggestions_Web {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		WebElement inputElement = driver.findElement(By.xpath("//input[@id='autocomplete']"));

		inputElement.clear();
		inputElement.sendKeys("Toronto");
		String text;
		
		
		do {
			inputElement.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			text=inputElement.getAttribute("value");
			if(text.equals("Toronto, OH, USA"))
			{
				inputElement.sendKeys(Keys.ENTER);
				break;
			}
			
			
			
		} while (!text.isEmpty());
		

	}

}
