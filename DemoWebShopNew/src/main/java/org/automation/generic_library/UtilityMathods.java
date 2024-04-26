package org.automation.generic_library;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMathods implements FrameworkConstant{

	
	//Screenshot of web page
		public void screenshot(WebDriver driver,String name) throws IOException {
			
			String path=screenshot_path+name+".png";
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File Trg=new File(path);
			FileHandler.copy(src, Trg);
		}
		
		//Accept Alert popup
		public void acceptAlert(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		
		//Dismiss Alert popup
		public void dismissAlert(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}
		
		//Get text of Alert popup
		public String getTextOfAlert(WebDriver driver) {
			String value = driver.switchTo().alert().getText();
			return value;
		}
		
		//To select option by index
		public void selectOptionByIndex(WebElement dropdown, int indexnum) {
			Select s=new Select(dropdown);
			s.selectByIndex(indexnum);
		}
		
		//To select option by value
		public void selectOptionByValue(WebElement dropdown, String Value) {
			Select s=new Select(dropdown);
			s.selectByValue(Value);
		}
		
		//To select option by visiable Text
		public void selectOptionByVisiableText(WebElement dropdown, String text) {
			Select s=new Select(dropdown);
			s.selectByVisibleText(text);
		}
		
		//To deselect option by index
		public void deselectOptionByIndex(WebElement dropdown, int indexnum) {
			Select s=new Select(dropdown);
			s.deselectByIndex(indexnum);
		}
		
		//To deselect option by value
		public void deselectOptionByValue(WebElement dropdown, String Value) {
			Select s=new Select(dropdown);
			s.deselectByValue(Value);
		}
		
		//To deselect option by visiable Text
		public void deselectOptionByVisiableText(WebElement dropdown, String text) {
			Select s=new Select(dropdown);
			s.deselectByVisibleText(text);
		}
		
		//To deselect all option
		public void deselectAllOption(WebElement dropdown) {
			Select s=new Select(dropdown);
			s.deselectAll();
		}
		
		//Scroll by Actions Class
		public void actionsScrollForCertainPixel(WebDriver driver, int x, int y) {
			Actions act=new Actions(driver);
			act.scrollByAmount(x, y).perform();
		}
		
		//Scroll Till Element By js
		public void jsScrollTillElement(WebDriver driver, boolean value, WebElement target) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeAsyncScript("argument[0].scrollIntoView(" + value + ")", target);
		}
		
		//Scroll Till Element By Axis
		public void jsScrollByAxis(WebDriver driver, int x, int y) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeAsyncScript("argument[0].scrollIntoView(" + x + "),(" + y + ");");
		}
		
		public int getRandomNumber() {
			Random r=new Random();
			return r.nextInt(4000);
		}
}
