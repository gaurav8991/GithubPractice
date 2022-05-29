package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTube {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Documents\\Testing class notes\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='search']"));
		searchBar.click();
		searchBar.sendKeys("tujhe yaad kar liya hai ");
		
		
		WebElement search = driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]"));
		search.click();
		Thread.sleep(2000);
		WebElement song = driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/vKDsAB1ccn0/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAj0mvjPnuxzNxhWbqIoZ7W6vsZlQ']"));
		song.click();
		Thread.sleep(10000);
		
		WebElement skipAd = driver.findElement(By.xpath("//div[@id='ad-text:6']"));
		skipAd.click();
		
		
		////div[@id='ad-text:6']
		
	}

}
