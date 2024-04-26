package org.automation.test_scripts;

import java.time.Duration;

import java.util.List;

import org.automation.element_repository.HomePage;
import org.automation.element_repository.ShoppingCartPage;
import org.automation.element_repository.WishListPage;
import org.automation.generic_library.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Validation02Test extends BaseTest{

	@Test
	public void validationOfProduct() throws InterruptedException {
		
		HomePage home_page;
		//Step 6-To navigate to Digital downloads 
		home_page=new HomePage(driver);
		home_page.getDigitalDownloadButton().click();

		//Step 7-To validate Digital downloads page is displayed or not 
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Digital downloads","Digital downloads page is not displayed");
		Reporter.log("Digital downloads page is displayed", true);
		
		//Step 8-To locate AddToCart buttons
		
		WishListPage wishlist=new WishListPage(null);
		wishlist.getAddToCart();
		List<WebElement> allProducts=(List<WebElement>) wishlist.getAddToCart();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		//Step 9-To add all the products to the cart
		for (WebElement products : allProducts) 
		{
			products.click();
			wait.until(ExpectedConditions.invisibilityOf(home_page.getShoppingCartLink()));
			Thread.sleep(1000);
		}
		
		//Step 10-To click on shopping cart
		
		home_page.getShoppingCartLink().click();

		//Step 11-To validate shopping cart page is displayed or not
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart","Shopping Cart page is not displayed");
		Reporter.log("Shopping Cart page is displayed", true);
		
		//WishListPage wishlist;
		wishlist=new WishListPage(null);
		wishlist.getCartItem();
		
		List<WebElement> cartProducts =(List<WebElement>) wishlist.getCartItem();

		//Step 12-To validate the number of products in shopping cart
		
		Assert.assertEquals(allProducts.size(), cartProducts.size(),"Add to cart is failed");
		Reporter.log("Add to cart is passed", true);
		
		
		ShoppingCartPage shop=new ShoppingCartPage(null);
		List<WebElement> removeCheckBox =(List<WebElement>) shop.getRemoveFromCart();

		for (WebElement CheckBox : removeCheckBox) 
		{
			CheckBox.click();
		}
		
		wishlist=new WishListPage(null);
		wishlist.getUpdateCart().click();

		

	}
}
