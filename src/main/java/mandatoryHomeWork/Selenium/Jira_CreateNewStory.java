package mandatoryHomeWork.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jira_CreateNewStory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://api-training.atlassian.net/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com");
		
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		driver.findElement(By.id("password")).sendKeys("India@123");
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//p[text()='SDET-5']")).click();
		
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		
		driver.findElement(By.id("summary-field")).sendKeys("Arun SDET-5");
		
		driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Backlog']")).click();
		
		driver.findElement(By.xpath("//input[@data-test-id='searchfield']")).sendKeys("Arun SDET-5");
		
		driver.findElement(By.xpath("(//*[text()='Arun SDET-5'])[2]")).isDisplayed();
		
		driver.quit();
		
		

	}

}
