package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alarts_JavaScript_popUps {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[normalize-space()='JavaScript Alerts']")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

		Thread.sleep(250);
		driver.switchTo().alert().accept();
		Thread.sleep(250);

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(250);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

		Alert alert = driver.switchTo().alert();
		Thread.sleep(2330);
		System.out.println(alert.getText());
		alert.sendKeys("chandu");
		alert.accept();

		driver.quit();

	}

}
