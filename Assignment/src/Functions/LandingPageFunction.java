package Functions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import BasePackage.BaseClass;

public class LandingPageFunction extends BaseClass {

	WebDriver driver;

	public LandingPageFunction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void FileRead() throws IOException, CsvValidationException {
		File fis = new File(System.getProperty("user.dir") + File.separator + "externalFiles" + File.separator
				+ "downloadFiles" + File.separator + "exact_match_data_2024-01-22_US.csv");

		CSVReader reader = null;
		try {
			reader = new CSVReader(new FileReader(fis));
			String[] nextLine;
			int lineNumber = 0;
			while((nextLine =reader.readNext()) != null)
			{
				lineNumber++;
				System.out.println("Line # " + lineNumber);
				
				 System.out.println(nextLine[4]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
