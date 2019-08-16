package org.sele.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day_Data {
	
public static void day() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	//select[@id='day']
	Select s=new Select(day);
	List<WebElement> options = s.getOptions();
	for(WebElement j:options)
	{
		String days = j.getText();
		System.out.println(days);
		
	}
	
	Thread.sleep(2000);
}
	public static void main(String[] args) throws InterruptedException {
		day();
	}

}

