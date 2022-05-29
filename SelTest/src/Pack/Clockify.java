package Pack;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Clockify {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
				
		driver.get("https://app.clockify.me/en/login");
		Thread.sleep(5000);
		
		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
		id.click();
		id.sendKeys("gaurav.ch98@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.click();
		password.sendKeys("G9503503574");
		
		WebElement stayLoggedIn = driver.findElement(By.xpath("//label[@class='cl-custom-control-label ng-tns-c394-2']"));
		//stayLoggedIn.click();
		
		boolean result = stayLoggedIn.isEnabled();
		if (result == true)
		{
			System.out.println(result);
			System.out.println("is selected by default");
			stayLoggedIn.click();
		}
		else
		{
			System.out.println(result);
			System.out.println("is selected by default");	
		}
		
		
		
		
		
		WebElement logIn = driver.findElement(By.xpath("//button[@type='submit']"));
		logIn.click();
		Thread.sleep(5000);		
		
//		WebElement profile = driver.findElement(By.xpath("//div[@class='cl-bg-teal cl-no-image-wrapper-sm ng-star-inserted']"));
//		profile.click();
//		
//		WebElement darkTheme = driver.findElement(By.xpath("//label[@for='darkThemeTopbar']"));
//		darkTheme.click();
		
//		WebElement panel = driver.findElement(By.xpath("//button[@class='cl-navbar-toggler']"));
//		panel.click();
		
		Thread.sleep(3000);
		WebElement clients = driver.findElement(By.xpath("//span[@class='cl-nav-link-copy cl-cut-text']"));
		clients.click();
		
		for(int i=1; i<= 6; i++)
		{
		WebElement addClientTextBox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		addClientTextBox.click();
		//addClientTextBox.sendKeys("Gaurav");
		
		String path = "M:\\Documents\\Testing class notes\\Client Data.xlsx";
		
		Thread.sleep(3000);
		FileInputStream files = new  FileInputStream(path);
		String value = WorkbookFactory.create(files).getSheet("Data").getRow(i).getCell(0).getStringCellValue();
		
		addClientTextBox.sendKeys(value);
		
		WebElement addClientButton = driver.findElement(By.xpath("//button[@type='submit']"));
		addClientButton.click();
		}
		
		
	
		
		
		
		
		
	}

}
