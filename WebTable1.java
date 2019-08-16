
package org.selenium.com;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTable1 {

	
		public static void getTableData(String value) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.toolsqa.com/automation-practice-table/");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement table = driver.findElement(By.tagName("table"));
			List<WebElement>  trow= table.findElements(By.tagName("tr"));
			
			for(int i=0;i<trow.size();i++)
			{
				 List<WebElement> thead = trow.get(i).findElements(By.tagName("th"));
				 for(int j=0;j<thead.size();j++)
				 {
					 String text = thead.get(j).getText();
					 System.out.println("row" + i + "cell" +j + text);
					 if(text.equals(value)) {
						 
						 List<WebElement> tdata = trow.get(i).findElements(By.tagName("td"));
						 for(WebElement xdata : tdata)
						 {
							 System.out.println("row" + i + xdata.getText());
						 }
					 }
				 }
						 
		}
		}
	
public static void main(String[] args) throws InterruptedException {
	getTableData("Burj Khalifa");
}
}
	

	
