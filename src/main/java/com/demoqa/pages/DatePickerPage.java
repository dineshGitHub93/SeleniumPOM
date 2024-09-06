package com.demoqa.pages;

import org.openqa.selenium.By;
import static com.selenium.utilities.Utilities.*; 

public class DatePickerPage extends WidgetsPage {
	
	private By selectDateField = By.id("datePickerMonthYearInput");
	private By monthDropDown = By.className("react-datepicker__month-select");
	private By yearDropDown = By.cssSelector(".react-datepicker__year-select");
	private By dayValue(String day) {
		return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+day+"']");
	}
	
	
	public void selectDate(String day) {
		clickOnBtn(dayValue(day));
	}
	public boolean isDayInMonth(String day) {
		return find(dayValue(day)).isDisplayed();
	}
	public void clickDateField() {
		clickOnBtn(selectDateField);
	}

	public String getDate() {
		return find(selectDateField).getAttribute("value");
	}
	
	public void selectMonth(String month) {
		selectByVisibleText(monthDropDown, month);
	}
	
	public void selectYear(String year) {
		selectByVisibleText(yearDropDown, year);
	}
}
