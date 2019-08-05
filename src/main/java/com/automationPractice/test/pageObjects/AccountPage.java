package com.automationPractice.test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	public WebDriver ldriver;

	public AccountPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(className="account")
	WebElement userAccount;

	@FindBy(xpath = "//a[@title='Orders']")
	WebElement orderHistory;
	
	public void clickUser()
	{
		userAccount.click();
	}

	public void clickOrderHistory()
	{
		orderHistory.click();
	}

}
