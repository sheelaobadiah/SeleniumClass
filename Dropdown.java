package org.sele.com;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
	

		public static void chromebrowserlaunch(){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			
			
			WebElement day=driver.findElement(By.id("day"));
			Select daydd=new Select(day);
			daydd.selectByIndex(0);
			
			WebElement mon=driver.findElement(By.id("month"));
			Select month=new Select(mon);
			month.selectByValue("2");
			
			WebElement year=driver.findElement(By.id("year"));
			Select year1y=new Select(year);
		    year1y.selectByVisibleText("2018");
		    
		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		public static void main(String[] args) {
			chromebrowserlaunch();
		}

}
