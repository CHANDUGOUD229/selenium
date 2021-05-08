package Selenium;

import org.jsoup.select.Evaluator.Id;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputSendText_Methods
{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		// using sendKeys
	  WebElement element	=driver.findElement(By.name("q"));
	  element.sendKeys("chandra shekhar");
		Thread.sleep(200);
		driver.findElement(By.name("q")).clear();
		//using JavaScriptExecuter
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='chandu';",element);
		
		Thread.sleep(2000);
		driver.close();
	}

}
