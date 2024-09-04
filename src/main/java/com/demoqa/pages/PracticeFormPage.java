package com.demoqa.pages;

import org.openqa.selenium.By;
import static com.selenium.utilities.JavaScriptUtilities.*;

public class PracticeFormPage extends FormsPage{
	
	private By maleRadioButton = By.id("gender-radio-1");
	private By selectSpotsCheckBox = By.id("hobbies-checkbox-1");
	private By selectReadingCheckBox = By.id("hobbies-checkbox-2");
	private By selectMusicCheckBox = By.id("hobbies-checkbox-3");
	
	public void maleRadioButton() {
		scrollIntoElementsJS(maleRadioButton);
		clickJS(maleRadioButton);
	}

	public boolean isMaleRadioButtonSelected() {
		return find(maleRadioButton).isSelected();
		
	}
	
	public void selectSpotsCheckBox() {
		
		if(!find(selectSpotsCheckBox).isSelected()) {
			scrollIntoElementsJS(selectSpotsCheckBox);
			clickJS(selectSpotsCheckBox);
		}
		
	}
	
	public void selectReadingCheckBox() {
		
		if(!find(selectReadingCheckBox).isSelected()) {
			scrollIntoElementsJS(selectReadingCheckBox);
			clickJS(selectReadingCheckBox);
		}
		
	}
	
	public void selectMusicCheckBox() {
		
		if(!find(selectMusicCheckBox).isSelected()) {
			scrollIntoElementsJS(selectMusicCheckBox);
			clickJS(selectMusicCheckBox);
		}
		
	}
	
	public void unSlectReadingCheckBox() {
		
		if(find(selectReadingCheckBox).isSelected()) {
			scrollIntoElementsJS(selectReadingCheckBox);
			clickJS(selectReadingCheckBox);
		}
		
	}
	
	public boolean isUnSlectedReadingCheckBox() {
		return find(selectReadingCheckBox).isSelected();
	}
}
