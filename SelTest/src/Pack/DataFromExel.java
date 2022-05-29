package Pack;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataFromExel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.xpath("//input[contains (@class,'inputtext _55r1 _6luy')][1]"));
		
		
		
		String path = "\"M:\\Documents\\Testing class notes\\Client Data.xlsx\"";
		FileInputStream file = new FileInputStream(path);
		String value = WorkbookFactory.create(file).getSheet("Data").getRow(1).getCell(0).getStringCellValue();
		
		Username.sendKeys(value);
		
		
	}

}
