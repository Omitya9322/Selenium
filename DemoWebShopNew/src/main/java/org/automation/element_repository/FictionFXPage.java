package org.automation.element_repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionFXPage {
	
	@FindBy(id = "add-to-wishlist-button-78")
	private WebElement addToWishlist;
	
	@FindBy(xpath="//a[text()='Fiction EX']")
	private WebElement frictionpage;
	

	public FictionFXPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToWishlist() {
		return addToWishlist;
	}
	public WebElement getFrictionPage() {
		return frictionpage;
	}
	
}