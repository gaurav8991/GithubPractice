package Pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Test11 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
				
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(3000);
//		
//		WebElement gender = driver.findElement(By.xpath("//select[@name='register_gender']"));
//		
//		Select s = new Select(gender);
//		
//		s.selectByVisibleText("Male");
//		
//		TakesScreenshot ss= (TakesScreenshot) driver;
//		File source = ss.getScreenshotAs(OutputType.FILE);
//		File dest = new File("M:\\Documents\\Automation Screenshots\\ ss1.jpeg");
//		FileHandler.copy(source, dest);
				
		
		WebElement userName = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		//WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		
		String path = "M:\\Documents\\Automation Screenshots\\VelocityData.xlsx";
		FileInputStream file = new FileInputStream(path);
		
		String value = WorkbookFactory.create(file).getSheet("Class").getRow(0).getCell(1).getStringCellValue();
				
		WebElement logIn = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		//logIn.click();
//		
//		boolean result = logIn.isEnabled();
//		if(result==true)
//		{
//			System.out.println("pass");
//			System.out.println(result);
//		}
//		else
//		{
//			System.out.println("Fail");
//			System.out.println(result);
//		}
//			result= logIn.isEnabled();
//			logIn.click();
//		
		
//		driver.navigate().to("https://www.facebook.com/");
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		
//		driver.manage().window().maximize();
//		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		driver.close();
//		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
