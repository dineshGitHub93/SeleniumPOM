package part3_4.com.demoqa.base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkTest extends BaseTest {

	@Test
	public void testLinkPage() {
		
		var testLinkpage = homePage.goToElement().clickLinkMenu();
		testLinkpage.clickBadRequestLink();
		String actualResponse = testLinkpage.getLinkResponse();
		Assert.assertFalse(actualResponse.contains("400") && actualResponse.contains("Bad Request"), 
				"Actual Response ("+actualResponse+") /n Does not match with 400 & Bad Request /n");
	}
}
