package com.selenium.utilities;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.saucedemo.pages.BasePage;

public class Utilities{

	public static WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	WebElement element;
	

	public static void setUtilityDriver() {
		driver = BasePage.driver;
	}
		
	//DropDown utilities 
	private static Select findDropDown(By locator) {
		return new Select(driver.findElement(locator));
	}
	
	public static void selectByVisibleText(By locator, String text) {
		findDropDown(locator).selectByVisibleText(text);
	}
	
	public static void selectByIndex(By locator, int index) {
		findDropDown(locator).selectByIndex(index);
	}
	
	public static void selectByValue(By locator, String Value) {
		findDropDown(locator).selectByValue(Value);
	}
	
	public static void deselectByVisibleText(By locator, String text) {
		findDropDown(locator).deselectByVisibleText(text);
	}
	
	public static void deselectByIndex(By locator, int index) {
		findDropDown(locator).deselectByIndex(index);
	}
	
	public static List<String> getAllSelectedOptions(By locators){
		List<WebElement> allSelectedOptions = 
				findDropDown(locators).getAllSelectedOptions();
		return allSelectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
		
	}
	//Generate A Random number
	
	//Return Strings To UpperCase
}
