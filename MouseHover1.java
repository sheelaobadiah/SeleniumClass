package org.sele.com;



	
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class MouseHover1 {
	
		public static void mousePractice() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.amazon.com/");
		
			WebElement hellosign=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2'])[1]"));
			WebElement signin=driver.findElement(By.xpath("(//span[contains(@class,'nav-action-inner')])[1]"));
			
	Actions ma=new Actions(driver);
	ma.moveToElement(hellosign).build().perform();
	Thread.sleep(2000);
	
	ma.click(signin).build().perform();
		}
	
	public static void main(String[] args) throws InterruptedException {
			mousePractice();
		}
	}




	



