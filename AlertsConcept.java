package org.sele.com;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsConcept {
	private static void alertsConcepts() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	
		driver.manage().window().maximize();

		WebElement simple=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
		simple.click();
		Thread.sleep(2000);
		Alert sA=driver.switchTo().alert();
		sA.accept();
		driver.switchTo().defaultContent();

		WebElement confirm=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
		confirm.click();
		Thread.sleep(2000);
		Alert confirmAlert=driver.switchTo().alert();
		confirmAlert.dismiss();
		driver.switchTo().defaultContent();

		WebElement prompt=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
		prompt.click();
		Thread.sleep(1000);
		Alert promptAlert=driver.switchTo().alert();
		prompt.sendKeys("sheela");
		promptAlert.accept();
		driver.switchTo().defaultContent();
		
		}

public static void main(String[] args) throws InterruptedException {
		alertsConcepts();
		}
}
	
	

