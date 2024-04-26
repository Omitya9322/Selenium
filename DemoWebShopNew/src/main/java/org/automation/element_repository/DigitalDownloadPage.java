package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadPage {
	
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addToCart;
	
	public DigitalDownloadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToCart() {
		return addToCart;
	}
	
}