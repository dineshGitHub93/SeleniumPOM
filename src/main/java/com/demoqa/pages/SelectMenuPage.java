package com.demoqa.pages;

import org.openqa.selenium.By;
import static com.selenium.utilities.JavaScriptUtilities.*;
import static com.selenium.utilities.Utilities.*;

import java.util.List;

public class SelectMenuPage extends WidgetsPage{
	
	private By selectMultiText = By.id("cars");
	
	public void selectStandardMulti(String text) {
		scrollIntoElementsJS(selectMultiText);
		selectByVisibleText(selectMultiText, text);
	}
	
	public void selectStandardMulti(int index) {
		scrollIntoElementsJS(selectMultiText);
		selectByIndex(selectMultiText, index);
	}
	
	public void deselectStandardMulti(int index) {
		scrollIntoElementsJS(selectMultiText);
		deselectByIndex(selectMultiText, index);
	}
	
	public void deselectStandardMulti(String text) {
		scrollIntoElementsJS(selectMultiText);
		deselectByVisibleText(selectMultiText, text);
	}

	public List<String> getAllSelectedStandardMultiOptions(){
		return getAllSelectedOptions(selectMultiText);
	}
}
