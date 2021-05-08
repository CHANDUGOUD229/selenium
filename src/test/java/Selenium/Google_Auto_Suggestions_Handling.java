package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_Auto_Suggestions_Handling 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("chandra shekhar");
		Thread.sleep(2000);
		List<WebElement> listElement=	driver.findElements(By.xpath("//ul[@class='erkvQe']/child::li"));
		System.out.println(listElement.size());
		
		for(WebElement element :listElement)
		{
			if(element.getText().contains("Chandra Shekhar Azad"))
			{
				element.click();
				break;
			}
			 
		}
		
		
		Thread.sleep(2500);
		
		driver.close();
		
		
	}

}
