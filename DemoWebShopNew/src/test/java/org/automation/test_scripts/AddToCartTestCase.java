package org.automation.test_scripts;


import org.automation.element_repository.ApparelShoesPage;
import org.automation.generic_library.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddToCartTestCase extends BaseTest{
	@Test
	public void verify_User_Is_Able_To_Add_Product_To_Cart()
	{

		home_page.getApparelshoelink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Apparel & Shoes", "Apparel & Shoes pahge is not displayed"); 
		Reporter.log("Apparel & Shoes pahge is displayed", true);

		ApparelShoesPage apparel_page = new ApparelShoesPage(driver);
		apparel_page.getBluegreensneaker().getText();
		apparel_page.getBluegreensneaker().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Blue and green Sneaker", "Blue green sneaker not Displayed");
		Reporter.log("Blue green sneaker Page Displayed", true);
		
	
		apparel_page.getAddTocartButton().click();
		
		
		home_page.getShoppingCartLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart", "Shopping cart page is not displayed...");
		Reporter.log("Shopping cart page is displayed", true);
	
		}
}

