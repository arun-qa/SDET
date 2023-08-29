package mandatoryHomeWork.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Marathon_VerifySorting {

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
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
        driver.executeScript("arguments[0].click();", account);
        
        driver.findElement(By.xpath("//a[contains(@class,'toggle slds-th__action')]")).click();
        
        driver.close();
        

	}

}
