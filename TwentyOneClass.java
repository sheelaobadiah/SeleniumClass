package com.allprogramssele.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TwentyOneClass {
	private static void dayOne() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.quit();
	}
	private static void dayTwo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		 String currenturl = driver.getCurrentUrl();
		 System.out.println(currenturl);
		
		 driver.quit();
	}
	private static void dayThree() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		WebElement emailfield = driver.findElement(By.id("email"));
		boolean displayed = emailfield.isDisplayed();
			boolean enabled = emailfield.isEnabled();
			if(displayed&&enabled)
				emailfield.clear();
			{
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
		driver.quit();
	}
	private static void dayFour() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement b1=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		b1.click();
		Thread.sleep(2000);
		
		WebElement b2=driver.findElement(By.xpath("//i[contains(@class,'fb_logo')]"));
		System.out.println(b2.getText());
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com/");

		
		
		WebElement b3=driver.findElement(By.xpath("//div[contains(text(),'I')]"));
		System.out.println(b3.getText());
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		WebElement b4=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		b4.click();
		//Thread.sleep(2000);
		driver.quit();
	}
	private static void dayFive() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
		WebElement day=driver.findElement(By.id("day"));
		Select daydd=new Select(day);
		daydd.selectByIndex(0);
		
		WebElement mon=driver.findElement(By.id("month"));
		Select month=new Select(mon);
		month.selectByValue("2");
		
		WebElement year=driver.findElement(By.id("year"));
		Select year1y=new Select(year);
	    year1y.selectByVisibleText("2018");
	    
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.quit();
	}
	private static void daySix() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		WebElement selectoption = driver.findElement(By.id("multi-select"));
		Select s=new Select(selectoption);
		boolean multiple = s.isMultiple();
		
		if(multiple) {
			s.selectByVisibleText("California");
			s.selectByValue("New Jersey");
			s.deselectByIndex(3);
			
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for(int i=0;i<allSelectedOptions.size();i++)
			{
				System.out.println(allSelectedOptions.get(i).getText());
			}
				//Thread.sleep(10000);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				
				s.deselectByVisibleText("California");
				s.deselectAll();
				driver.navigate().refresh();
				driver.quit();
			}

	}
	private static void daySeven(String string) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
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
		driver.quit();
	}
	private static void dayEight() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//bottom to top
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		
		driver.quit();
	
	}
	private static void dayNine() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		File screens = new File("C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\ScreenShots\\test2.png");
		
		TakesScreenshot takescreens = (TakesScreenshot)driver;
		
		File source = takescreens.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, screens);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
	
	private static void dayTen() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php/");
	
		WebElement women=driver.findElement(By.xpath("//a[text()='Women']"));
		WebElement tshirt=driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
		
Actions ma=new Actions(driver);
ma.moveToElement(women).build().perform();
//Thread.sleep(2000);
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


ma.click(tshirt).build().perform();
driver.quit();
	}
	
	private static void dayEleven() throws InterruptedException {
		
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
driver.quit();
//driver.navigate().refresh();


/*WebElement drag3 = driver.findElement(By.xpath("//li[@id='credit0']"));

//driver.manage().window().maximize();

WebElement drop3 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));

Actions dragdrop3 = new Actions(driver);

dragdrop3.dragAndDrop(drag3, drop3).build().perform();

Thread.sleep(2000);*/
	}
	
	private static void dayTwelve() throws AWTException {
		
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.com/");
			
			WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
			
			//to get first window
			
			String fid=driver.getWindowHandle();
			System.out.println(fid);
			Actions ac=new Actions(driver);
			ac.contextClick(images).build().perform();
			
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			//Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					
			WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
			ac.contextClick(gmail).build().perform();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			Set<String> sid = driver.getWindowHandles();
			
			for(String s:sid)
			{
				System.out.println(s);
				driver.switchTo().window(s);
				String title = driver.getTitle();
				System.out.println(title);
				
			}
			
		//driver.quit();
		}
	
	private static void dayThirteen() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
			driver.manage().window().maximize();

			WebElement simple=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
			simple.click();
			Thread.sleep(2000);
			Alert sA=driver.switchTo().alert();
			sA.accept();
			driver.switchTo().defaultContent();

			WebElement confirm=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
			confirm.click();
			Thread.sleep(2000);
			Alert confirmAlert=driver.switchTo().alert();
			confirmAlert.dismiss();
			driver.switchTo().defaultContent();
			//driver.quit();
			
		
	}
	private static void dayFourteen() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement frame1 = driver.findElement(By.id("singleframe"));
		
		driver.switchTo().frame(frame1);
		
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		textBox.sendKeys("Mahe");
		//driver.quit();
		
	}


	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		dayOne();
		dayTwo();
		dayThree();
		dayFour();
		dayFive();
		daySix();	
		daySeven("Burj Khalifa");
		dayEight();
		dayNine();
		dayTen();
		dayEleven();
		dayTwelve();
		dayThirteen();
		dayFourteen();		
	}

}
