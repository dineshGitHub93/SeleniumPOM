package part3_4.com.demoqa.base;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoqa.pages.HomePage;

public class ModelDialogTest extends BaseTest{
	
	@Test
	public void textModelDialogPage() {
		var modelDialogPage = homePage.goToAlertsFramesWindows().clickModelDialog();
		modelDialogPage.clickSmallModel();
		String actualText = modelDialogPage.getText();
		System.out.println(actualText);
		
		Assert.assertTrue(actualText.contains("small modal."),
				"/n Text Does not matct actual results");
		modelDialogPage.clickCloseButton();
	}

}
