package com.tests.easyges.page_objects;

import com.tests.easyges.base.BasePage;
import com.tests.easyges.hooks.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	/* Retrieve Web Element */
	@FindBy(how = How.XPATH, using = "//input[@data-qa='login-email']")
	private static WebElement email;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Login']")
	private static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Logout']")
	private static WebElement btnLogout;
	

	public LoginPage() {
		super(Setup.getDriver());
	}

	public static WebElement getUsername() {
		waitForElementToBeVisible(email);
		return email;
	}

	public static WebElement getPasswordField() {
		waitForElementToBeVisible(password);
		return password;
	}

	public static WebElement getBtnLogin() {
		waitForElementToBeClickable(btnLogin);
		return btnLogin;
	}

	public static WebElement getBtnLogout() {
		waitForElementToBeClickable(btnLogout);
		return btnLogout;
	}

}
