package part3_4.com.demoqa.base;

import static com.selenium.utilities.Utilities.acceptAlert;
import static com.selenium.utilities.Utilities.sendValueToPrompt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertPromptOptionTest extends BaseTest {
	
	@Test
	public void clickAlertPromtAndGetInformation() {
		String value ="Dinesh";
		var alertPage = homePage.goToAlertsFramesWindows().clickAlertMenu();
		alertPage.clickToSeePromptAlert();
		sendValueToPrompt(value);
		String actualPromtValue = alertPage.getPromptResult();
		Assert.assertTrue(actualPromtValue.contains(value), 
				"/n Actual & Expected Messages does not match");
		acceptAlert();
		
	}

}
