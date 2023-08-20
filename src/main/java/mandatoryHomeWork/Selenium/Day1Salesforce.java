package mandatoryHomeWork.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://login.salesforce.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		//driver.findElement(By.xpath("//span[text()='Accounts']"));
		
		WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
        driver.executeScript("arguments[0].click();", account);
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("ArunG");
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();

	}

}
