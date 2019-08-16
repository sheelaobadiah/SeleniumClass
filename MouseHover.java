package org.sele.com;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHover {
	
		
		public static void mousePractice() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://automationpractice.com/index.php/");
		
			WebElement women=driver.findElement(By.xpath("//a[text()='Women']"));
			WebElement tshirt=driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
			
	Actions ma=new Actions(driver);
	ma.moveToElement(women).build().perform();
	Thread.sleep(2000);
	
	ma.click(tshirt).build().perform();
		}
	
	public static void main(String[] args) throws InterruptedException {
			mousePractice();
		}
	}



