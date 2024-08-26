package Selenium.basics.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageNegativeValidation {

	WebDriver driver;
	
	@BeforeClass
	public void setBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	
	@Test
	public void testLoggingIntoApplication() throws InterruptedException {
		Thread.sleep(2000);
		
		var userName = driver.findElement(By.xpath("//*[@id='login']/ul/li[2]/b[1]")).getText()+1;
		var password = driver.findElement(By.xpath("//*[@id='login']/ul/li[2]/b[2]")).getText();
		
		WebElement userNameField = driver.findElement(By.id("username"));
		userNameField.sendKeys(userName);
		
		var passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys(password);
		
		driver.findElement(By.className("btn")).click();
		
		Thread.sleep(3000);
		
		String actualResult = driver.findElement(By.id("error")).getText();
		String expectedResult = "Your username is invalid!";
		
		Assert.assertEquals(actualResult, expectedResult);
	}
}
