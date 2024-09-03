package part3_4.com.demoqa.base;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectDropDownTest extends BaseTest{
	
	@Test
	public void testMultiDropDown() {
		var dropDownSelect = homePage.goToWidgets().clickSelectMenu();
		
		//Select value
		dropDownSelect.selectStandardMulti("Volvo");
		dropDownSelect.selectStandardMulti(1);
		dropDownSelect.selectStandardMulti("Opel");
		dropDownSelect.selectStandardMulti(3);
		
		//de-select value
		dropDownSelect.deselectStandardMulti("Saab");
		dropDownSelect.deselectStandardMulti(2);
		
		//Validate selected data
		List<String> actualOptions = 
				dropDownSelect.getAllSelectedStandardMultiOptions();
		Assert.assertTrue(actualOptions.contains("Volvo"));
		Assert.assertFalse(actualOptions.contains("Saab"));
		Assert.assertFalse(actualOptions.contains("Opel"));
		Assert.assertTrue(actualOptions.contains("Audi"));
		
		
	}

}
