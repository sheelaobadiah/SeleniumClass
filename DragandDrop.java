package org.sele.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	
	WebElement drag = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
	WebElement drop = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
	
	Actions dradrop=new Actions(driver);
	
	dradrop.dragAndDrop(drag, drop).build().perform();
	
	Thread.sleep(2000);
	
	WebElement drag1 = driver.findElement(By.xpath("//li[@id='credit2']"));
	WebElement drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	
Actions dragdrop1 = new Actions(driver);

dragdrop1.dragAndDrop(drag1, drop1).build().perform();

Thread.sleep(2000);

driver.manage().window().maximize();


driver.navigate().refresh();

WebElement drag2 = driver.findElement(By.xpath("//li[@id='credit1']"));
WebElement drop2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));

Actions dragdrop2 = new Actions(driver);

dragdrop2.dragAndDrop(drag2, drop2).build().perform();

Thread.sleep(3000);

driver.navigate().refresh();


WebElement drag3 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
WebElement drop3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

Actions dragdrop3=new Actions(driver);

dragdrop3.dragAndDrop(drag3, drop3).build().perform();
Thread.sleep(3000);

//driver.navigate().refresh();


/*WebElement drag3 = driver.findElement(By.xpath("//li[@id='credit0']"));

//driver.manage().window().maximize();

WebElement drop3 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));

Actions dragdrop3 = new Actions(driver);

dragdrop3.dragAndDrop(drag3, drop3).build().perform();

Thread.sleep(2000);*/
	}
}