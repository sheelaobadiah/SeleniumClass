package org.sele.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {
	
	public static void amazon() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");

	WebElement shopbycaty = driver.findElement(By.id("nav-link-shopall"));
	WebElement amzprimevid = driver.findElement(By.xpath("(//span[text()='Amazon Prime Video'])[1]"));
    WebElement tvshows = driver.findElement(By.xpath("//span[text()='TV Shows']"));
	
	
	 Actions act = new Actions(driver);
	 act.moveToElement(shopbycaty).build().perform();
	 
	 Thread.sleep(2000);
	 act.moveToElement(amzprimevid).build().perform();
	 
	 act.click(tvshows).build().perform();
	}
	public static void main(String[] args) throws InterruptedException {
		amazon();
	}
	
	
}
