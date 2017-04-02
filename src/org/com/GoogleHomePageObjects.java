package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {
	
	public GoogleHomePageObjects(WebDriver driver){
		PageFactory.initElements(driver,this);

		}
		@FindBy(name="q")
		public WebElement txtSearch;

		@FindBy(name="btnG")
		public WebElement btnSearch;
		
		@FindBy(linkText="Selenium - Web Browser Automation")
		public WebElement linkSelenium;
		
   public  void googleSearch(String searchTxt){
	   txtSearch.sendKeys(searchTxt);
		btnSearch.click();
	   }
		
   public SeleniumPageObjects clickSelenium(){
	   linkSelenium.click();
	return new SeleniumPageObjects();
   }
		
		
		}

