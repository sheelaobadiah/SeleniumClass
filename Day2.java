package org.sele.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day2 {
public static void chromebrowserlaunch() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.facebook.com/");
	
	driver.navigate().back();
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	 String currenturl = driver.getCurrentUrl();
	 System.out.println(currenturl);
	
	 driver.quit();
	 
}
public static void main(String[] args) throws InterruptedException {
	chromebrowserlaunch();
}
	
	
}

