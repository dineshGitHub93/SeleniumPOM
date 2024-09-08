package part3_4.com.demoqa.base;

import org.testng.annotations.Test;

public class CaptureFailedScreenShotTest extends BaseTest{
	
	@Test
	public void testSubmitButtonWithoutJavaScriptExecutor() {
		var practiceFormPage = homePage.goToForm().clickPracticeForm();
		practiceFormPage.clickSubmitButton();
	}

}
