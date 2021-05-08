package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selecting_Checkboxes {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		
		
		 List<WebElement>   checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		 int totalcheckBoxes=checkBoxes.size();
		 //select all check boxes
	/**	for(WebElement option:checkBoxes)
		{
			
			option.click();
		}
	**/
		 //select based on the condition
		/** for(WebElement option:checkBoxes)
			{
			  String abvalue=option.getAttribute("id");
			  if(abvalue.equals("friday")||abvalue.equals("monday"))
			  {
				  option.click();
			  }
				
			}
		**/
		 //select last two check boxes
		 
		 
		/** 
		  for(int i=totalcheckBoxes-4 ; i<totalcheckBoxes;i++)
		 {
			 checkBoxes.get(i).click();
		 }
		 
		 **/
		 for(int i=0;i<totalcheckBoxes;i++)
		 {
			 if(i<3)
			 {
				 checkBoxes.get(i).click();
			 }
		 }
		 
		
		
		
	}

}
