package part3_4.com.demoqa.base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {
	
	@Test
	public void testCheckBoxFuntion() {
		
		var formpage = homePage.goToForm().clickPracticeForm();
		formpage.selectSpotsCheckBox();
		formpage.selectReadingCheckBox();
		formpage.selectMusicCheckBox();
		formpage.unSlectReadingCheckBox();
		var isReadingcheckboxSelected = formpage.isUnSlectedReadingCheckBox();
		Assert.assertFalse(isReadingcheckboxSelected, "Reading check box selected");
	}

}
