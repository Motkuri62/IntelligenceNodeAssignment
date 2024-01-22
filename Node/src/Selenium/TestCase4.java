
package Selenium;

import org.testng.annotations.Test;
import BasePackage.BaseClass;
import ObjectRepository.LandingPage;

public class TestCase4 extends BaseClass {

	@Test
	public void checktheicon() throws InterruptedException {

		LandingPage LandingPage = new LandingPage(driver);
		waitforpageload();
		highlight(LandingPage.compareTab);
		LandingPage.compareTab.click();
		waiting(LandingPage.items);
		highlight(LandingPage.items);
		LandingPage.items.click();
		waitforpageload();
		ScrolltoElement(LandingPage.icon);
		waitforpageload();
		clickElement(LandingPage.icon);
		waiting(LandingPage.matchescount);
		highlight(LandingPage.itemscount);
		String matchescountText = LandingPage.matchescount.getText();
		System.out.println(matchescountText);
	}
}
