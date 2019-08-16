package org.sele.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class auto_mation{

	public static void automationPractice() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php/");
		
		WebElement signin=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        signin.click();
        
		
		WebElement email=driver.findElement(By.xpath("//input[contains(@id,'email_create')]"));
        email.sendKeys("sheelaobadiah@gmail.com");
        
        WebElement createButton=driver.findElement(By.id("SubmitCreate"));
        createButton.click();
        Thread.sleep(1000);
        
        driver.manage().window().maximize();
    	
        WebElement radio=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        radio.click();
        
        WebElement firstname=driver.findElement(By.xpath("//input[@name='customer_firstname']"));
        firstname.sendKeys("sheela");
        
        WebElement lastname=driver.findElement(By.id("customer_lastname"));
        lastname.sendKeys("obadiah");
        
        WebElement mail=driver.findElement(By.id("email"));
        //mail.sendKeys("sheelaobadiah@gmail.com");
        
        WebElement pass=driver.findElement(By.id("passwd"));
        pass.sendKeys("Jesus");
        
        Thread.sleep(1000);
        
        WebElement day=driver.findElement(By.id("days"));
		Select daydd=new Select(day);
		daydd.selectByIndex(1);
		
		WebElement mon=driver.findElement(By.id("months"));
		Select month=new Select(mon);
		month.selectByValue("2");
		
		WebElement year=driver.findElement(By.name("years"));
		Select year1y=new Select(year);
		//year1y.selectByValue("3");
	    year1y.selectByVisibleText("2017  ");
	    

	
        WebElement company=driver.findElement(By.id("company"));
        company.sendKeys("texas");
        
        WebElement add=driver.findElement(By.id("address1"));
        add.sendKeys("villivakkam");
        
       WebElement add1=driver.findElement(By.id("address2"));
        add1.sendKeys("tamilnadu");
        
        WebElement city=driver.findElement(By.id("city"));
        city.sendKeys("chennai");
        
        WebElement state=driver.findElement(By.xpath("//select[@id='id_state']"));
        Select state1=new Select(state);
        state1.selectByVisibleText("Indiana");
        
        WebElement post=driver.findElement(By.id("postcode"));
        post.sendKeys("60005");
        
        WebElement country=driver.findElement(By.xpath("//select[@id='id_country']"));
        Select country1=new Select(state);
        country1.selectByIndex(1);
        
        
        WebElement mobile=driver.findElement(By.xpath("//input[@name='phone_mobile']"));
        mobile.sendKeys("9176357488");
        
        WebElement addref=driver.findElement(By.id("alias"));  
        //addref.sendKeys("northcarolina");
        Thread.sleep(3000);
        
        WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
        register.click();
        
	}
        public static void main(String[] args) throws InterruptedException{
        	automationPractice();
			
		}
        
}     
        
           
        
        
        
        
        
        
        
        
        
        
        
      
        
        
        
        
        
        
        
        

	    
	    

      
        
        
        
        
        
        
        
        
      
        

        
        
        

		
		

