package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	@FindBy(id = "gender-male")
	private WebElement gender;
	
	@FindBy(id = "FirstName")
	private WebElement firstName;
	
	@FindBy(id = "LastName")
	private WebElement lastName;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confPassowrd;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getGenderRadioButton()
	{
		return gender;
	}
	
	public WebElement getFirstName()
	{
		return firstName;
	}
	
	public WebElement getLastName()
	{
		return lastName;
	}
	
	public WebElement getEmailTextField()
	{
		return email;
	}
	
	public WebElement getPassword()
	{
		return password;
	}
	public WebElement getConfirmPassword()
	{
		return confPassowrd;
	}
	public WebElement getRegisterButton()
	{
		return registerButton;
	}
	
	public WebElement getContinueButton()
	{
		return continueButton;
	}
	
}
