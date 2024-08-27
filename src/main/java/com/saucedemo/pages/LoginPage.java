package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	
	private By userNameField = By.id("user-name");
	private By userPasswordField = By.id("password");
	private By LoginBtn = By.id("login-button");
	private By errorMessage = By.cssSelector("#login_button_container h3");
	
	public void setUserName(String userName) {
		set(userNameField, userName);
	}
	
	public void setPassword(String password) {
		set(userPasswordField, password);
	}
	
	public ProductPage clickLoginButton() {
		clickOnBtn(LoginBtn);
		return new ProductPage();
	}
	
	public ProductPage logIntoApplication(String userName, String password) {
		setUserName(userName);
		setPassword(password);
		return clickLoginButton();
	}

	public String getErrorMessage() {
		return find(errorMessage).getText();
	}
}
