package Selenium;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Handling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");

		int rowNo = driver.findElements(By.xpath("//table[@class='data-list']//tbody/tr")).size();// 5
		int columNo = driver.findElements(By.xpath("//table[@class='data-list']//thead/tr/th")).size();// 6
		System.out.println("table row >>" + rowNo);
		System.out.println("table column >> " + columNo);

		String value = driver.findElement(By.xpath("//table[@class='data-list']//tbody/tr[2]/td[6]")).getText();
		System.out.println(">>>>>   " + value);
		System.out.println();
		// if we want print table data
		for (int i = 1; i <= rowNo; i++) {
			for (int j = 1; j <= columNo; j++) {

				String data1 = driver.findElement(By.xpath("//table[@class='data-list']//tr[" + i + "]/td[" + j + "]"))
						.getText();

				System.out.print(data1 + "                ");

			}
			System.out.println();
		}

		// if we want specific data
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for (int k = 1; k < rowNo; k++) {
			
			String language = driver.findElement(By.xpath("//table[@class='data-list']//tr[" + k + "]/td[1]")).getText();
			if(language.equals("Java"))
			{
				String data3 = driver.findElement(By.xpath("//table[@class='data-list']//tr[" + k + "]/td[2]")).getText();
				String data4 = driver.findElement(By.xpath("//table[@class='data-list']//tr[" + k + "]/td[6]")).getText();
				System.out.print(language+" >>>>>  "+data3+"  >>>>>>>  "+data4);
				
			}

		}

		driver.close();

	}

}
