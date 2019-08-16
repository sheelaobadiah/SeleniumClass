package org.selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SendKeys {
	public static void chromebrowserLauch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);

	WebElement emailfield = driver.findElement(By.id("email"));
	boolean displayed = emailfield.isDisplayed();
		boolean enabled = emailfield.isEnabled();
		if(displayed&&enabled)
		{
			emailfield.clear();
			emailfield.sendKeys("Hello");
			
		}
		
		
		String attribute = emailfield.getAttribute("value");
		System.out.println(attribute);
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='1']"));
		radiobutton.click();
		boolean selected = radiobutton.isSelected();
		System.out.println("RadioButton=" +selected);
		//check whether radio button is selected ie true or false and  print that one
		
		
		String text = driver.findElement(By.xpath("//div[@class='_5iyx']")).getText();//div[@class='_5iyx']
		System.out.println("get text for facebook header" +text);
		//getting text using gettext
		
		
		WebElement mobilefield = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		String attribute2 = mobilefield.getAttribute("class");
		mobilefield.getTagName();
		System.out.println("class attribute value" +attribute2);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String beforeSelecting = firstSelectedOption.getText();
		System.out.println("before selecting" +beforeSelecting);
		
		
		s.selectByValue("5");
		WebElement firstSelectedOption2 = s.getFirstSelectedOption();
		String afterSelecting = firstSelectedOption2.getText();
		System.out.println("before selecting" +afterSelecting);
		System.out.println("options in month dropdown");
		
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
	
	
}
	public static void main(String[] args) throws InterruptedException {
	chromebrowserLauch();
	
	}
}
//invalid argument exception