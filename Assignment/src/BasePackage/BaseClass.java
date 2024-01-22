package BasePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;

	public static String properties(String url) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\Properties\\GlobalData.properties");
		prop.load(fis);
		String urllink = prop.getProperty(url);
		return urllink;

	}

	public void ScrolltoElement(WebElement Element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", Element);
	}

	public void ScrollbyHeight() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void waiting(WebElement value) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOf(value));
	}

	public void waitforpageload() throws InterruptedException {
		Thread.sleep(10000);
	}

	public void clickElement(WebElement value) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", value);
	}

	public void highlight(WebElement value) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", value);
	}

	@BeforeMethod()
	public WebDriver initialization() throws IOException {

		String browsername = properties("browser");

		if (browsername.equalsIgnoreCase("chrome")) {
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("download.default_directory", System.getProperty("user.dir") + File.separator + "externalFiles"
					+ File.separator + "downloadFiles");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			driver = new ChromeDriver(options);
			WebDriverManager.chromedriver().setup();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			WebDriverManager.edgedriver().setup();
			;
		}
		String URL = properties("url");
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		return driver;
	}

	@AfterMethod()
	public void teardown() {
		driver.quit();
	}
}
