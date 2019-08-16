package org.sele.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void chromebrowserlaunch() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement b1=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		b1.click();
		Thread.sleep(2000);
		
		WebElement b2=driver.findElement(By.xpath("//i[contains(@class,'fb_logo')]"));
		System.out.println(b2.getText());
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com/");

		
		
		WebElement b3=driver.findElement(By.xpath("//div[contains(text(),'I')]"));
		System.out.println(b3.getText());
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		WebElement b4=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		b4.click();
		//Thread.sleep(2000);
		//driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		chromebrowserlaunch();
		
	}


}
