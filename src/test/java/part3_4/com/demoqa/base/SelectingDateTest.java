package part3_4.com.demoqa.base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectingDateTest extends BaseTest{
	
	@Test
	public void selectingDateTest() {
		
		String date = "17";
		String month = "May";
		String year = "2025";
		String monthInNum = "05";
		
		var datePicker = homePage.goToWidgets().clickDatePickerMenu();
		datePicker.clickDateField();
		datePicker.selectMonth(month);
		datePicker.selectYear(year);
		
		if(datePicker.isDayInMonth(date)) {
			
			datePicker.selectDate(date);
			
			String actualDate = datePicker.getDate();
			String expctedDate = monthInNum+"/"+date+"/"+year;
			
			Assert.assertEquals(actualDate, expctedDate, "\n Actual Date & Expected Date does not match"+
			"\n Actual Date   : "+actualDate+
			"\n Expected Date : "+expctedDate);
		}
		else {
			
			System.out.println("Given date is not displayed in the month");
		}
		
		

	}

}
