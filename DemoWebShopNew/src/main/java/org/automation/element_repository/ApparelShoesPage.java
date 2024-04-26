package org.automation.element_repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelShoesPage {
	@FindBy(xpath = "//a[contains(text(),'Blue and green Sneaker')]")
	private WebElement bluegreensneaker;
	
	@FindBy(id = "add-to-wishlist-button-28")
	private WebElement addToWishlist;
	
	
	@FindBy(id = "add-to-cart-button-28")
	private WebElement addTocartButton;
	
	public WebElement getAddTocartButton() {
		return addTocartButton;
	}

	public WebElement getBluegreensneaker() {
		return bluegreensneaker;
	}

	public WebElement getAddToWishlist() {
		return addToWishlist;
	}


	public ApparelShoesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

