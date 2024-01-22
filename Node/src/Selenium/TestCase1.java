package Selenium;

import org.testng.annotations.Test;
import java.io.IOException;
import BasePackage.BaseClass;
import ObjectRepository.LandingPage;

public class TestCase1 extends BaseClass {

	@Test
	public void CheckTotalNoofItems() throws InterruptedException, IOException {
		LandingPage LandingPage = new LandingPage(driver);
		waitforpageload();
		highlight(LandingPage.compareTab);
		LandingPage.compareTab.click();
		waiting(LandingPage.items);
		highlight(LandingPage.items);
		LandingPage.items.click();
		ScrollbyHeight();
		waiting(LandingPage.itemscount);
		highlight(LandingPage.itemscount);
		String totalitems = LandingPage.itemscount.getText();
		System.out.println(totalitems + " Total Number of Items present.");

	}

}
