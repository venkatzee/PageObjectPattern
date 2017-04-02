package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\AutomationJars\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		page.googleSearch("Selenium");
		Thread.sleep(5000);
		//click on the selenium link it will return selenium web site
		SeleniumPageObjects selPage=page.clickSelenium();
		Thread.sleep(5000);
		
		//SeleniumPageObjects selPage = new SeleniumPageObjects(driver);
		SeleniumDownloadPage SelDnpage= selPage.clickDownload();
		Thread.sleep(5000);
		selPage.navigateHome();
		Thread.sleep(5000);
		
		
		
		
		driver.quit();
	}

}
