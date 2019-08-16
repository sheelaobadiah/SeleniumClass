package org.selenium.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WindowHandle1 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
		//google->images->inspect
		
		//to get first window ie go into images and open new tab
		
		String fid=driver.getWindowHandle(); //w1
		System.out.println(fid); //1
		Actions ac=new Actions(driver);
		ac.contextClick(images).build().perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
		//gmail and opens gmail in new tab 
		
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		//google->gmail->inspect
		ac.contextClick(gmail).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		Set<String> sid = driver.getWindowHandles(); //w2
		
		for(String s:sid)
		{
			System.out.println(s);
			driver.switchTo().window(s); //2
			String title = driver.getTitle();
			System.out.println(title); //3
			
		if(title.equals("Google"))
		{
			WebElement lucky = driver.findElement(By.xpath("(//input[@type='submit'])[4]"));
			//google->i'm feeling lucky->inspect
			lucky.click();
			Thread.sleep(3000);
			driver.close();
			
		}
		else if(title.equals("Gmail-Free Sstorage and Email from Google")) {
			WebElement signin = driver.findElement(By.xpath("//a[@class='h-c-header__nav-li-link ']"));
			//google->gmail->sign in ->inspect
			signin.click();
			Set<String> sid2 = driver.getWindowHandles();
			System.out.println(sid2); //4
		}
		
			
			/*for(String s1:sid2)
			{
				System.out.println(s1);
				driver.switchTo().window(s1);
				String title1 = driver.getTitle();
				System.out.println(title1);
					
			}*/
			else if(title.equals("Google Images")) {
				WebElement imagesearch = driver.findElement(By.name("q"));
				//above line is google->images->searchtab inside rightclick ->inspect
				imagesearch.sendKeys("mobile");
				Thread.sleep(3000);
				driver.close();
			}
		}
				
	}
}