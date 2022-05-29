package Pack;

import java.io.Closeable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Argument;

public class ScrollDownUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.instagram.com/?hl=en");
				
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement about = driver.findElement(By.xpath("//div[text()='About']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,3000)"); // +Scrolldown
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,-500)");	//	scrollup

		js.executeScript("arguments[0].scrollIntoView(true);", about);
		Thread.sleep(3000);
		
		about.click();
		driver.quit();
		
		
		
	}

}
