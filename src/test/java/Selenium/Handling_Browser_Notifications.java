package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Browser_Notifications {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

		driver.get("https://www.redbus.in/");
		datePicker("10", "Aug", "2021");
		Thread.sleep(250);
		driver.close();

	}
	
	
	

	public static void datePicker(String date, String month, String year) {
		driver.findElement(By.id("onward_cal")).click();
//		String month="Aug";
//		String year="2025";
//		String date="9";
		while (true) {
			String cal = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String arry[] = cal.split(" ");
			String month1 = arry[0];
			String yer = arry[1];

			// System.out.println(month1 +" "+yer);
			if (month1.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
				break;
			} else {
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
		}
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		for (WebElement dates : allDates) {
			String exDate = dates.getText();
			if (exDate.equals(date)) {
				dates.click();
				break;
			}

		}

	}

}
