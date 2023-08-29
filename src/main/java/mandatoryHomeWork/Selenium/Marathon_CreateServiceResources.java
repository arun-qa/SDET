package mandatoryHomeWork.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Marathon_CreateServiceResources {

	public static void main(String[] args) {
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
		
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Service Resources");
		
		driver.findElement(By.xpath("//mark[text()='Service Resources']")).click();
		
	 	WebElement dropdown = driver.findElement(By.xpath("//a[contains(@class,'rowActionsPlaceHolder')]"));
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", dropdown);
	  	   
        driver.findElement(By.xpath("//a[@title='Edit']")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
      WebElement ele =  driver.findElement(By.xpath("(//input[@class='slds-input'])[2]"));
      
      ele.clear();
      
      ele.sendKeys("Bob");
      
      driver.findElement(By.xpath("//button[text()='Save']")).click();
      
      String element = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		
		System.out.println(element);
		
		String message ="saved";
		
		if(element.contains(message))
		{
			System.out.println("Updated Name is Saved");
		}
		else
		{
			System.out.println("Name is not saved");
		}
		driver.close();
		

	}

}
