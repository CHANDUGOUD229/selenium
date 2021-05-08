package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//   get the entire page screenshot,
 class ScreenshotDemo  
{
	//@Test
	public void TakingScreenShots() throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		File sourcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File destFile = new File(
				"C:\\Users\\chand\\eclipse-workspace\\InterViewQustionOnCoding\\src\\test\\resources\\ScreenShoot\\screenshot.png");

		FileUtils.copyFile(sourcFile, destFile);

	}

}
//   How to capture the screenshot of a particular element by using the getScreenshotAs() method?

public class TakingScreenShotss {
    public static void main(String[] args) throws IOException {
        //set the location of chrome browser
       
    	WebDriverManager.chromedriver().setup();
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        
        //navigate to url
        driver.get("https://demoqa.com");
        
        // Locate the web element
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
        
        // capture screenshot with getScreenshotAs() of the WebElement class
        File f = logo.getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(f, new File("C:\\Users\\chand\\eclipse-workspace\\InterViewQustionOnCoding\\src\\test\\resources\\ScreenShoot\\logoScreeshot.png"));
        
        driver.close();
    }
}

