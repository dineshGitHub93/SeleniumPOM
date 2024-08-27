package Selenium.pom.com.test;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.ProductPage;

import Selenium.pom.com.base.BaseTest;

public class ProductTest extends BaseTest{

	@Test
	public void productHeaderIsDisplayed() {
		
		ProductPage productPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
		
		Assert.assertTrue(productPage.isProductHeaderDisplayed(), "Product Header is not displayed");
		
		//assertFalse(productPage.isProductHeaderDisplayed(), "Product Header is not displayed");
	}
}
