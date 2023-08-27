package mandatoryHomeWork.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day9CreateAccounts {

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
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Arun-SDET");
		
		driver.findElement(By.xpath("(//button[@data-value='--None--'])[3]")).click();
		
		driver.findElement(By.xpath("//span[@title='Public']")).click();
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		String element = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		
		System.out.println(element);
		
		System.out.println(element.contains("created"));
	}

}









////WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
//driver.executeScript("arguments[0].click();", account);
