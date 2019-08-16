package org.sele.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class DemoDouble {
	private static void doubleClick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://artoftesting.com/sampleSiteForSelenium.html");
		
	WebElement text=driver.findElement(By.xpath("//input[@id='fname']"));
	WebElement submit= driver.findElement(By.xpath("//button[@id='idOfButton']"));
	WebElement textbutton = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
	
	Actions ma=new Actions(driver);
	ma.sendKeys(text, "Rakesh").build().perform();
	Thread.sleep(2000);
	ma.click(submit).build().perform();
	Thread.sleep(2000);
	ma.doubleClick(textbutton).build().perform();
	//textbutton.sendKeys("Rakesh");
			
	}
	public static void main(String[] args) throws InterruptedException {
		doubleClick();
	}
	
}