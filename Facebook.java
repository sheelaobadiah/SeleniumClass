package org.selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void chromeBrowserLaunch(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chromeBrowserLaunch();
		System.out.println("hell");
	}

}
