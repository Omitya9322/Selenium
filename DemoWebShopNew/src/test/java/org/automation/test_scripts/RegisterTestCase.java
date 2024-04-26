package org.automation.test_scripts;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.automation.element_repository.HomePage;
import org.automation.element_repository.RegisterPage;
import org.automation.generic_library.DataUtility;
import org.automation.generic_library.UtilityMathods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTestCase {
	
	
	@Test(groups = "System", dataProvider = "RegisterTestCase")
	public void registerAndValidate(String firstname, String lastname, String email, String password, String confirmpassword) {
		
		UtilityMathods d=new UtilityMathods();
		
		//Step 1-To launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		//Step 2-To validate demo web shop page is displayed or not
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Demo web shop page is not displayed");
		Reporter.log("Demo Web Shop is displayed", true);
		
		//Step 3-Click on Register button
		HomePage homepage=new HomePage(driver);
		homepage.getRegisterLink().click();
		
		//Step 4-To validate Register page is displayed or not
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register","Register page is not displayed");
		Reporter.log("Register page is displayed", true);
		
		//Step 5-Perform Registration
		
		RegisterPage register=new RegisterPage(driver);
		register.getGenderRadioButton().click();
		register.getFirstName().sendKeys(firstname);
		register.getLastName().sendKeys(lastname);
		register.getEmailTextField().sendKeys(d.getRandomNumber()+email);
		register.getPassword().sendKeys(password);
		register.getConfirmPassword().sendKeys(confirmpassword);
		register.getRegisterButton().click();
		
		//Step 6-To validate Registration is complete  or not
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register","Register page is not complete");
		Reporter.log("Register page is not complete", true);
		
		//Click on Continue
		register.getContinueButton().click();
		
		//To close the browser
		driver.close();
		
	}
	
	@DataProvider(name="RegisterTestCase")
	public Object[][] dataSupply() throws EncryptedDocumentException, IOException{
		 return DataUtility.getMultipleDataFromExcelFile("RegisterTestCase");
	}
}

