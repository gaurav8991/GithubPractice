package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		WebElement AccountAndList = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		WebElement YourWishList = driver.findElement(By.xpath("//span[text()='Your Wish List']"));
	
		Actions act = new Actions(driver);
		
		act.moveToElement(AccountAndList).moveToElement(YourWishList).click().build().perform();
		System.out.println("End");
		
	}

}
