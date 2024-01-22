
package Selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import ObjectRepository.LandingPage;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

public class TestCase5 extends BaseClass {

	@Test
	public void DragAndDrop() throws InterruptedException {
		LandingPage LandingPage = new LandingPage(driver);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		highlight(LandingPage.relationshipchart);
		LandingPage.relationshipchart.click();
		waitforpageload();

		Actions act = new Actions(driver);

		Action draganddropxaxis = act.clickAndHold(LandingPage.website).moveToElement(LandingPage.xaxis)
				.release(LandingPage.xaxis).build();
		draganddropxaxis.perform();
		waitforpageload();

		Action draganddropyaxis = act.clickAndHold(LandingPage.category).moveToElement(LandingPage.yaxis)
				.release(LandingPage.yaxis).build();
		draganddropyaxis.perform();
		
		LandingPage.applyFilter.click();
		waitforpageload();
		
		LandingPage.chartCell.click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector(".relationshio-module > .row")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector(".btn-primary")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector(".raphael-group-3-hot > rect:nth-child(24)")).click();
	}
}
