package com.demoqa.pages;

import org.openqa.selenium.By;

import com.demoqa.pages.elements.ElementPage;
import com.saucedemo.pages.BasePage;
import static com.selenium.utilities.JavaScriptUtilities.*;

public class HomePage extends BasePage{
	
	private By formCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
	private By elementCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
	private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
	
	public FormsPage goToForm() {
		scrollIntoElementsJS(formCard);
		clickOnBtn(formCard);
		return new FormsPage();
	}
	
	public ElementPage goToElement() {
		scrollIntoElementsJS(elementCard);
		clickJS(elementCard);
		return new ElementPage();
	}
	
	public WidgetsPage goToWidgets() {
		scrollIntoElementsJS(widgetsCard);
		clickJS(widgetsCard);
		return new WidgetsPage();
		
	}
}
