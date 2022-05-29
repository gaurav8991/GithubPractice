package Pack;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test10 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		TakesScreenshot s = (TakesScreenshot) driver;
		//s.getScreenshotAs(OutputType.FILE);
		
		for(int i = 0; i>5;i++)
		{
		File source = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("M:\\Documents\\Automation Screenshots\\" + 123 + ".jpeg");
		FileHandler.copy(source,dest);
		}
		
		
		
		
	}

}
