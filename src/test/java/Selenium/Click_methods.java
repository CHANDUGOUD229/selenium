package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click_methods {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
	WebElement  element=driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnI']"));
	 
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click()", element);
	js.executeScript("arguments[0].style.background='blue'", element);
	
	
}
}
