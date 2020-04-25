package com.cucumber.signin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement loginButton;
	
	@FindBy(how=How.XPATH, using="//div[@id='error_box']")
	private WebElement error;

	public void enterEmailOrPhone(String value) {
		email.sendKeys(value);
	}

	public void enterPassword(String value) {
		password.sendKeys(value);
	}

	public void clickOnLoginButton() {
		loginButton.click();
		
	}
	
	public boolean isErrorAppear() {
		return error.isDisplayed();
		

	}

	
}
