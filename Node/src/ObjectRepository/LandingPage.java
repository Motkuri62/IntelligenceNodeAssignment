package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class LandingPage extends BaseClass {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "li[class='dropdown']:nth-child(5) > a")
	public WebElement compareTab;

//	@FindBy(xpath="(//ul[@class='dropdown-menu']/li/a[text()='Items'])[2]")
//	public WebElement items;

	@FindBy(linkText = "Items")
	public WebElement items;

	@FindBy(css = "span[class='bold-text text-padding']")
	public WebElement itemscount;

	@FindBy(css = ".sorting-dropdown > address")
	public WebElement statusDropdown;

	@FindBy(css = "div#discount_options li:nth-child(5)")
	public WebElement overpricedlink;

	@FindBy(xpath = "(//i[@class='icon icon-sidemodal'])[3]")
	public WebElement icon;

	@FindBy(css = "div[class='row mainHeadTooltip'] p")
	public WebElement matchescount;
	
	@FindBy(xpath = "//*[text()=' Relationship Chart']")
	public WebElement relationshipchart;
	
	@FindBy(css = "span[title='Website']")
	public WebElement website;
	
	
	
	@FindBy(css = "span[title='Category']")
	public WebElement category;
	
	@FindBy(css = "li[class='saveoptions-dropdown no-border click-parent pull-right']")
	public WebElement optionsDrpodown;
	
	@FindBy(xpath = "//li[text()='Download Page Data(V)']")
	public WebElement downloadPageData;
	
	
	

}
