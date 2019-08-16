package org.selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void getTableData(String string) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement>  trow= table.findElements(By.tagName("tr"));
		
		for(WebElement xRow:trow) {
			List<WebElement> tdata=xRow.findElements(By.tagName("td"));
			for(WebElement xcell:tdata)
			{
				String text=xcell.getText();
				System.out.println(text);
			}
		}
			
	}
	public static void main(String[] args) throws InterruptedException {
		getTableData("Burj Khalifa");
		
	}

}

