package org.automation.test_scripts;


import org.automation.element_repository.AccountPage;
import org.automation.generic_library.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class ChangePasswordTestCase extends BaseTest {


	@Test(groups = "System")
	public  void changePassword() {
		home_page.getMyAccount().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Account","Account page is not dispaleyd");
		Reporter.log("Account page is dispaleyd", true);
		
		AccountPage acc=new AccountPage(driver);
		acc.getChangePassword().click();
		
		acc.getOldPassword().sendKeys("Omitya@123");
		
		acc.getNewPassword().sendKeys("Omitya@123");
		
		acc.getConfirmPassword().sendKeys("Omitya@123");
		
		acc.getChangePwd().click();
		
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='result']")).getText(), "Password was changed","Password is not changed");
		Reporter.log("Password is changed", true);

	}
}





