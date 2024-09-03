package part3_4.com.demoqa.base;

import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTest{
	
	@Test
	public void testScrollToElements() {
		homePage.goToForm();
	}

}
