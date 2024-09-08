package part3_4.com.demoqa.base;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler.*;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.demoqa.pages.HomePage;
import com.saucedemo.pages.BasePage;
import com.selenium.utilities.Utilities;

public class BaseTest {

	private WebDriver driver;
	protected BasePage basePage;
	protected HomePage homePage;
	protected Utilities utl;
	private String URL ="https://demoqa.com/";
	
	@BeforeClass
	public void browserSetUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void loadApplication() {
		driver.get(URL);
		basePage = new BasePage();
		basePage.setDriver(driver);
		utl.setUtilityDriver();
		homePage = new HomePage();
		
	}
	
	@AfterMethod
	public void takeSnapForFailedResults(ITestResult testResult) {
		
		if(ITestResult.FAILURE == testResult.getStatus()) {
			TakesScreenshot screenShot =(TakesScreenshot) driver;
			File source = screenShot.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\dines\\git\\repository\\SeleniumPOM\\src\\main\\resources\\screenshots\\"+
					java.time.LocalDate.now()+
					testResult.getName()+ ".png");
			
			try {
				FileHandler.copy(source, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Screen Shot located at : "+destination);
		}
		
		
	}
	
	@AfterClass
	public void tearDown() {
		BasePage.delay(3000);
		driver.quit();
	}
}
