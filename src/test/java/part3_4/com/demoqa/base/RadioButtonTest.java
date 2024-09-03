package part3_4.com.demoqa.base;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;

public class RadioButtonTest extends BaseTest{
	
	@Test
	public void maleRadioButtonClick() {
		var formpage = homePage.goToForm().clickPracticeForm();
		formpage.maleRadioButton();
		var isMaleRadioButtonSelected = formpage.isMaleRadioButtonSelected();
		Assert.assertTrue(isMaleRadioButtonSelected, "Male radio button is not selected");
	}

}
