package org.automation.test_scripts;

import org.automation.element_repository.HomePage;
import org.automation.element_repository.WishListPage;
import org.automation.generic_library.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class RemoveFromCartTestCase extends BaseTest {

	@Test(groups = "System")
	public void removeFromCart() {
		
		HomePage home=new HomePage(driver);
		home.getJewwlryButton().click();
		
		WishListPage wishlist;
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Jewelry","Jewelry page is  not displayed");
		Reporter.log("Jewelry page is displayed", true);
		
		home.getJeweryImage().click();
		
		home.getProduct().sendKeys("20");
		
		wishlist=new WishListPage(null);
		wishlist.getAddToCartButton().click();
		
		
		home.getShoppingCartLink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart","Shopping Cart page is not displayed");
		Reporter.log("Shopping Cart page is displayed", true);
		
		wishlist=new WishListPage(null);
		wishlist.getRemoveFromCart().click();
		
		wishlist.getUpdateCart().click();
		
	}
}






