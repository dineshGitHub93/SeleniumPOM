package part3_4.com.demoqa.base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest{
	
	@Test
	public void testWebTables() {
		
		String email ="alden@example.com";
		String age = "31";
		var webTablesPage = homePage.goToElement().clickWebTables();
		webTablesPage.clicEditBtn(email);
		webTablesPage.setAge(age);
		webTablesPage.submitBtn();
		String expectedAge = webTablesPage.getAge(email);
		
		Assert.assertEquals(age, expectedAge, "Actual & Expected age is not match");
		
	}

}
