package com.demoqa.pages;

import org.openqa.selenium.By;

import com.saucedemo.pages.BasePage;

import static com.selenium.utilities.JavaScriptUtilities.*;

public class SelectAlertMenu extends Alerts_Frames_WindowsPage{
	
	private By clickToSeeAlertInfo = By.id("alertButton");
	private By cilickToSeePromptAlert = By.id("promtButton");
	private By getPromtValue = By.id("promptResult");
	private By cilickToSeeConfirmationAlert = By.id("confirmButton");
	private By getConfirmationAlertResult = By.id("confirmResult");
	
	public void clickToSeeAlertInfo() {
		clickOnBtn(clickToSeeAlertInfo);
	}

	public void clickToSeePromptAlert() {
		scrollIntoElementsJS(cilickToSeePromptAlert);
		clickJS(cilickToSeePromptAlert);
	}
	
	public String getPromptResult() {
		return find(getPromtValue).getText();
	}
	
	public void clickToSeeConfirmationAlert() {
		scrollIntoElementsJS(cilickToSeeConfirmationAlert);
		clickJS(cilickToSeeConfirmationAlert);
	}
	
	public String getConfirmationResult() {
		return find(getConfirmationAlertResult).getText();
	}
	
}
