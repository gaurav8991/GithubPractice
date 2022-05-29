package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BartiSite {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
				
		driver.get("https://barti.maharashtra.gov.in/");
		Thread.sleep(3000);
		
		WebElement CCVISWebsite = driver.findElement(By.xpath("(//img[@class='img-responsive'])[3]"));
		CCVISWebsite.click();
		
		WebElement newUser = driver.findElement(By.xpath("//a[@class='new_resister']"));
		
		
		Thread.sleep(3000);	
		Actions act = new Actions(driver);
		act.moveToElement(CCVISWebsite).moveToElement(newUser).click().build().perform();
		
		
		WebElement salutation = driver.findElement(By.xpath("//select[@name='mr']"));
		Select s = new Select(salutation);
			s.selectByValue("Mr.");
		
		
		
	}

}
