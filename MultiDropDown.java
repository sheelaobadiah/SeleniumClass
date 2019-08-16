package org.selenium.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement selectoption = driver.findElement(By.id("multi-select"));
		Select s=new Select(selectoption);
		boolean multiple = s.isMultiple();
		
		if(multiple) {
			s.selectByVisibleText("California");
			s.selectByValue("New Jersey");
			s.deselectByIndex(3);
			
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for(int i=0;i<allSelectedOptions.size();i++)
			{
				System.out.println(allSelectedOptions.get(i).getText());
			}
				Thread.sleep(10000);
				//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				s.deselectByVisibleText("California");
				s.deselectAll();

			}
			
		}
		
	}


		
		
		
