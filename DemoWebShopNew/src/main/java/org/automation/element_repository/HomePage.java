package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(className = "ico-register")
	private WebElement registerLink;
	
	@FindBy(className = "ico-login")
	private WebElement loginLink;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishListLink;
	
	
	@FindBy(id="small-searchterms")
	private WebElement searchTextField;
	
	@FindBy(className="button-1 search-box-button")
	private WebElement searchButton;
	
	@FindBy(linkText="Log out")
	private WebElement logoutButton;
	
	@FindBy(partialLinkText="Jewelry")
	private WebElement jewelry;
	
	@FindBy(xpath = "//a[contains(text(),'Digital downloads')]")
	private WebElement digitalDownload;
	
	@FindBy(xpath = "//img[@alt='Picture of Create Your Own Jewelry']")
	private WebElement JeweryImage;
	
	@FindBy(id = "product_attribute_71_10_16")
	private WebElement product;
	
	@FindBy(xpath = "//a[text()='My account']")
	private WebElement myAccount;
	
	@FindBy(partialLinkText = "Books")
	private WebElement booksLink;
	
	@FindBy(xpath  = "//a[contains(text(),'Apparel & Shoes')]")
	private WebElement apparelshoelink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRegisterLink()
	{
		return registerLink;
	}
	
	public WebElement getLoginLink()
	{
		return loginLink;
	}
	
	public WebElement getShoppingCartLink()
	{
		return shoppingCartLink;
	}
	
	
	public WebElement getWishListLink() {
		return wishListLink;
	}
	
	public WebElement getSearchTextField()
	{
		return  searchTextField;
	}
	
	public WebElement getSearchButton()
	{
		return  searchButton;
	}
	              
	public WebElement getLogoutButton()
	{
		return  logoutButton;
	}
	
	public WebElement getJewwlryButton()
	{
		return  jewelry;
	}
	
	public WebElement getDigitalDownloadButton()
	{
		return  digitalDownload;
	}
	
	public WebElement getJeweryImage()
	{
		return  JeweryImage;
	}
	
	public WebElement getProduct()
	{
		return  product;
	}
	
	public WebElement getMyAccount()
	{
		return  myAccount;
	}
	

	public WebElement getBooksLink() 
	{
		return booksLink;
	}
	
	public WebElement getApparelshoelink() 
	{
		return apparelshoelink;
	}

}
