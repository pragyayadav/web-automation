package com.automationPractice.test.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.test.stepDefination.BaseClass;

public class ShoppingCartPage extends BaseClass{

	public WebDriver ldriver;

	public ShoppingCartPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "total_price")
	WebElement totalPrice;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	WebElement cartProceedCheckout;

	public String getTotalPrice() {
		return totalPrice.getText();
	}

	public void clickCartProceedCheckout() throws InterruptedException {
		Thread.sleep(5000);
		cartProceedCheckout.click();
		
		
/*		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView();", cartProceedCheckout);*/
	}
}
