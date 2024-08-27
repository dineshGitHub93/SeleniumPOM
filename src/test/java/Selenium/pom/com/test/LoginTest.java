package Selenium.pom.com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Selenium.pom.com.base.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test
	public void testLoginErrorMessage() {
		loginPage.setUserName("standard_user");
		loginPage.setPassword("secret_sauc");
		loginPage.clickLoginButton();
		String actualError = loginPage.getErrorMessage();
		Assert.assertTrue(actualError.contains("Epic sadface"));
		//Assert.assertFalse(actualError.contains("Epic sadface"));
	}

}
