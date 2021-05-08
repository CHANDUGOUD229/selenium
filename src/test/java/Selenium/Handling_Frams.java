package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Frams {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		
		
		driver.switchTo().frame("packageFrame");
		
		driver.findElement(By.linkText("ChromeDriver")).click();
		
		driver.switchTo().defaultContent();
		
		//driver.switchTo().parentFrame();
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("org.openqa.selenium.chromium.ChromiumDriver")).click();
		
		
		driver.close();
		
		
	}

}
