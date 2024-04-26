package org.automation.element_repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	@FindBy(name = "removefromcart")
	private WebElement removeFromCart;
	
	@FindBy(name = "updatecart")
	private WebElement updateCart;
	
	@FindBy(name = "continueshopping")
	private WebElement continueShopping;
	
	@FindBy(xpath = "//tr[@class='cart-item-row']//input[@type='checkbox']")
	private WebElement removeCheckbox;

	
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getRemoveFromCart() {
		return removeFromCart;
	}

	public WebElement getUpdateCart() {
		return updateCart;
	}


	public WebElement getContinueShopping() {
		return continueShopping;
	}
	
	public WebElement getRemoveCheckbox() {
		return removeCheckbox;
	}

}