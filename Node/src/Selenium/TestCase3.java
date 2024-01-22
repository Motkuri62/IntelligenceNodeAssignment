
package Selenium;

import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvValidationException;

import BasePackage.BaseClass;
import Functions.LandingPageFunction;
import ObjectRepository.LandingPage;

public class TestCase3 extends BaseClass {

	@Test
	public void checktheicon() throws InterruptedException, IOException, CsvValidationException {

		LandingPage LandingPage = new LandingPage(driver);
		waitforpageload();
		highlight(LandingPage.compareTab);
		LandingPage.compareTab.click();
		waiting(LandingPage.items);
		highlight(LandingPage.items);
		LandingPage.items.click();
		waitforpageload();
		highlight(LandingPage.optionsDrpodown);
		LandingPage.optionsDrpodown.click();
		waiting(LandingPage.downloadPageData);
		highlight(LandingPage.downloadPageData);
		LandingPage.downloadPageData.click();
		waitforpageload();
		LandingPageFunction LP = new LandingPageFunction(driver);
		LP.FileRead();
		
		
	}
}
