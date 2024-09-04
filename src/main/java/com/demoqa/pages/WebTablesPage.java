package com.demoqa.pages;

import org.openqa.selenium.By;
import static com.selenium.utilities.JavaScriptUtilities.*;

public class WebTablesPage extends ElementPage {
	
	By ageField = By.id("age");
	By submitButton = By.id("submit");
	
	public void clicEditBtn(String email) {
		By edit = By.xpath("//div[text()='"+email+"']//following::span[@id='edit-record-2']");
		clickOnBtn(edit);
	}
	
	public void setAge(String age) {
		set(ageField, age);
	}
	public void submitBtn() {
		clickJS(submitButton);
	}
	
	public String getAge(String email) {
		By webTablesAge = By.xpath("//div[text()='"+email+"']//preceding::div[1]");
		return find(webTablesAge).getText();
	}
}
