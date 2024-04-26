package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	
	@FindBy(name = "removefromcart")
	private WebElement removeFromCart;
	
	@FindBy(name = "addtocart")
	private WebElement addToCart;
	
	@FindBy(name = "updatecart")
	private WebElement updateCart;
	
	@FindBy(name = "addtocartbutton")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//input[@value='Email a friend']")
	private WebElement emailFriend;
	
	@FindBy(xpath = "//a[contains(text(),'Books')]")
	private WebElement bookLink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishlist;
	
	@FindBy(xpath="//tr[@class='cart-item-row']")
	private WebElement cartItem;
	
	@FindBy(xpath = "//a[@href='/fiction-ex']")
	private WebElement fictionFXProduct;
	
	public WishListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getRemoveFromCart() {
		return removeFromCart;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getUpdateCart() {
		return updateCart;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getEmailFriend() {
		return emailFriend;
	}
	
	public WebElement getBookLinks() {
		return bookLink;
	}
	
	public WebElement getWishlist() {
		return wishlist;
	}
	
	
	public WebElement getCartItem() {
		return cartItem;
	}
	
    public WebElement getFictionFXProduct() {
		
		return fictionFXProduct;
	}


}