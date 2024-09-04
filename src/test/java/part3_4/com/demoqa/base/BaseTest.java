package part3_4.com.demoqa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
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
	
	@AfterClass
	public void tearDown() {
		BasePage.delay(3000);
		driver.quit();
	}
}
