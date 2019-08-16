package org.sele.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAY_1 {
	public static void chromebrowserlaunch() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.quit();
		
	}
		/*public static void ielaunch() {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\IEDriverServer.exe");
			WebDriver driver1=new InternetExplorerDriver();
			driver1.get("https://www.facebook.com/");

		}*/
		public static void main(String[] args) throws InterruptedException {
			chromebrowserlaunch();
			//ielaunch();
		}
		
	}




