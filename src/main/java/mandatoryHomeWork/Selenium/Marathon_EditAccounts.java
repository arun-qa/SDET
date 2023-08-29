package mandatoryHomeWork.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Marathon_EditAccounts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option  = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://login.salesforce.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("arun09it@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Accounts");

		driver.findElement(By.xpath("//mark[text()='Accounts']")).click();

		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("DJ",Keys.ENTER);
	 	
	 	Thread.sleep(4000);
	 	
	 	WebElement dropdown = driver.findElement(By.xpath("//a[contains(@class,'rowActionsPlaceHolder')]"));
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", dropdown);
	  	   
	   driver.findElement(By.xpath("//a[@title='Edit']")).click();
	   	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("(//button[@role='combobox'])[2]")).click();
	   
	   driver.findElement(By.xpath("//span[@title='Technology Partner']")).click();
	   
	   jse.executeScript("arguments[0].click();", driver.findElement(By.xpath("//label[normalize-space()='Industry']/parent::lightning-combobox/div//button")));
	   
	   jse.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[@title='Healthcare']")));
	   
	   driver.findElement(By.xpath("//textarea[@name='street']")).sendKeys("Test Billing Street");
	   
	   driver.findElement(By.xpath("(//textarea[@name='street'])[2]")).sendKeys("Shipping Street");
	   
	   jse.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//div[@class = 'slds-input__icon-group slds-input__icon-group_right'])[7]")));
	   
	   driver.findElement(By.xpath("//span[@title='Low']")).click();
	   
	   driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[6]")).click();
	   
	   driver.findElement(By.xpath("//span[@title='Silver']")).click();
	   
	   driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[8]")).click();
	   
	   driver.findElement(By.xpath("//span[@title='No']")).click();
	   
	  WebElement ele =  driver.findElement(By.xpath("//input[@name='Phone']"));
	   
	  ele.sendKeys("9787567757");
	  
	  ele.clear();
	  
	   jse.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[7]")));
	   
	   driver.findElement(By.xpath("//span[@title='No']")).click();
	   
	   driver.findElement(By.xpath("//button[text()='Save']")).click();
	   
	   String text = driver.findElement(By.xpath("//td[@role='gridcell'][4]")).getText();
	   
	   System.out.println("The phone number "+ text +" has been saved successfully");
	   
	   driver.close();

	}

}
