package com.automationPractice.test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

	public WebDriver ldriver;

	public AddressPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "processAddress")
	WebElement processAddress;

	public void clickAddressProceedCheckout() {
		processAddress.click();
	}

}
