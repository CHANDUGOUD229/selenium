package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuterUse
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Page Scroll Down ====== 1
		System.out.println("first  use of javascript Executer ------------------------------------Page scrollDown-------------------------------------------- ");
		driver.get("You can give any site name and change below webelement");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// By Using Pixel
		js.executeScript("window.scrollBy(0,5500)", "");
		// By Using Body Height Method
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		WebElement element = driver.findElement(By.xpath("//*[contains(text(),\"Togo\")]"));

		// By Using web element
		js.executeScript("arguments[0].scrollIntoView()", element);
		
		//WebElement Hightlateing with Background Colour  =====2
		
		System.out.println("Second use of javascript Executer ------------------Webelement backgroundColour and Border-------------------------------");
		
		driver.get("https://www.google.com/?gws_rd=ssl");
		WebElement element9=driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		
		WebElement element2=driver.findElement(By.xpath("//div[@class=\"FPdoLc tfB0Bf\"]//input[@class=\"RNmpXc\"]"));
		
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		//background fill with colour
		jsExecutor.executeScript("arguments[0].style.background='red'", element9);
		
		//border
		jsExecutor.executeScript("arguments[0].style.border='2px solid blue'", element2);
		//driver.close();
		
		
		System.out.println("Third use of javascripExecuter ----------------- sendKyes-------------------------------------------------");
		// SendKyes method using javascript exrcuter
		driver.get("https://www.google.com/?gws_rd=ssl");
		WebElement element3=	driver.findElement(By.xpath("//input[@name=\"q\"]"));
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("arguments[0].value='Javascript Executer Methods';", element3);
		
		
		System.out.println("fouth use of javascript executer-------------------click-----------------------------------------------------");
		
		driver.get("https://www.google.com/?gws_rd=ssl");
		WebElement element5=driver.findElement(By.xpath("//div[@class=\"FPdoLc tfB0Bf\"]//input[@class=\"RNmpXc\"]"));
		WebElement element6=	driver.findElement(By.xpath("//input[@name=\"q\"]"));
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].value='chandrashekhar'", element6);
		js2.executeScript("arguments[0].click()", element5);
		

	}

}
