package com.automationPractice.test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {

	public WebDriver ldriver;

	public OrderSummaryPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement confirmOrder;

	public void clickConfirmOrder() {
		confirmOrder.click();
	}

}
