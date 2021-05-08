package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageScrollMethods {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		Dimension d = new Dimension(500000, 500000);
		driver.manage().window().setSize(d);

		driver.get("https://www.worldometers.info/geography/how-many-countries-are-there-in-the-world/");

		List<WebElement> e = driver.findElements(By.tagName("a"));

		System.out.println(e.size());

		for (int i = 0; i < e.size() - 1; i++) {

			String ssString = e.get(i).getAttribute("href");
			System.out.println(ssString);

		}

		JavascriptExecutor js=(JavascriptExecutor)driver;
		// By Using Pixel
		 js.executeScript("window.scrollBy(0,5500)", "");
		 // By Using Body Height Method
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 

		 WebElement element=driver.findElement(By.xpath("//*[contains(text(),\"Togo\")]"));
		 
		 // By Using web element

		 js.executeScript("arguments[0].scrollIntoView()", element); 
		 
		//By pixel shortcut 1

		 js.executeScript("scroll(0, 2550);"); 

		 driver.close();

		// Using Send keys method

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		
		// Using Robot Clas Method
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

}
