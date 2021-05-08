package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenImges 
{
	public static void main(String[] args) throws IOException {
		verifyImages();
	}
	
	
	public static void verifyImages() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.theworldsworstwebsiteever.com/");
		List<WebElement> list=	driver.findElements(By.tagName("img"));
		for(WebElement element:list)
		{
			
				String imgSrc=element.getAttribute("src");
				try {
				URL url=new URL(imgSrc);
				HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
				httpURLConnection.setConnectTimeout(5000);
				httpURLConnection.connect();
				if(httpURLConnection.getResponseCode()==200)
				{
					System.out.println(imgSrc+"  >>  "+httpURLConnection.getResponseCode()+" >> "+httpURLConnection.getResponseMessage());
				}else 
				{
					System.err.println(imgSrc+"  >>  "+httpURLConnection.getResponseCode()+" >> "+httpURLConnection.getResponseMessage());
				}
			} catch (Exception e) 
			{
				
				System.err.println(imgSrc);
			}
			
		}
		
		
	}

}
