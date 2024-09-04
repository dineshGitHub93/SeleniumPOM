package com.demoqa.pages;

import org.openqa.selenium.By;
import static com.selenium.utilities.JavaScriptUtilities.*;

public class WidgetsPage extends HomePage {
	
	private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
	
	public SelectMenuPage clickSelectMenu() {
		
		scrollIntoElementsJS(selectMenuItem);
		clickJS(selectMenuItem);
		return new SelectMenuPage();
		
	}

}
