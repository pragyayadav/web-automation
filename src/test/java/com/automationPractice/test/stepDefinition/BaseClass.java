package com.automationPractice.test.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automationPractice.test.pageObjects.AccountPage;
import com.automationPractice.test.pageObjects.AddressPage;
import com.automationPractice.test.pageObjects.LoginPage;
import com.automationPractice.test.pageObjects.OrderHistoryPage;
import com.automationPractice.test.pageObjects.OrderSummaryPage;
import com.automationPractice.test.pageObjects.PaymentPage;
import com.automationPractice.test.pageObjects.PersonalInfoPage;
import com.automationPractice.test.pageObjects.ProductPage;
import com.automationPractice.test.pageObjects.ShippingPage;
import com.automationPractice.test.pageObjects.ShoppingCartPage;

public class BaseClass {

	public WebDriver driver;
	public LoginPage login;
	public ProductPage product;
	public ShoppingCartPage shop;
	public AddressPage address;
	public OrderSummaryPage order;
	public ShippingPage ship;
	public PaymentPage payment;
	public OrderHistoryPage orderHistory;
	public AccountPage account;
	public PersonalInfoPage personalInfo;

	String projectPath = System.getProperty("user.dir");

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
