package com.demoqa.pages;

import org.openqa.selenium.By;
import static com.selenium.utilities.JavaScriptUtilities.*;

public class Alerts_Frames_WindowsPage extends HomePage{
	
	private By selectModelDialogsManu = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
	
	public SelectModelDialogs clickModelDialog() {
		
		scrollIntoElementsJS(selectModelDialogsManu);
		clickJS(selectModelDialogsManu);
		return new SelectModelDialogs();
		
	}
	
	

}
