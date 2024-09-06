package com.demoqa.pages;

import org.openqa.selenium.By;
import static com.selenium.utilities.JavaScriptUtilities.*;

public class WidgetsPage extends HomePage {
	
	private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
	private By datePickerMenuItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");
	
	public SelectMenuPage clickSelectMenu() {
		
		scrollIntoElementsJS(selectMenuItem);
		clickJS(selectMenuItem);
		return new SelectMenuPage();
		
	}

	public DatePickerPage clickDatePickerMenu() {
		
		scrollIntoElementsJS(datePickerMenuItem);
		clickJS(datePickerMenuItem);
		return new DatePickerPage();
		
	}
}
