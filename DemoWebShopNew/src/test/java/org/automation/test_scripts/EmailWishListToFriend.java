package org.automation.test_scripts;


import org.automation.element_repository.EmailWishlist;
import org.automation.element_repository.FictionFXPage;
import org.automation.element_repository.WishListPage;
import org.automation.generic_library.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmailWishListToFriend extends BaseTest {
	@Test
	public void verify_User_Is_Able_To_Add_Product_To_Wishlist()
	{
		home_page.getBooksLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "Books page not displayed"); 
		Reporter.log("Books Page Displayed", true);

		FictionFXPage fiction=new FictionFXPage(driver);
        String actProductName=fiction.getFrictionPage().getText(); 
        fiction.getFrictionPage().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Fiction EX", "Fiction Ex Product Page not Displayed");
		Reporter.log("Fiction Ex Product Page Displayed", true);

		FictionFXPage product_Page = new FictionFXPage(driver);
		product_Page.getAddToWishlist().click();

		home_page.getWishListLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Wishlist", "Wish List Page not Displayed");
		Reporter.log("Wish List Page Displayed", true);
		
		driver.navigate().refresh();

		WishListPage wishList_Page = new WishListPage(driver);
		
		String expProductName=wishList_Page.getFictionFXProduct().getText();
		
		Assert.assertEquals (actProductName, expProductName, "verify_User_Is_Able_To_Add_Product_To_WishList Test Case Fail");
		Reporter.log("verify_User_Is_Able_To_Add_Product_To_WishList Test Case Pass..", true);
		
		EmailWishlist email = new EmailWishlist(driver);
		email.getEmailFriend().click();
		email.getFriendmail().sendKeys("Sahil");
//		String mail="sahil24@gmail.com";
//		email.setFriendmail(mail);
		

		}
}
