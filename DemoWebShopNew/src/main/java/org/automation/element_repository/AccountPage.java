package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	
	@FindBy(xpath = "//a[text()='Change password']")
	private WebElement changePassword;
	
	@FindBy(id = "OldPassword")
	private WebElement oldPassword;
	
	@FindBy(id = "NewPassword")
	private WebElement newPassword;
	
	@FindBy(id = "ConfirmNewPassword")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@value='Change password']")
	private WebElement changePwd;
	
	public AccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getChangePassword()
	{
		return changePassword;
	}
	
	public WebElement getOldPassword()
	{
		return oldPassword;
	}
	
	public WebElement getNewPassword()
	{
		return newPassword;
	}
	
	public WebElement getConfirmPassword()
	{
		return confirmPassword;
	}
	
	public WebElement getChangePwd()
	{
		return changePwd;
	}
}
