package org.sele.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollclass {
	public static void amazonPractice() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
	
		
		//bottom to top
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//interface
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		//bottom to top
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js1.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);	
	
	
	/*public static void amazonPractice2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/ref=nav_logo/");*/
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
	
		WebElement shoes = driver.findElement(By.xpath("(//div[contains(@class,'a-image-container ')])[5]"));
		
		//(//div[contains(@class,'a-image-container ')])
		
		WebElement logo=driver.findElement(By.id("nav-logo"));
		//bottom to top
		JavascriptExecutor js2 =(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].scrollIntoView(false):",shoes);
		Thread.sleep(3000);
		js2.executeScript("arguments[0].scrollIntoView(true):",logo);
				
	}	
	public static void main(String[] args) throws InterruptedException {
		
		amazonPractice();
		//amazonPractice2();
	}
}

