package part3_4.com.demoqa.base;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.BasePage;

import static com.selenium.utilities.Utilities.*;

public class AlertOptionTest extends BaseTest{
	
	public void clickAlertAndGetInformation() {
		String expectedAlertText = "You clicked a button";
		var alertPage = homePage.goToAlertsFramesWindows().clickAlertMenu();
		alertPage.clickToSeeAlertInfo();
		
		Assert.assertEquals(getAlertText(), expectedAlertText, 
				"/n Actual & Expected Messages does not match");
		acceptAlert();
		
	}
	
	public void clickConfirmationAlertAndGetInformation() {
		var alertPage = homePage.goToAlertsFramesWindows().clickAlertMenu();
		alertPage.clickToSeeConfirmationAlert();
		dismissAlert();
		String actualConfirmationResult = alertPage.getConfirmationResult();
		String expectedConfirmationResult = "You selected Cancel";
		Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult, 
				"/n Actual & Expected Messages does not match");
				
	}
	
	@Test
	public void clickAlertPromtAndGetInformation() {
		String value ="Dinesh";
		var alertPage = homePage.goToAlertsFramesWindows().clickAlertMenu();
		alertPage.clickToSeePromptAlert();
		sendValueToPrompt(value);
		acceptAlert();
		String actualPromtValue = alertPage.getPromptResult();
		Assert.assertTrue(actualPromtValue.contains(value), 
				"/n Actual & Expected Messages does not match");
		
	}
}
