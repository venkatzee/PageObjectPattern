package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageObjects {
	public SeleniumPageObjects(){
		
	}
	public SeleniumPageObjects(WebDriver driver){
		PageFactory.initElements(driver,this);

		}

	@FindBy(linkText="Download")
	public WebElement linkDownload;
	
	@FindBy(xpath=".//*[@id='header']/h1/a")			
	public WebElement linkhome;
	
	public SeleniumDownloadPage clickDownload() throws InterruptedException{
		linkDownload.click();
		Thread.sleep(5000);
		return new SeleniumDownloadPage();
		
	}
	
	public void navigateHome(){
		linkhome.click();
	}
}
