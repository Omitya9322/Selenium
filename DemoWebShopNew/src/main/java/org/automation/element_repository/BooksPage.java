package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	
	@FindBy(xpath = "//img[@alt='Picture of Fiction EX']")
	private WebElement fictionFX;
	
	public BooksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFictionFX() {
		return fictionFX;
	}

}
