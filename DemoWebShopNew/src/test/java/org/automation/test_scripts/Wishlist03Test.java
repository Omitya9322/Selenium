package org.automation.test_scripts;


import org.automation.element_repository.FictionFXPage;
import org.automation.element_repository.WishListPage;
import org.automation.generic_library.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Wishlist03Test extends BaseTest {

	@Test
	public void verify_user_is_able_to_add_product_to_Wishlist() {
		
		//Step 7-Click on books
		WishListPage wishlist=new WishListPage(null);
		wishlist.getBookLinks().click();
		
		//Step 8-To validate Books page is displayed or not
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books","Books page is not displayed");
		Reporter.log("Books page is displayed", true);
		
		//Step-9 Click on Friction EX
		FictionFXPage fiction_page=new FictionFXPage(null);
		String book1 =fiction_page.getFrictionPage().getText();
		fiction_page.getFrictionPage().click();
		
		//Step 8-To validate Friction EX page is displayed or not
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Fiction EX","Friction EX page is not displayed");
		Reporter.log("Friction EX page is displayed", true);
		
		//Step 9-Add to Wishlist
		fiction_page.getAddToWishlist().click();
		
		//Step 10-Navigate to Wishlist
		wishlist.getWishlist().click();
		
		//Step 11-To validate Wishlist page is displayed or not
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Wishlist","Wishlist page is not displayed");
		Reporter.log("Wishlist page is displayed", true);
		
		//Step 15-Validation of product
		String WishlistBook = fiction_page.getFrictionPage().getText();
		System.out.println(book1);
		System.out.println(WishlistBook);
		
		Assert.assertEquals(book1, WishlistBook,"Book is not displayed");
		Reporter.log("Book is displayed", true);
		
		//Step 13-Remove from wishlist
		wishlist.getRemoveFromCart().click();
		
		wishlist.getUpdateCart().click();
		
		
		
	}
}
