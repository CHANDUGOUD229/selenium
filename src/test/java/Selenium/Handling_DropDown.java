package Selenium;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.map.StaticBucketMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://primusbank.qedgetech.com/");
		WebElement element = driver.findElement(By.id("drlist"));
		Select select = new Select(element);
//		select.selectByVisibleText("Solapur");
//		select.selectByValue("shdvsgsj");
		// element.sendKeys("Juby5");
		List<WebElement> allOptions = select.getOptions();
		
		System.out.println(allOptions.size());

		ArrayList<String> orgList = new ArrayList<String>();
		ArrayList<String> dupList = new ArrayList<String>();
		// print specefic element
		/**
		 * for(WebElement a : allElements) { if(a.getText().equals("Juby5")) {
		 * a.click(); break; } } // Sorted order or not
		 **/

		for (WebElement options : allOptions) {
			orgList.add(options.getText());
			dupList.add(options.getText());
		}
		System.out.println("OrgList ::" + orgList);

		System.out.println("Dup :: " + dupList);

		Collections.sort(dupList);

		System.out.println("Ofter sortingDup :: " + dupList);
		System.out.println("Ofter sortingOrg :: " + orgList);

		if (orgList == dupList) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		driver.close();

		// Re usable method for dropdown

	}

	public static void selectDropDownOptions(List<WebElement> options, String value) {
		for (WebElement option : options) {
			if (option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}

}
