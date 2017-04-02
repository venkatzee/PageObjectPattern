package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumDownloadPage {
	public SeleniumDownloadPage(){
		
	}
	public SeleniumDownloadPage(WebDriver driver){
		PageFactory.initElements(driver,this);

		}

	@FindBy(linkText="Selenium Html Runner")
	public WebElement linkHtmlRunner;
	
	/*public SeleniumDownloadPage clickSelHtmlRunner(){
		linkHtmlRunner.click();
		return new SeleniumDownloadPage();
	}*/

}
