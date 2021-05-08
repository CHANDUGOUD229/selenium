package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Calander_old {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");

		handlingDateCalender("21", "Aug", "2022");

//		driver.findElement(By.id("returndate")).click();
//
//		String dat = "21";
//		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
//
//		Select select = new Select(month);
//		select.selectByVisibleText("Aug");
//
//		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("2021");
//
//		List<WebElement> date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
//		for (WebElement sDate : date) {
//			String exDate = sDate.getText();
//			if (exDate.equals(dat)) {
//				sDate.click();
//				break;
//			}
//		}

		Thread.sleep(3000);
		driver.close();

	}

	public static void handlingDateCalender(String date, String month, String year) {
		driver.findElement(By.id("returndate")).click();

		String dat = "21";
		WebElement Cmonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

		Select select = new Select(Cmonth);
		select.selectByVisibleText(month);

		WebElement Cyear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select2 = new Select(Cyear);
		select2.selectByVisibleText(year);

		List<WebElement> Cdate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for (WebElement sDate : Cdate) {
			String exDate = sDate.getText();
			if (exDate.equals(date)) {
				sDate.click();
				break;
			}
		}
	}

}
