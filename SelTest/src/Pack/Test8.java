package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.xpath("//input[@type='text'][1]"));
		WebElement to = driver.findElement(By.xpath("//input[@autocomplete='off'][1]"));
		WebElement date = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		
		from.sendKeys("C SHIVAJI MAH T - CSMT");
		Thread.sleep(2000);
		
		to.sendKeys("H SAHIB NANDED - NED");
		Thread.sleep(2000);
		
		date.sendKeys("04/05/2022");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		
		
	}

}
