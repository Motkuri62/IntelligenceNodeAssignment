package Selenium;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import ObjectRepository.LandingPage;

public class TestCase2 extends BaseClass {

	@Test
	public void CheckTotalNoofOverPricedItems() throws InterruptedException {

		LandingPage LandingPage = new LandingPage(driver);
		waitforpageload();
		highlight(LandingPage.compareTab);
		LandingPage.compareTab.click();
		waiting(LandingPage.items);
		highlight(LandingPage.items);
		LandingPage.items.click();
		waiting(LandingPage.statusDropdown);
		ScrolltoElement(LandingPage.statusDropdown);
		highlight(LandingPage.statusDropdown);
		LandingPage.statusDropdown.click();
		waiting(LandingPage.overpricedlink);
		highlight(LandingPage.overpricedlink);
		LandingPage.overpricedlink.click();
		ScrollbyHeight();
		String totalitems = LandingPage.itemscount.getText();
		System.out.println(totalitems + " Total Number of Items present which are overpriced.");
	}
}
