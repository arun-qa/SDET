package mandatoryHomeWork.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Marathon_DeleteAccounts {

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
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
        driver.executeScript("arguments[0].click();", account);
        
        driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("DJ",Keys.ENTER);
	 	
	 	Thread.sleep(2000);
 	   
	 	WebElement dropdown = driver.findElement(By.xpath("//a[contains(@class,'rowActionsPlaceHolder')]"));
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", dropdown);
	  	   
	   driver.findElement(By.xpath("//a[@title='Delete']")).click();
	   
	   driver.findElement(By.xpath("//span[text()='Delete']")).click();
	   
	   driver.findElement(By.xpath("//input[@class='slds-input']")).clear();
	   
	   driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("DJ",Keys.ENTER);
	   
	   Thread.sleep(2000);
	   
	   String text = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
	   	   
	   if(text.contains(text))
		{
			System.out.println("Account is deleted");
		}
		else
		{
			System.out.println("Account is not Created");
		}
	   
	   
	   
	   
		

	}

}
