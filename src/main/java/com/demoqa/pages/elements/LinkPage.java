package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static com.selenium.utilities.JavaScriptUtilities.*;

public class LinkPage extends ElementPage{
	
	private By badRequestLink = By.id("bad-request");
	private By linkResponse = By.id("linkResponse");
	
	public void clickBadRequestLink() {
		scrollIntoElementsJS(badRequestLink);
		clickOnBtn(badRequestLink);
	}
	
	public String getLinkResponse() {
		delay(2000);
		return find(linkResponse).getText();
	}

}
