package Selenium;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable_Pagination {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/admin/index.php");
		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");

		WebElement possword = driver.findElement(By.id("input-password"));
		possword.clear();
		possword.sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		// find number of pages in a table
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		System.out.println(text);
		int  total_pages = Integer.valueOf(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));
		System.out.println("Number of pages : "+total_pages);
		
		
		
		for(int p=1;p<5;p++)
		{
		WebElement active_Page=driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
		System.out.println("Active_Page gettex  : "+active_Page.getText()); 
		active_Page.click();
		
		int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
		System.out.println("number of rows  :  "+rows);
			 for(int r=1;r<=rows;r++)
			 {
				String orderId =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[2]")).getText();
				String CustomerName =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[3]")).getText();
				String Status =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[4]")).getText();
				if(CustomerName.equals("Ramesh Ku")) {
				System.out.println(orderId+"              "+CustomerName+"                 "+Status);
				}
			 }
			 
			
			 
		
			 	String pageNo	=Integer.toString(p+1);
		
			driver.findElement(By.xpath("//ul[@class='pagination']//li/a[contains(text(),'"+pageNo+"')]")).click();
		}
		
		
		
		driver.quit();

	}

}
