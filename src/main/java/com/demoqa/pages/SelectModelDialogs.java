package com.demoqa.pages;

import org.openqa.selenium.By;
import static com.selenium.utilities.JavaScriptUtilities.*;

public class SelectModelDialogs extends Alerts_Frames_WindowsPage{

	private By smallModel = By.id("showSmallModal");
	private By smallText = By.xpath("//div[contains(text(),'small modal')]");
	private By closeButton = By.id("closeSmallModal");
	
	public void clickSmallModel() {
		clickJS(smallModel);
	}
	
	public String getText() {
		return find(smallText).getText();
	}
	
	public void clickCloseButton() {
		clickJS(closeButton);
	}
}
