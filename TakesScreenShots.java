package org.sele.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShots {
	private static void screenShot() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		File screens = new File("C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\ScreenShots\\test3.png");
		
		TakesScreenshot takescreens = (TakesScreenshot)driver;
		
		File source = takescreens.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, screens);
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
public static void main(String[] args) throws IOException, InterruptedException {
	screenShot();
	
}
}
