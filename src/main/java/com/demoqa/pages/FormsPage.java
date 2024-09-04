package com.demoqa.pages;

import org.openqa.selenium.By;
import static com.selenium.utilities.JavaScriptUtilities.*;

public class FormsPage extends HomePage{
	
	private By practiceFormMenu = By.xpath("//li[@id='item-0']//span[text()='Practice Form']");
	
	public PracticeFormPage clickPracticeForm() {
		
		scrollIntoElementsJS(practiceFormMenu);
		clickOnBtn(practiceFormMenu);
		return new PracticeFormPage();
	}

}
