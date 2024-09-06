package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import com.demoqa.pages.HomePage;

public class ElementPage extends HomePage{
	
	private By webTeblesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
	private By linkMenuItem = By.xpath("//li[@id='item-5']//span[text()='Links']");
	
	
	public WebTablesPage clickWebTables() {
		clickOnBtn(webTeblesMenuItem);
		return new WebTablesPage();
	}
	
	public LinkPage clickLinkMenu() {
		clickOnBtn(linkMenuItem);
		return new LinkPage();
	}

}
