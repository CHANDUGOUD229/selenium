package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MonetControl_Table {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/");
		Thread.sleep(3000);
		int row = driver.findElements(By.xpath("//table[@class='topcomp_tbl']//tbody/tr")).size();
		int column = driver.findElements(By.xpath("//table[@class='topcomp_tbl']//thead/tr/th")).size();
		System.out.println(row);
		System.out.println(column);
		Thread.sleep(200);
		String ss = driver.findElement(By.xpath("//table[@class='topcomp_tbl']/tbody/tr[2]/td[1]/a")).getText();
		System.out.println("coming");
		System.out.println(ss);
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++)
			{
				String value=driver.findElement(By.xpath("//table[@class='topcomp_tbl']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(value+"              ");
			}
			System.out.println();
		}
		for (int r = 1; r <= row; r++) {
			
			String companyNames=driver.findElement(By.xpath("//table[@class='topcomp_tbl']/tbody/tr["+r+"]/td[1]/a")).getText();
			if(companyNames.equals("HDFC Bank"))
			{
				String data1=driver.findElement(By.xpath("//table[@class='topcomp_tbl']/tbody/tr["+r+"]/td[2]")).getText();
				String data2=driver.findElement(By.xpath("//table[@class='topcomp_tbl']/tbody/tr["+r+"]/td[3]")).getText();
				System.out.println(companyNames+"  >>>>>>>>>   "+data1+" >>>>>>> "+data2);
			}
		}
		driver.close();
	}

}
